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
public class ListSuspectsView extends View {
    
    public ListSuspectsView() {
        
        super ("------------------------------------------"
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
            + "\nPlease enter a command: ");
            
    }
     
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
          System.out.println("Colonel Mustard is a dignified, dapper and "
                  + "\n dangerous military man. ");
    }

    private void white() {
        System.out.println("Mrs. White is a frazzled servant of the mansion, "
                + "\n with a possible grudge against her employer.");
    }

    private void plum() {
        System.out.println("Professor Plum is a quick witted professor, who"
                + "\n is widely seen as an intellectual, although his "
                + "\n intelligence is tempered with homicidal tendencies.");
    }

    private void peacock() {
        System.out.println("Mrs. Peacock is an elderly yet still attractive"
                + "\n woman who maintains her dignity at all times. She has "
                + "\n had three marriages ending disasterously in the death"
                + "\n of her husband.");
    }

    private void scarlet() {
        System.out.println("Miss Scarlet is an aspiring acress with more "
                + "\n aspiration than talent. She has now become a cunning"
                + "\n young gold digger.");
    }

    private void green() {
        System.out.println("Mr. Green is a con man, who has settled with the "
                + "\n identity of Reverand Green. He has taken money from "
                + "\n everyone from mobsters to businessmen.");
    }




}
    
