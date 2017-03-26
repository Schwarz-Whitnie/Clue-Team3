/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;

/**
 *
 * @author Cameron
 */
public enum Weapon implements Serializable {
    
    Candlestick("Candlestick"),
    Knife("Knife"),
    Rope("Rope"),
    Dumbbell("Dumbbell"),
    Poison("Poison"),
    LeadPipe("LeadPipe"),
    Revolver("Revolver"),
    Wrench("Wrench");
    
    private String description;
    private String status;
    public boolean accused;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Room[] room;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }
    Weapon() {
        
    }
    Weapon(String description) {
        this.description = description;
                }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Weapon{" + "description=" + description + "}";
    }
}
