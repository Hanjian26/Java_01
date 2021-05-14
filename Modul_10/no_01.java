/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_10;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class no_01 {
    public static void main(String  []args){
       Scanner keyboard = new Scanner(System.in);
       int n,r;
        do {
            
        
        
        System.out.print("Nilai n = ");
        n = keyboard.nextInt();
        System.out.print("Nilai r = ");
        r = keyboard.nextInt();
        if (r > n){
            System.out.println("Nilai memiliki syarat yaitu  r ≤ n ");
            System.out.println();
        }
        } while (r >n );
        
        System.out.println();
        System.out.println("Besarnya C = "+C(n, r));
        System.out.println("Hasil Faktorial C(n,r) = "+C(n,r));
        System.out.println("Nilai dari "+n+"! yaitu "+faktorial(n));
            System.out.println("Besarnya "+r+"! yaitu "+faktorial(r));
        
    }
    static int faktorial(int n){
        int hasFak = 1;
        if (n==0){
            return 0;
        }
        else{ 
            for (int i = 1 ;i <= n ; i++){
        hasFak = hasFak*i;
        }
        }
        return hasFak;
        
    }
static int C(int n, int r){
    int C = faktorial(n)/(faktorial(n-r)*faktorial(r));
    return C;
    
}
}