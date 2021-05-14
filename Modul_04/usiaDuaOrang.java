package Modul_04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
import java.util.Scanner;
public class usiaDuaOrang {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        int tBadan, bBadan, bIdeal;
        String  nama;
        
        System.out.println("Program Menghitung Berat Ideal JAVA");
        System.out.println("-------------------------------------");
        
        System.out.print("Masukan Nama Anda : ");
        nama = keyboard.next();
        System.out.print("Masukan Tinggi Badan Anda : ");
        tBadan = keyboard.nextInt();
        System.out.print("Masukan Berat Badan Anda : ");
        bBadan = keyboard.nextInt();
        
        
        if (tBadan - bBadan < 90);
        System.out.println("Anda terlalu gemuk");
        
        if (tBadan - bBadan > 110);
        System.out.println("Anda Terlalu Kurus");   
    }
    
}
