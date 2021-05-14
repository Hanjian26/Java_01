/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_02;

/**
 *
 * @author acer
 */
public class Persegi {
    public static void main(String[]    args){
        int panjang, lebar;
        double luas;
        /*Kesalahan pada program ini yaitu pada algoritma yang kita tulis.
          Kita diharuskan menulis satuan apa saja yang sudah diketahui terlebih
          dahulu lalu kita tulis algoritma rumus dari luas persegi tersebut 
          agar tidak terjadi error. Bukan Sebaliknya */
        System.out.println("Diketahui");
        panjang = 4;
        System.out.println("Panjang Persegi = "+panjang);
        lebar = 5;
        System.out.println("Lebar Persegi = "+lebar);
        System.out.println("Berapakah Luas Persegi tersebut ?");
        System.out.println("Jawaban = ");
        System.out.println();
        System.out.println("Rumus mencari Luas Persegi yaitu Panjang x Lebar");
        luas = panjang*lebar;
        System.out.print("Hasil dari Luas Persegi adalah :"+luas);
    }  
}
