import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Scanner reader = new Scanner(System.in);
        int grade = 0;
        Grades gradeList = new Grades();
        while(grade != -1){
            System.out.println("Type exam scores, -1 completes: ");
            grade = reader.nextInt();
            if ((grade <= 60 && grade >= 0)){
            gradeList.addGrade(grade);
            }
        }
        
        int[] tallied = gradeList.tallyGrades(gradeList.getGrades());
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        gradeList.printStar(tallied[0]);
        System.out.println();
        System.out.print("4: ");
        gradeList.printStar(tallied[1]);
        System.out.println();
        System.out.print("3: ");
        gradeList.printStar(tallied[2]);
        System.out.println();
        System.out.print("2: ");
        gradeList.printStar(tallied[3]);
        System.out.println();
        System.out.print("1: ");
        gradeList.printStar(tallied[4]);
        System.out.println();
        System.out.print("0: ");
        gradeList.printStar(tallied[5]);
        System.out.println();
        System.out.println("Acceptance percentage: " + gradeList.calculateAcceptance());
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

}
