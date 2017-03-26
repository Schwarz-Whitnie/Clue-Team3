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
public class Game implements Serializable {
    
    //class instance varibales
    private double totalTime;

    private Player player;
    private MansionMap mansionMap;
    private Time time;
    private DetectiveNotebook[] notebook;
    private DetectiveNotebook[] roomNotebook;;
    private Point playersLocation;
    
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
//added 3-22-17 to test
    public Point getPlayersLocation() {
        return playersLocation;
    }

    public void setPlayersLocation(Point playersLocation) {
        this.playersLocation = playersLocation;
    }
    public DetectiveNotebook[] getNotebook() {
        return notebook;
    }

    public void setNotebook(DetectiveNotebook[] notebook) {
        this.notebook = notebook;
    }
    public DetectiveNotebook[] getRoomNotebook() {
        return roomNotebook;
    }
    public void setRoomNotebook(DetectiveNotebook[] roomNotebook) {
        this.roomNotebook = roomNotebook;
    }
    public Game() {
        this.totalTime = 0;
    }

    public MansionMap getMansionMap() {
        return mansionMap;
    }

    public void setMansionMap(MansionMap mansionMap) {
        this.mansionMap = mansionMap;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
       
        return true;
    }

    
    
    
    
 
}