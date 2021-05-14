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
public class nilaiTotal {
        public static void main(String  []args){
            Scanner keyboard = new Scanner(System.in);
            double nilaiTotal, uts1, uts2,uas;
            System.out.println("\tProgram Menghitung Nilai Final");
            System.out.println("================================================");
    
            do{
            System.out.print("Masukan Nilai  UTS - 1 : ");
            uts1 = keyboard.nextDouble();
            System.out.print("Masukan Nilai  UTS - 2 : ");
            uts2 = keyboard.nextDouble();
            System.out.print("Masukan Nilai  UAS     : ");
            uas = keyboard.nextDouble();
            if (uts1 <= -1 || uts2 <= -1 || uas <= -1 ){
                System.out.println("Harap Masukan Nilai Lagi");
                System.out.println("Nilai Tidak Boleh Bernilai Negatif");
                System.out.println("");
            }
             
            
            }while(uts1 <= -1 || uts2 <= -1 || uas <= -1);
           
                        nilaiTotal = ((0.3 * uts1) + (0.3 * uts2) + (0.4 * uas));
            if (nilaiTotal >= 80){
                System.out.println("Nilai Total Anda       : "+nilaiTotal);
                System.out.println("Nilai Huruf            : A ");
            }
            
            else if(nilaiTotal <= 65 && nilaiTotal < 80){
                System.out.println("Nilai Total Anda       : "+nilaiTotal);
                System.out.println("Nilai Huruf            : B ");
            }
            else if(nilaiTotal <= 55 && nilaiTotal < 65){
                System.out.println("Nilai Total Anda       : "+nilaiTotal);
                System.out.println("Nilai Huruf            : C ");
            }
            
            else if(nilaiTotal <= 50 && nilaiTotal < 55){
                System.out.println("Nilai Total Anda       : "+nilaiTotal);
                System.out.println("Nilai Huruf            : D "); 
        }
      
            else if(nilaiTotal < 50  ){
                System.out.println("Nilai Total Anda       : "+nilaiTotal);
                System.out.println("Nilai Huruf            : E "); 
        }
            
      }
}
    