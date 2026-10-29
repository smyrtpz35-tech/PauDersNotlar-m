/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nyp2026;

/**
 *
 * @author gurha
 */
public class Point {

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    private int x;
    public int y;
    
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distanceFromOrigin(){
        return distance(0,0);
    }
    public double distance(int x2, int y2){
        return Math.sqrt((this.getX()-x2)*(this.getX()-x2)+
                   (this.y-y2)*(this.y-y2));
    }
    public double distance(Point p){
        //return Math.sqrt((this.x-p.x)*(this.x-p.x)+
        //           (this.y-p.y)*(this.y-p.y));
        return distance(p.getX(), p.y);
    }
    public String toString(){
        return "(" + this.getX()+","+this.y+")";
    }
}
