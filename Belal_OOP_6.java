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
public class Belal_OOP_6 {
    public static void main(String[] args) {
        // create an object 
        Mobile m1 = new Mobile("Samsung Galaxy Note 9", "Note 9", "Samsung", 850, 6, 8, 64);
        m1.turnOff();
        m1.turnOn();
        System.out.println(m1.company);
        
        // create another object
        Mobile m2 = new Mobile("Iphone", "8 plus", "Apple", 970, 7, 12, 128);
        m2.turnOff();
        m2.turnOn();
        System.out.println(m2.company);
                
    }
}

// class
class Mobile {
    
    // properties
     String name;
     String model;
     String company;
     int price;
     int size;
     int RAM;
     int storage;

    // Default constructor 
     Mobile() {
    
     }
     
     // custom constructor 
     Mobile(String name, String model, String company, int price, int size, int RAM, int storage) {
         this.name = name;
         this.model = model;
         this.company = company;
         this.price = price;
         this.size = size;
         this.RAM = RAM; 
         this.storage = storage;
     }
                   
     
     // methods
     void turnOn() {
         System.out.println("THe mobile is turned on!");
     }
     
     void turnOff() {
         System.out.println("THe mobile is turned off!");
     }
     
     
}
