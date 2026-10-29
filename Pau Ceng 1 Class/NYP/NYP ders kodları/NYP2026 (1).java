/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nyp2026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gurha
 */
public class NYP2026 {
//
//    public static boolean search(int [] numbers, int value){
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i]==value)
//                return true;
//        }
//        return false;
//    }
//    public static int sum(int n){
//        if(n==0)
//            return 0;
//        return n+sum(n-1);
//    }
//    public static  int factorial(int n){
//        if(n==0)
//            return 1;
//        return n*factorial(n-1);
//    }
//    
////    public static double average(int a, int b, int c){
////        a=1;
////        b=99;
////        return (double)(a+b+c)/3;
////        
////    }
////    public static void display(int [] numbers){
////        for (int i = 0; i < numbers.length; i++) {
////            System.out.print(numbers[i]+" ");
////        }
////        System.out.println("");
////        numbers[0]=9999;
////    }
////    public static int[] copyArray(int [] numbers){
////        int [] copy=new int[numbers.length];
////        for (int i = 0; i < copy.length; i++) {
////            copy[i]=numbers[i];
////        }
////        return copy;
////    }
//    public static void display(int [][] matrix){
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
//    public static int [][] matrixSum(int [][] m1, int [][]m2){
//        int [][] sum=new int[m1.length][m1[0].length];
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                sum[i][j]=m1[i][j]+m2[i][j];
//            }
//        }
//        return sum;
//    }
//    public static void findIndices(String s, char c){
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)==c)
//                System.out.println(i);
//        }
//        
////        int index=0;
////        while(true){
////            index=s.indexOf(c,index);
////            if(index==-1)
////                return;
////            System.out.println(index++);
////            
////        }
//    }
//    public static void printChars(String s){
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.substring(i, i+1));
//        }
//        
//    }
        
        
        
        
        
        
    public static boolean search(int [] numbers, int value){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==value)
                return true;
        }
        return false;
    }    

    public static void displayMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] matrixSum(int [][]m1, int [][]m2){
        int [][] sum=new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return sum;
    }
    public static void findIndices(String s, char c){
        int index=0;
        while(true){
            index=s.indexOf(c,index);
            if(index==-1)
                return;
            System.out.print(index +"  ");
            index++;
        }
        
    }
    public static void main(String[] args) {
        Point p=new Point(8,9);
        Circle c1=new Circle();
        Circle c2=new Circle(3,4,2);
        Circle c3=new Circle(p, 7);
        //System.out.println(c3.toString());
        //System.out.println(c2);
        //System.out.println(c1.distance(c2));
        Circle [] circles=new Circle[3];
        circles[0]=c1;
        circles[1]=c2;
        circles[2]=c3;
        c1.r=9;
        for (int i = 0; i < circles.length; i++) {
           System.out.println(circles[i]);
    
        }
        ArrayList<Circle> list=new ArrayList<Circle>();
        list.add(c1);
        list.add(c2);
        list.add(0, c3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }







//        Point p1=new Point();
//        Point p2=new Point(3,4);
//        System.out.println(p1.toString());
//        System.out.println(p2);
//        System.out.println(p1.distance(7, 8));
//        System.out.println(p1.distance(p2));
//        System.out.println(p1.distance(new Point(5,5)));
//        System.out.println();
//        Point [] points=new Point[3];
//        //System.out.println(points[0].y);//null pointer exception
//        points[0]=p1;
//        points[1]=p2;
//        points[2]=new Point(6,7);
//        for (int i = 0; i < points.length; i++) {
//            System.out.println(points[i]);
//        }
//        Dog myDog3=new Dog();
//        Dog myDog4=new Dog("pulsar", false, 2020);
//        
//        System.out.println(myDog3);
//        System.out.println(myDog4);
//        
//        Dog myDog=new Dog();
//        myDog.birthYear=2020;
//        myDog.name="Tarçın";
//        System.out.println(myDog.birthYear+"  "+ myDog.name);
//        Dog myDog2=new Dog();
//        System.out.println(myDog2.birthYear+ " "+ myDog2.name);
//        myDog2=myDog;
//        System.out.println(myDog2.birthYear+ " "+ myDog2.name);
//        myDog2.birthYear=2022;
//        System.out.println(myDog.birthYear+"  "+ myDog.name);
//        System.out.println(myDog2);
//        myDog2.eat();
//        System.out.println(myDog2);
        
//        String s="abcabdea";
//        findIndices(s,'a');
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.substring(i, i+1));
//        }
//        int x=5;
//        String s1=String.valueOf(x);
//        
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//        int [] values={1,2,3,4,5};
//        for (int val:values) {
//            System.out.println(val);
//        }
//        
//        int [] values={8,3,6,2,8,5};
//        int [][] matrix={{2,4,1}, {4,1,2}};
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
//        displayMatrix(matrix);
//        //int[][] toplam=matrixSum(matrix, matrix);
//        //displayMatrix(toplam);
//        displayMatrix(matrixSum(matrix, matrix));
//        
        
        //boolean result=search(values, 15);
        //System.out.println(result);
        
//        int [] copyOfValues=copyArray(values);
//        values[0]=99;
//        System.out.println(copyOfValues[0]);
//        display(values);
//        display(copyOfValues);
//        System.out.println(copyOfValues[0]);
//        System.out.println(values[0]);
//        
//        int [] temp =new int[10];
//        temp=values;
//        temp[0]=99;
//        System.out.println(values[0]);
//        System.out.println(temp[7]);//index out of bound
//        System.out.println(temp.length);
//        
//        int min=values[0];
//        for (int i = 1; i < values.length; i++) {
//            if(values[i]<min)
//                min=values[i];
//        }
//        System.out.println("min..:"+min);
//        int tekToplam=0;
//        int ciftToplam=0;
//        int tekSayisi=0;
//        int ciftSayisi=0;
//        for (int i = 0; i < values.length; i++) {
//            if(values[i]%2==0){
//                ciftToplam+=values[i];
//                ciftSayisi++;
//            }else{
//                tekToplam+=values[i];
//                tekSayisi++;
//            }
//        }
//        System.out.println("tek sayılar toplamı..:"+tekToplam+
//                " ortalaması..:"+ (double)tekToplam/tekSayisi);
//        System.out.println("çift sayılar toplamı..:"+ciftToplam+
//                " ortalaması..:"+ (double)ciftToplam/ciftSayisi);
//        
//        for (int i = 0; i < values.length; i++) {
//            sum+=values[i];
//        }
//        System.out.println("toplamları..:"+sum);
//        System.out.println("ortalama..:"+ (double)sum/values.length);

//        int [] values={1,2,3,8,4};
//        int [] copyOfValues=new int[values.length];
//        for (int i = 0; i < values.length; i++) {
//            copyOfValues[i]=values[i];
//        }
//        display(values);
//        System.out.println(values[0]);
//        int a=5;
//        int x=4;
//        int c=8;
//        System.out.println(average(a,x,c));
//        System.out.println(a);
//        System.out.println(x);
//        
//        
//        Scanner scn=new Scanner(System.in);
//        //String input=scn.nextLine();
//        int number=scn.nextInt();
//        int factorial=1;
//        for (int i = 1; i <= number; i++) {
//            factorial*=i;
//        }
//        System.out.println(factorial);
//                
//        int kenar=Integer.parseInt(input);
//        for (int i = 0; i < kenar; i++) {
//            for (int j = 0; j < kenar; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//            
//        }
        
    }
}










