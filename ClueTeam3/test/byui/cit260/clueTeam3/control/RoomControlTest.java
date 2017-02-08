/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author whitnieschwarz
 */
public class RoomControlTest {
    
    public RoomControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcRoute method, of class RoomControl.
     */
    @Test
    public void testCalcRoute() {
        System.out.println("calcRoute");
        
        /***********************
         * Test case #1 
         ************************/
        System.out.println("\tTest case #1");
        
        double lengthIn = 816.0;
        double lengthCm = 2499.36;
        
        double expResult = 150.0;
        
        RoomControl instance = new RoomControl();
        
        double result = instance.calcRoute(lengthIn, lengthCm);
        
        assertEquals(expResult, result, 0.0);
    
      /************
     * Test case #2.
     ***************/
        System.out.println("\tTest case #2");
        
        lengthIn = 0.0;
        lengthCm = 2.0;
        
        expResult = -1;
       
        result = instance.calcRoute(lengthIn, lengthCm);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #3.
     ***************/
        System.out.println("\tTest case #3");
        
        lengthIn = 2.0;
        lengthCm = 0.0;
        
        expResult = -1;
       
        result = instance.calcRoute(lengthIn, lengthCm);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #4.
     ***************/
        System.out.println("\tTest case #4");
        
        lengthIn = 0.0;
        lengthCm = 0.0;
        
        expResult = -1.0;
       
        result = instance.calcRoute(lengthIn, lengthCm);
        
        assertEquals(expResult, result, 0.0);
         
    }
}
