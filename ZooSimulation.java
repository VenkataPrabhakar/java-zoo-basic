/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.edu;

/**
 *
 * @author S545407
 */
public class ZooSimulation {
    
    
    static String greeting = "Welcome to Memphis Zoo!";
        
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      Okapi alice = new Okapi();
      alice.speak();
      alice.move();
      alice.look();
      
    }
}

