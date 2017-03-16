/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;

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
    
   private String description;
   
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

    Character() {

    }
 
    public String getDescription() {
        return description;
    }

}
