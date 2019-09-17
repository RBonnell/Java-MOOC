/**
 *
 * @author 358721
 */

package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws Exception {
        Scanner reader = new Scanner(file);
        int lines = 0;
        
        while (reader.hasNext()) {
            lines++;
            reader.nextLine();
        }
        return lines;
    }
    
    public int characters() throws Exception {
        Scanner reader = new Scanner(file);
        int characters = 0;
        
        while (reader.hasNext()) {
            String line = reader.nextLine();
            characters += line.length() + 1; // line break counts as character
        }
        return characters;
    }
}