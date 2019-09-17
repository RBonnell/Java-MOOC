package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 358721
 */
public class MindfulDictionary {

    private Map<String, String> dictionary = new HashMap<String, String>();
    private String filePath;
    private Scanner reader;
    private FileWriter writer;
    private File file;

    public MindfulDictionary() {

    }

    public MindfulDictionary(String file) {
        this.filePath = file;
    }

    public boolean load() {

        try {
            file = new File(this.filePath);
            reader = new Scanner(file);

            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
            return true;
        } 
        catch (FileNotFoundException e){
            e.getMessage();
            return false;
        }
    }

    public boolean save(){
        try {
            writer = new FileWriter(filePath);
            for (String key : this.dictionary.keySet()){
                StringBuilder sb = new StringBuilder();
                sb.append(key).append(":").append(this.dictionary.get(key)).append("\n");
                writer.write(sb.toString());
            }
            writer.close();
            return true;
        } 
        catch (IOException ex){
            ex.getMessage();
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
        }
    }

    public String translate(String word){
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } 
        else if (this.dictionary.containsValue(word)){
            for (String key : this.dictionary.keySet()){
                if (this.dictionary.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
    }

    public void remove(String word){
        if (this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
        if (this.dictionary.containsValue(word)) {
            List<String> keys = new ArrayList<String>();
            /*this list is used because you will generate a 
            ConcurrentModificationException if you try to modify a collection
            during iteration*/
            for (String key : this.dictionary.keySet()){
                if (this.dictionary.get(key).equals(word)) {
                    keys.add(key);
                }
            }
            for (String key : keys) {
                this.dictionary.remove(key);
            }
        }
    }
}