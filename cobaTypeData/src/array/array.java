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
public class array {
    
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford","Mazda"};
        Number[] myNumber = new Number[4];
        myNumber[0] = 10;
        myNumber[1] = 20;
        myNumber[2] = 30;
        myNumber[3] = 40;
        
        System.out.println(cars[0]);
        System.out.println(myNumber[1]);  
        
        myNumber[1] = 100;
        myNumber[2] = null;
        
        System.out.println(myNumber[1]);
        System.out.println(myNumber[2]);
                
    }        

    
    
    
            
        
    
     
}
