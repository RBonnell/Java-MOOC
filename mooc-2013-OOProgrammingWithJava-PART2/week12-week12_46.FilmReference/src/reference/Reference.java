package reference;

/**
 *
 * @author 358721
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register){
        this.register = register;
    }

    public Film recommendFilm(Person viewer){
        if (register.getPersonalRatings(viewer).isEmpty()){
            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(register.filmRatings()));
            return films.get(0);
        }
 
        List<Person> sortedReviewers = sortReviewers(viewer);
        return getRecommendedFilm(viewer, sortedReviewers);
    }
    
    private List<Person> sortReviewers(Person viewer) {
        Map<Person, Integer> reviewerSimilarity = compareReviewers(register.getPersonalRatings(viewer));

        List<Person> similarReviewers = new ArrayList<Person>(reviewerSimilarity.keySet());
        Collections.sort(similarReviewers, new PersonComparator(reviewerSimilarity));
        
        return similarReviewers;
    }
    
    private Map<Person, Integer> compareReviewers(Map<Film, Rating> filmRatings){
        Map<Person, Integer> reviewerSimilarity = new HashMap<Person, Integer>();
        
        for (Person reviewer : register.reviewers()) {
            int similarity = 0;
            
            for (Film film : filmRatings.keySet()) {
                similarity += filmRatings.get(film).getValue() * register.getRating(reviewer, film).getValue();
            }
            if (similarity > 0) {
                reviewerSimilarity.put(reviewer, similarity);
            }
        }
        return reviewerSimilarity;
    }
    
    private Film getRecommendedFilm(Person viewer, List<Person> sortedReviewers){
        Map<Film, Rating> viewersSeenFilms = register.getPersonalRatings(viewer);
   
        for (Person reviewer : sortedReviewers){
            if (reviewer == viewer) {
                continue;
            }
            
            for (Film film : register.getPersonalRatings(reviewer).keySet()){
                if (viewersSeenFilms.containsKey(film)) { 
                    continue;
                }
                if (register.getPersonalRatings(reviewer).get(film).getValue() > 1){
                    return film;
                }
            }
        }
        return null;
    }     
}
