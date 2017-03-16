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
public class ListRoomsView extends View{
    
    
    public ListRoomsView() {
        super("\n---------------------------------------"
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
            + "\nPlease enter a command.");
                
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
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



