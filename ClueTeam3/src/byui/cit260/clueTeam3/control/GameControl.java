/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.model.Clue;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import clueteam3.ClueTeam3;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import byui.cit260.clueTeam3.model.Weapon;
import byui.cit260.clueTeam3.view.GameMenuView;

/**
 *
 * @author whitnieschwarz
 */
public class GameControl {
    
    public GameControl() {
        
    }
    
    public static void createNewGame(Player player) {
    
        Game game = new Game();
        ClueTeam3.setCurrentGame(game);
        
        game.setPlayer(player);
       
        GameMenuView gameMenuView = new GameMenuView(); //
        
        
        //DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        //game.setDetectiveNotebook(notebookList);  // will need these at some point LB 
        
        MansionMap mansionMap = MapControl.createMansionMap(); // creating an storing in the game LB
        game.setMansionMap(mansionMap);
        MapControl.moveCharactersToStartingLocation(mansionMap); // added this back  LB 
        gameMenuView.display(); // moved this from line 36 to here LB 
        
        DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        game.setDetectiveNotebook(notebookList); 

    }

    public static Player createPlayer(String name) {
         
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        ClueTeam3.setPlayer(player); //save the player
        
        return player;
    }
    

    private static DetectiveNotebook[] createDetectiveNotebook() {
        // create and array(list of detective notebook items
        
        
        DetectiveNotebook[] notebook = new DetectiveNotebook[8];
        
        DetectiveNotebook candlestick = new DetectiveNotebook();
        candlestick.setDescription("Clue One description");
        candlestick.setAccused(true);
        notebook[Weapon.candlestick.ordinal()] = candlestick;
        
        DetectiveNotebook knife = new DetectiveNotebook();
        knife.setDescription("Clue Two description");
        knife.setAccused(false);
        notebook[Weapon.knife.ordinal()] = knife;
        
        DetectiveNotebook rope = new DetectiveNotebook();
        rope.setDescription("Clue Three description");
        rope.setAccused(true);
        notebook[Weapon.rope.ordinal()] = rope;
        
        DetectiveNotebook dumbbell = new DetectiveNotebook();
        dumbbell.setDescription("Clue Four description");
        dumbbell.setAccused(false);
        notebook[Weapon.dumbbell.ordinal()] = dumbbell;
        
        DetectiveNotebook poison = new DetectiveNotebook();
        poison.setDescription("Clue Five description");
        poison.setAccused(true);
        notebook[Weapon.poison.ordinal()] = poison;
        
        DetectiveNotebook leadPipe = new DetectiveNotebook();
        leadPipe.setDescription("Clue Six description");
        leadPipe.setAccused(false);
        notebook[Weapon.leadPipe.ordinal()] = leadPipe;
        
        DetectiveNotebook revolver = new DetectiveNotebook();
        revolver.setDescription("Clue Seven description");
        revolver.setAccused(true);
        notebook[Weapon.revolver.ordinal()] = revolver;
        
        DetectiveNotebook wrench = new DetectiveNotebook();
        wrench.setDescription("Clue Eight description");
        wrench.setAccused(false);
        notebook[Weapon.wrench.ordinal()] = wrench;
        
        return notebook;
        
    }
    
  //  public static Room[][] getMapLocations() {
  //      return ClueTeam3.getCurrentGame().getMansionMap().getRooms();
  //  }         // might not even need this LB 
public static DetectiveNotebook[] getSortedDetectiveNotebook() {
        
        // get inventory list for the current game
        DetectiveNotebook[] originalDetectiveNotebook = 
                ClueTeam3.getCurrentGame().getNotebook();
        
        // clone (make a copy) orignalList
        DetectiveNotebook[] notebookList = originalDetectiveNotebook.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        DetectiveNotebook tempDetectiveNotebook;
        for (int i = 0; i < notebookList.length-1; i++) {
            for (int j = 0; j < notebookList.length-1-i; j++) {
                if (notebookList[j].getDescription().
                        compareToIgnoreCase(notebookList[j + 1].getDescription()) > 0) {
                    tempDetectiveNotebook = notebookList[j];
                    notebookList[j] = notebookList[j+1];
                    notebookList[j+1] = tempDetectiveNotebook;
                }
            }
        }
        
        return notebookList;
    }    

}    
