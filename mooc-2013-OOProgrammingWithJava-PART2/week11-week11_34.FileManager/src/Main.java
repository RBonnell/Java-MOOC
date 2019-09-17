
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();

        List<String> lines = new ArrayList<String>();
        lines.add("This is the first line");
        lines.add("Voici la deuxième ligne");
        lines.add("Hier ist die dritte zeil");
        lines.add("Aquí está la cuarta línea");
        lines.add("Tässä on viides rivi");
        
        f.save("src/testinput1.txt", lines);
    }
}

