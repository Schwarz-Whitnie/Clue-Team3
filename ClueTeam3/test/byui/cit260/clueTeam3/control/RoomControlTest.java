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
    public void testCalcShortestRoute() {
        System.out.println("calcShortestRoute");
        
        /***********************
         * Test case #1 
         ************************/
        System.out.println("\tTest case #1");
        
        double lengthIn = 1800.00;
        double lengthYd = 60.00;
        
        double expResult = 150.00;
        
        RoomControl instance = new RoomControl();
        
        double result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
    
      /************
     * Test case #2.
     ***************/
    System.out.println("\tTest case #2");
        
        lengthIn = 1700.00;
        lengthYd = 60.00;
        
        expResult = -1.00;
        
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #3.
     ***************/
        System.out.println("\tTest case #3");
        
        lengthIn = 1900.00;
        lengthYd = 60.00;
        
        expResult = -1.00;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #4.
     ***************/
        System.out.println("\tTest case #4");
        
        lengthIn = 1800.00;
        lengthYd = 50.00;
        
        expResult = -1.00;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #5.
     ***************/
        System.out.println("\tTest case #5");
        
        lengthIn = 1800.00;
        lengthYd = 70.00;
        
        expResult = -1.00;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0); 
        
     /************
     * Test case #6.
     ***************/
        System.out.println("\tTest case #6");
        
        lengthIn = 1750.00;
        lengthYd = 60.00;
        
        expResult = 145.83;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
           
     /************
     * Test case #7.
     ***************/
        System.out.println("\tTest case #7");
        
        lengthIn = 1850.00;
        lengthYd = 60.00;
        
        expResult = 154.17;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0); 
        
     /************
     * Test case #8.
     ***************/
        System.out.println("\tTest case #8");
        
        lengthIn = 1800.00;
        lengthYd = 55.00;
        
        expResult = 150.00;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);
        
     /************
     * Test case #9.
     ***************/
        System.out.println("\tTest case #9");
        
        lengthIn = 1800.00;
        lengthYd = 65.00;
        
        expResult = 150.00;
       
        result = instance.calcShortestRoute(lengthIn, lengthYd);
        
        assertEquals(expResult, result, 0.0);    
    }
}
