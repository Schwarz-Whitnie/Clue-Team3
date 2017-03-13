/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.Scene;

/**
 *
 * @author whitnieschwarz
 */
public class SceneControl {
    
    public static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[ResourceTypeScene.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Welcome to the game..");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[ResourceTypeScene.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congrats..");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[ResourceTypeScene.finish.ordinal()] = finishScene;
        
        Scene clueScene = new Scene();
        clueScene.setDescription("Look, it's a clue..");
        clueScene.setMapSymbol("CL");
        clueScene.setBlocked(false);
        clueScene.setTravelTime(300);
        scenes[ResourceTypeScene.clue.ordinal()] = clueScene;
        
        Scene weaponScene = new Scene();
        weaponScene.setDescription("A weapon, that's suspicious..");
        weaponScene.setMapSymbol("WP");
        weaponScene.setBlocked(false);
        weaponScene.setTravelTime(300);
        scenes[ResourceTypeScene.weapon.ordinal()] = weaponScene;
        
        Scene characterScene = new Scene();
        characterScene.setDescription("Look its - let's go talk to them..");
        characterScene.setMapSymbol("CT");
        characterScene.setBlocked(false);
        characterScene.setTravelTime(300);
        scenes[ResourceTypeScene.character.ordinal()] = characterScene;
        
        Scene roomScene = new Scene();
        roomScene.setDescription("Let's explore the room..");
        roomScene.setMapSymbol("RM");
        roomScene.setBlocked(false);
        roomScene.setTravelTime(300);
        scenes[ResourceTypeScene.character.ordinal()] = roomScene;
        
        Scene hallScene = new Scene();
        hallScene.setDescription("You are in the hall..");
        hallScene.setMapSymbol("HL");
        hallScene.setBlocked(false);
        hallScene.setTravelTime(300);
        scenes[ResourceTypeScene.hall.ordinal()] = hallScene;
        
        return scenes;
    }

  
    
}
