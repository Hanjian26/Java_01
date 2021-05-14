/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class jamNo_02BETA {
    public static void main(String  []args){
                int menit = 0, jam = 0;
        
        for (int i = 1; i <= 12; i++) {
            {
                for(int j = 1; j<=60; j++){
                    
                    System.out.print("Detik : ");
                    for (int k = 1; k <= 60; k++) {
                        
                        System.out.print(" "+k);
                        if(k==60){
                            menit++;
                        }
                    }
                    System.out.print("\n");
                    System.out.print("Menit : "+menit );
                    System.out.print("\n");
                    if(j==60){
                        jam++;
                        System.out.println("Jam   : "+jam);
                        System.out.println();
                    }

                }
                
            }
        }
        
    }
}
   
