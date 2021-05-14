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
public class nilaiFinal {
    public static void main(String[]    args){
     double us1, us2, uas,a ,b, c, nilaiFinal;
      //.........Diketahui.......//
   
      System.out.println("Diketahui");
      us1 = 80;
      System.out.println("US1 = "+us1);
      us2 = 60;
      System.out.println("US2 = "+us2);
      uas = 82;
      System.out.println("UAS = "+uas);
      /*Persen dirubah menjadi desimal*/
      a = 0.3;
      System.out.println("30% ke desimal yaitu = "+a);
      b = 0.3;
      System.out.println("30% ke desimal yaitu = "+b);
      c = 0.4;
      System.out.println("40% ke desimal yaitu = "+c);
      System.out.println("Jawaban");
      System.out.println("");

     /* Nilai Final = 30 % x us1 + 30 % x us2 + 40 % x uas*/
      System.out.println("Rumus yaitu Nilai Final = 30 % x us1 + 30 % x us2 + 40 % x uas");
      System.out.println("nilaiFinal = a * us1 + b * us2 + c * uas");
      System.out.println("nilaiFinal = 0.3 x 80 + 0.3 x 60 + 0.4 x 82");
      nilaiFinal = a * us1 + b * us2 + c * uas;
      System.out.println("Nilai Final yaitu = "+nilaiFinal);
    }
}
