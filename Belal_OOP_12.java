/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOreiented;

/**
 *
 * @author Full-Stack
 */
public class Belal_OOP_12 {
    public static void main(String[] args) {
    /*
        Inheritance 
            a class can inherit from another class 
            when we have multiple with shared member classes on that
            time we can use inheritance 
        
        Super Class (Parent)    
        Child Class (Child)
        
    */
    
    Student s = new Student();
    Teacher t = new Teacher();
    Employee e = new Employee();
    
    
    
    
    }
}


class UniMember {
    // shared properties 
    String name;
    String lastName;
    int age;
    boolean gender;
    String phone;
    String email;
    
    void attend() {
        System.out.println("The university member is attending!");   
    }
    
}

// Student is child of UniMember 
class Student extends UniMember{
    String faculty;
    String department;   
    int semster;

    
    void study() {
        System.out.println("Student is studying!");   
    }
    
    void participateExam() {
        System.out.println("Student is participating!");   
    }     
}


// Teacher is a child of UniMember
class Teacher extends UniMember{
    String faculty;
    String department;
    int salary;
    String[] subject; 
    
    void takeExam() {
        System.out.println("The teacher is taking exam!");
    }
    
    void teach() {
        System.out.println("The teacher is teaching!");
    }
    
    void getSalary() {
        System.out.println("The teacher is getting salary");
    }   
}


// Employee is a child of UniMember
class Employee extends UniMember {
    int salary;
    String position;
    
    void work() {
        System.out.println("Employee is working!");
    } 
    
    void getSalary() {
        System.out.println("Employee is getting salary!");
    }
     
}
