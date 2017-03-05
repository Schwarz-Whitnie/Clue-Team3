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
public class TimeRemainingView extends View {
    
    private double timeRemaining;
    
    public TimeRemainingView() {
        super ("\nPlease enter number of rooms passed through:");
        //display the locations prompt
        this.locationPrompt();  
        this.passagewayPrompt();
        
    }
    
    public void locationPrompt() {
        
        System.out.println("\nPlease enter number of locations passed through:");
    }
    
    public void passagewayPrompt() {
        
        System.out.println("\nPlease enter number of passageways used:");
    }

@Override 
   public boolean doAction(String value) {
        
       if (value.equals("-1")) {
           System.out.println("\nInvalid number of rooms: "
                   + "The number of rooms must be greater than 0");
           return false;
       }
       
        double r = Double.parseDouble(value);
       
       //call calcTotalTime() control function
       TimeControl timeControl = new TimeControl();
       timeRemaining = TimeControl.calcTotalTime(r,r,r);
       
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
        

    

