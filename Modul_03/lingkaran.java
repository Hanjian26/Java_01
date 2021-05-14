/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_03;

/**
 *
 * @author acer
 */
public class lingkaran {
    public static void main(String[]    args){
        int jari;
        double keliling, phi, luas;
        /* Nilai yang diketahui */
       System.out.println("Diketahui");
       jari = 10;
       System.out.println("Jari - Jari =" +jari);
       phi =3.14;
       System.out.println("Nilai phi = " +phi);
       System.out.println("Hitunglah luas dan keliling lingkaran jika r (Jari - Jari) diketahui");
       
       // ..Rumus menghitung luas L = π(r)²..//
       //..Jawaban..//
       System.out.println("Jawab");
       System.out.println("Rumus menghitung luas jika r dikethaui L = phi(jari)^2");
       luas = phi* jari * jari;
       System.out.println("Hasil dari Luas Lingkaran yaitu =" +luas);
       
       //..Rumus menghitung Keliling Lingkaran = 2πr..//
       System.out.println("");
       System.out.println("Rumus menghitung Keliling = 2*phi*jari");
       keliling = 2 * phi * jari;
       System.out.println("Hasil dari Keliling Lingkaran yaitu ="+ keliling);
    }
}
