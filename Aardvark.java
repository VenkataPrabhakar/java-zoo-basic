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
public class Aardvark extends Animal {
     @Override
    public void speak() {
        System.out.println("I'm an Aardvark!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
    @Override
    public void look() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
}
