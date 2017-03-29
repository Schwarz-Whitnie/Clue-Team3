/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.AccusationControl;
import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author whitnieschwarz
 */
public class AccusationView {
    
    private String accusationPrompt; 
    private String weaponPrompt;
    private String suspectPrompt;
    private String accusation; 
    
    protected final BufferedReader keyboard = ClueTeam3.getInFile();
    protected final PrintWriter console = ClueTeam3.getOutFile();
    
    
    public AccusationView() {
        this.accusationPrompt = "\nMake an accusation. Please enter a room:";
        this.weaponPrompt = "\nPlease enter a weapon:";
        this.suspectPrompt = "\nPlease enter a suspect:";
        
    }
    
    void displayPrompt() {
        boolean done = false; // user flag to not done
        do { 
            // prompt for and get number of rooms 
            String room = this.getRoom();
            if (room.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String weapon = this.getWeapon();
            if (weapon.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String suspect = this.getSuspect();
            if (suspect.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            
            // do the request action and display the next view 
            done = this.doAction(room, weapon, suspect); 
           
        }while (!done);
        
    }
private String getRoom() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.accusationPrompt);
            
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
    
private String getWeapon() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.weaponPrompt);
            
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

private String getSuspect() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.suspectPrompt);
            
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

   public boolean doAction(String room, String weapon, String suspect) {
        
       if (!room.equals("Billard Room") && !room.equals("Ballroom") && !room.equals("Library") 
               && !room.equals("Study") && !room.equals("Hall") && !room.equals("Lounge") 
               && !room.equals("Dining Room") && !room.equals("Kitchen") && !room.equals("Conservatory")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild room: "
                   + "Please enter a room in the manison.");
           return false;
       }
       
       if (!weapon.equals("Poison") && !weapon.equals("Candlestick") && !weapon.equals("Knife") 
               && !weapon.equals("Dumbbell") && !weapon.equals("Revolver") && !weapon.equals("Wrench") 
               && !weapon.equals("Rope") && !weapon.equals("Pipe")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild weapon: "
                   + "Please enter a weapon found in the manison.");
           return false;
       }
       
       if (!suspect.equals("Mrs. Peacock") && !suspect.equals("Miss Scarlet") && !suspect.equals("Mrs. White") 
               && !suspect.equals("Professor Plum") && !suspect.equals("Colonel Mustard") && 
               !suspect.equals("Mr. Green")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild suspect: "
                   + "Please enter a suspect found in the manison.");
           return false;
       }
       
       
       //call calcTotalTime() control function
       AccusationControl accusationControl = new AccusationControl();
       accusation = AccusationControl.makeAnAccusation(room, weapon, suspect);
       
       //display next view
       //this.displayNextView(accusationControl);
       
       return true; //success
    }

    /*private void displayNextView(AccusationControl accusationControl) {
        this.console.println(
                "\n=============================================="
                + "\n You have " + accusation 
                + "\n minutes remaining in the game."
                + "\n============================================"
                );

    }*/

}
