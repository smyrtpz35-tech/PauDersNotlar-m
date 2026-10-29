/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev;

/**
 *
 * @author Rüveyda
 */
public class Odev {

    public static void main(String[] args) throws Exception {
        Stack s= new Stack(7);
        s.push(9);
        s.push(14);
        s.push(7);
        s.push(4);
        s.push(12);
        s.push(6);
        s.push(2);
        
        Stack s2 = new Stack(9);
        s2.push(11);
        s2.push(3);
        s2.push(1);
        s2.push(8);
        s2.push(15);
        s2.push(5);
        s2.push(10);
        s2.push(13);
        s2.push(16);
        
        
        Stack s3=RegularStack.birlestir(s, s2);
        s3.display();
    }
}
