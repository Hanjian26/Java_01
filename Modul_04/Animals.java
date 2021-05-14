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
public class Animals {
    public static void main(String  []args){
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;
        
        if ( rabbit & donkey | donkey & leporidae | donkey |  donkey | rabbit)
            System.out.println("DOG");
        
        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
            System.out.println("CAT");

    }
}
