/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_08;

/**
 *
 * @author Hanjian Listanto
 */
import  java.util.Scanner;
public class totalTahanan01 {
    public static void main(String  []args){
    Scanner keyboard = new Scanner(System.in);
        int   bTahanan, nilaiR,seri, tentRangkaian;
        double paralel = 0;
        seri = 0;
       
        
        System.out.print("Masukan Banyak Resistor : ");
        bTahanan = keyboard.nextInt();
        System.out.println("==============================================");
  
        
        for (int a=1; a<= bTahanan; a++){
             System.out.print("Masukan Resistor ke "+a+" : ");
             nilaiR = keyboard.nextInt();
             seri = seri + nilaiR;
             paralel =  ((double) (paralel + 1.0/nilaiR)) ;
         }  
        
        System.out.println("==============================================");
        System.out.println("Disusun Seri atau Parelel ?");
        System.out.println("Masukan Angka 0 untuk Seri dan 1 Untuk Paralel");
        System.out.print ("Masukan Angka (0-1) : ");
        tentRangkaian = keyboard.nextInt();
                
                
        System.out.println("==============================================");
        switch (tentRangkaian) {
            case 0:
                System.out.println("Anda Menggunakan Rangkaian Seri");
                System.out.println("Nilai Total Pada Rangkaian Resistor Nilai Seri : "+seri+" Ohm ");
                break;
            case 1:
                System.out.println("Anda Menggunakan Rangkaian Paralel");
                System.out.println("Nilai Total Pada Rangkaian Resistor Nilai Paralel : "+paralel+" Ohm");
                break;
            default:
                System.out.println("Angka hanya antara 0 dan 1");
                
                break;
        }
         
    }
   }


