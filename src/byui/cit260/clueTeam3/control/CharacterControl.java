/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

/**
 *
 * @author camer
 */
public class CharacterControl {
    
    
    public static double calcTimePoison(double amtPoison) {
        
        if (amtPoison != 69) {
            return -1;
        }
        
        double poisonPerMinute = 0.05;
        double timePoison = amtPoison / (poisonPerMinute*60);
        timePoison = Math.round (timePoison *10) / 10;
        
        return timePoison;
        

        
    }
    
    
}
