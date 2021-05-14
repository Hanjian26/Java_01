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
public class dataMangga5 {
    public static void main(String  []args){
        Scanner jumlah = new Scanner(System.in);
            int banyakMangga , mangga ;
        int kecil = 0 ,sedang = 0 ,besar = 0;
        int a = 1 ;
       
        System.out.println("\t Program Pengelompokan Buah");
        System.out.println("===========================================");
        System.out.print("Banyak Mangga yang Akan di Proses  :  ");
        banyakMangga = jumlah.nextInt(); 
        
        while (a<=banyakMangga){
            System.out.print("Berat Mangga "+a+" : ");
            mangga = jumlah.nextInt();
            if (mangga >=600) besar++;
                else if (mangga >200) sedang++;
                    else kecil++;
            a++;
        }
        System.out.println("===========================================");
        System.out.println("Dari "+banyakMangga+ " Buah Mangga yang ditimbang : ");
        System.out.println("Kecil  : "+kecil+ " Buah");
        System.out.println("Sedang : "+sedang+" Buah");
        System.out.println("Besar  : "+besar+ " Buah");
        
    }
    
}
