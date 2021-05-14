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
public class beratMangga3 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int jumlahMangga, beratMangga,banyakMangga, mangga, a, biasa = 0, bagus = 0, unggul = 0;
        a = 1;
        System.out.println("\t Program Menghitung Berat Mangga");
        System.out.println("================================================");
        
        System.out.print("Banyak Mangga yang ingin diproses : ");
        banyakMangga = keyboard.nextInt();
        

        
        do{

        System.out.print("Masukan Berat Mangga  "+a+" : ");
        mangga = keyboard.nextInt();
        
        if ( mangga < 1 ){
            
        System.out.println("Angka Harus Lebih dari 0");
        System.out.print("Masukan Berat Mangga  "+a+" : ");
        mangga = keyboard.nextInt();
        continue;
           }
        if (mangga > 750) unggul++;
        if (mangga >= 500 && mangga < 750) bagus++;
        if (mangga < 500) biasa++;
        
       
        a++;
        
        
        } while(a <=  banyakMangga ||  mangga < 1  );
        
        System.out.println("");
        System.out.println("Banyak Mangga Biasa : "+biasa );
        System.out.println("Banyak Mangga Unggul : "+unggul  );
        System.out.println("Banyak Mangga Bagus :"+bagus );
 
    }
}
