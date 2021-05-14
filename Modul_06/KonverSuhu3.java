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
public class KonverSuhu3 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int celcius=0, reamur, fahrenheit, sMax, sMin, selisih;
        int a;
        
        System.out.println("Tabel Konversi Celcius ke Reamur dan Fahrenheit");
        System.out.print("Masukkan Nilai Suhu Minimum : ");
        sMin = keyboard.nextInt();
        System.out.print("Masukkan Nilai Suhu Maksimum : ");
        sMax = keyboard.nextInt();
        System.out.print("Masukkan selisih kenaikan : ");
        selisih = keyboard.nextInt();
        System.out.println("Celcius\t \t Reamur      Fahrenheit");
        System.out.println("====================================================");
        
        a = 0;
        while (a <= 5){
            reamur = (int)  ((0.8) * celcius);
            fahrenheit = (int) ((1.8)*celcius + 32);
            System.out.println(celcius+"   \t \t" +reamur+" \t \t " +fahrenheit);
            celcius = celcius + selisih;
            a++;
        }
    }
}
