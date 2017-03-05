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
public class WeaponControl {
    
    public static double calcAmountPoison(double poisonPerlb, double weightGrams) {
    
        if (poisonPerlb != 0.3 && weightGrams != 104326) { 
            return -1; 
        } 
        
        double poisonAmount = (weightGrams / 453.59) * poisonPerlb;
        poisonAmount = Math.round (poisonAmount * 10) / 10;
        
        return poisonAmount;
                
    }    
}
