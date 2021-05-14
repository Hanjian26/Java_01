/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class bilanganPrima_03 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int inputN, bil;
        
        System.out.print("Masukan Nilai N : ");
        inputN = keyboard.nextInt();
        
        // Bilangan Prima 
     
        for (int i = 0; i <= inputN; i++) {
            bil=0;
            for (int j = 1; j <= inputN; j++) {
                if(i % j == 0){
                    bil = bil + 1;
                }
                
            }
            if (bil == 2) {
                System.out.print(" "+i);
                
            }
        }
            System.out.println();
            System.out.println("Bilangan ke "+inputN);

    }
}