/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_07;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class persamaanKuadrat1 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        double a, c, nilaiAkar1, nilaiAkar2, b;
       
        System.out.println("Program Jenis Dan Nilai Akar Persamaaan Kuadrat");
        System.out.println("================================================");
        
        System.out.print("Masukan Koefisien x2  : ");
        a = keyboard.nextInt();
        System.out.print("Masukan Kofeisien x   : ");
        b = keyboard.nextInt();
        System.out.print("Masukan Koefisien     : ");
        c = keyboard.nextInt();
        
        nilaiAkar1 = ((b * b) + Math.sqrt (b * b  - 4 * a * c)) /2 * a;
        System.out.println("Nilai Akar Adalah "+nilaiAkar1);
        nilaiAkar2 = ((b * b) - Math.sqrt (b * b  - 4 * a * c)) /2 * a;
        System.out.println("Nilai Akar Adalah "+nilaiAkar2);
        
        
        
         
        
        /*
        do{
        
    }while();
    */    
        
        
    }
}
