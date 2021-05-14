/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_05;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class tes {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int masaKerja, golonganKerja;
        
        System.out.print("Masukan Masa Kerja : ");
        masaKerja = keyboard.nextInt();
        System.out.print("Masukan Golongan Kerja : ");
        golonganKerja = keyboard.nextInt();
        
        if (masaKerja >= 0 && masaKerja <= 10){
            System.out.println("Cetak ");
        }
         else if (masaKerja >= 11 && masaKerja <= 20);
    
    }
}