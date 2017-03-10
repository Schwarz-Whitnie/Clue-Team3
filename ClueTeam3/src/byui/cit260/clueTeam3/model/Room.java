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
public class Room implements Serializable {
    
    
    private String description;
    private double attribute;
    private Point coordinates;
    private int row;
    private int column;
    private boolean visited;

  
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    private Scene scene;
    private Character character;
    private Weapon weapon;
    private Clue clue;

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

    Room() {
    }

    public String getDescription() {
        return description;
    }

    public double getAttribute() {
        return attribute;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
       // return "Room{" + "name=" + name + ", description=" + description + ", attribute=" + attribute + '}';
        return null;
    }
}
