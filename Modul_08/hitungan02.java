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
public class hitungan02 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        double n, jmlhKuadrat = 0, x, a =0, b =0, c =0;

        do{
            System.out.print("Masukan Banyak Data : ");
            n = keyboard.nextInt();
            
        }
        while(n <= 0) ;
            
        for (int i = 1; i <= n; i++){
            System.out.print("Nilai Data "+i+" : ");
            x = keyboard.nextDouble();
            a = a + Math.pow(x,2);
            b = b + Math.sqrt(x);
            if(x!=0) c = c + 1/x;
                }
        
        
        
        System.out.println("Nilai Jumlah Kuadratnya     = "+a);
        System.out.println("Nilai Jumlah Akarnya        = "+b);
        System.out.println("Nilai data/i untuk data yang tidak sama dengan 0 = "+c);

        
    }
    
}
