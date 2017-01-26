/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Character;
import byui.cit260.clueTeam3.model.Time;

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
        
        Game gameOne = new Game();
        
        gameOne.setTotalTime(12.0);
        gameOne.setNoPeople(0);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo); 
        
        
        Character characterOne = new Character();
        
        characterOne.setName("name");
        characterOne.setDescription("description");
        characterOne.setCoordinates(0);
        characterOne.setType("type");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        
        Time timer = new Time();
        
        timer.setRun("countdown");
        timer.setCountdownTime(0);
        timer.setDisplayTime(0);
        
        String timeInfo = timer.toString();
        System.out.println(timeInfo);
                
                
     
}
}
