/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.GameControl;
import clueteam3.ClueTeam3;
import java.util.Scanner;

/**
 *
 * @author Treya
 */
public class MainMenuView extends View {

    
    
    public MainMenuView() {
       super("----------------------------------------"
            + "\n| Main Menu                            |"
            + "\n----------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"  
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ");
       
            
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "N": //create and start new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }
    
    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(ClueTeam3.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
    
    
}
