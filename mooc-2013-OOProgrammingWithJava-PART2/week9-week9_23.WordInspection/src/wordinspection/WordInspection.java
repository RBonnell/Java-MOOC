/**
 *
 * @author 358721
 */

package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws Exception{
        int count = 0;
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()){
            count++;
            reader.nextLine();
        }
        return count;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        List<String> zList = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()){
            String word = reader.next();
            if (word.contains("z") || (word.contains("Z"))){
                zList.add(word);
            }
        }
        return zList;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        List<String> endInL = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()){
            String word = reader.next();
            if(word.charAt(word.length() -1) == 'l'){
                endInL.add(word);
            }
        }
        return endInL;
    }
    
    public List<String> palindromes() throws Exception{
        List<String> palindromes = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()){
            String word = reader.next();
            StringBuilder reversed = new StringBuilder();
            reversed.append(word);
            reversed.reverse();
            if (word.equals(reversed.toString())){
                palindromes.add(reversed.toString());
            }
        }
        return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        List<String> allVowels = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()){
            String word = reader.next();
            if(word.contains("" + 'a')
            && word.contains("" + 'e')
            && word.contains("" + 'i')
            && word.contains("" + 'o')
            && word.contains("" + 'u')
            && word.contains("" + 'y')
            && word.contains("" + 'ä')
            && word.contains("" + 'ö')){
                allVowels.add(word);
            }
        }
        return allVowels;
    }
}
