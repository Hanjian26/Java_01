/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_03;

/**
 *
 * @author acer
 */
public class tKelontong {
    public static void main(String[]    args){
        int hBarang, jBarang, hsbDiscount, discount, hstDiscount;
        /*Diketahui Nilai
        */
        System.out.println("Toko JOGJA MART");
        System.out.println("Diketahui");
        hBarang = 5000;
        System.out.println("Harga Barang = " + hBarang);
        jBarang = 2;
        System.out.println("Jumlah Barang = " + jBarang);
        System.out.println("Menghitung harga total sebelum discount, besarnya discount, dan harga setelah discount");
        System.out.println("Jawaban");
        System.out.println("");
       /*Jawaban berturut*/
       
       hsbDiscount = hBarang * jBarang;
       System.out.println("Harga Sebelum Discount =" +hsbDiscount);
       discount = 2000;
       System.out.println("Discount = "+discount);
       hstDiscount = hsbDiscount - discount;
       System.out.println("Harga Setelah Discount = "+hstDiscount);
       
    }
    
}
