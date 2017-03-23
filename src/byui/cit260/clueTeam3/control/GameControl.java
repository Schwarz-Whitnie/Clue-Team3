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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        
        
        DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        game.setNotebook(notebookList);  // will need these at some point LB 
        
        MansionMap mansionMap = MapControl.createMansionMap(); // creating an storing in the game LB
        game.setMansionMap(mansionMap);
        MapControl.moveDetectiveToStartingLocation(mansionMap); // added this back  LB 
        gameMenuView.display(); // moved this from line 36 to here LB 
        
        //DetectiveNotebook[] notebookList = GameControl.createDetectiveNotebook();  
        //game.setNotebook(notebookList); 

    }
    
    public static void saveGame(Game game, String filepath) 
        throws GameControlException {
        
    try( FileOutputStream fops = new FileOutputStream(filepath)) {
        ObjectOutputStream output = new ObjectOutputStream(fops);
        
        output.writeObject(game);
    }
    catch(IOException ex) {
        throw new GameControlException(ex.getMessage());
    }
    }
    
    public static void getSavedGame(String filepath)
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
        ObjectInputStream input = new ObjectInputStream(fips);
        
        game = (Game) input.readObject();
        
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        ClueTeam3.setCurrentGame(game);
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
        candlestick.setDescription("Candle Stick");
        candlestick.setAccused(true);
        notebook[Clue.clueOne.ordinal()] = candlestick;
        
        DetectiveNotebook knife = new DetectiveNotebook();
        knife.setDescription("Knife");
        knife.setAccused(false);
        notebook[Clue.clueTwo.ordinal()] = knife;
        
        DetectiveNotebook rope = new DetectiveNotebook();
        rope.setDescription("Rope");
        rope.setAccused(true);
        notebook[Clue.clueThree.ordinal()] = rope;
        
        DetectiveNotebook dumbbell = new DetectiveNotebook();
        dumbbell.setDescription("Dumbbell");
        dumbbell.setAccused(false);
        notebook[Clue.clueFour.ordinal()] = dumbbell;
        
        DetectiveNotebook poison = new DetectiveNotebook();
        poison.setDescription("Poison");
        poison.setAccused(true);
        notebook[Clue.clueFive.ordinal()] = poison;
        
        DetectiveNotebook pipe = new DetectiveNotebook();
        pipe.setDescription("Pipe");
        pipe.setAccused(false);
        notebook[Clue.clueSix.ordinal()] = pipe;
        
        DetectiveNotebook gun = new DetectiveNotebook();
        gun.setDescription("Gun");
        gun.setAccused(true);
        notebook[Clue.clueSeven.ordinal()] = gun;
        
        DetectiveNotebook wrench = new DetectiveNotebook();
        wrench.setDescription("Wrench");
        wrench.setAccused(false);
        notebook[Clue.clueEight.ordinal()] = wrench;
        
        return notebook;
        
    }
    
  //  public static Room[][] getMapLocations() {
  //      return ClueTeam3.getCurrentGame().getMansionMap().getRooms();
  //  }         // might not even need this LB 
public static DetectiveNotebook[] getSortedDetectiveNotebook() throws GameControlException {
        
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
                    throw new GameControlException("Can not display notebook"
                                                  + " because error.");
               }
            }
        }
        
        return notebookList;
    }    

public static DetectiveNotebook[] getNotebook() {    
    return ClueTeam3.getCurrentGame().getNotebook();
}    
}    
