/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;



/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class modif_02 {
    public static void main(String   []args){
        //.....Deklarasi Array.....//
        int[] hitung;
        int[] cadangan;
         hitung = new int[5];
         cadangan = hitung;
         
         Scanner Keyboard = new Scanner(System.in);
         System.out.println("Masukkan 5 data bulat");
                  
         for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" Adalah : ");
                hitung[i] = Keyboard.nextInt();
            }

                 System.out.println();
                System.out.println("Array untuk Hitung");
                for(int i = 0; i <= 4; i++){
                System.out.println("Data ke "+ (i+1) +" Adalah : "
                + hitung[i]);
                }
            
         
                System.out.println();
                System.out.println("Array untuk cadangan");
                for(int i=0; i <= 4; i++){
                System.out.println("Data ke "+ (i+1) +" Adalah : "
                + cadangan[i]);
                }

    }
   
}
