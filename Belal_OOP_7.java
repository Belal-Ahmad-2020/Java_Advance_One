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
public class Belal_OOP_7 {
    public static void main(String[] args) {
    /*
      Function Overloading 
          multiple functions with 
            different names
            different number of parameters 
        
        Constructor overloading --> same name different parameters
        
    */
    

    Person p1 = new Person("Ahmad", "Mohammad Nabi", "Ahmadi", 20, 1.74f, 65.3f);
        
    Person p2 = new Person("Mohammad", "Mohammadi", 27);
    
    Person p3 = new Person("Ali", "Haqjoh", 34, 76.5f);
    
    
    System.out.println(p1.height);
    p1.move();
    
    System.out.println(p2.name);
    p2.running();
    
    
    System.out.println(p3.weight);
    p3.sleep();
    
    }
}

class Person {
    
    // Propeties 
    String name;
    String fatherName;
    String lastName;
    String job;
    int age;    
    float height;
    float weight;
    
    //default constructor
    Person() {
        
    }
    
    // custom constructor 
    Person(String name, String fatherName, String lastName, int age, float height, float weight) {
        this.name = name;
        this.fatherName = fatherName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
    }
    
    // constructor overloading 
    Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    
    // Constructor overloading 
    Person(String name, String lastName, int age, float weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }
    
    void move() {
        System.out.println("Moving ...!");
    }
    
    void running() {
        System.out.println("Running ...!");
    }
    
    void sleep() {
        System.out.println("Sleeping ...!");
    }
    
    
    
}