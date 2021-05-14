package Modul_03B;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */

import  java.util.Scanner;
public class SegitigaSembarangBenar {
    public static void main(String[]    args){
     double x1, y1, x2, y2, x3, y3, xa, ya, xb, yb, xc, yc, a, b, c, k, s, l ;
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Diketahui Titik Koordinat");
     System.out.print("x1 = ");
     x1 = keyboard.nextDouble();
     System.out.print("y1 = ");
     y1 = keyboard.nextDouble();
     System.out.print("x2 = ");
     x2 = keyboard.nextDouble();
     System.out.print("y2 = ");
     y2 = keyboard.nextDouble();
     System.out.print("x3 = ");
     x3 = keyboard.nextDouble();
     System.out.print("y3 = ");
     y3 = keyboard.nextDouble();
     
     System.out.println("Menghitung Panjang Sisi Masing Masing ");
     xa = x2 - x1;
     ya = y2 - y1;
     a = Math.sqrt((xa * xa) + (ya * ya ));
     xb = x3 - x2;
     yb = y3 - y2;
     b = Math.sqrt((xb * xb) + (yb * yb ));
     xc = x1 - x3;
     yc = y1 - y3;
     c = Math.sqrt((xc * xc) + (yc * yc ));
     
     System.out.println("");
     k = (a + b + c)/2;
     s = k/2;
     l = Math.sqrt(s * (s-a)*(s-b)*(s*c));
     System.out.println("Panjang sisi AB Segitiga yaitu = "+a );
     System.out.println("Panjang sisi BC Segitiga yaitu = "+b );
     System.out.println("Panjang sisi CA Segitiga yaitu = "+c );
     System.out.println("Nilai Luas yaitu = "+l);
      
    }
}
