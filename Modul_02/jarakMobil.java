package Modul_02.newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class jarakMobil {
    public static void main(String[]    args){
        int v0,a,t,t2;
        double setengah,sT;
       //Rumus = St = V0 * t + 1/2 * a * t^2//
        
        v0 =4;
        t  =2;
        a  =3;
        t2 =4;
        setengah =0.5;
        
        sT = v0 * t + setengah * a * t2;
        
        System.out.println("Jarak yang ditempuh mobil adalah "+sT);
      
    }
    
}
