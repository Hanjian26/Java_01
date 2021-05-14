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
public class MyClass1 {
        public static void main (String []args){
            boolean a, b, c;
            a = b = c = true;
            
            if( !a || ( b && c ))
            {
                System.out.println("If executed");
            }   
            else 
            {
                System.out.println("else executed");
            }
        }
}
