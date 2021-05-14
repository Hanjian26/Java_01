/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_03B;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class nilaiFinal {
    public static void main(String[]    args){
        double us1, us2, uas, a, b, c, nilaiFinal;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nilai Final :");
        a = 0.3;
        b = 0.3;
        c = 0.4;
        //.......Persen dirubah menjadi desimal ....//
        //.......Pembuat Operator Penghitung........//
        
        System.out.print("Masukan Nilai US-1: ");
        us1 = keyboard.nextDouble();
        System.out.print("Masukan Nilai US-2: ");
        us2 = keyboard.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        uas = keyboard.nextDouble();
        
        /*  Rumus 30 % x us1 + 30 % x us2 + 40 % x uas
            Dirubah ke Desimal........
        */
        
        nilaiFinal = (a * us1) + (b * us2) + (c * uas);

        System.out.println("Nilai Final: "+nilaiFinal);
    }
    
}
