/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_05;

/**
 *
 * @Hanjian Listanto
 */
import java.util.Scanner;
public class besarBonusKaryawan {
    public static void main(String  []args){
        Scanner keyboard = new Scanner (System.in);
        
        int masaKerja, golonganKerja;
        System.out.println("--------------------------------------------------------");
        System.out.println("\t Menghitung Bonus Akhir Tahun Karyawan");
        System.out.println("--------------------------------------------------------");
        
        System.out.print("Masukan Masa Kerja : ");
        masaKerja = keyboard.nextInt();
        System.out.print("Masukan Golongan Kerja : ");
        golonganKerja = keyboard.nextInt();
        System.out.println("--------------------------------------------------------");
        System.out.println("\tTotal Bonus Akhir Tahun Anda");
        System.out.println("--------------------------------------------------------");
        
        //.....Golongan Kerja 1.....//
        if (golonganKerja == 1)
        {   
            if ( masaKerja >= 0 && masaKerja <= 10)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 50%");
            }
            else if (masaKerja >= 11 && masaKerja <= 20)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 60%");
            }
            else if (masaKerja >= 21 && masaKerja <= 30)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 70%");
            }
         
        }
        
        //.....Golongan Kerja 2.....//
        if (golonganKerja == 2)
        {
            if ( masaKerja >= 0 && masaKerja <= 10)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 60%");
            }
            else if (masaKerja >= 11 && masaKerja <= 20)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 70%");
            }
            else if (masaKerja >= 21 && masaKerja <= 30)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 80%");
            }
        }
        //.....Golongan Kerja 3.....//
        if (golonganKerja == 3)
        {
            if ( masaKerja >= 0 && masaKerja <= 10)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 70%");
            }
            else if (masaKerja >= 11 && masaKerja <= 20)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 80%");
            }
            else if (masaKerja >= 21 && masaKerja <= 30)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 90%");
            }
        }
        //.....Golongan Kerja 4.....//
        if (golonganKerja == 4)
        {
            if ( masaKerja >= 0 && masaKerja <= 10)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 80%");
            }
            else if (masaKerja >= 11 && masaKerja <= 20)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 90%");
            }
            else if (masaKerja >= 21 && masaKerja <= 30)
            {
                System.out.println("Golongan Kerja Anda : "+golonganKerja+" dan Masa Kerja Anda :"+masaKerja+"");
                System.out.println("Bonus Akhir Tahun Anda yaitu 100%");
            }
        }   
}
}
