package Modul_04;

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
public class beratIdeal {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        String  nama;
        int beratBadan, tinggiBadan;
        
        System.out.println("Operator Berat Badan Ideal");
        
        System.out.print("Masukan Nama Anda : ");
        nama = keyboard.next();
        System.out.print("Masukan Tinggi Badan Anda : ");
        tinggiBadan = keyboard.nextInt();
        System.out.print("Masukan Berat Badan Anda : ");
        beratBadan = keyboard.nextInt();
        
        if (90 <= (tinggiBadan-beratBadan) && (tinggiBadan - beratBadan)<= 110){
            System.out.println("Berat Badan Anda Ideal");
        } 
        
        else if (tinggiBadan - beratBadan < 90){
            System.out.println("Berat Badan anda berlebihan");
        }    
        
        else if (tinggiBadan - beratBadan > 110){
            System.out.println("Berat Badan anda Kurang");
    }
   }
    
}
