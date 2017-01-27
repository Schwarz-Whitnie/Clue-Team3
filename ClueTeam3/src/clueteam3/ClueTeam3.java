/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Scene;

/**
 *
 * @author Cameron
 */
public class ClueTeam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
    
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Room 1: Hallway");
        sceneOne.setTravelTime(8.00);
        sceneOne.setBlockedLocation("Blocked");
        sceneOne.setDisplaySymbol("Scene1");
        sceneOne.setAmountAvailable(5);
        sceneOne.setResourceType("Weapon Clue");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
    }
    
}
