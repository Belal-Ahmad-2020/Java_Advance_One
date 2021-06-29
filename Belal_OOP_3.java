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
public class Belal_OOP_3 {
    public static void main(String[] args) {
        
        Tv tv1 = new Tv();
        
        tv1.color = "Black";
        tv1.company = "Samsung";
        tv1.is_expensive = true;
        tv1.model = "edge";
        tv1.name = "Samsung 234";
        tv1.price = 1590;
        tv1.size = 32;
        tv1.quality = "High";
        
        
        System.out.println(tv1.color);
        System.out.println(tv1.company);
        System.out.println(tv1.is_expensive);
        System.out.println(tv1.model);
        
        
        System.out.println(tv1.display());
        
  
        
    }
}

class Tv {
    
    String name; 
    String model;
    String color; 
    String company; 
    int size;
    int price;
    String quality;
    boolean is_expensive;
    
    
    public String turnOn() {
        return "TV has been turned on!";
    }
    
    public  String turnOf() {
        return "TV has been turned off!";
    }
    
    public String display() {
        return "TV is started!";
    }
    
    
    
}
