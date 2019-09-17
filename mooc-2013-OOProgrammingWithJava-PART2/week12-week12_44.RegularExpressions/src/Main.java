
public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.println(isAWeekDay("tue")); //true
        System.out.println(isAWeekDay("tues")); //false
        System.out.println(allVowels("aeö")); //true
        System.out.println(allVowels("hiya")); //false
        System.out.println(clockTime("3:08:15")); //false
        System.out.println(clockTime("23:59:59")); //true
        System.out.println(clockTime("clocktime")); //false
        System.out.println(clockTime("25:60:60")); //false
        
    }
    
    public static boolean isAWeekDay(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;            
        }
        return false;
    }
    
    public static boolean allVowels(String string){
        if (string.matches("(a|e|i|o|u|ä|ö)*")){
            return true;
        }
        return false;
    }
    
    public static boolean clockTime(String string){
        if (string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        return false;
    }
}
