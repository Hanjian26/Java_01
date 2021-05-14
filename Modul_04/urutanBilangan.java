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
public class urutanBilangan {
    public static void main(String  []args){
        int bilS, bilD, bilT;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\t Mengurutkan Bilangan");
        
        System.out.print("Masukan Bilangan Pertama : ");
        bilS = keyboard.nextInt();
        System.out.print("Masukan Bilangan Kedua : ");
        bilD = keyboard.nextInt();
        System.out.print("Masukan Bilangan Ketiga : ");
        bilT = keyboard.nextInt();
        
        System.out.println("Urutannya adalah : ");
       //Bilangan Satu Terkecil dan Bilangan Tiga Terbesar//
        if (bilS < bilD && bilD < bilT){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilS+" "+bilD+" "+bilT+"");
        }
        //Bilangan Tiga Terkecil dan Bilangan Satu Terbesar//
        else if (bilS > bilD && bilD > bilT){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilT+" "+bilD+" "+bilS+"");
        }
        //Bilagan Dua Terkecil dan Bilangan Satu Terbesar//
        else if (bilS > bilD && bilD < bilT && bilS > bilT){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilD+" "+bilT+" "+bilS+"");
        }
        
        else if (bilS < bilD && bilD > bilT && bilS < bilT){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilS+" "+bilT+" "+bilD+"");
        }
        
        else if (bilD > bilS && bilD > bilT && bilS > bilT ){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilT+" "+bilS+" "+bilD+"");
        }
        else if (bilT > bilD && bilT > bilS && bilS > bilD){
            System.out.println("Maka Urutan Bilangannya yaitu : "+bilD+" "+bilS+" "+bilT+"");
        }
    }
}
