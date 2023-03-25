/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author FASILKOM
 */
public class conditional {
    public static void main(String[] args) {
        int nilai = 80;
        int absensi = 75;
        
        // if statement
        if (nilai >= 80 && absensi >= 75){
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
        
        // Else If Statement & Nested Condition
        if (absensi >= 75){
            if (nilai >= 90){
                System.out.println("Nilai A");
            } else if (nilai >= 80){
                System.out.println("Nilai B");
            } else if (nilai >= 70){
                System.out.println("Nilai C");
            } else if (nilai >= 60){
                System.out.println("Nilai D");
            }
            else {
                System.out.println("YAH GAK LULUS");
            }
        }
        
        // Switch Condition
        switch(nilai) {
            case 90:
                System.out.println("Nilai A");
                break;
            case 80:
                System.out.println("Nilai B");
                break;
            default:
                System.out.println("Tidak lulus");
                break;
        }
    }
}
        
        
    
    

