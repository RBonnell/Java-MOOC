
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Dictionary {
    private HashMap<String, String> dictionary;
    
    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if (this.dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for (String key : dictionary.keySet()){
            list.add(key + " = " + dictionary.get(key));
        }
        return list;
    }
}
