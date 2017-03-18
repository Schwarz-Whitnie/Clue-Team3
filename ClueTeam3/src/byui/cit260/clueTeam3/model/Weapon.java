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
public enum Weapon implements Serializable {
    
    candlestick,
    knife,
    rope,
    dumbbell,
    poison,
    leadPipe,
    revolver,
    wrench;
    
    private String description;
    private String location;
    private String weaponType;
    private Point coordinates;
    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private Room[] room;
    private Clue[] clue;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Clue[] getClue() {
        return clue;
    }

    public void setClue(Clue[] clue) {
        this.clue = clue;
    }
    
    Weapon() {
        coordinates = new Point(1,1);  // TODO: do we need coordinates for weapon? 
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "Weapon{" + "description=" + description + ", location=" + location + ", weaponType=" + weaponType + '}';
    }
}
