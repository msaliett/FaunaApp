/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.fauna.model;

/**
 *
 * @author ProvenSoft
 */
public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }


    
}
