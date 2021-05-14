package Modul_02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Lingkaran {
    public static void main(String[] args){
        double phi,luas,r,d;
     System.out.println("Diketahuii");
      r = 5;
      d = 10;
      phi = 3.14;
    System.out.println("Jari-Jari= "+r);
    System.out.println("Diameter = "+d);
    System.out.println("Phi = "+phi);
      
      /*Menghitung keliling menggunakan diamenter Rumusnya Keliling = phi x d
      //Menghitung keliling menggunakan diamenter*/
     
      luas = phi*d;
      System.out.println("Menghitung keliling menggunakan diameter. Luas = phi x d ");
      System.out.println("Hasil keliling lingkaran menggunakan rumus pertama atau diameter adalah "+luas);
      System.out.println("");
      
     /*Menghitung keliling menggunakan Jari jari
      Rumusnya Keliling = 2 x phi x r
      */
     
    luas = 2*phi*r;
    System.out.println("Menghitung keliling menggunakan jari jari. Luas = 2*phi*d ");
    System.out.println("Diketahui =");
    System.out.println("r = "+r);
    System.out.println("Phi = "+phi);
    System.out.println("Hasil keliling menggunakan  jari jari = "+r+" phi = "+phi+"dan luas adalah = "+luas);    
    }
}

