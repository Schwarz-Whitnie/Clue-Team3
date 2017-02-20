/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;

/**
 *
 * @author camer
 */
public class HelpMenuView {
    
    private String help;
    
    public HelpMenuView() {
        
        
        
        this.help = 
              "----------------------------------------"
            + "\n| Getting Help                         |"
            + "\n----------------------------------------"
            + "\nO - What is the object of the game"
            + "\nM - How to move"
            + "\nP - How to pick things up"
            + "\nT - How to interview a suspect"
            + "\nR - List of rooms"
            + "\nN - View the detective notebook"  
            + "\nS - List of Suspects"    
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ";
            
    }
    
    void displayHelpMenu() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String helpOption = this.getHelpOption();
            if (helpOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(helpOption);
                     
        } while (!done);
    }
     
    private String getHelpOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.help);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

    public boolean doAction(String helpOption) {
        
        helpOption = helpOption.toUpperCase(); //convert choice to upper case
        
        switch (helpOption) {
            case "O": //what is the boject of the game
                this.objectGame();
                break;
            case "M": //how do you move
                this.move();
                break;
            case "P": //how do you pick stuff up
                this.pickUp();
                break;
            case "T": //how to interview people
                this.interview();
                break;
            case "R": //list of rooms
                this.roomList();
                break;
            case "N": //how to access detective notebook
                this.notebook();
                break;
            case "S": //how to view list of suspects
                this.displayListSuspects();
                break;                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }
    
    public void objectGame() {
        System.out.println("*** object of game is... ***");
    }

    private void move() {
        System.out.println("*** you move by... ***");
    }

    private void pickUp() {
        System.out.println("*** pick stuff up by... ***");
    }

    private void interview() {
        System.out.println("*** interview people by... ***");
    }

    private void roomList() {
        System.out.println("*** list of rooms... ***");
    }

    private void notebook() {
        System.out.println("*** how to get to your notebook... ***");
    }

    public void displayListSuspects() {
        // display the list of suspects
        ListSuspectsView listSuspects = new ListSuspectsView();
        listSuspects.displayListSuspects();
}
}
