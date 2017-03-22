/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;
import byui.cit260.clueTeam3.control.CharacterControl;
import java.util.Scanner;

/**
 *
 * @author catrinalonghurst1
 */

public class PoisonControlView {
      
    private String poisonPrompt;
    private String poisonControl;

    
    public PoisonControlView() {
        
        //displays the posion prompt
        this.poisonPrompt = "\nPlease enter the amount of Poison missing from "
                + "the vile.";
        
    }
   
    
    void displayPoisonPrompt() {
        boolean done = false;
        do{
            String amtPoison = this.getAmountPoison();
            if (amtPoison.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
        done = this.doAction(amtPoison);  
        
        } while (!done);
    }
    
    private String getAmountPoison() {
        Scanner keyboard = new Scanner(System.in); 
        String value = ""; //value to be returned
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.poisonPrompt);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 0) { // value is blank
                System.out.println("\n Value cannot be blank");
                continue;
            }
            
            break; //end loop
        }
        return value; //return the value entered. 
    }

   public boolean doAction(String amtPoison) {
        
       if (amtPoison.equals("68")) {
           System.out.println("\nInvalid entry. Try again");
           return false;
       } 
        
       double p = Double.parseDouble(amtPoison);
       
       CharacterControl characterControl = new CharacterControl();

       
       this.displayNextView(characterControl);
       return true;
   }
   
   private void displayNextView(CharacterControl characterControl) {
        String timePoison = null;
       
       System.out.println("\nThe poison was administered" + characterControl 
               + "Good work!");
            
   
    }

        
    }



