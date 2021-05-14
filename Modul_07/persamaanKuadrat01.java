/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_07;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class persamaanKuadrat01 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        double a, b, c, D, x1 , x2;
        
        
        do {
            System.out.print("Masukan Koefisien x2 : ");
            a = keyboard.nextDouble();
            if (a < 1  ){
                System.out.println("Angka Harus Lebih dari 0");
                       
                
            }
        }while(a == 0 );
            System.out.print("Masukan Koefisien x ( b ) : ");
            b = keyboard.nextDouble();
            System.out.print("Masukan Koefisien x ( c ) : ");
            c = keyboard.nextDouble();
            
            
            D = b * b - (4 * a * c);
            
            if(D < 0 || a == 0){
                System.out.println("Tidak Mempunyai Akar Real");
                
                
            }
            else {
                x1 = (-b + Math.sqrt(D)) / (2*a);
                x2 = (-b - Math.sqrt(D)) / (2*a);
                System.out.println("Akar Pertama : " + x1);
                System.out.println("Akar Kedua   : " + x2);
            }
         
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
