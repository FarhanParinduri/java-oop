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
public class looping {
    public static void main(String[] args) {
        // For Loop
        for (int counter = 0; counter <= 10; counter++){
            System.out.println("Loop Ke - "+ counter);
        }
        
        // while loop
        int counterLoop = 0;
        while (counterLoop <= 5){
            System.out.println("While Loop Ke - " + counterLoop);
            counterLoop++;
        }
        
        // Do While Loop
        do {
            System.out.println("Do While Loop Ke - " + counterLoop);
            counterLoop++;  
          } while (counterLoop <= 10);
    }
    
}
