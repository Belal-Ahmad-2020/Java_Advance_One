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
public class Belal_OOP_5 {
    public static void main(String[] args)  {
        // Custom constructor 
        ComputerNew com1 = new ComputerNew("White", "HP 564", "HP", "Laptop", 15, 2500, 8, 2.4f, 2, 4);
                
    }
}
class ComputerNew {
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
    
    // default constructor 

     ComputerNew() {
         
    }
    
    
    
    // custom constructor 
    
    
     ComputerNew(String color, String model, String company, String type, int size, int price, int RAM, float cpu, int hdd, int graphic) {
        this.color = color;
        this.model = model;
        this.company = company;
        this.type = type;
        this.size = size;
        this.price = price;
        this.RAM = RAM;
        this.cpu = cpu;
        this.hdd = hdd;
        this.graphic = graphic;
    }

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