/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import static byui.cit260.clueTeam3.control.SceneControl.createScenes;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author whitnieschwarz
 */
public class MapControl {
    public static MansionMap createMansionMap() {
    
        MansionMap mansionMap = new MansionMap(7,6);
        
        Scene[] scenes = createScenes();
        
        ResourceTypeScene.assignScenesToLocations(mansionMap, scenes);
        
        return mansionMap;
    }
    
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
    
        public static void assignScenesToLocations(MansionMap mansionMap, Scene[] scenes) {
    
        Room[][] rooms = mansionMap.getRooms();
        
        // starting point
        rooms[0][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[0][1].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[0][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[0][3].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[0][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[0][5].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[0][6].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        
        rooms[1][0].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[1][1].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[1][2].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[1][3].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[1][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[1][5].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[1][6].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        
        rooms[2][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[2][1].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[2][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[2][3].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[2][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[2][5].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[2][6].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        
        rooms[3][0].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[3][1].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[3][2].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[3][3].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[3][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[3][5].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[3][6].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        
        rooms[4][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[4][1].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[4][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[4][3].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        rooms[4][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[4][5].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[4][6].setScene(scenes[ResourceTypeScene.clue.ordinal()]);
        
        rooms[5][0].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[5][1].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[5][2].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[5][3].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        rooms[5][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[5][5].setScene(scenes[ResourceTypeScene.character.ordinal()]);
        rooms[5][6].setScene(scenes[ResourceTypeScene.weapon.ordinal()]);
        
        HashMap<String, ArrayList<Point>> sceneLocations =
                new HashMap<String, ArrayList<Point>>();
        
        ArrayList<Point> clueCoordinates = new ArrayList<Point>();
        clueCoordinates.add(new Point(0,1));
        clueCoordinates.add(new Point(0,3));
        clueCoordinates.add(new Point(0,6));
        clueCoordinates.add(new Point(2,1));
        clueCoordinates.add(new Point(2,3));
        clueCoordinates.add(new Point(2,6));
        clueCoordinates.add(new Point(4,1));
        clueCoordinates.add(new Point(4,3));
        clueCoordinates.add(new Point(4,6));
        sceneLocations.put("CLUE", clueCoordinates);
        
        ArrayList<Point> weaponCoordinates = new ArrayList<Point>();
        weaponCoordinates.add(new Point(1,0));
        weaponCoordinates.add(new Point(1,2));
        weaponCoordinates.add(new Point(1,5));
        weaponCoordinates.add(new Point(3,0));
        weaponCoordinates.add(new Point(3,2));
        weaponCoordinates.add(new Point(3,5));
        weaponCoordinates.add(new Point(5,0));
        weaponCoordinates.add(new Point(5,2));
        weaponCoordinates.add(new Point(5,5));
        sceneLocations.put("WEAPON", weaponCoordinates);
        
        ArrayList<Point> hallCoordinates = new ArrayList<Point>();
        hallCoordinates.add(new Point(0,4));
        hallCoordinates.add(new Point(1,4));
        hallCoordinates.add(new Point(2,4));
        hallCoordinates.add(new Point(3,4));
        hallCoordinates.add(new Point(4,4));
        hallCoordinates.add(new Point(5,4));
        sceneLocations.put("HALL", hallCoordinates);
}
 public static void moveCharactersToStartingLocation(MansionMap mansionMap) 
 {
 }
 

}
