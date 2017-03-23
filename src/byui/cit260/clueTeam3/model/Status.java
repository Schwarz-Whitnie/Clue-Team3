/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;

/**
 *
 * @author camer
 */
public enum Status implements Serializable {
    
    quilty("*"),
    not_guilty("x"),
    not_accused(" ");
    
    private final String status;
    
    Status(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    
}
