/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_10;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class segitigaPascal_02 {
public static void main(String  []args){
  //.....Metode Menghitung N!......//
        hitungN();    
 //.....Metode menghitung C (n,r).....//
        int a, i, j;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        a = keyboard.nextInt();
        for (i=0; i<a; i++){
            for (j=0; j<a-i-1; j++){
                System.out.print(" ");
      } 
                for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
        System.out.println();
}
             //.....Metode Menghitung N!......//
       public static void hitungN(){
            Scanner keyboard = new Scanner (System.in);    
            int faktorial = 1;
        
                System.out.print("Masukkan nilai N Faktorial: ");
                int n = keyboard.nextInt();
                for(int i = 1; i<=n; i++){
                    faktorial = i * faktorial;
        }
                System.out.println("Faktorial "+n+"! adalah "+faktorial);
    } 
       
             //.....Metode menghitung C (n,r).....//
    static int faktorial(int n){
    int z =1;
    int i = 1;
    while(i <= n){
      z=z*i;
      i++;
    }
     
    return z;
   } 
 }
