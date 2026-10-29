/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ozlem
 */
public class LinkedList<T extends Comparable<T>>  {
    
    Node<T> head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public void addToFront(T val){
        Node<T> newNode = new Node<>(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addToEnd(T val){
        Node<T> newNode = new Node<>(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node<T> iterator = head;
        while(iterator.next != null){
            iterator = iterator.next;
        }
        iterator.next = newNode;
        
    }
    
    public void display(){
        Node<T> iterator = head;
        while(iterator != null){
            //System.out.print(iterator.value + " ");
            System.out.print(iterator.toString() + " ");
            iterator = iterator.next;
        }
        System.out.println(" ");
    }
    
    public int count(){
        Node<T> iterator = head;
        int count = 0;
        while(iterator != null){
            count++;
            iterator = iterator.next;
        }
        return count;
    }
    
    public T finMin(){
        if(head == null){
            return null;
        }
        Node<T> iterator = head;
        T min = head.value;
        while(iterator !=null){
            if(iterator.value.compareTo(min) < 0){
                min = iterator.value;
            }
            iterator = iterator.next;
        }
        return min;
    }
}
