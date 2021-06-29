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
public class Belal_OOP_11 {
    public static void main(String[] args) {
    
        Test t = new Test();
        t.setTest("Test value here");
        
        System.out.println(t.getTest());
        
        
        
    }
}

class Test {
    private String test;
    
    public void setTest(String test) {
         this.test = test;
    }
    
    public String getTest() {
        return test;
    }
    
}
