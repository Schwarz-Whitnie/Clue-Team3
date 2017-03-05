/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.TimeControl;
import java.util.Scanner;

/**
 *
 * @author whitnieschwarz
 */
public class TimeRemainingView {
    
    private String roomPrompt;
    private final String locationPrompt;
    private final String passagewayPrompt;
    private double timeRemaining;
    
    public TimeRemainingView() {
        this.roomPrompt = "\nPlease enter number of rooms passed through:";
        //display the locations prompt
        this.locationPrompt = "\nPlease enter number of locations passed through:";
        this.passagewayPrompt = "\nPlease enter number of passageways used:";
        
    }
    
    void displayRoomPrompt() {
        boolean done = false; // user flag to not done
        do { 
            // prompt for and get number of rooms 
            String roomsTraveled = this.getRoomsTraveled();
            if (roomsTraveled.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String locationsTraveled = this.getLocationsTraveled();
            if (locationsTraveled.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String passagewaysUsed = this.getPassagewaysUsed();
            if (passagewaysUsed.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            
            // do the request action and display the next view 
            done = this.doAction(roomsTraveled, locationsTraveled, passagewaysUsed); 
           
        }while (!done);
        
    }
private String getRoomsTraveled() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.roomPrompt);
            
            value = keyboard.nextLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; // return the value entered
    }
    
private String getLocationsTraveled() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.locationPrompt);
            
            value = keyboard.nextLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; // return the value entered
    }

private String getPassagewaysUsed() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.passagewayPrompt);
            
            value = keyboard.nextLine(); // get next line typed one keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value; // return the value entered
    }

   public boolean doAction(String roomsTraveled, String locationsTraveled, String passagewaysUsed) {
        
       if (roomsTraveled.equals("-1")) {
           System.out.println("\nInvalid number of rooms: "
                   + "The number of rooms must be greater than 0");
           return false;
       }
       
       if (locationsTraveled.equals("-1")) {
           System.out.println("\nInvalid number of locations: "
                   + "The number of locations must be greater than 0");
           return false;
       }
       
       if (passagewaysUsed.equals("-1")) {
           System.out.println("\nInvalid number of passageway used: "
                   + "The number of passageways must be between 0-3");
           return false;
       }
       
//       passagewaysUsed = " ";
       double d = Double.parseDouble(passagewaysUsed);
       
//       roomsTraveled = " ";
       double r = Double.parseDouble(roomsTraveled);
       
//       locationsTraveled = " ";
       double l = Double.parseDouble(locationsTraveled);
       
       //call calcTotalTime() control function
       TimeControl timeControl = new TimeControl();
       timeRemaining = TimeControl.calcTotalTime(r, l, d);
       
       //display next view
       this.displayNextView(timeControl);
       
       return true; //success
    }

    private void displayNextView(TimeControl timeControl) {
        System.out.println(
                "\n=============================================="
                + "\n You have " + timeRemaining 
                + "\n minutes remaining in the game."
                + "\n============================================"
                );
    }


}

        

    

