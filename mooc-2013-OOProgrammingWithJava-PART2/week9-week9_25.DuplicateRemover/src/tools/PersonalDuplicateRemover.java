package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author 358721
 */

public class PersonalDuplicateRemover implements DuplicateRemover{
    private List<String> strings;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        this.strings = new ArrayList<String>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (strings.contains(characterString)){
            duplicates++;
        }
        strings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniques = new HashSet<String>();
        for(String word : strings){
            uniques.add(word);
        }
        return uniques;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicates = 0;
    }
    
}
