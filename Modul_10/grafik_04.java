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
public class grafik_04 {
        static int normal(int n, double z) {  
            double f = (1/Math.sqrt(2*3.14))*Math.pow(2.71828,(-0.5*Math.pow(z, 2)));
            return (int) Math.round(n * f) ;
        } 
            static void bintang(int m) {
                for(int i = 1; i <= m; i++) System.out.print ("*");
                System.out.println();
        }  
            public static void main(String[]args){
                Scanner keyboard = new Scanner(System.in);
                int n;
             
                System.out.println("Program Membuat Grafik");
                System.out.print("Masukan Nilai N : ");
                n = keyboard.nextInt();
                    for (double z = -4; z <= 4; z = z + 0.5) {    
                int jumBintang = normal(n,z);
                bintang(jumBintang);
        }

    }
}

     
                    

            
