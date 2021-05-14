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
public class beratIdeal {
    public static void main(String[]    args){
        int tBadan, bIdeal;
        
        //Diketahui Nilai//
        tBadan =172;
        System.out.println("Tinggi Badan yaitu =" + 172+"cm");
        System.out.println("Berapakah Berat Badan Ideal tersebut?");
        /*Rumus tinggi badan ideal yaitu
          Tinggi badan - 100
          Jawaban
        */
        System.out.println("");
        System.out.println("Jawaban");
        System.out.println("Rumus yang digunakan untuk menghitung Berat ideal adalah Tinggi badan - 100");
        System.out.println("Berat ideal =" +tBadan+" - 100");
        bIdeal = tBadan - 100;
        System.out.println("Berat ideal dari 172cm adalah =" +bIdeal+"kg");
        
    } 
}
