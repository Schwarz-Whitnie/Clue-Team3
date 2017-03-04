/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.WeaponControl;
import java.util.Scanner;

/**
 *
 * @author treya
 */
public class AmountPoisonView {
    
    protected String weight;
    protected String poison;
    
    public AmountPoisonView() {
        
        this.weight = "\nEnter Mr. Boddy's weight: ";
        this.poison = "\nEnter the amount of poison per pound: ";
        this.displayBanner();
        
        //display the banner when view is created
        
    }

    public void displayBanner() {
        
        System.out.println(
              "\n************************************************************************"
            + "\n*                                                                      *"        
            + "\n* Congratulations, you discovered which weapon was used for the murder *"
            + "\n* of Mr. Boddy. Mr. Boddy was poisoned. examine the information below  *"
            + "\n* and when prompted, enter the needed numbers.                         *"
            + "\n*                                                                      *"
            + "\n* Mr. Boddy weights - 104326grams                                      *"
            + "\n* It takes .3mg of poison per pound to kill                            *"
            + "\n*                                                                      *"
            + "\n* Its up to you to find out how much poison was administered to Mr.    *"
            + "\n* Boddy on the day he was murdered.                                    *"
            + "\n*                                                                      *"  
            + "\n************************************************************************"  

        );
    }
    
    public void display() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String weight = this.getWeight();
            if (weight.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            String poison = this.getPoison();
            if (poison.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(weight, poison);
                     
        } while (!done);
    }
    
    private String getWeight() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.weight);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

    private String getPoison() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.weight);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }
    
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.poison);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }
    
    private boolean doAction(double weight, double poison) {
       
       //call createPlayer() control function
       WeaponControl weaponControl = new WeaponControl();
       double weapon = weaponControl.calcAmountPoison(weight, poison);
      
       //display next view
       this.displayNextView(weaponControl);
       
       return true; //success
    }
    
    private void displayNextView(WeaponControl weaponControl) {
        
        System.out.println(
                "\n=============================================="
                + "\n The amount of poison administered was:"
                + "\n" + weaponControl
                + "\n Good work!"
                + "\n============================================"
                );
        
    }

    private boolean doAction(String weight, String poison) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   
}
