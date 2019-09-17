package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/wordList.txt");
        WordInspection wi = new WordInspection(file);
        System.out.println("Word count:");
        System.out.println(wi.wordCount());
        System.out.println("Words containing Z:");
        System.out.println(wi.wordsContainingZ());
        System.out.println("Words ending in L:");
        System.out.println(wi.wordsEndingInL());
        System.out.println("Palindromes:");
        System.out.println(wi.palindromes());
        System.out.println("Words which contain all vowels:");
        System.out.println(wi.wordsWhichContainAllVowels());
    }
    
}
