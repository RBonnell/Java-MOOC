
public class Smileys {
    
    
    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        System.out.println();
        printWithSmileys("Beerbottle");
        System.out.println();
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        String word = characterString;
        if (word.length() % 2 == 1){
            word += " ";
        }
        word = ":) " + word + " :)";
        printSmilesToLength(word);
        System.out.println();
        System.out.println(word);
        printSmilesToLength(word);
        System.out.println();
    }
        
    public static void printSmilesToLength(String wordWithSpaces){
        for (int i = 0; i < (wordWithSpaces.length()/2); i++){
            System.out.print(":)");
        }
    }
}






