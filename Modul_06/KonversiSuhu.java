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
public class KonversiSuhu {
    public static void main(String  []args ){
        Scanner keyboard = new Scanner(System.in);
        int celcius, fahrenheit, reamur, banyakData, i;
        int  data = 1;
        
        
        System.out.print("Masukan Banyak Data Celcius : ");
        banyakData = keyboard.nextInt();
        System.out.println("");
        
        while (data <= banyakData){
                    System.out.print("Masukan Suhu ke " +data+" :");
                i = keyboard.nextInt();
                reamur = (int) (0.8  * i);
                fahrenheit = (int) (1.8 * i) + 32;
                
                System.out.println("Celcius "+i+" \t Reamur "+reamur+" \t Fahrenheit "+fahrenheit+"");
                data++;
                
        }
        
    }
    
}
