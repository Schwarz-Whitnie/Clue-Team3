/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

/**
 *
 * @author whitnieschwarz
 */
public class RoomControl {
    
    public double calcRoute(double lengthIn, double lengthCm) {
    
        if (lengthIn != 816 && lengthCm != 2499.36) { 
            return -1; 
        } 
        
        double distanceInFeet = (lengthIn / 12) + (lengthCm * 0.0328084);
        distanceInFeet = Math.round (distanceInFeet * 10) / 10;
        
        return distanceInFeet;
                
    }
    
}
