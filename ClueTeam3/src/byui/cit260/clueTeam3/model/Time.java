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
public class Time implements Serializable{
    
    private String run;
    private double countdownTime;
    private double displayTime;
    
    private Game[] game;

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Time() {
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public double getCountdownTime() {
        return countdownTime;
    }

    public void setCountdownTime(double countdownTime) {
        this.countdownTime = countdownTime;
    }

    public double getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(double displayTime) {
        this.displayTime = displayTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.run);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.countdownTime) ^ (Double.doubleToLongBits(this.countdownTime) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.displayTime) ^ (Double.doubleToLongBits(this.displayTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Time{" + "run=" + run + ", countdownTime=" + countdownTime + ", displayTime=" + displayTime + '}';
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
        final Time other = (Time) obj;
        if (Double.doubleToLongBits(this.countdownTime) != Double.doubleToLongBits(other.countdownTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.displayTime) != Double.doubleToLongBits(other.displayTime)) {
            return false;
        }
        if (!Objects.equals(this.run, other.run)) {
            return false;
        }
        return true;
    }

   
    
    
    
}
