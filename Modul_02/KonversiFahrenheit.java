/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_02;

/**
 *
 * @author acer
 */
public class KonversiFahrenheit {
    public static void main(String[]    args){
       
        double fahrenheit, celcius;
        System.out.println("Conversi celcius ke Fahrenheit");
         
        celcius =5;
        System.out.println("Diketahui Celcius ="+celcius);
       
        
        fahrenheit = 9.0/5.0 * celcius + 32;
        
        System.out.println("Suhu 5 derajat celcius adalah =:"+fahrenheit);
    }
    
}
