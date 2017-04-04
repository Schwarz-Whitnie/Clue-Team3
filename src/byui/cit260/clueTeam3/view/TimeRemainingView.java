/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.TimeControl;
import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author whitnieschwarz
 */
public class TimeRemainingView {
    
    private String roomPrompt;
    private String passagewayPrompt;
    private double timeRemaining;
    protected final BufferedReader keyboard = ClueTeam3.getInFile();
    protected final PrintWriter console = ClueTeam3.getOutFile();
    
    public TimeRemainingView() {
        this.roomPrompt = "\nPlease enter number of rooms passed through:";
        //display the locations prompt
        this.passagewayPrompt = "\nPlease enter number of passageways passed through:";
        
    }
    
    void displayPrompt() {
        boolean done = false; // user flag to not done
        do { 
            // prompt for and get number of rooms 
            String roomsTraveled = this.getRoomsTraveled();
            if (roomsTraveled.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            /*String locationsTraveled = this.getLocationsTraveled();
            if (locationsTraveled.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game */
            
            String passagewaysUsed = this.getPassagewaysUsed();
            if (passagewaysUsed.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            
            // do the request action and display the next view 
            done = this.doAction(roomsTraveled, passagewaysUsed); 
           
        }while (!done);
        
    }
private String getRoomsTraveled() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.roomPrompt);
            
            value = this.keyboard.readLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
        }
        return value; // return the value entered
    }
    
/*private String getLocationsTraveled() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.locationPrompt);
            
            value = this.keyboard.readLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
        }
        return value; // return the value entered
    }*/

private String getPassagewaysUsed() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.passagewayPrompt);
            
            value = this.keyboard.readLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
        }
        return value; // return the value entered
    }

   public boolean doAction(String roomsTraveled, String passagewaysUsed) {
        
       if (roomsTraveled.equals("-1")) {
           ErrorView.display(this.getClass().getName(),"\nInvalid number of rooms: "
                   + "The number of rooms must be greater than 0");
           return false;
       }
       
       /*if (locationsTraveled.equals("-1")) {
           ErrorView.display(this.getClass().getName(),"\nInvalid number of locations: "
                   + "The number of locations must be greater than 0");
           return false;
       }*/
       
       if (passagewaysUsed.equals("-1")) {
           ErrorView.display(this.getClass().getName(),"\nInvalid number of passageway used: "
                   + "The number of passageways must be between 0-3");
           return false;
       }
       
//       passagewaysUsed = " ";
       double d = Double.parseDouble(passagewaysUsed);
       
//       roomsTraveled = " ";
       double r = Double.parseDouble(roomsTraveled);
       
//       locationsTraveled = " ";
       //double l = Double.parseDouble(locationsTraveled);
       
       //call calcTotalTime() control function
       TimeControl timeControl = new TimeControl();
       timeRemaining = TimeControl.calcTotalTime(r, d);
       
       //display next view
       this.displayNextView(timeControl);
       
       return true; //success
    }

    private void displayNextView(TimeControl timeControl) {
        this.console.println(
                "\n=============================================="
                + "\n You have " + timeRemaining 
                + "\n minutes remaining in the game."
                + "\n============================================"
                );
    }


}        



    

