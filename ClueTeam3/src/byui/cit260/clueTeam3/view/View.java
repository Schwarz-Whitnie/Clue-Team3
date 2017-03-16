/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;


/**
 *
 * @author catrinalonghurst1
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
        
    } 
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(value);
                     
        } while (!done);
    }
    
        @Override
        public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

}
