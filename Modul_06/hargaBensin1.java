/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_06;

/**
 *
 * Hanjian Listanto
 */
import java.util.Scanner;
public class hargaBensin1 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        //.....Delkarasi Variabel.....//
        int  hLiter ,angka;
        angka = 1;
        
        //.....Memberian Nilai Untuk Varaibel yang dibutuhkan.....//

        
        hLiter = 0;
        
        System.out.println("Harga Per Liter Rp 6500");
        System.out.print(" Jumlah Liter  "); 
        
        System.out.println(" \t Harga  (Rp)");
       
        System.out.println("========================================="); 
        
        while (angka <= 20){
            System.out.print(angka);
            hLiter = hLiter + 6500;
            System.out.println("\t \t \t " + (hLiter ));
            angka++;
        }
        System.out.println("=========================================");

        
        }    
    }
    
