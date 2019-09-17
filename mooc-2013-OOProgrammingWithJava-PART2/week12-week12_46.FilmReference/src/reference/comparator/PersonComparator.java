package reference.comparator;

/**
 *
 * @author 358721
 */

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

public class PersonComparator implements Comparator<Person>{

    private Map<Person, Integer> people;

    public PersonComparator(Map<Person, Integer> people){
        this.people = people;
    }

    @Override
    public int compare(Person p1, Person p2){
        if (people.get(p1) == people.get(p2)){
            return 0;
        } 
        else if (people.get(p1) > people.get(p2)){
            return -1;
        } 
        else{
            return 1;
        }
    }
}
