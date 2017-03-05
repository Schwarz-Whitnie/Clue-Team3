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
        
        super ("----------------------------------------"
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
            + "\nPlease enter a command: ");
    }
    

    @Override
    public boolean doAction (String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
        listWeapons.display();
    }

    private void roomList() {
        //display the list of rooms
        ListRoomsView listRooms = new ListRoomsView();
        listRooms.display();
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
