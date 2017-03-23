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
 * @author catrinalonghurst1
 */
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }

    /**
     * Test of calcTimePoison method, of class CharacterControl.
     */
    @Test
    public void testCalcTimePoison() {
        System.out.println("calcTimePoison");
        
        
        /****************
         * Test case #1
         ****************/
        System.out.println("\tTest case #1");
        
        double amtPoison = 69.0;
        
        double expResult = 23.0;
        
        CharacterControl instance = new CharacterControl();
        
        double result = instance.calcTimePoison(amtPoison);
        
        assertEquals(expResult, result, 0.0);
       
        
        /****************
         * Test case #2
         ****************/
        System.out.println("\tTest case #2");
        
        amtPoison = 90.0;
        
        expResult = -1;
        
        result = instance.calcTimePoison(amtPoison);
        
        assertEquals(expResult, result, 0.0);
        
        
        /****************
         * Test case #3
         ****************/
        System.out.println("\tTest case #3");
        
        amtPoison = 50.0;
        
        expResult = -1;
        
        result = instance.calcTimePoison(amtPoison);
        
        assertEquals(expResult, result, 0.0);
        
        
        /****************
         * Test case #4
         ****************/
        System.out.println("\tTest case #4");
        
        amtPoison = 5.0;
        
        expResult = -1;
        
        result = instance.calcTimePoison(amtPoison);
        
        assertEquals(expResult, result, 0.0);
        
        
        /****************
         * Test case #5
         ****************/
        System.out.println("\tTest case #5");
        
        amtPoison = 69.0;
        
        expResult = 23;
        
        result = instance.calcTimePoison(amtPoison);
        
        assertEquals(expResult, result, 0.0);
        
    }
    
}
