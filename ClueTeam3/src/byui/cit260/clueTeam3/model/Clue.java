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
public enum Clue implements Serializable {
    
    clueOne,
    clueTwo,
    clueThree,
    clueFour,
    clueFive,
    clueSix;
           
    private String description;
    private double clueType;
    private final Point coordinates;
    private Weapon weapon;
    private Room[] room;

    Clue() {
        coordinates = new Point(1,1);
    }
    
    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }
    
    public String getDescription() {
        return description;
    }

    public double getClueType() {
        return clueType;
    }

    public Point getCoordinates() {
        return coordinates;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
