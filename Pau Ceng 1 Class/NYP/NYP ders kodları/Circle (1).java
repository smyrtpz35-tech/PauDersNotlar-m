/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nyp2026;

public class Circle {
    int r;
    Point center;
    public Circle(){
        this(0,0,1);
    }
    public Circle(int x, int y, int r){
        this.r=r;
        this.center=new Point(x,y);
    }
    public Circle(Point p, int r){
        this.r=r;
        //this.center=p;//p ile aynı adresi gösterir birbirini etkiler 
       
        this.center=new Point(p.getX(), p.y);
    }
    public double area(){
        return Math.PI*this.r*this.r;
        
    }
    public double perimeter(){
        return Math.PI*2*this.r;
    }
    public double distance(Circle c){
        //return Math.sqrt(Math.pow(this.center.getX()-c.center.getX(), 2)+
        //                Math.pow(this.center.y-c.center.y, 2));
        return this.center.distance(c.center);
    }
    public String toString(){
        return "Circle center..:"+this.center.toString()+
                " radius..:" + this.r +
                " area...:" + this.area() +
                " perimeter..:" + this.perimeter();
    }
    

    
////ilk tasarım 
////    private int x;
////    int y;
////    int r;
////    public Circle(int x, int y, int r){
////        this.x=x;
////        this.y=y;
////        this.r=r;
////    }
////    public double perimeter(){
////        return Math.PI*2*this.r;
////    }
////    
////    public double area(){
////        return Math.PI*this.r*this.r;
////    }
////    
////    public double distance(Circle c){
////        return Math.sqrt(Math.pow(this.x-c.x, 2)+
////                        Math.pow(this.y-c.y, 2));
////    }
////    
////    public String toString(){
////        return "center is...:("+this.x+ "," +
////                this.y+") radius is..:"+ this.r +
////                " area is ..:"+ this.area()+ 
////                " perimeter is ..:"+ this.perimeter();
////    }
//    
}
