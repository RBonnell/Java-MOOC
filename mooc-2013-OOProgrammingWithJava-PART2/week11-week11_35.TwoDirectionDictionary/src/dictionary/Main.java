package dictionary;

public class Main {
    public static void main(String[] args) throws Exception{
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println(dict.translate("one"));
        System.out.println(dict.translate("three"));
        System.out.println(dict.translate("five"));
        dict.add("seven", "eight");
        dict.add("nine", "ten");
        dict.add("eleven", "twelve");
        dict.remove("nine");
        System.out.println(dict.translate("seven"));
        System.out.println(dict.translate("nine"));
        
        dict.save();
    }
}
