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
 * @author Cameron
 */
public enum Clue implements Serializable {
    
    ClueOne,
    ClueTwo,
    ClueThree,
    ClueFour,
    ClueFive,
    ClueSix;
           
    private final String description;
    private final double clueType;
    
    private Weapon weapon;
    
    private Room[] room;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    Clue(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public double getClueType() {
        return clueType;
    }

    @Override
    public String toString() {
        return "Clue{" + "name=" + name + ", description=" + description + ", attribute=" + attribute + '}';
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
