/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_05;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class jumlahUang {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        //......Delkarasi Variabel.....//
        int sH, mH, lH, xlH, xxlH, totalPembelian;
        String sU, mU, lU, xlU, xxlU;
        //......Membuat Scanner masing masing variabel......//
        System.out.println("\tMenghitung Total Pembelian");
        System.out.println("-------------------------------------------");
        System.out.print("Masukan Ukuran : ");
        sU = keyboard.next();
        System.out.print("Masukan Jumlah Kaos : ");
        sH = keyboard.nextInt();
        System.out.print("Masukan Ukuran : ");
        mU = keyboard.next();
        System.out.print("Masukan Jumlah Kaos : ");
        mH = keyboard.nextInt();
        System.out.print("Masukan Ukuran : ");
        lU = keyboard.next();
        System.out.print("Masukan Jumlah Kaos : ");
        lH = keyboard.nextInt();
        System.out.print("Masukan Ukuran : ");
        xlU = keyboard.next();
        System.out.print("Masukan Jumlah Kaos : ");
        xlH = keyboard.nextInt();
        System.out.print("Masukan Ukuran : ");
        xxlU = keyboard.next();
        System.out.print("Masukan Jumlah Kaos : ");
        xxlH = keyboard.nextInt();
        System.out.println("-------------------------------------------");
       
        //..........Membuat Hitungan Harga............//
        sH = 30000 * sH;
        System.out.println("Harga Total untuk  Kaos Ukuran S :"+sH);
        mH = 38000 * mH;
        System.out.println("Harga Total untuk  Kaos Ukuran M :"+mH);
        lH = 45000 * lH;
        System.out.println("Harga Total untuk  Kaos Ukuran L :"+lH);
        xlH = 50000 * xlH;
        System.out.println("Harga Total untuk  Kaos Ukuran XL :"+xlH);
        xxlH = 60000 * xxlH;
        System.out.println("Harga Total untuk  Kaos Ukuran XXL :"+xxlH);
        
        System.out.println("-------------------------------------------");
        totalPembelian = sH + mH + lH + xlH + xxlH;
        System.out.println("Total yang harus dibayar : Rp. "+totalPembelian);    
    }
    
}
