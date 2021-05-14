/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_06;

/**
 *
 * @Hanjian Listanto
 */
import java.util.Scanner;
public class rataBilanganN2 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner (System.in);
        int data, nilai,bData, i, rataRata;
        nilai = 0;
        bData = 1;
        
        System.out.print("Banyak Data yang akan diproses : ");
        data = keyboard.nextInt();
        
        while ( bData <= data ){
            System.out.print("Data ke "+bData+" : ");
            i = keyboard.nextInt();
            nilai+=i;
            bData++;
        }
        
        rataRata = nilai/data;
        System.out.println("Rata Rata Data Adalah : "+rataRata+" ");
        
    }
}
