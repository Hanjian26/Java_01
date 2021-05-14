/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_08;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a = 0, b, c, y, D, x1, x2, hasil = 0;

        do {
            System.out.print("Masukan Koefisien x2 ( a ) : ");
            a = keyboard.nextInt();
        } while (a == 0);
        System.out.print("Masukan Koefisien x  ( b ) : ");
        b = keyboard.nextInt();
        System.out.print("Masukan Koefisien x  ( c ) : ");
        c = keyboard.nextInt();

        System.out.println("Nilai y untuk beberapa  x antara akar pertama dan kedua adalah");
        System.out.println("===================================================================");
        System.out.println("x\t y = " + a + "x^2 + " + b + "x + " + c);
        System.out.println("===================================================================");

        D = b * b - 4 * a * c;

        if (D > 0) {

            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Dari persamaan y  = " + a + "x^2 + " + b + "x +" + c);
            System.out.println("Akar - Akarnya adalah " + x1 + " dan " + x2);
            System.out.println("===================================================================");

            for (double x = x2; x <= x1; x = x + 0.25) {
                y = a * x * x + b * x + c;

                hasil = hasil + x + y;
                System.out.println(hasil);

            }

        } else {
            System.out.println("Tidak ada dua akar yang berbeda");
        }

        System.out.println("===================================================================");

    }
}
