/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_03B;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class beratIdeal {
    public static void main(String []args){
    int tBadan, bBadan, bIdeal;
    String nama;
    
   Scanner keyboard = new Scanner(System.in);
   System.out.println("PROGRAM BERAT IDEAL = ");
   
   System.out.print("Nama Anda : ");
   nama = keyboard.next();
   
   System.out.print("Tinggi Anda (CM) : ");
   tBadan = keyboard.nextInt();
   System.out.print("Berat Badan Anda : ");
   bBadan = keyboard.nextInt();
   System.out.println("");
   
   //.....Rumus Tinggi Badan - 100......//
   bIdeal = tBadan - 100;
   System.out.print("Berat ideal Anda adalah : "+bIdeal);
   System.out.println("");

    } 
}
