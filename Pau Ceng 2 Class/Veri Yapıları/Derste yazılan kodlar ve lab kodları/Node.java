/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gurha
 */
public class Node<T extends Comparable> {
    T value;
    Node<T> next;
    
    public Node(T val){
        this.value=val;
        this.next=null;
    }
    public String toString(){
        return this.value.toString();
        //return String.valueOf(this.value);
    }
    
}
