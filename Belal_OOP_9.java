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
public class Belal_OOP_9 {
    public static void main(String[] args) {
    /*
        Inner class --> class within another class 
         to access class B first you should create an object for class A
        
        A ob = new A();
        A.B object = ob.new B();
        
        
        class A {
            class B {
            }
        }
    */    
    
    
    // class Com object
    Com myComputer = new Com();
    myComputer.RAM = 8;
    myComputer.color = "Black";
    myComputer.hdd = 500;
    
    // inner class object creation 
    // Class OS object creation 
    Com.OS operatingSystem = myComputer.new OS();
    operatingSystem.name = "Windows";
    operatingSystem.version = "10";
    operatingSystem.copy();
    
    // Innser class
    // Class Files object creation 
    Com.OS.Files file = operatingSystem.new Files();
    
    
    
    
    
    }
}

class Com {
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
    
    Com() {
        
    }
    // Inner class
    class OS {
        String name;
        String version;
        // Inner class
        class Files {
            String fileName;
            String fileLocation;
            
        }
        
        void boot() {
            
        }
        
        void createFile() {
            
        }
        
        void copy() {
            
        }
        
        void delete() {
            
        }
        
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
