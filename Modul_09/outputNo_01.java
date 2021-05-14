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
public class outputNo_01 {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int inputN = 1;
 for (int i = 1 ; i < inputN; i++) {
            for (int j = 1; j < inputN ; j++) {
                i = i + j;
               System.out.print(" "+i);  
   
            }
                       
        }   
 
  }
}
