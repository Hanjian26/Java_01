package Modul_04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanjian Listanto 
 */
import  java.util.Scanner;
public class discountBarang {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int hargaBarang, jumlahBarang, totalPembelian, discount;
        System.out.println("Diskon Barang");
        
        
        System.out.print("Harga Satuan Barang : Rp.");
        hargaBarang = keyboard.nextInt();
        System.out.print("Jumlah Barang : ");
        jumlahBarang = keyboard.nextInt();
        
        totalPembelian = hargaBarang * jumlahBarang;
        discount = totalPembelian - ( totalPembelian *10/100);
      
        
        if ( totalPembelian >= 1000000){
            System.out.println("Total Pembelian ( Discount 10% ) : Rp. "+discount);
        }
        
        else if (totalPembelian < 1000000){
            System.out.println("Total Pembelian anda : Rp."+totalPembelian);
        }
    }
    
}
