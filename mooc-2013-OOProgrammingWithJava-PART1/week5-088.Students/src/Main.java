
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList();
        String name = "name";
        String studentNumber;
        
        while (true){
        System.out.println("name: ");
        name = reader.nextLine();
        if (name.equals("")){
            break;
        }
        System.out.println("student number: ");
        studentNumber = reader.nextLine();
        Student student = new Student(name, studentNumber);
        students.add(student);
        }
        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String st = reader.nextLine();
        System.out.println("Result:");
        for (Student student : students){
            if (student.getName().contains(st)){
                System.out.println(student);                
            }  
        }
    }
}
