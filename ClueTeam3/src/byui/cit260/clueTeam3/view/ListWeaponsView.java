/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public class ListWeaponsView {
    
    private String weapon;
    
    public ListWeaponsView() {
        
        
        
        this.weapon = 
              "----------------------------------------"
            + "\n|   Weapons                        |"
            + "\n----------------------------------------"
            + "\nC - Candlestick"
            + "\nK - Knife"
            + "\nR - Rope"
            + "\nD - Dumbbell"
            + "\nP - Poison"
            + "\nL - Lead pipe"  
            + "\nG - Revolver"
            + "\nW - Wrench"
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease choose a weapon: ";
            
    }
    
 void displayListWeapons() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String helpOption = this.getWeaponsView();
            if (helpOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(helpOption);
                     
        } while (!done);
    }
     
    private String getWeaponsView() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.weapon);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nPlease make a valid selection.");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

    public boolean doAction(String weaponList) {
        
        weaponList = weaponList.toUpperCase(); //convert choice to upper case
        
        switch (weaponList) {
            case "C": //candlestick
                this.candlestick();
                break;
            case "K": //knife
                this.knife();
                break;
            case "R": //rope
                this.rope();
                break;
            case "D": //dumbbell
                this.dumbbell();
                break;
            case "P": //poison
                this.poison();
                break;
            case "L": //lead pipe
                this.leadpipe();
                break;
            case "G": //gun
                this.gun();
                break;
            case "W": //wrench
                this.wrench();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }
    
    private void candlestick() {
        System.out.println("*** Candle Stick ***");
    }

    private void knife() {
        System.out.println("*** wKnife ***");
    }

    private void rope() {
        System.out.println("*** Rope ***");
    }

    private void dumbbell() {
        System.out.println("*** Dumbbell ***");
    }

    private void poison() {
        System.out.println("*** Posion ***");
    }

    private void leadpipe() {
        System.out.println("*** Lead Pipe ***");
    }

    private void gun() {
        System.out.println("*** Revolver ***");
    }
    
     private void wrench() {
        System.out.println("*** Wrench ***");
    }


}