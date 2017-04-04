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
 * @author whitnieschwarz
 */
public class TimeControlTest {
    
    public TimeControlTest() {
    }

    /**
     * Test of calcTotalTime method, of class TimeControl.
     */
    @Test
    public void testCalcTotalTime() {
        System.out.println("calcTotalTime");
        
        /****************
         * Test case #1
         ***************/
        System.out.println("\tTest case #1");
        
        double noOfRooms = 3.0;
        double noOfLocations = 2.0;
        double passageway = 1.0;
        
        double expResult = 58.75;
        
        TimeControl instance = new TimeControl();
        
        double result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
     
        
        /****************
         * Test case #2
         ***************/
        System.out.println("\tTest case #2");   
           
        noOfRooms = 0.0;
        noOfLocations = 2.0;
        passageway = 1.0;
        
        expResult = -1;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
       
        /****************
         * Test case #3
         ***************/
        System.out.println("\tTest case #3");   
           
        noOfRooms = 3.0;
        noOfLocations = -1.0;
        passageway = 1.0;
        
        expResult = -1;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
        
        /****************
         * Test case #4
         ***************/
        System.out.println("\tTest case #4");   
           
        noOfRooms = 3.0;
        noOfLocations = 2.0;
        passageway = -1.0;
        
        expResult = -1;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
        
        /****************
         * Test case #5
         ***************/
        System.out.println("\tTest case #5");   
           
        noOfRooms = 3.0;
        noOfLocations = 2.0;
        passageway = 4.0;
        
        expResult = -1;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
        
        /****************
         * Test case #6
         ***************/
        System.out.println("\tTest case #6");   
           
        noOfRooms = 1.0;
        noOfLocations = 1.0;
        passageway = 0.0;
        
        expResult = 55;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
        
        /****************
         * Test case #7
         ***************/
        System.out.println("\tTest case #7");   
           
        noOfRooms = 1.0;
        noOfLocations = 1.0;
        passageway = 3.0;
        
        expResult = 96.25;
        
        result = instance.calcTotalTime(noOfRooms, passageway);
       
        assertEquals(expResult, result, 0.0001);
    
    }
    
}
