/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.util.Scanner;

/**
 *
 * @author catrinalonghurst1
 */
public class ListSuspectsView {
    
    private String suspects;
    private final String listSuspects;

    
    public ListSuspectsView() {
        
        this.listSuspects = 
              "------------------------------------------"
            + "\n| List of Suspects                      |"
            + "\n----------------------------------------"
            + "\nC  - Colonel Mustard"
            + "\nW  - Mrs. White"
            + "\nPP - Professor Plum"
            + "\nP  - Mrs. Peacock"
            + "\nS  - Miss Scarlet"
            + "\nG  - Mr. Green"    
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ";
            
    }
    
    void displayListSuspects() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String suspectsOption = this.getSuspectsOption();
            if (suspectsOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
          
            
            //do the requested action and display the next view
            done = this.doAction(suspectsOption);
                     
        } while (!done);
    }
     
    private String getSuspectsOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.listSuspects);
            
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

    public boolean doAction(String suspectsOption) {
        
        suspectsOption = suspectsOption.toUpperCase(); //convert choice to upper case
        
        switch (suspectsOption) {
            case "C": //Colonel Mustard
                this.mustard();
                break;
            case "W": //hMrs. White
                this.white();
                break;
            case "PP": //Professor Plum
                this.plum();
                break;
            case "P": //Mrs. Peacock
                this.peacock();
                break;
            case "S": //Miss Scarlet
                this.scarlet();
                break;
            case "G": //Mr. Green
                this.green();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }

    private void mustard() {
          System.out.println("*** Mustard.. ***");
    }

    private void white() {
        System.out.println("*** White... ***");
    }

    private void plum() {
        System.out.println("*** plum... ***");
    }

    private void peacock() {
        System.out.println("*** peacock... ***");
    }

    private void scarlet() {
        System.out.println("*** scarlet... ***");
    }

    private void green() {
        System.out.println("*** green... ***");
    }




}
    
