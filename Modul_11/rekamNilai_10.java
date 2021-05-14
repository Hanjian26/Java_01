/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class rekamNilai_10 {
     static int jumlahMahasiswa;
    static String[] nim,nama;
    static Double[] us1,us2,uas,nilaiTotal;
    static char[] nilaiHuruf;
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa   : ");
        jumlahMahasiswa = keyboard.nextInt();
        
        //.....Mengalokasikan Nilai Nilai variabel.....//
        nim = new String[jumlahMahasiswa];
        nama = new String[jumlahMahasiswa];
        us1 = new Double[jumlahMahasiswa];
        us2 = new Double[jumlahMahasiswa];
        uas = new Double[jumlahMahasiswa];
        nilaiTotal = new Double[jumlahMahasiswa];
        nilaiHuruf =  new char[jumlahMahasiswa];
           
        //......Memanggil sub program.....//
        bacaData();
        hitTotNilai();
        konversiNilai();
        System.out.println();
        System.out.println("\t \t Daftar Nilai Mahasiswa Informatika USD ");
        System.out.println("==================================================================");
        tampilNilai();
        urutTerbaik();
        System.out.println("==================================================================");
        System.out.println();
        System.out.println("\t \t Daftar Mahasiswa Informatika USD Urut Terbaik ");
        System.out.println("==================================================================");
        tampilNilai();
        System.out.println("==================================================================");
    }
    //.....Sub Program untuk memasukan Data Mahasiswa.....//
    static void bacaData(){
        for (int i = 0; i < jumlahMahasiswa; i++){
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.print("Masukkan NIM Mahasiswa   Ke  "+(i+1)+"  : ");
            nim[i] = keyboard.next();
            System.out.print("Masukkan Nama Mahasiswa  Ke  "+(i+1)+"  : ");
            nama[i] = keyboard.next();
            System.out.print("Masukkan US 1 Mahasiswa  Ke  "+(i+1)+"  : ");
            us1[i] = keyboard.nextDouble();
            System.out.print("Masukkan US 2 Mahasiswa  Ke  "+(i+1)+"  : ");
            us2[i] = keyboard.nextDouble();
            System.out.print("Masukkan UAS 1 Mahasiswa Ke  "+(i+1)+"  : ");
            uas[i] = keyboard.nextDouble();
        }
    }
    //.....Sub Program untuk menghitung total nilai.....//
    static void hitTotNilai(){
        for (int i = 0; i<jumlahMahasiswa; i++){
            nilaiTotal[i] = (0.3 * us1[i]) + (0.3 * us2[i] + (0.4 * uas[i]));
        }
    }
    //......Sub Program Mengkonversikan nilai angka menjadi huruf.....//
    static void konversiNilai(){
        for (int i = 0; i < jumlahMahasiswa; i++){
          if ((nilaiTotal[i] >= 80) && (nilaiTotal[i] <= 100)){
              nilaiHuruf[i] = 'A';
          }
          else if ((nilaiTotal[i] >= 65) && (nilaiTotal[i] < 80)){
              nilaiHuruf[i] = 'B';
          }
          else if ((nilaiTotal[i] >= 55) && (nilaiTotal[i] < 65)){
              nilaiHuruf[i] = 'C';
          }
          else if ((nilaiTotal[i] >= 45) && (nilaiTotal[i] < 55)){
              nilaiHuruf[i] = 'D';
          }
          else {
              nilaiHuruf[i] = 'E';
          }
        }
    }
    //.....Sub Program Mencetak Data.....//
    static void tampilNilai(){
        System.out.println("No \t NIM \t Nama \t  US 1 \t US 2 \t UAS \t Total \t Final");
        System.out.println("==================================================================");
        for (int i = 0; i < jumlahMahasiswa; i++){
            
            System.out.println((i+1)+"\t "+nim[i]+"\t "+nama[i]+" \t "+us1[i]+"\t "+us2[i]+"\t "+uas[i]+"\t "+nilaiTotal[i]+"\t "+nilaiHuruf[i]);
      
        }
    }
    //.....Sub Program Bubblesort.....//
    static void urutTerbaik(){
        for (int i = 0; i < jumlahMahasiswa; i++)
          for (int j = 0; j < jumlahMahasiswa-i - 1; j++)
            if (nilaiTotal[j] < nilaiTotal[j + 1]) {
              Double urut1;
               urut1 = nilaiTotal[j];
               nilaiTotal[j] = nilaiTotal[j+1];
               nilaiTotal[j+1] = urut1;
               
               String urut2;
               urut2 = nim[j];
               nim[j] = nim[j+1];
               nim[j+1] = urut2;
               
               String urut3;
               urut3 = nama[j];
               nama[j] = nama[j+1];
               nama[j+1] = urut3;
               
               Double urut4;
               urut4 = us1[j];
               us1[j] = us1[j+1];
               us1[j+1] = urut4;
               
               Double urut5;
               urut5 = us2[j];
               us2[j] = us2[j+1];
               us2[j+1] = urut5;
               
               Double urut6;
               urut6 = uas[j];
               uas[j] = uas[j+1];
               uas[j+1] = urut6;
               
         
               char urut7 = nilaiHuruf[j];
               nilaiHuruf[j] = nilaiHuruf[j+1];
               nilaiHuruf[j+1] = urut7;
            }
    
    }
}
