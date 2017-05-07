/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingvaluesinaloop;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class AddingValuesInALoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int userInput, count, sum, results;
        sum = 0;
        results = 0;
        count = 1;
        System.out.print("I will add up the numbers you give me.\n" + "number: ");
        userInput = keyboard.nextInt();
        count++;
        
        
        while(userInput != 0){
            
            results = results + userInput;
            
            System.out.print("The total so far is " + results + "\n" + "number: ");
            userInput = keyboard.nextInt();
    
             }
    
        
    
    }
    
}
