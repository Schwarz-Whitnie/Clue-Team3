/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;

/**
 *
 * @author Treya
 */
public class GameMenuView extends View{

    private String gameMenu;
    
    
    public GameMenuView() {
        
        this.gameMenu = 
              "----------------------------------------"
            + "\n| Game Menu                            |"
            + "\n----------------------------------------"
            + "\nMM - Map of Mansion"
            + "\nS - List of Suspects"
            + "\nW - List of Weapons"
            + "\nR - List of Rooms" 
            + "\nL - Move to New Room"
            + "\nN - View Detective Notebook"
            + "\nA - Make an Accusation"
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ";
    }
    
    public void displayGameMenuView() {
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(gameMenuOption);
                     
        } while (!done);
    }
    
    private String getGameMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.gameMenu);
            
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

    public boolean doAction(String gameMenuOption) {
        
        gameMenuOption = gameMenuOption.toUpperCase(); //convert choice to upper case
        
        switch (gameMenuOption) {
            case "M": //view list
                this.MansionMap();
                break;
            case "S": //view list
                this.suspectList();
                break;
            case "W": //view list
                this.weaponList();
                break;
            case "R": //view list
                this.roomList();
                break;
            case "L": //move to new room
                this.moveRooms();
                break;
            case "N": //view detective notebook
                this.viewDetectiveNotebook();
                break;
            case "A": //make an accusation
                this.makeAccusation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }

    private void MansionMap() {
        System.out.println("*** Map of Mansion ***");
    }
    
    private void suspectList() {
        //display the list of suspects
        ListSuspectsView listSuspects = new ListSuspectsView();
        listSuspects.display();        
    }

    private void weaponList() {
        //display the list of weapons
        ListWeaponsView listWeapons = new ListWeaponsView();
        listWeapons.displayListWeapons();
    }

    private void roomList() {
        //display the list of rooms
        ListRoomsView listRooms = new ListRoomsView();
        listRooms.displayListRooms();
    }

    private void moveRooms() {
        System.out.println("*** Move Rooms ***");
    }

    private void viewDetectiveNotebook() {
        System.out.println("*** View Detective Notebook ***");
    }

    private void makeAccusation() {
        System.out.println("*** Make an Accusation ***");
    }

    
}
