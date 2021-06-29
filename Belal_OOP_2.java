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
public class Belal_OOP_2 {
    public static void main(String[] args) {
        
        // create an object
        SecondMotorCycle motor1 = new SecondMotorCycle();
        
        motor1.color = "White";
        motor1.company = "Zarang";
        motor1.model = "2003";
        motor1.speed = 170;
        motor1.tires = 2;
        motor1.weight = 130;
        
        
        // Motor 1
        System.out.println(motor1.doBreak());

        motor1.move();
        
        motor1.start();
        
        motor1.stop();
     
        
    }
}

class SecondMotorCycle {
    String color;
    String model;
    int speed;
    int tires;
    String company;
    int weight;
    
    public static String doBreak() {
        return "The motorcycle breaked!";
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
