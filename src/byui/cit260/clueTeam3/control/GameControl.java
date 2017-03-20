/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.exeptions.GameControlException;
import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.Clue;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import clueteam3.ClueTeam3;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import byui.cit260.clueTeam3.view.GameMenuView;

/**
 *
 * @author whitnieschwarz
 */
public class GameControl {
    
    public GameControl() {
        
    }
    
    public static void createNewGame(Player player) throws MapControlException {
    
        Game game = new Game();
        ClueTeam3.setCurrentGame(game);
        
        game.setPlayer(player);
       
        GameMenuView gameMenuView = new GameMenuView(); //
        
        
        //DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        //game.setDetectiveNotebook(notebookList);  // will need these at some point LB 
        
        MansionMap mansionMap = MapControl.createMansionMap(); // creating an storing in the game LB
        game.setMansionMap(mansionMap);
        MapControl.moveDetectiveToStartingLocation(mansionMap); // added this back  LB 
        gameMenuView.display(); // moved this from line 36 to here LB 
        
        DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        game.setNotebook(notebookList); 

    }

    public static Player createPlayer(String name) throws GameControlException {
         
        if (name == null) {
            throw new GameControlException("Can not move player to location"
                                            + " because that location is outside "
                                            + "the bounds of the map.");
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
        notebook[Clue.clueOne.ordinal()] = candlestick;
        
        DetectiveNotebook knife = new DetectiveNotebook();
        knife.setDescription("Clue Two description");
        knife.setAccused(false);
        notebook[Clue.clueTwo.ordinal()] = knife;
        
        DetectiveNotebook rope = new DetectiveNotebook();
        rope.setDescription("Clue Three description");
        rope.setAccused(true);
        notebook[Clue.clueThree.ordinal()] = rope;
        
        DetectiveNotebook dumbbell = new DetectiveNotebook();
        dumbbell.setDescription("Clue Four description");
        dumbbell.setAccused(false);
        notebook[Clue.clueFour.ordinal()] = dumbbell;
        
        DetectiveNotebook poison = new DetectiveNotebook();
        poison.setDescription("Clue Five description");
        poison.setAccused(true);
        notebook[Clue.clueFive.ordinal()] = poison;
        
        DetectiveNotebook pipe = new DetectiveNotebook();
        pipe.setDescription("Clue Six description");
        pipe.setAccused(false);
        notebook[Clue.clueSix.ordinal()] = pipe;
        
        DetectiveNotebook gun = new DetectiveNotebook();
        gun.setDescription("Clue Seven description");
        gun.setAccused(true);
        notebook[Clue.clueSeven.ordinal()] = gun;
        
        DetectiveNotebook wrench = new DetectiveNotebook();
        wrench.setDescription("Clue Eight description");
        wrench.setAccused(false);
        notebook[Clue.clueEight.ordinal()] = wrench;
        
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
