/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;

/**
 *
 * @author whitnieschwarz
 */
public enum ResourceTypeScene implements Serializable{
    
    start,
    clue,
    weapon,
    character,
    room,
    hall,
    finish;
    
    // class instance variables
    private double amountAvailable;
    private String resourceType; 

    ResourceTypeScene() {
    }
    
    private static void assignScenesToLocation (MansionMap mansionMap, Scene[] scenes) {
    
        Room[][] rooms = mansionMap.getRooms();
        
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
}
    

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + '}';
    }
    
    
}
