/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

/**
 *
 * @author catrinalonghurst1
 */

public enum Suspects {
    suspectOne,
    suspectTwo,
    suspectThree,
    suspectFour,
    suspectFive,
    suspectSix;
    
    private String description;
    private double clueType;
    private final Point coordinates;
    private Suspects suspect;
    private Room[] room;
    private String accused;

    Suspects() {
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
        return suspect;
    }

    public void setSuspect(Suspects suspect) {
        this.suspect = suspect;
    }

}
