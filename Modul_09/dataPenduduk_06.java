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
public class dataPenduduk_06 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
         int dataPenduduk, range1, range2, range3, range4, range5;
         range1 = 0;
         range2 = 0;
         range3 = 0;
         range4 = 0;
         range5 = 0;
         
         System.out.print("Masukan Jumlah Penduduk : ");
          dataPenduduk= keyboard.nextInt();
         
         for (int i = 1; i <= dataPenduduk; i++) {
             int usia;
             System.out.print("Usia Warga "+i+": ");
             usia = keyboard.nextInt();
             
             if (usia >= 0 && usia <=20) {  
                 range1++;
             }else if (usia >= 21 && usia <= 40){
                 range2++;
             }else if (usia >= 41 && usia <= 60){
                 range3++;
             }else if (usia >= 61 && usia <= 80){
                 range4++;
             }else if (usia >= 81 && usia <= 100){
                 range5++;                
             }
         }
         System.out.println();        
         System.out.println("Distribusi Umur "+dataPenduduk+" Warga Di atas Adalah : ");
                 
         for (int i = 1; i <= 5; i++){
             String umur = "";
             int range = 0;
             
             switch (i) {
                 case 1:
                     umur = "0 - 20    : ";
                     range = range1;
                     break;
                 case 2:
                     umur = "21 - 40   : ";
                     range = range2;
                     break;
                 case 3:
                     umur = "41 - 60   : ";
                     range = range3;
                     break;
                 case 4:
                     umur = "61 - 80   : ";
                     range = range4;
                     break;
                 case 5:
                     umur = "81 - 100  : ";
                     range = range5;
                     break;
                 default:
                     break;
             }
             System.out.print(umur);
             for (int j = 0; j < range; j++){
             System.out.print("*");
         }
         System.out.println("");
        }
    }
}