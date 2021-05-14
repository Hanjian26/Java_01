/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_03B;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class akarPersamaanKuadrat {
    public static void main(String  []args){
        double b, a, c, d;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Menghitung Persamaan Berpangkat");
        
        System.out.print("Masukan Nilai b = ");
        b = keyboard.nextInt();
        System.out.print("Masukan Nilai a = ");
        a = keyboard.nextInt();
        System.out.print("Masukan Nilai c = ");
        c = keyboard.nextInt();
        
        
        d =  Math.pow (b,2) - (4 * a * c );
        System.out.println("Hasil nilai d yaitu = "+d);
        
    }
    
}
