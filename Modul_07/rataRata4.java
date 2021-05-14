/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_07;

/**
 *
 * @author Hanjian Listanto
 */
import java.util.Scanner;
public class rataRata4 {
    public static void main(String  []args){
    Scanner keyboard = new Scanner (System.in);
    
    double banyakN, jumlahData, jumlahKuadrat, nilaiMax, nilaiMin, rataRata, variansi, devStandard;
    int data, a, rentangData;
    a = 1;
    jumlahData = 0;
    jumlahKuadrat = 0;
    nilaiMax = 0;
    nilaiMin = 999999; 
    
    
        System.out.println("");
    
        System.out.print("Masukan Banyak Data yang akan diolah : ");
        banyakN = keyboard.nextDouble();
    
        do {
            System.out.print("Masukkan data ke "+a+" : ");
            data = keyboard.nextInt();
            a++;
            jumlahData += data;
            jumlahKuadrat += (data*data);
            
            /* Nilai Maksimal dan Nilai Minimum*/
            
            if (a == 1 ){
                nilaiMax = data;                
            }
            
            else if (data > nilaiMax ){
                
                nilaiMax = data;
        }
            
            if (a == 1){
                nilaiMin = data;
            }
            
            else if (data < nilaiMin){
                nilaiMin = data; 
 
            }
            
            /*...........RENTANG DATA................*/
            
            rentangData = (int) (nilaiMax - nilaiMin);
            
            
             /*...........RATA RATA................*/
             
             rataRata = (jumlahData) / banyakN;  
            
            /*...........VARIANSI................*/
            
            variansi = (jumlahKuadrat - banyakN * (rataRata * rataRata)  ) / banyakN ;
            
            /*..........Deviasi Standar...........*/
            
            devStandard = Math.sqrt (variansi);
            
        }while (a <= banyakN );
        System.out.println("");
        System.out.println("Nilai Max                     : "+nilaiMax);
        System.out.println("Nilai Min                     : "+nilaiMin);
        System.out.println("Nilai dari Rentang Data yaitu : "+rentangData);
        System.out.println("Nilai dari Rata Rata yaitu    : "+rataRata);
        System.out.println("Nilai Variansi Yaitu          : "+variansi);
        System.out.println("Nilai Deviasi Standart Yaitu  : "+devStandard);
    
    }
}
