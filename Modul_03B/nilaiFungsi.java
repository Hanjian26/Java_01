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
public class nilaiFungsi {
    public static void main(String[]    args){
        Scanner  keyboard    =   new Scanner(System.in);
        double fx, x;
       
       
       System.out.print("x yaitu = ");
       x = keyboard.nextDouble();
       
       fx = 5 + 6*x + 8*Math.pow(x,2) + 9*Math.pow(x,3) + 5*Math.pow(x,4);
       System.out.println("fx yaitu = "+fx);
    }
}
