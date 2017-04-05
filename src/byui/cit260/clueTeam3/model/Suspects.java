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

public enum Suspects implements Serializable{
    
    ColonelMustard(),
    ProfessorPlum(),
    MissScarlet(),
    MrsWhite(),
    MrsPeacock(),
    MrGreen();
    
    private String description;
    private String status;
    private double clueType;
    private final Point coordinates;
    private Suspects suspects;
    private Room[] room;
    private String accused;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    Suspects() {
        coordinates = new Point(1,1);
        this.description = description;
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
    
    public void setDescription() {
        this.description = description;
    }
    
    public String getAccused () {
        return accused;
    } 
    
    public void setAccused() {
        this.accused = accused;
    }

    public double getClueType() {
        return clueType;
    }

    public Point getCoordinates() {
        return coordinates;
    }


    public Suspects getSuspect() {
        return suspects;
    }

    public void setSuspect(Suspects suspects) {
        this.suspects = suspects;
    }

    @Override
    public String toString() {
        return "Suspect{" + "description=" + description + "}";
    }
}

