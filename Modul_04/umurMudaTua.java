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
public class umurMudaTua {
    public static void main(String  []args){
        Scanner keyboard    =   new Scanner(System.in);
        int umurAndi, umurTiur;
        
        System.out.println("Umur Siapakah yang lebih tua dan muda");
        
        System.out.print("Masukan Umur Andi : ");
        umurAndi = keyboard.nextInt();
        System.out.print("Masukan Umur Tiur : ");
        umurTiur = keyboard.nextInt();
        
        if (umurAndi > umurTiur){
            System.out.println("Andi lebih tua dari Tius");
        }
        
        else if (umurAndi < umurTiur){
            System.out.println("Tiur lebih tua dari Andi");
        }
        else if (umurAndi == umurTiur){
            System.out.println("Umur Andi dan Umur Tiur Sama ");
        }
        
    }
    
}
