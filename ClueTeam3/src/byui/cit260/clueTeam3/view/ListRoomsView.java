/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;

/**
 *
 * @author whitnieschwarz
 */
public class ListRoomsView {
    
    private final String listRooms;
    
    public ListRoomsView() {
        this.listRooms = 
              "---------------------------------------"
            + "\n| List of Rooms                     |"
            + "\n-------------------------------------"
            + "\nR - Billard Room"
            + "\nB - Ballroom"
            + "\nL - Library"
            + "\nS - Study"
            + "\nH - Hall"
            + "\nO - Lounge"    
            + "\nD - Dining Room"
            + "\nK - Kitchen"
            + "\nC - Conservatory" 
            + "\nQ - Quit"
            + "\n--------------------------------------"
            + "\nPlease enter a command.";
                
    }
    
    void displayListRooms() {
        boolean done = false; // user flag to not done
        do { 
            // prompt for and get players name 
            String roomsOption = this.getRoomsOption();
            if (roomsOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game 
            
            // do the request action and display the next view 
            done = this.doAction(roomsOption); 
           
        }while (!done);
    }
private String getRoomsOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //i nitialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.listRooms);
            
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

    public boolean doAction(String roomsOption) {
        
        roomsOption = roomsOption.toUpperCase(); // convert choice to upper case
        
        switch (roomsOption) {
            case "R": // Billard Room 
                this.billard();
                break;
            case "B": // Ballroom
                this.ballroom();
                break;
            case "L": // Library
                this.library();
                break;
            case "S": // Study 
                this.study();
                break;
            case "H": // Hall 
                this.hall();
                break;
            case "O": // Lounge
                this.lounge();
                break;
            case "D": // Dining Room 
                this.dining();
                break;
            case "K": // Kitchen
                this.kitchen();
                break;
            case "C": // Conservatory 
                this.conservatory();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }

    private void billard() {
          System.out.println("*** billard funtion called ***");
    }

    private void ballroom() {
        System.out.println("*** ballroom function called***");
    }

    private void library() {
        System.out.println("*** ballroom function called ***");
    }

    private void study() {
        System.out.println("*** study function called ***");
    }

    private void hall() {
        System.out.println("*** hall function called ***");
    }

    private void lounge() {
        System.out.println("*** lounge function called ***");
    }
    
    private void dining() {
        System.out.println("*** dining function called ***");
    }
    
    private void kitchen() {
        System.out.println("*** kitchen function called ***");
    }
    
    private void conservatory() {
        System.out.println("*** conservatory function called ***");
    }
    
}



