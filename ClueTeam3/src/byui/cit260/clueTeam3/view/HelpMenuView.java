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
public class HelpMenuView extends View {
    
    
    public HelpMenuView() {
        
        super("----------------------------------------"
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
            + "\nPlease enter a command: ");
            
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
            case "K": //how to view list of suspects
                this.displayTimeRemaining();
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
        listSuspects.display();
}
    private void displayTimeRemaining() {
        TimeRemainingView roomPrompt = new TimeRemainingView();
        roomPrompt.display();
    }
}
