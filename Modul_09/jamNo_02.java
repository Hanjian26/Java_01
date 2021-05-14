/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanjian Listanto
 */
public class jamNo_02 {
    public static void main (String []args){
 
        for (int jam = 1; jam <= 12; jam++) {
            for (int menit = 1; menit <= 60; menit++) {
                System.out.print("Detik : ");
                for (int detik = 1; detik <= 60; detik++) {
                    System.out.print(" "+detik);
                     
                }
                System.out.println("");
                System.out.println("Menit :  "+menit);
                
            }
           
            System.out.println("Jam    : "+jam);
            System.out.println("\t");
             }
       }
}