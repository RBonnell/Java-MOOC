package reference.comparator;

/**
 *
 * @author 358721
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film>{

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film f1, Film f2){
        double f1Ratings = 0;
        double f2Ratings = 0;
        
        for (Rating rating : ratings.get(f1)){
            f1Ratings += rating.getValue();
        }
        
        f1Ratings /= ratings.size();
        f1Ratings = (int) f1Ratings;
        
        for (Rating rating : ratings.get(f2)){
            f2Ratings += rating.getValue();
        }
        
        f2Ratings /= ratings.size();
        f2Ratings = (int) f2Ratings;
        
        if (f1Ratings == f2Ratings){
            return 0;
        } 
        else if (f1Ratings > f2Ratings){
            return -1; 
        } 
        else{
            return 1;
        }
    }
}
