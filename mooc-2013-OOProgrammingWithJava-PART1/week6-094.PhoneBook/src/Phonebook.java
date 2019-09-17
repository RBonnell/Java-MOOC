
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    
    public void add(String name, String number){
        Person p = new Person(name, number);
        phonebook.add(p);
    }
    
    public void printAll(){
        for (Person p : phonebook){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String searched){
        for (Person p : phonebook){
            if (p.getName().contains(searched)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
