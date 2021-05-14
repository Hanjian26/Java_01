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
public class PrintRelation8 {
    public static void main (String []args){
        int a = 7 * 3 + 6 / 2 - 5; 
        int b = 21 - 8 + a % 3 * 11;
        System.out.println(": "+a);
        System.out.println(" :"+b);
        
        if ( a < b)
        {
            System.out.println("A is Less than B");
        }
        
        if (a == b)
        {
            System.out.println("A is equal to B");
        }
        
        if ( a > b )
        {
            System.out.println("A is greater than B");
        }
    }
}
