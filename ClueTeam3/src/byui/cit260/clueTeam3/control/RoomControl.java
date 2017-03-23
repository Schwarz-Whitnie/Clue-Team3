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
    
    public double calcShortestRoute(double lengthIn, double lengthYd) {
    
        if (lengthIn < 1750 || lengthIn > 1850) { 
            return -1; 
        } 
        
        if (lengthYd < 55 || lengthYd > 65) {
            return -1;
        }
        
        double routeOne = lengthIn / 12;
        double routeTwo = lengthYd * 3;
        
        double shortestRouteFt = Math.min (routeOne, routeTwo);
        shortestRouteFt = Math.round (shortestRouteFt * 100.00) / 100.00;
        
        return shortestRouteFt;
                
    }
    
}
