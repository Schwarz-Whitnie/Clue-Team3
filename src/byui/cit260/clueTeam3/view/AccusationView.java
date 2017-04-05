/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.AccusationControl;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Weapon;
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
        this.accusationPrompt = 
                  "\nMake an accusation. "
              + "\n\nBillardRoom       Ballroom"
                + "\nLibrary            Study"
                + "\nHall               Lounge"
                + "\nDiningRoom        Kitchen"
                + "\nConservatory"
                + "\n\nPlease enter a room:";
        this.weaponPrompt = 
                  "\nCandlestick        Knife"
                + "\nRope               Dumbbell"
                + "\nPoison             LeadPipe"
                + "\nRevolver           Wrench"
                + "\n\nPlease enter a weapon:";
        this.suspectPrompt = 
                  "\nColonelMustard    MrsWhite"
                + "\nProfessorPlum     MrsPeacock"
                + "\nMissScarlet       MrGreen"
                + "\n\nPlease enter a suspect:";
        
    }
    
    void displayPrompt() {
        boolean done = false; // user flag to not done
        do { 
            // prompt for and get number of rooms 
            String accusedRoom = this.getRoom();
            if (accusedRoom.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String accusedWeapon = this.getWeapon();
            if (accusedWeapon.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            String accusedSuspect = this.getSuspect();
            if (accusedSuspect.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            
            // do the request action and display the next view 
            done = this.doAction(accusedRoom, accusedWeapon, accusedSuspect); 
           
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

   public boolean doAction(String accusedRoom, String accusedWeapon, String accusedSuspect) {
        
       if (!accusedRoom.equals("BillardRoom") && !accusedRoom.equals("Ballroom") && !accusedRoom.equals("Library") 
               && !accusedRoom.equals("Study") && !accusedRoom.equals("Hall") && !accusedRoom.equals("Lounge") 
               && !accusedRoom.equals("DiningRoom") && !accusedRoom.equals("Kitchen") && !accusedRoom.equals("Conservatory")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild room: "
                   + "Please enter a room in the manison.");
           return false;
       }
       
       if (!accusedWeapon.equals("Poison") && !accusedWeapon.equals("Candlestick") && !accusedWeapon.equals("Knife") 
               && !accusedWeapon.equals("Dumbbell") && !accusedWeapon.equals("Revolver") && !accusedWeapon.equals("Wrench") 
               && !accusedWeapon.equals("Rope") && !accusedWeapon.equals("LeadPipe")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild weapon: "
                   + "Please enter a weapon found in the manison.");
           return false;
       }
       
       if (!accusedSuspect.equals("MrsPeacock") && !accusedSuspect.equals("MissScarlet") && !accusedSuspect.equals("Mrs. White") 
               && !accusedSuspect.equals("ProfessorPlum") && !accusedSuspect.equals("ColonelMustard") && 
               !accusedSuspect.equals("MrGreen")) {
           ErrorView.display(this.getClass().getName(),"\nInvaild suspect: "
                   + "Please enter a suspect found in the manison.");
           return false;
       }
       
       
       //call calcTotalTime() control function
       AccusationControl accusationControl = new AccusationControl();
       accusation = AccusationControl.makeAnAccusation(accusedRoom, accusedWeapon, accusedSuspect);
       
       
       //display next view
       //this.displayNextView(accusationControl);
       
       return true; //success
    }
   
   /*public void resetWeaponStatus(String accusedWeapon) {
       
       for (Weapon weapon : Weapon.values()) {
           if (accusedWeapon.equals(Weapon.values().toString())) {
               accusedWeapon.equals(Weapon.valueOf(accusation));
               
              // DetectiveNotebook.setWeaponStatus(accusation.accusedWeapon, status.guilty);    
           }
       }
   }*/

    /*private void displayNextView(AccusationControl accusationControl) {
        this.console.println(
                "\n=============================================="
                + "\n You have " + accusation 
                + "\n minutes remaining in the game."
                + "\n============================================"
                );
    }*/

}