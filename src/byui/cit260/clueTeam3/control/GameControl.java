/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.exeptions.GameControlException;
import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import clueteam3.ClueTeam3;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.RoomEnum;
import byui.cit260.clueTeam3.model.Weapon;
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
        notebook[Weapon.Candlestick.ordinal()] = candlestick;
        
        DetectiveNotebook knife = new DetectiveNotebook();
        knife.setDescription("Knife");
        knife.setAccused(false);
        notebook[Weapon.Knife.ordinal()] = knife;
        
        DetectiveNotebook rope = new DetectiveNotebook();
        rope.setDescription("Rope");
        rope.setAccused(true);
        notebook[Weapon.Rope.ordinal()] = rope;
        
        DetectiveNotebook dumbbell = new DetectiveNotebook();
        dumbbell.setDescription("Dumbbell");
        dumbbell.setAccused(false);
        notebook[Weapon.Dumbbell.ordinal()] = dumbbell;
        
        DetectiveNotebook poison = new DetectiveNotebook();
        poison.setDescription("Poison");
        poison.setAccused(true);
        notebook[Weapon.Poison.ordinal()] = poison;
        
        DetectiveNotebook pipe = new DetectiveNotebook();
        pipe.setDescription("Pipe");
        pipe.setAccused(false);
        notebook[Weapon.LeadPipe.ordinal()] = pipe;
        
        DetectiveNotebook gun = new DetectiveNotebook();
        gun.setDescription("Gun");
        gun.setAccused(true);
        notebook[Weapon.Revolver.ordinal()] = gun;
        
        DetectiveNotebook wrench = new DetectiveNotebook();
        wrench.setDescription("Wrench");
        wrench.setAccused(false);
        notebook[Weapon.Wrench.ordinal()] = wrench;
        
        
        return notebook;
        
    }
    
        private static DetectiveNotebook[] createRoomNotebook() {
        // create and array(list of detective notebook items
        
        DetectiveNotebook[] roomNotebook = new DetectiveNotebook[9];
        
        //roomlist
        DetectiveNotebook billardRoom = new DetectiveNotebook();
        billardRoom.setDescription("Billard Room");
        billardRoom.setAccused(false);
        roomNotebook[RoomEnum.BillardRoom.ordinal()] = billardRoom;
        
        DetectiveNotebook ballroom = new DetectiveNotebook();
        ballroom.setDescription("Ballroom");
        ballroom.setAccused(false);
        roomNotebook[RoomEnum.Ballroom.ordinal()] = ballroom;
        
        DetectiveNotebook library = new DetectiveNotebook();
        library.setDescription("Library");
        library.setAccused(false);
        roomNotebook[RoomEnum.Library.ordinal()] = library;
        
        DetectiveNotebook study = new DetectiveNotebook();
        study.setDescription("Study");
        study.setAccused(false);
        roomNotebook[RoomEnum.Study.ordinal()] = study;
        
        DetectiveNotebook hall = new DetectiveNotebook();
        hall.setDescription("Hall");
        hall.setAccused(false);
        roomNotebook[RoomEnum.Hall.ordinal()] = hall;
        
        DetectiveNotebook lounge = new DetectiveNotebook();
        lounge.setDescription("Lounge");
        lounge.setAccused(false);
        roomNotebook[RoomEnum.Lounge.ordinal()] = lounge;
        
        DetectiveNotebook diningRoom = new DetectiveNotebook();
        diningRoom.setDescription("Dining Room");
        diningRoom.setAccused(false);
        roomNotebook[RoomEnum.DiningRoom.ordinal()] = diningRoom;
        
        DetectiveNotebook kitchen = new DetectiveNotebook();
        kitchen.setDescription("Kitchen");
        kitchen.setAccused(false);
        roomNotebook[RoomEnum.Kitchen.ordinal()] = kitchen;
        
        DetectiveNotebook conservatory = new DetectiveNotebook();
        conservatory.setDescription("Conservatory");
        conservatory.setAccused(false);
        roomNotebook[RoomEnum.Conservatory.ordinal()] = conservatory;
        
        return roomNotebook;
        
        
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

public static DetectiveNotebook[] getRoomNotebook() {    
    return ClueTeam3.getCurrentGame().getRoomNotebook();
}
public static DetectiveNotebook[] getSortedRoomNotebook() throws GameControlException {
        
        // get inventory list for the current game
        DetectiveNotebook[] originalRoomNotebook = 
                ClueTeam3.getCurrentGame().getRoomNotebook();
        
        // clone (make a copy) orignalList
        DetectiveNotebook[] roomNotebookList = originalRoomNotebook.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        DetectiveNotebook tempRoomNotebook;
        for (int i = 0; i < roomNotebookList.length-1; i++) {
            for (int j = 0; j < roomNotebookList.length-1-i; j++) {
                if (roomNotebookList[j].getDescription().
                        compareToIgnoreCase(roomNotebookList[j + 1].getDescription()) > 0) {
                    tempRoomNotebook = roomNotebookList[j];
                    roomNotebookList[j] = roomNotebookList[j+1];
                    roomNotebookList[j+1] = tempRoomNotebook;
                    throw new GameControlException("Can not display notebook"
                                                  + " because error.");
               }
            }
        }
        
        return roomNotebookList;
    }    

}    
