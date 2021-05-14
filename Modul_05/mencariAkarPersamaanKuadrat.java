/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_05;

/**
 *
 * @Hanjian Listanto
 */
import java.util.Scanner;
public class mencariAkarPersamaanKuadrat {
    public static void main(String  []args){
        Scanner keyboard =  new Scanner(System.in);
        double x1, x2, a, b, c, D;
        
        System.out.println("Mencari Akar Persamaan Kuadrat");
        System.out.println("----------------------------------");
        
        
        System.out.print("Koefisien x2 (a) : ");
        a = keyboard.nextDouble();
        System.out.print("Koefisien x (b) : ");
        b = keyboard.nextDouble();
        System.out.print("Koefisien  (c) : ");
        c = keyboard.nextDouble();
        
        D = b *b  - ( 4*a*c );
        //.....Tidak Mempunyai Akar Real.....//
        if ( D < 0 || a == 0 ){
            System.out.println("Tidak Mempunyai Akar Real");
        }
        //.....Apabila Akarnya sama......//
        else if(D == 0 ){
            x1 = -b / (2*a);
            System.out.println("Akar Tunggal yaitu : "+x1);
        }
        else {
            x1 = (-b + Math.sqrt (D)) / (2*a);
            x2 = (-b + Math.sqrt (D)) / (2*a);
            System.out.println("Akar Pertama Yaitu : "+x1);
            System.out.println("Akar Pertama Yaitu : "+x2);
            
        }
    }
    
}
