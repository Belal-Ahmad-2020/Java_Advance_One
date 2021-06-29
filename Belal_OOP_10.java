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
public class Belal_OOP_10 {
    public static void main(String[] args) {
        /*
        Encapsulation: protecting from class properties and methods 
            to do that we will use Access Modifiers 
            Data Hiding
            Public -->   All users can use   -->  Name
            Protected --> Some  users can use --> Date Of Birth
            Private  -->  No One can use   --> Password 
        
            to access private properites and methods you should use getter and setter methods 
            
            Getter Method:
                - has no parameter 
                - has return type 
        
            Setter Method: 
                - has parameter
                - has no return type 
        */
        
        Bycycle b1 = new Bycycle();
        b1.company = "Honda";
        b1.speed = 30;
        b1.setPrice(10000);  // set price  chek and validate data
        
        // get the price 
//        System.out.println(b1.getPrice());

       // get the price in dollor
        System.out.println(b1.getPrice(79.10));
        
    }
}


class Bycycle {
    String name;
    String model;
    String company;
    private int price;  // private 
    int tires;
    int speed;
    
    
    // getter method 
    /*
        public int getPrice() {
             return price;           
        }
    */  
    // you can add more logic inside getter method 
    public double getPrice(double rate) {        
        return price / rate;
    }
    
    // metod overloading 
    public int getPrice() {
        return price;
    }
    
    // Setter Method 
        public void setPrice(int price) {            
            if(price >= 2000 && price <= 50000) {
                this.price = price;
            }
            else {
                System.err.println("Invalid price! (Price should be between 2000 and 50000)");   
            }            
        }
    
    
    
}