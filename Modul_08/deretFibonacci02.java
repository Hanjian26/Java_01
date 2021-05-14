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
public class deretFibonacci02 {
    public static void main(String  []args){
        int banyakSuku,hasil = 0, a= 0 , b=1;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Deret Hitungan Fibonacci");
        System.out.println("===========================");
        System.out.print("Masukan Banyak Suku : ");
        banyakSuku = keyboard.nextInt();
        
        
        for(int i = 1;  i <= banyakSuku; i++){
        
         a=b;
         b=hasil;

         hasil=a+b;
         System.out.print(hasil+" ");
        }
        
        
    }
    
}
