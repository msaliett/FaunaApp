/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.fauna;

import cat.proven.fauna.model.*;


/**
 *
 * @author ProvenSoft
 */
public class FaunaAp {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[3]; 
        Cat myCat = new Cat();
        myCat.setName("Garfield");
        animals[0] = myCat;
        
        animals[1] = new Dog();
        animals[2] = new Duck();
        
        
        FaunaAp myApp = new FaunaAp();
        myApp.letsTalk(animals);
    }

    private void letsTalk(Animal[] animals) {
        for (Animal a: animals){
            System.out.println("I'm a " + a.getClass().getSimpleName());
            System.out.println("My name is " +a.getName());
            a.makeSound();
        }
    }
    
}
