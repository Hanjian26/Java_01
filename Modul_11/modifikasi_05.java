/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;
/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class modifikasi_05 {
    public static void main(String  []args){
        int jumlahArray;
        double total = 0;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Masukan Jumlah data array : ");
        jumlahArray = keyboard.nextInt();
        double [] array = new double[jumlahArray];
         
        double max = 0;
        
        for(int i = 0; i < jumlahArray;i++){
            System.out.print("Masukan Data ke "+(i+1)+" : ");
            array[i] = keyboard.nextDouble();
        }
        System.out.println();
            for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke "+(i+1)+" adalah "+array[4-i]);    

            //.....Nilai Total.....//
            total = total + array[i];
            double min = array[0];
            //.....Nilai Rata Rata.....//
            double rataRata;
            rataRata = total / array.length;
            
            if (array[i] > max){   
                max = array[i];
            }
            //......Menghitung nilai minimum.....//
            else if(array[i] <  min){
                min = array[i];
            }
            if (i == array.length - 1){
            System.out.println();
            System.out.println("Jumlah Element Array Tersebut adalah                    : "+jumlahArray);
            System.out.println("Nilai Total "+jumlahArray+" Data Tersebut Adalah\t \t      : "+total);
            System.out.println("Nilai Rata Rata Data Tersebut Adalah                    : "+rataRata);
            System.out.println("Nilai Maksimum Data Tersebut Adalah                     : "+max);
            System.out.println("Nilai Minimum Data Tersebut Adalah                      : "+min);
            }           
       }    
    }
}
