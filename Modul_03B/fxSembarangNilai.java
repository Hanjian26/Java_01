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
public class fxSembarangNilai {
    public static void main(String  []args){
        double konstanta, phi, bilBawah, bilPangkat, pangkat, o, u, x, hasil;
        phi = 3.14;
        konstanta = 2.718;
        Scanner keyboard    =   new Scanner(System.in);
        
        System.out.println("f(x) Sembarang Nilai");
        System.out.print("Masukan nilai untuk konstanta x = ");
        x = keyboard.nextDouble();
        System.out.print("Masukan nilai untuk konstanta u = ");
        u = keyboard.nextDouble();
        System.out.print("Masukan nilai untuk konstanta o = ");
        o = keyboard.nextDouble();
        
        System.out.print("Persamaannya yaitu = ");
        bilBawah = konstanta    *   (1/(o*(Math.sqrt(2*phi))));
        bilPangkat = -0.5*((((x*x)-(u*u)/(o*o))));
        hasil = Math.pow (bilBawah, bilPangkat);
        System.out.print(+hasil);
        System.out.println("");
    }
    
}
