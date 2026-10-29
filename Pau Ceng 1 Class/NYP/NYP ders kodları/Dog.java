/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nyp2026;

/**
 *
 * @author gurha
 */
public class Dog {
    public String name;
    private boolean hungry;
    public int birthYear;
    public Dog(){//default constructor
        name="Efes";
        hungry=true;
        birthYear=2024;
    }
    public Dog(String n, boolean hungry, int year){
        this.name=n;
        this.hungry=hungry;
        this.birthYear=year;
    }
    
    public void eat(){
        hungry=false;
    }
    public String toString(){
        return this.name+ "  " + this.birthYear +"  "+
                            this.hungry;
    }
    
}
