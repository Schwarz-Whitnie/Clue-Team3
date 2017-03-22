/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camer
 */
public class WeaponControlTest {
    
    public WeaponControlTest() {
    }

    @Test
    public void testCalcAmountPoison() {
        System.out.println("calcAmountPoison");
        
        /***********************
         * Test case #1 
         ************************/
        System.out.println("\tTest case #1");
        
        double poisonPerlb = 0.3;
        double weightGrams = 104326;
        
        double expResult = 69;
        
        WeaponControl instance = new WeaponControl();
        
        double result = instance.calcAmountPoison(poisonPerlb, weightGrams);
        
        assertEquals(expResult, result, 0.0);
        
        /***********************
         * Test case #2 
         ************************/
        System.out.println("\tTest case #2");
        
        poisonPerlb = 1;
        weightGrams = 10700;
        
        expResult = -1;
        
        result = instance.calcAmountPoison(poisonPerlb, weightGrams);
        
        assertEquals(expResult, result, 0.0);
        
       /***********************
         * Test case #3 
         ************************/
        System.out.println("\tTest case #3");
        
        poisonPerlb = 0.03;
        weightGrams = 100;
        
        expResult = -1;
        
        result = instance.calcAmountPoison(poisonPerlb, weightGrams);
        
        assertEquals(expResult, result, 0.0);
        
        /***********************
         * Test case #4
         ************************/
        System.out.println("\tTest case #4");
        
        poisonPerlb = 0;
        weightGrams = 0;
        
        expResult = -1;
        
        result = instance.calcAmountPoison(poisonPerlb, weightGrams);
        
        assertEquals(expResult, result, 0.0);
    }
    
}
