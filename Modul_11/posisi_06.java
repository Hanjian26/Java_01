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
public class posisi_06 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int cari;
        int[] angka = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        int periksa = 0;

        System.out.print("Nilai yang dicari : ");
        cari = keyboard.nextInt();
        
        for (int n = 0; n < angka.length; n++) {       
            if (angka[n] == cari){
                System.out.println("Berada di indeks : "+n); 
                periksa++;
            }
    }
     if(periksa == 0){
         System.out.println("Tidak Ada");
     }   
        
    }
}
