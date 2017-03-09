/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author catrinalonghurst1
 */
public enum Character implements Serializable {
    
    colonelMustard,
    mrsWhite,
    professorPlum,
    mrsPeacock,
    missScarlet,
    mrGreen;
    
   private final String description;
   private final double coordinates;
   
   private Game game;
   
   private Room[] room;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    Character(String description) {

        this.description = description;
        coordinates = new Point(1,1);
    }
 
    public String getDescription() {
        return description;
    }

    public double getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", type=" + type + '}';
    }
    
   
   
}
