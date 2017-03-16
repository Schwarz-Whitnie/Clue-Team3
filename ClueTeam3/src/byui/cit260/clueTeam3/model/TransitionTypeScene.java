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
 * @author whitnieschwarz
 */
public class TransitionTypeScene implements Serializable{
    
    // class instance variables
    private String noOfSpaces;

    public TransitionTypeScene() {
    }
    

    public String getNoOfSpaces() {
        return noOfSpaces;
    }

    public void setNoOfSpaces(String noOfSpaces) {
        this.noOfSpaces = noOfSpaces;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.noOfSpaces);
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
        final TransitionTypeScene other = (TransitionTypeScene) obj;
        return Objects.equals(this.noOfSpaces, other.noOfSpaces);
    }

    @Override
    public String toString() {
        return "TransitionTypeScene{" + "noOfSpaces=" + noOfSpaces + '}';
    }
        
    
    
}
