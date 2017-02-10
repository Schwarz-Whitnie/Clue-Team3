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
public class TimeControl {
    
    public double calcTotalTime(double noOfRooms, double noOfLocations, double passageway) {
        
        if (noOfRooms < 1) {
            return -1;
        }
        
        if (noOfLocations < 1) {
            return -1;
        }
        
        if (passageway < 0 || passageway > 3) {
            return -1;
        }
        
        double travelTime = 60 - ((noOfRooms * 3) + (noOfLocations * 2));
        double totalTime = travelTime + (travelTime * (passageway * .25)); 
        
        return totalTime;
    }
    
}
