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
public enum Room implements Serializable {
    
    BillardRoom,
    Ballroom,
    Library,
    Study,
    Hall,
    Lounge,
    DiningRoom,
    Kitchen,
    Conservatory;
                  
    
    private final String description;
    private final double attribute;
    
    private Character character;
    private Weapon weapon;
    private Clue clue;
    private Scene scene;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    Room(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public double getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", description=" + description + ", attribute=" + attribute + '}';
    }
}
