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
public class nilaiFinal {
    public static void main(String  []args){
        Scanner keyboard = new  Scanner(System.in);
        int uts1, uts2, uas;
        double a, b, c, nilaiTotal;
        
        a = 0.3;
        b = 0.3;
        c = 0.4;
        
        System.out.println("Menghitung Nilai Final");
        
        System.out.print("Nilai UTS - 1 : ");
        uts1 = keyboard.nextInt();
        System.out.print("Nilai UTS - 2 : ");
        uts2 = keyboard.nextInt();
        System.out.print("Nilai UAS : ");
        uas = keyboard.nextInt();
        
  
        nilaiTotal = a * uts1 + b * uts2 + c * uas;
        System.out.println(+nilaiTotal);
        
        if (nilaiTotal >= 80){
            System.out.println("A");
        }
        
        else if (65 <= (nilaiTotal) && (nilaiTotal) <80){
            System.out.println("B");
        }
        else if (55 <= (nilaiTotal) && (nilaiTotal) <65){
            System.out.println("C");
        }
        else if (50 <= (nilaiTotal) && (nilaiTotal) <55){
            System.out.println("D");
        }
        else if (nilaiTotal < 50 ){
            System.out.println("E");
        }
    }
  }


