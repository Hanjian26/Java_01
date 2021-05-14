/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_06;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class KonverSuhu4 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int a,  suhu1, suhu2, suhu3, suhu4, suhu5, celcius, reamur, fahrenheit;
        
        a = 0;
        System.out.print("Masukan Suhu ke - 1 : ");
        suhu1 = keyboard.nextInt();
        System.out.println("Hasil Konversi Suhu");
        System.out.print("Celcius");
        System.out.print("\t Reamur");
        System.out.print("\t Fahreneit");
        System.out.println("");
        

        
        while (a <1 ){
            celcius = suhu1;
            System.out.print(celcius);
            
            reamur = (int) (0.8  * celcius);
            System.out.print("\t " +reamur);
            
            fahrenheit = (int) (1.8 * celcius) + 32;
            System.out.println("\t " +fahrenheit);
            
     
            a++;
        }
        System.out.println("=================================");
        
        System.out.println("");
        System.out.print("Masukan Suku ke 2 : ");
        suhu2 = keyboard.nextInt();
        System.out.println("Hasil Konversi Suhu");
        System.out.print("Celcius");
        System.out.print("\t Reamur");
        System.out.print("\t Fahreneit");
        System.out.println("");

        
        while (a<2){
                   celcius = suhu2;
            System.out.print(celcius);
            
            reamur = (int) (0.8 * celcius);
            System.out.print("\t " +reamur);
            
            fahrenheit = (int)(1.8 * celcius) + 32;
         System.out.println("\t " +fahrenheit);
         a++;
        }
        System.out.println("=================================");
        
         System.out.println("");
         System.out.print("Masukan Suku ke 3 : ");
         suhu3 = keyboard.nextInt();
         System.out.println("Hasil Konversi Suhu");
         System.out.print("Celcius");
         System.out.print("\t Reamur");
         System.out.print("\t Fahreneit");
         System.out.println("");
         
        
        while (a<3){
         celcius = suhu3;
         System.out.print(celcius);
             
         reamur = (int)(0.8 * celcius);
         System.out.print("\t " +reamur);
           
         fahrenheit = (int)(1.8 * celcius) + 32;
         System.out.println("\t " +fahrenheit);
         a++;
        }
        System.out.println("=================================");
        
         System.out.println("");
         System.out.print("Masukan Suku ke 4 : ");
         suhu4 = keyboard.nextInt();
         System.out.println("Hasil Konversi Suhu");
         System.out.print("Celcius");
         System.out.print("\t Reamur");
         System.out.print("\t Fahreneit");
         System.out.println("");
         
         
        while (a<4){
         celcius = suhu4;
         System.out.print(celcius);
             
         reamur = (int)(0.8 * celcius);
         System.out.print("\t " +reamur);
             
         fahrenheit = (int)(1.8 * celcius) + 32;
         System.out.println("\t " +fahrenheit);
         a++;
        }
        System.out.println("=================================");
        
        System.out.println("");
        System.out.print("Masukan Suku ke 5 : ");
        suhu5 = keyboard.nextInt();
        System.out.println("Hasil Konversi Suhu");
        System.out.print("Celcius");
        System.out.print("\t Reamur");
        System.out.print("\t Fahreneit");
        System.out.println("");
        
        
        while (a<5){
         celcius = suhu5;
         System.out.print(celcius);
            
         reamur = (int)(0.8 * celcius);
         System.out.print("\t " +reamur);
            
         fahrenheit = (int)(1.8 * celcius) + 32;
         System.out.println("\t " +fahrenheit);
         a++;
        }
        System.out.println("=================================");


    }
}
