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
public class duaArray_07 {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String  []args){
        
        //.....Array.....//
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96 };
        int[] usiaGabung = new int[usia1.length + usia2.length];
        
        //.....Deklarasi Variabel dekUsia1, dekUsia2.....//
        int dekUsia1 = 0;
        int dekUsia2 = 0;

        System.out.println("Gabungan dari kedua Array Tersebut Adalah : ");
        
        for (int i = 0; i < usia1.length + usia2.length; i++) {
            if (dekUsia1 >= usia1.length) {
                usiaGabung[i] = usia2[dekUsia2];
                dekUsia2++;
            } 
            else if (dekUsia2 >= usia2.length) {
                usiaGabung[i] = usia1[dekUsia1];
                dekUsia1++;
            } 
            else {
                if (usia1[dekUsia1] < usia2[dekUsia2]) {
                    usiaGabung[i] = usia1[dekUsia1];
                    dekUsia1++;
                } 
            else {
                    usiaGabung[i] = usia2[dekUsia2];
                    dekUsia2++;
                }
            }
        }
        for (int i = 0; i < usiaGabung.length; i++) {  
            if(i == (usiaGabung.length-1)){
                System.out.println(usiaGabung[i]);
            }
            else{
                System.out.print(usiaGabung[i]+ ",");
           } 
    }   
        System.out.println();
 }
}

