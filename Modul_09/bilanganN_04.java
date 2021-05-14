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
public class bilanganN_04 {
    public static void main(String  []args){
     int inputN, bil;
     char y,t;
     String keputusan;
     Scanner keyboard = new Scanner(System.in);
           
        System.out.print("Masukan Bilangan N : ");
        inputN = keyboard.nextInt();

        for (int i = 0 ; i < inputN; i++) {
            for (int j = 0; j < inputN ; j++) {
                i = i + j;
               System.out.print(" "+i);       
            }              
        }   
        System.out.println();
        System.out.println("Bilangan ke : "+inputN);
        System.out.println();

        System.out.print("Apakah Anda Ingin Keluar (y/t)? : ");
        keputusan = keyboard.next();
        
         switch (keputusan){
            
            case "y":
                System.out.println("Program anda berhenti");
                break;
            case "t":
                System.out.println("Program anda akan berlanjut ");
                
                  System.out.print("Masukan Bilangan N : ");
                  inputN = keyboard.nextInt();
                        for (int i = 0 ; i < inputN; i++) {
                            for (int j = 0; j < inputN ; j++) {
                                i = i + j;
                               System.out.print(" "+i);
                              }
                          }   
                        System.out.println();
                        System.out.println("Bilangan ke : "+inputN);
                        System.out.println();
            default:      
        }
    }
}
