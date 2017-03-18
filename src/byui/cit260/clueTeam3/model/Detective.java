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
public enum Detective implements Serializable {
    
    Detective("Detective");
    
     private final String description;
    
    Detective(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   
}
