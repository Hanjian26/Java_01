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
public class segitigaSembarang {
    public static void main(String  []args){
     double s, luas, keliling, a, b, c;
     
     Scanner keyboard = new Scanner(System.in);
 
     /* Rumus menghitung keliling Segitiga
        Keliling a+b+c 
     */
     System.out.println("Menghitung Keliling");
     System.out.print("Panjang a : ");
     a = keyboard.nextInt();
     System.out.print("Panjang b : ");
     b = keyboard.nextInt();
     System.out.print("Panjang c : ");
     c = keyboard.nextInt();
    
     
     keliling = a + b + c;
     System.out.println("Keliling adalah "+keliling);
     System.out.println("");
     
     /*.... Rumus Menghitung Luas Segitiga
       ....  nilai setengah kelilingnya yakni s = keliling / 2
     .... Luas = Akar s(s-a)(s-b)(s-c)
     */
     s = (a + b + c) / 2;
     System.out.println("Nilai S yaitu "+s);
     luas = Math.sqrt (s*(s-a)*(s-b)*(s-c));
     System.out.println("Luas = "+luas);
        
     
     /* 6
     6
     7
     */
    }
}
