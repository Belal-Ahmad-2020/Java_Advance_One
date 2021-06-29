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
public class Belal_OOP_8 {
    public static void main(String[] args) {
    /*
        Static and Non Static Members 
        by default every property is non static 
        
        
    */
        
    //    instantiation 
    //    new MobileNew().color = "white";
   
    // MobileNew.company = "Samsung"; // it will added to all object company property
    
    // you can access to a static property or method directly there is no need to create an object 
    MobileNew.company = "Samsung";
    MobileNew.mobInfo();
    
    MobileNew m1 = new MobileNew();          
    m1.company = "Samsung";    
    MobileNew m2 = new MobileNew();
    m2.company = "Iphone";
    
    // replaced by m2 object value because company is static
    System.out.println(m1.company);
    
    }
}

class MobileNew {
    
    // properties 
    String name;
    String type;
    String model;
    String color;
    static String company;  // shareable property between all objects
    double size;
    String reslution;
    int camera;
    int RAM;
    int price;
    int storage;
    int battery;
    
    // default constructor 
    MobileNew() {
        
    }
    
    // custom constructor 
    MobileNew(String name, int camera, int price) {
        this.name = name;        
        this.camera = camera;
        this.price = price;
    }
    
    MobileNew(String color, double size, int RAM, int storage) {
        this.color = color; 
        this.size = size;
        this.RAM = RAM;
        this.storage = storage;
    }
    
    
    
    // Methods 
    
    static void mobInfo() {
        System.out.println("all about mobile");
    }
    
    
    void powerOn() {
        System.out.println("The mobile has been turned on!");
    }
    
    void powerOff() {
        System.out.println("The mobile has been turned off!");
    }
    
    void call() {
        System.out.println("Mobile is calling!");
    }
    
    void takePhoto() {
        System.out.println("Mobile is taking photo!");
    }
    
    
}
