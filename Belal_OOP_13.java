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
public class Belal_OOP_13 {
    public static void main(String[] args) {
    /*
    Access Specifier 
        Public    --> All Class
        Protected --> only derived class (Child classes)
        Private   --> only parent class 
        Package Level Access  --> two classes in one package 
        
        default access modifier is private 
        
        when two classes are in the different pacakges java let us to import them
        to access all properties and methods the class mwmbers should be public 
        
        
        
    */
        
        
    Student s = new Student();
    Teacher t = new Teacher();
    Employee e = new Employee();
    
        
    }
}


class UniversityMember {
    // only this class can access it
    private int member_id;
    // shared properties     
    protected String name;
    protected String lastName;
    protected int age;
    protected boolean gender;
    protected String phone;
    protected String email;
    
    void attend() {
        System.out.println("The university member is attending!");   
    }
}

class studentA {
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

class TeacherA {
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

class EmployeeA {
    int salary;
    String position;
    
    void work() {
        System.out.println("Employee is working!");
    } 
    
    void getSalary() {
        System.out.println("Employee is getting salary!");
    }
}

