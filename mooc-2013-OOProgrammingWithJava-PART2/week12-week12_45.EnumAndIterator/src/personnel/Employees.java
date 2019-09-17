package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 358721
 */
public class Employees {
    private List<Person> employees = new ArrayList<Person>();
    
    public Employees(){}
    
    public void add(Person person){
        this.employees.add(person);
    }
    public void add(List<Person> persons){
        for(Person person : persons){
            this.employees.add(person);
        }
    }
    public void print(){
        for(Person employee : employees){
           System.out.println(employee);
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
