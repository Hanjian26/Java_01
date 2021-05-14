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
public class mZodiak {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        //.....Deklarasi Variabel.....//
        int tLahir, bLahir;
        String nama, alamat, bintang, sifat;     
        System.out.println("\tMenentukan Zodiak anda");
        System.out.println("-------------------------------------------");
        //.....Membuat Scanner masing masing Variabel.....//
        
        System.out.print("Nama              : ");
        nama = keyboard.nextLine();
        System.out.print("Alamat            : ");
        alamat = keyboard.nextLine();
        System.out.print("Tanggal Lahir     : ");
        tLahir = keyboard.nextInt();
        System.out.print("Bulan Lahir       : ");
        bLahir = keyboard.nextInt();
        //.....Aquarius.....//
        if ((tLahir >= 20 && bLahir == 1) || (tLahir <= 18 && bLahir == 2)){
            System.out.println("Anda Berbintang   : Aquarius");
            System.out.println("Sifat Anda        : Tertarik dengan Petualangan, Berjiwa Kemanusiaan, Ingin Tahu...dst");
        }
        //.....Pisces.....//
        if ((tLahir >= 19 && bLahir == 2) || (tLahir <= 20 && bLahir == 3)){
            System.out.println("Anda Berbintang   : Pisces ");
            System.out.println("Sifat Anda        : Mengutamakan Cinta Universal, Bersifat Manja, Menyukai Musik...dst");
         }
        //.....Aries.....//
        if ((tLahir >= 21 && bLahir == 3) || (tLahir <= 19 && bLahir == 4)){
            System.out.println("Anda Berbintang   : Aries ");
            System.out.println("Sifat Anda        : Seorang Yang Berani, Yakin, Inisiatif, Mengutamakan Tindakan, Ada Pertahanan Diri...dst");
         }
        //.....Taurus.....//
        if ((tLahir >= 20 && bLahir == 4) || (tLahir <= 20 && bLahir == 5)){
            System.out.println("Anda Berbintang   : Taurus ");
            System.out.println("Sifat Anda        : Mengutamakan Kekayaan, Ketinggian Spiritual, Kaut Daya Rasa, Loyalitas...dst");
         }
        //.....Gemini.....//
        if ((tLahir >= 21 && bLahir == 5) || (tLahir <= 20 && bLahir == 6)){
            System.out.println("Anda Berbintang   : Gemini");
            System.out.println("Sifat Anda        : Terampil Berkomunikasi, Suka Bepergian, Serbaguna, Cerdas, Ada Kekuatan Berbicara...dst");
         }
        //.....Cancer.....//
        if ((tLahir >= 21 && bLahir == 6) || (tLahir <= 22 && bLahir == 7)){
            System.out.println("Anda Berbintang   : Cancer");
            System.out.println("Sifat Anda        : Orang yang Menyukai Rumah Tangga, Keluarga, Kesehatan, Makanan, Ada Rasa Simpati");
         }
        //.....Leo.....//
        if ((tLahir >= 23 && bLahir == 7    ) || (tLahir <= 22 && bLahir == 8)){
            System.out.println("Anda Berbintang   : Leo");
            System.out.println("Sifat Anda        : Orang Yang Mengutamakan Rasa Cinta, Ramah, Bersifat Pemurah, Ada Daya Kepemimpinan...dst");
         }
        //.....Virgo.....//
        if ((tLahir >= 23 && bLahir == 8) || (tLahir <= 22 && bLahir == 9)){
            System.out.println("Anda Berbintang   : Virgo");
            System.out.println("Sifat Anda        : Orang Yang Suka Pada Kerja, Hasil Kerja Sempurna, Punya Pahlawan Diri, Suci...dst");
         }
        //.....Libra.....//
        if ((tLahir >= 23 && bLahir == 9) || (tLahir <= 22 && bLahir == 10)){
            System.out.println("Anda Berbintang   : Libra");
            System.out.println("Sifat Anda        : Orang Yang Harmonis, Seimbang, Menyukai Pernikahan, Mendapati Perhubungan...dst");
         }
        //.....Scorpio.....//
        if ((tLahir >= 23 && bLahir == 10) || (tLahir <= 21 && bLahir == 11)){
            System.out.println("Anda Berbintang   : Scorpio");
            System.out.println("Sifat Anda        : Orang Yang Kreatif, Ada Keinginan Yang Kuat, Punya Stamina, Daya Sensual Yang Tinggi...dst");
         }
        //.....Sagitarius.....//
        if ((tLahir >= 22 && bLahir == 11) || (tLahir <= 21 && bLahir == 12)){
            System.out.println("Anda Berbintang   : Sagitarius");
            System.out.println("Sifat Anda        : Orang Yang Bersikap Optimis, Pemahaman Diri, Bercita-cita Tinggi, Memiliki Hati Nurani...dst");
        }
        //.....Capricornus.....//
        if ((tLahir >= 22 && bLahir == 12) || (tLahir <= 19 && bLahir == 1)){
            System.out.println("Anda Berbintang   : Capricornus");
            System.out.println("Sifat Anda        : Mengutamakan Kesuksesan, Status, Posisi, Reputasi, Loyalitas, Konsentrasi, Pemecahan Masalah...dst");
        }
       }
    }