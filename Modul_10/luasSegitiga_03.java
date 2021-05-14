/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_10;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class luasSegitiga_03 {
 static double  y1 ,x2 ,y2 ,x3 ,y3, n, x1;
        static double sisiA, sisiB, sisiC,luas, keliling;
        
        public static void main(String[] args) {
        /* .....Memanggil masing masing methodd.....*/
        bacaTitik();
        hitungJarak();
        hitungKeliling();
        hitungLuas();
       
        }  
        
      /*.....Membaca absis dan ordinat suatu titik.....*/
    static void bacaTitik(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Absis dan Ordinat untuk titik pertama");
        
        System.out.print("Masukkan absis   (x) ke - 1   : ");
        x1 = keyboard.nextDouble();
        System.out.print("Masukkan ordinat (y) ke - 1   : ");
        y1 = keyboard.nextDouble();
        System.out.println();
        
        System.out.println("Absis dan Ordinat untuk titik kedua");
        System.out.print("Masukkan absis   (x) ke - 2   : ");
        x2 = keyboard.nextDouble();
        System.out.print("Masukkan ordinat (y) ke - 2   : ");
        y2 = keyboard.nextDouble();
        
        System.out.println();
        System.out.println("Absis dan Ordinat untuk titik ketiga");
        System.out.print("Masukkan absis   (x) ke - 3   : ");
        
        x3 = keyboard.nextDouble();
        System.out.print("Masukkan ordinat (y) ke - 3   : ");
        y3 = keyboard.nextDouble();
    
        System.out.println();
    }
    
    /*......Membaca jarak......*/   
        static void hitungJarak(){
        System.out.println("Menghitung Jarak");
        sisiA = jarak(x1,x2,y1,y2);
        System.out.println("Jarak antara titik 1 dan 2 adalah " +sisiA);
        sisiB = jarak(x2,x3,y2,y3);
        System.out.println("Jarak antara titik 2 dan 3 adalah " +sisiB);
        sisiC = jarak(x3,x1,y3,y1);
        System.out.println("Jarak antara titik 1 dan 3 adalah " +sisiC);
        
        System.out.println();
    }
    static double jarak (double x1, double x2, double y1, double y2){
     double sisi;
     sisi = Math.sqrt(((x2  - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1)));
     return sisi;
    }
    /*.....Membaca Keliling.....*/
    static void hitungKeliling(){
        System.out.println("Menghitung Keliling");
        keliling = hitung(sisiA);
        System.out.println("Keliling Untuk Segitiga Sembarang adalah : " +keliling);
    }
    static double hitung(double s){
        double k = sisiA + sisiB + sisiC;
        return k;
    }
    /*.....Membaca Luas.....*/
    static void hitungLuas(){
        System.out.println("Menghitung Luas");
        luas = total(keliling);
        System.out.println("Luas untuk Segitiga Sembarang adalah     : " +luas);
    }
    static double total(double s){
        s = keliling/2;
        double L = Math.sqrt(s* (s - sisiA)*(s - sisiB)*( s - sisiC));
        return L;
}
}