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
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import static byui.cit260.clueTeam3.model.ResourceTypeScene.weapon;
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
       
        DetectiveNotebook notebook = new DetectiveNotebook();
        
        game.setNotebook(notebook);
        
        GameMenuView gameMenuView = new GameMenuView(); //
        
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
    
    
       /* private static DetectiveNotebook[] createRoomNotebook() {
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
        
        
    }*/
    
  //  public static Room[][] getMapLocations() {
  //      return ClueTeam3.getCurrentGame().getMansionMap().getRooms();
  //  }         // might not even need this LB 
}
