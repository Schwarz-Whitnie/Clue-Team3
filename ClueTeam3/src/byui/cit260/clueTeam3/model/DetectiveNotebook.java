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
public enum DetectiveNotebook implements Serializable {
    
    Clue1(""),
    Clue2(""),
    Clue3(""),
    Clue4(""),
    Clue5(""),
    Suspect1(""),
    Suspect2(""),
    Suspect3(""),
    Suspect4(""),
    

    
    private final String description;
    private final Point coordinates;

    public DetectiveNotebook(String description){
        
        this.description = description;
        coordinates = new Point (1,1);
        
    }

    public String getDescription() {

    return description;
}

    public Point getCoordinates() {
    return coordinates;
}
    
}
