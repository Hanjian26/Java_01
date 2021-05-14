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
import  java.util.Scanner;
public class segitigaSikuSiku {
    public static void main (String []args){
        Scanner keyboard    =   new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Masukan Nilai A : ");
        a = keyboard.nextInt();
        System.out.print("Masukan Nilai B: ");
        b = keyboard.nextInt();
        System.out.print("Masukan Nilai C : ");
        c = keyboard.nextInt();
        
        if (a*a == (b*b + c*c)){
            System.out.println("Segitiga Siku Siku");
            

        }
       
    }
    
}
