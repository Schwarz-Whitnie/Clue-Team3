/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.model.Weapon;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public class ListWeaponsView extends View{
    
    
    public ListWeaponsView() {
        super ("----------------------------------------"
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
            + "\nPlease choose a weapon: ");
        /*try {
           
            out.println("/n     Weapon Report     ");
            out.printf("%n%-20s%10s", "Weapon", "Status");
            out.printf("%n%-20s%10s", "------", "------");
            
            for (Weapon weapon : status) {
                out.printf("%n%-20s%7d", weapon.getDescription(),
                                         status.getStatus());
            }
            ) catch (IOException ex) {
                    this.console.println("I/O Error: " + ex.getMessage());
                    }
        }*/
        
        
            
    }
    

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
        System.out.println("*** Knife ***"); // had to delete a k LB
    }

    private void rope() {
        System.out.println("*** Rope ***");
    }

    private void dumbbell() {
        System.out.println("*** Dumbbell ***");
    }

    private void poison() {
        System.out.println("*** Posion ***");
        AmountPoisonView amountPoisonView = new AmountPoisonView();
        amountPoisonView.display();
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