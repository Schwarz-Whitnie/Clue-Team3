/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author catrinalonghurst1
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ClueTeam3.getInFile();
    protected final PrintWriter console = ClueTeam3.getOutFile();
    
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
        
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        try {
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);
            
                value = this.keyboard.readLine(); //get next line typed one keyboard
            
               // Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
        }
        return value; // return the value entered
    }
       
    public String getBlockedMessage(String message) {
        
        String newMessage = "";
        int noOfLines = (message.length() / 81) + 1;
        String[] words = message.split(" ");
        String line = "";
        
        for (String word : words) {
            
            if (line.length() + word.length() < 80) {
                line += word.trim() + " ";
            }
            else {
                newMessage += line + "\n";
                line = word.trim() + " ";
            }
        }
        newMessage += line;
        
        
        return newMessage;
        
        
    }
}
