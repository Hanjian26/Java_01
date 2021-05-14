/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class BackUp_10 {
    static int n;
static String[] nim,nama;
static Double[] us1,us2,uas,nilaiTotal;
static char[] nilaiHuruf;

 public static void main(String[] args) {
 // Program utama
 Scanner tombol = new Scanner(System.in);
 System.out.print("Masukkan jumlah mahasiswa: ");
 n = tombol.nextInt();

//alokasi variabel array
nim = new String[n];
 nama = new String[n];
 us1 = new Double[n];
 us2 = new Double[n];
 uas = new Double[n];
 nilaiTotal = new Double[n];
 nilaiHuruf = new char[n];

 bacaData();
 hitungTotalNilai();
 konversiNilai();
 System.out.println();
 System.out.println("Daftar Nilai Mahasiswa Informatika USD");
 tampilNilai();
 urutNilai();
 System.out.println();
 System.out.println("Daftar Nilai Mahasiswa Informatika USD Urut Terbaik");
 tampilNilai();

 }

 // Sub Program untuk Membaca Data Mahasiswa dan Nilainya
 static void bacaData(){
 for (int i=0;i<n;i++){
 Scanner tombol = new Scanner(System.in);
 System.out.println();
 System.out.print("Masukkan NIM mahasiswa ke-"+(i+1)+"       : ");
 nim[i] = tombol.next();
 System.out.print("Masukkan Nama mahasiswa ke-"+(i+1)+"      : ");
 nama[i] = tombol.next();
 System.out.print("Masukkan nilai US 1 mahasiswa ke-"+(i+1)+": ");
 us1[i] = tombol.nextDouble();
 System.out.print("Masukkan nilai US 2 mahasiswa ke-"+(i+1)+": ");
 us2[i] = tombol.nextDouble();
 System.out.print("Masukkan nilai UAS mahasiswa ke-"+(i+1)+" : ");
 uas[i] = tombol.nextDouble();
 }
 }

 // Sub Program untuk Menghitung Nilai Total
 static void hitungTotalNilai(){
 for (int i=0;i<n;i++){
 nilaiTotal[i]=(0.3*us1[i])+(0.3*us2[i]+(0.4*uas[i]));
 }
 }

 // Sub Program untuk Mengkonversi Nilai Total menjadi Nilai Huruf
 static void konversiNilai(){
 for (int i=0;i<n;i++){
 if ((nilaiTotal[i] >= 80) && (nilaiTotal[i] <= 100)){
 nilaiHuruf[i]='A';
 }
 else if ((nilaiTotal[i] >= 65) && (nilaiTotal[i] < 80)){
 nilaiHuruf[i]='B';
 }
 else if ((nilaiTotal[i] >= 55) && (nilaiTotal[i] < 65)){
 nilaiHuruf[i]='C';
 }
 else if ((nilaiTotal[i] >= 45) && (nilaiTotal[i] < 55)){
 nilaiHuruf[i]='D';
 }
 else {
 nilaiHuruf[i]='E';
 }
 }
 }
 // Sub Program untuk Menampilkan Seluruh Nilai
 static void tampilNilai(){
 System.out.println("No NIM        Nama     US 1  US 2  UAS   Total Final");
 System.out.println("-----------------------------------------------------");
 for (int i=0;i<n;i++){
 System.out.println((i+1)+"  "+nim[i]+"  "+nama[i]+"    "+us1[i]+"  "+us2[i]+"  "+uas[i]+"  "+nilaiTotal[i]+"  "+nilaiHuruf[i]);
 }
 }

 // Sub Program untuk Mengurutkan Data dengan menggunakan metode Bubble Sort
 // Prinsip kerja bubble sort: 
  // 1. membaca 2 data lalu mempertukarkan posisinya jika urutannya keliru
 // 2. lakukan langkah 1 berulang-ulang untuk seluruh data
 static void urutNilai()
 {
 for (int i = 0; i < n-1; i++)
 for (int j = 0; j < n-i-1; j++)
 if (nilaiTotal[j] < nilaiTotal[j+1])
 {
 // tukarkan temp1 and nilaiTotal[i]
 Double temp1 = nilaiTotal[j];
 nilaiTotal[j] = nilaiTotal[j+1];
 nilaiTotal[j+1] = temp1;

 // tukarkan temp2 and nim[i]
 String temp2 = nim[j];
 nim[j] = nim[j+1];
 nim[j+1] = temp2;

 // tukarkan temp3 and nama[i]
 String temp3 = nama[j];
 nama[j] = nama[j+1];
 nama[j+1] = temp3;

 // tukarkan temp4 and us1[i]
 Double temp4 = us1[j];
 us1[j] = us1[j+1];
 us1[j+1] = temp4;

 // tukarkan temp5 and us2[i]
 Double temp5 = us2[j];
 us2[j] = us2[j+1];
 us2[j+1] = temp5;

 // tukarkan temp6 and uas[i]
 Double temp6 = uas[j];
 uas[j] = uas[j+1];
 uas[j+1] = temp6;

 // tukarkan temp7 and nilaiHuruf[i]
 char temp7 = nilaiHuruf[j];
 nilaiHuruf[j] = nilaiHuruf[j+1];
 nilaiHuruf[j+1] = temp7;
 }
 }
}
   
