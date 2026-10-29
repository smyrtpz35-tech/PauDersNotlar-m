/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author ozlem
 */
public class LabH4 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addToFront(5);
        ll.display();
        ll.addToEnd(3);
        ll.display();
        ll.addToFront(8);
        ll.display();
        ll.addToEnd(4);
        ll.display();
        System.out.println("Count: " + ll.count());
        System.out.println("Min: " + ll.finMin());
        
        
        LinkedList<String> sl = new LinkedList<>();
        sl.addToFront("Betul");
        sl.display();
        sl.addToEnd("Ece");
        sl.display();
        sl.addToEnd("Eda");
        sl.display();
        sl.addToFront("Yaren");
        sl.display();
        sl.addToEnd("Ayse");
        sl.display();
        
        System.out.println("Count: " + sl.count());
        System.out.println("Min: " + sl.finMin());
    }
}
