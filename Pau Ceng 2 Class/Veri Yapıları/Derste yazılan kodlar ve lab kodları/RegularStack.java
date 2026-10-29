/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev;

/**
 *
 * @author Rüveyda
 */
public class RegularStack {
    
    //s ve s2 deki tüm elemanları sıralamadan direkt s3'e ekle
    public static Stack birlestir( Stack s, Stack s2) throws Exception{
        Stack s3 = new Stack(s.count() + s2.count());
        Stack sCopy = new Stack(s.count());
        Stack s2Copy = new Stack(s2.count());
        while(!s.isEmpty()){
            int value = s.pop();
            sCopy.push(value);
            s3.push(value);
            
        }
        while(!s2.isEmpty()){
            int value = s2.pop();
            s2Copy.push(value);
            s3.push(value);
            
        }
        while(!sCopy.isEmpty()){
            s.push(sCopy.pop());
        }
        while(!s2Copy.isEmpty()){
            s2.push(s2Copy.pop());
        }
        //s3 ü sırala
        sirala(s3);
        return s3;
    }
    
    
    private static void sirala(Stack s) throws Exception {
        Stack gecici = new Stack(s.size());
        
        while (!s.isEmpty()) {
            int x = s.pop();
            //geçicinin en üstündeki elemanlar x ten büyükse s ye geri gönder
            while (!gecici.isEmpty()) {
                int y = gecici.pop();
                if (y <= x) {
                    gecici.push(y);  // y doğru yerindeymiş döngüden çık 
                    break;
                }
                s.push(y);  //y x ten büyük daha sonra tekrar işlenecek          
            }

            gecici.push(x);    //x i doğru yerinde koy       
        }

        //geçici de en büyük üstte tersine çevir s ye aktar
        while (!gecici.isEmpty()) {
            s.push(gecici.pop());
        }
    }
}
