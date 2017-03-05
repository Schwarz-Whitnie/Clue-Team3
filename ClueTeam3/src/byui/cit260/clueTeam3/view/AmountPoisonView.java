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
    
    private final String weight;
    private final String poison;
    private double poisonAmount;
    
    
    public AmountPoisonView() {
        
        this.weight = "\nEnter Mr. Boddy's weight: ";
        this.poison = "\nEnter the amount of poison per pound: ";
        this.displayBanner();
        
    }

    public void displayBanner() {
        
        System.out.println(
              "\n************************************************************************"
            + "\n*                                                                      *"        
            + "\n* Congratulations, you discovered which weapon was used for the murder *"
            + "\n* of Mr. Boddy. Mr. Boddy was poisoned. Examine the information below  *"
            + "\n* and when prompted, enter the needed numbers.                         *"
            + "\n*                                                                      *"
            + "\n* Mr. Boddy weights - 104326grams                                      *"
            + "\n* It takes .3mg of poison per pound to kill someone                    *"
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
            done = this.doAction(poison, weight);
                     
        } while (!done);
    }
    
    private String getWeight() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.weight);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 0) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

    private String getPoison() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.poison);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 0) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }
    
    public boolean doAction(String poison, String weight) {
       if (weight.equals("-1")) {
           System.out.println("\nInvalid weight: "
                   + "The weight must be greater than 0");
           return false;
       }
       
       if (poison.equals("-0")) {
           System.out.println("\nInvalid poison amount: "
                   + "The poison amount must be greater than 0");
           return false;
       }
       
        double w = Double.parseDouble(weight);
        
        double p = Double.parseDouble(poison);
        
       //call createPlayer() control function
       WeaponControl weaponControl = new WeaponControl();
       poisonAmount = WeaponControl.calcAmountPoison(p, w);
       
       //display next view
       this.displayNextView(weaponControl);
       
       return true; //success
    }
    
    private void displayNextView(WeaponControl weaponControl) {
        
        System.out.println(
                "\n=============================================="
                + "\n The amount of poison administered was:"
                + "\n " + poisonAmount
                + "\n Good work!"
                + "\n============================================"
                );
        
    }

}
