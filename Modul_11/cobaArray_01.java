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

public class cobaArray_01 {

    public static void main(String[] args) {
        int[] hitung;
        hitung = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " adalah " + hitung[4 - i]);
        }
    }
}
