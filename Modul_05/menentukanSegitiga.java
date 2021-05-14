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
public class menentukanSegitiga {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        int sisiA, sisiB, sisiC;
        
        System.out.println("\t Menentukan Jenis Segitiga");
        System.out.println("-----------------------------------------------");
        
        
        System.out.print("Masukan Panjang Sisi A : ");
        sisiA = keyboard.nextInt();
        System.out.print("Masukan Panjang Sisi B : ");
        sisiB = keyboard.nextInt();
        System.out.print("Masukan Panjang Sisi C : ");
        sisiC = keyboard.nextInt();
        
        /*
        Segitiga siku-siku, segitiga sama kaki, segitiga
        sama sisi, dan segitiga sembarang.
        */
        //Segitiga Siku Siku//
        System.out.println("-----------------------------------------------");
        if (sisiA*sisiA == (sisiB*sisiB + sisiC*sisiC)){
            System.out.println("Panjang Sisi A "+sisiA+" Panjang Sisi B "+sisiB+" Panjang Sisi C "+sisiC+"  ");
            System.out.println("Segitiga Siku Siku");
        }

        //Segitiga Sama Sisi//
        else if ((sisiA == sisiB ) && (sisiA == sisiC) && (sisiB == sisiC)){
             System.out.println("Panjang Sisi A : "+sisiA+" Sisi B "+sisiB+" Sisi C "+sisiC+" ");
           System.out.println("Segitiga Sama Sisi");  
        }
        //Segitiga Sama Kaki//
        else if ((sisiA == sisiB) || (sisiA == sisiC) || (sisiB == sisiC)){
            System.out.println("Panjang Sisi A : "+sisiA+" Panjang Sisi B "+sisiB+" Panjang Sisi C "+sisiC+" ");
            System.out.println("Segitiga Sama Kaki");
        }
        //Segitiga Sembarang//
        else {
            System.out.println("Panjang Sisi A : "+sisiA+"  Sisi B "+sisiB+" Sisi C "+sisiC+" ");
            System.out.println("Segitiga Sembarang");
        }
        
       }    
    }
