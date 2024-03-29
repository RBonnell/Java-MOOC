
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private Scanner reader;
    private FileWriter writer;

    public List<String> read(String file) throws FileNotFoundException {
        this.reader = new Scanner(new File(file));
        List<String> lines = new ArrayList<String>();
        while (reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
        reader.close();
        return lines;
    }

    public void save(String file, String text) throws IOException {
        this.writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        this.writer = new FileWriter(file);
        for (String text : texts){
            writer.write(text);
            writer.write("\n");
        }
        writer.close();
    }
}
