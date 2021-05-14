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
public class ganjilGenap_08 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        
        int [] bil = { 23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        
        System.out.println("Bilangan Genap: ");
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] % 2 == 0 ){
                System.out.print(bil[i]+" "); 
            }  
        }
            System.out.println();
            System.out.println("Bilangan Ganjil : ");     
             for (int i = 0; i < bil.length; i++) {
                if(bil[i] % 2 != 0){
                 System.out.print(bil[i]+" ");
          }
       }
        System.out.println();
                   
    }
}
