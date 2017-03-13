/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import static byui.cit260.clueTeam3.control.SceneControl.createScenes;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.Scene;

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
 public static void moveCharactersToStartingLocation(MansionMap mansionMap) 
 {
 }
 
 ArrayList<Point> roomCoordinates = new ArrayList<Point>();
        roomCoordinates.add(new Point(0,0));
        roomCoordinates.add(new Point(0,2));
        roomCoordinates.add(new Point(0,5));
        roomCoordinates.add(new Point(2,0));
        roomCoordinates.add(new Point(2,2));
        roomCoordinates.add(new Point(2,5));
        roomCoordinates.add(new Point(4,0));
        roomCoordinates.add(new Point(4,2));
        roomCoordinates.add(new Point(4,5));
        sceneLocations.put("ROOM, roomCoordinates");
        
 ArrayList<Point> characterCoordinates = new ArrayList<Point>();
        characterCoordinates.add(new Point(1,0));
        characterCoordinates.add(new Point(1,2));
        characterCoordinates.add(new Point(1,6));
        characterCoordinates.add(new Point(3,0));
        characterCoordinates.add(new Point(3,2));
        characterCoordinates.add(new Point(3,6));
        characterCoordinates.add(new Point(5,0));
        characterCoordinates.add(new Point(5,2));
        characterCoordinates.add(new Point(5,6));
        sceneLocations.put("CHARACTER, characterCoordinates");
        
        

}
