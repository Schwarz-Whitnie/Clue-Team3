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

}
