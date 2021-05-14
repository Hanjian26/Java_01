package Modul_04;

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
public class bilGanjilGenap {
    public static void main(String  []args){
        Scanner keyboard = new Scanner(System.in);
        int x, y;
        
        System.out.println("Menentukan Bilangan Ganjil Dan Bilangan Genap");
        System.out.print("Masukan Angka X : ");
        x = keyboard.nextInt();

    
        
        if(x%2==0){
            System.out.println("Bilangan "+x+" adalah bilangan genap");
        }else   {
            System.out.println("Bilangan "+x+" adalah bilangan ganjil");
        }
      
    }
    
}
