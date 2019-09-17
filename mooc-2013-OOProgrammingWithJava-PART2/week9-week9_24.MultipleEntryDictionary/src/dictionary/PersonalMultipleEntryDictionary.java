package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 358721
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> dict;
    
    public PersonalMultipleEntryDictionary(){
        dict = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!dict.containsKey(word)){
            dict.put(word, new HashSet<String>());
        }
        dict.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (dict.containsKey(word)){
            return dict.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        if (dict.containsKey(word)){
            dict.remove(word);
        }
    }
}
