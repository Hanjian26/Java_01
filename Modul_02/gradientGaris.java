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
public class gradientGaris {
    public static void main(String[] args){
        double x1, y1, x2, y2;
        double gradientM;
        
        System.out.println("Menentukan gradient garis  yang menghubungkan ");
        System.out.println("2 titik yakni (x1,y1) dan (x2,y2) dengan rumus");
        System.out.println("Gradient (m) = (y1-y2)/(x1-x2)");
        System.out.println("Tentukan terlebih dahulu nilai awal dan keluarannya");
        //Menentukan nilai awal//
        
        System.out.println("Jawab");
        System.out.println("");
        x1 = 10;
        System.out.println("x1="+x1);
        y1= 12;
        System.out.println("x1="+y1);
        x2 =8;
        System.out.println("x2="+x2);
        y2=4;
        System.out.println("y2="+y2);
 
     /*Menghitung gradient garis  
     /Rumus Gradient (m) =(y1-y2) / (x1 -x2 )*/
     
     System.out.println("Menghitung gradient garis");
     gradientM =(y1-y2)/(x1-x2);
     System.out.println("gradientM =(y1-y2)/(x1-x2) = "+gradientM);    
    }
}
