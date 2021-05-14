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
public class bubblesort_09 {
    public static void main(String  []args){
        int jumlah,i,j, tukar;
        Scanner keyboard = new Scanner(System.in);

       System.out.print("Banyak Element : ");
       jumlah = keyboard.nextInt();

       int array[] = new int[jumlah];

       for(i = 0; i < jumlah;i++){
        System.out.print("Bilangan Ke : " + (i+1)+" : ");
        array[i] = keyboard.nextInt();
       }

        for(i = 0; i < (jumlah-1); i++){
             for(j = 0;j < jumlah-i-1; j++){
             if (array[j] > array[j+1]){
             tukar = array[j];
             array[j] = array[j+1];
             array[j+1] = tukar;
       }
     }
   }
        System.out.println();
        System.out.println("Bilangan Terurutnya adalah : ");
        for(i = 0;i<jumlah; i++)
        System.out.print(array[i] +" ");
 }
}
