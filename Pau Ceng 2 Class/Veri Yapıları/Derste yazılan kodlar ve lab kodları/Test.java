/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vy2026;

/**
 *
 * @author gurha
 */
public class Test {

    public static boolean linearSearch(int[] numbers, int value) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return true;
            }

        }
        return false;

    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;

    }

    public static int[] copy(int[] numbers) {
        int[] kopya = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            kopya[i] = numbers[i];
        }
        return kopya;
    }

    public static double tekCiftOrani(int[] numbers) {
        return (double) tekToplam(numbers) / ciftToplam(numbers);

    }

    public static int ciftToplam(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        //numbers[0]=7;//bu değişiklik dışarda da geçerli
        return sum;

    }

    public static int tekToplam(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 1) {
                sum = sum + numbers[i];
            }
        }
        //numbers[0]=7;//bu değişiklik dışarda da geçerli
        return sum;

    }

    public static double ortalama(int[] numbers) {
        int sum = toplam(numbers);
        double average = (double) sum / numbers.length;
        return average;

    }

    public static int toplam(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        //numbers[0]=7;//bu değişiklik dışarda da geçerli
        return sum;

    }

    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(5);
        
            
            myStack.push(3);
            myStack.push(5);
            myStack.push(7);
            myStack.push(8);
            myStack.pop();
            myStack.display();
        
        Stack stk=new Stack(myStack.size());
        Stack stkTemp=new Stack(myStack.size());
        while(!myStack.isEmpty()){
            int temp=myStack.pop();
            stkTemp.push(temp);
            stk.push(temp);
            
        }
        while(!stkTemp.isEmpty())
            myStack.push(stkTemp.pop());
        stk.display();
        myStack.display();
        
//        int x=9;
//        int [] numbers=new int[10];
//        numbers[1]=5;
//        numbers[6]=8;
//        
//        int [] sayilar=numbers;//hafizada aynı yeri gösterirler. 
//        int sonuc=toplam(numbers);
//        sayilar=copy(numbers);
//        System.out.println("dizinini elemanlarının toplamı"+sonuc);
//        System.out.println(numbers[0]);
    }
}
