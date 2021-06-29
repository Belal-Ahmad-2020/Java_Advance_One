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
public class Belal_OOP_14 {
    // UniversityMember class
    
    // only this class can access it
    private int member_id;
    // shared properties     
    protected String name;
    protected String lastName;
    protected int age;
    protected boolean gender;
    protected String phone;
    protected String email;
    
    // to accesss these properties outside this class you should define setter and getter methods 
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    
    
    
    
    
    
    
    void attend() {
        System.out.println("The university member is attending!");   
    }
    
    
}
