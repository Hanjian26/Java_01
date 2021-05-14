/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class matrix_05 {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int baris, kolom, a= 1;
        
        System.out.print("Masukan Baris Matrix : ");
        baris = keyboard.nextInt();
        System.out.print("Masukan Kolom Matrix : ");
        kolom = keyboard.nextInt();
        
        for ( int i = 1; i <= baris; i++) {
            for ( int j = 1; j <= kolom; j++) {
                if(j == i){
                    System.out.print(""+a+" ");
                }else{
                    System.out.print("0 ");
                }
  
            }
            System.out.println();
        }
           
        
    }
}
    