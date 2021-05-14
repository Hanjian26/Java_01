package Modul_02.newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Segitiga3 {
    public static void main(String[]   args){
        int alas,tinggi;
        double luasSeg;
        /* Kesalahan pada program ini yaitu pada tipe data luasSeg 
           yang mana awalnya int. Harus diganti dengan double karna memiliki 
           nilai desimal pada rumus yaitu 0.5
        */
        
        //Diketahui//
        alas = 35;
        System.out.println("Nilai alas adalah "+alas);
        tinggi = 3;
        System.out.println("Nilai tinggi adalah "+tinggi);
        System.out.println("Berapakah nilai dari Luas Segitiga ?");
        
        /*Rumus Luas Segitiga
          Luas = 0.5 * alas * tinggi;
        */ 
        System.out.println();
        System.out.println("Jawaban : ");
        System.out.println("Rumus menghitung Luas Segitiga yaitu  Luas = 0.5 * alas * tinggi");
        luasSeg = 0.5 * alas * tinggi;
        
        
        System.out.println("Hasil dari luas segitiga adalah = "+luasSeg);
    } 
}
