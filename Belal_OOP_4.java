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
public class Belal_OOP_4 {
    /*
        Class Member 
        1 Property 
        2 Method 
        3 constructor
        4 Inner Class 
        
        constructor --> special function , do not return any value
                        should be the same as class name     
                        the best place to initialize to properties of a class 
        default constructor  -- > predefined   --> has no parameter 
        Custom constructor--> user defined   --> has parameter
            
    */
    
    public static void main(String[] args) {
         // create an object 
        Computer com = new Computer();
    
        // Computer()   --> default constructor 
        com.color = "White";
        com.company = "HP";
        com.model = "HP 756E";
        com.type = "Laptop";
        
        com.RAM = 8;
        com.cpu = 2.4f;
        com.graphic = 2;
        com.hdd = 1024;
        com.price = 100000;
        com.size = 15;
        
        
        System.out.println(com.RAM);
        System.out.println(com.company);
        
        com.boot();
        com.turnOn();
        com.turnOff();
    }
}


class Computer {
    String color;
    String model;
    String company;
    String type;
    int size;
    int price;
    int RAM;
    float cpu;
    int hdd;
    int graphic;
    
    void turnOn() {
        System.out.println("THe computer has been turned on!");
    }
    
    void turnOff() {
        System.out.println("THe computer has been turned off!");
    }
    
    void boot() {
        System.out.println("The computer is booting !");
    }
    
    
}