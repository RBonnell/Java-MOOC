/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Student {
    private String Name;
    private String studentNumber;   


public Student (String name, String studentNumber){
    this.Name = name;
    this.studentNumber = studentNumber;
}

public String getName(){
    return Name;
}
public String getStudentNumber(){
    return studentNumber;
}
public String toString(){
    return Name + " (" + studentNumber + ")";
}

}