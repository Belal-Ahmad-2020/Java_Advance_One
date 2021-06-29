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
public class Belal_OOP_1 {
    public static void main(String[] args) {
        /*
            Don't invent the wheel again!
            Framework --> already codes 
        OOP -- Object Oriented Programming -- class & object
        OOD -- Object Oriented Design  -- Map  (Property, Method)
        
        Class -- colection of properties and methods 
                property - variable
                method   - function
        
        Object -- an instance of a class
                Construct                                                  
        
        to create an object 
        ClassNmae objectName = new ClassName();
//        
        */
        
        // create an object
        MotorCycle motor1 = new MotorCycle();
        
        motor1.color = "White";
        motor1.company = "Zarang";
        motor1.model = "2003";
        motor1.speed = 170;
        motor1.tires = 2;
        motor1.weight = 130;
        
        // create another object
        MotorCycle motor2 = new MotorCycle();
        
        motor2.color = "Black";
        motor2.company = "Wahab";
        motor2.model = "2007";
        motor2.speed = 169;
        motor2.tires = 2;
        motor2.weight = 170;
        
        // Motor 1
        System.out.println(motor1.color);
        System.out.println(motor1.company);
        System.out.println(motor1.speed);
        
        
        // Motor 2
        System.out.println(motor2.model);
        System.out.println(motor2.tires);
        System.out.println(motor2.weight);
        
        motor2.doBreak();
    }
}

class MotorCycle {
    String color;
    String model;
    int speed;
    int tires;
    String company;
    int weight;
    
    void doBreak() {
        System.out.println("The motorcycle breaked!");
    }
    
    void move() {
        System.out.println("The motorcycle moving!");
    }
    
    void start() {
        System.out.println("The motorcycle is started!");
    }
    
    void stop() {
        System.out.println("The motorcycle has been turned off!");
    }
    
    
    
}
