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
public abstract class Animal {
    
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = "Animal->"+name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public abstract void makeSound();
    
}
