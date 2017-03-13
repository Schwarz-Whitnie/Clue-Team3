/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;

/**
 *
 * @author whitnieschwarz
 */
public enum ResourceTypeScene implements Serializable{
    
    start,
    clue,
    weapon,
    character,
    room,
    hall,
    finish;
    
    // class instance variables
    private double amountAvailable;
    private String resourceType; 

    ResourceTypeScene() {
    }
    

    

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + '}';
    }
    
    
}
