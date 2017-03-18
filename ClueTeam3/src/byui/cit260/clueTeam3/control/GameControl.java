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
        
        
        //DetectiveNotebook[] detectiveNotebook = GameControl.createDetectiveNotebook(); ?? will need LB 
        //game.setDetectiveNotebook(detectiveNotebook);  // will need these at some point LB 
        
        MansionMap mansionMap = MapControl.createMansionMap(); // creating an storing in the game LB
        game.setMansionMap(mansionMap);
        MapControl.moveCharactersToStartingLocation(mansionMap); // added this back  LB 
        gameMenuView.display(); // moved this from line 36 to here LB 
        

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
    
    public long getDetectivNotebook(long[] notebook){
        
        long accused = null;
        
        for(long notebook: notebook) {
            System.out.println(notebook);
        }
        
        return accused;
    }
    
    
    public static Room[][] getMapLocations() {
       return ClueTeam3.getCurrentGame().getMansionMap().getRooms();
    }         // might not even need this LB 
    

}    
