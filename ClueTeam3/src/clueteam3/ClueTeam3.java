/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Weapon;
import byui.cit260.clueTeam3.model.Scene;
import byui.cit260.clueTeam3.model.Time;
import byui.cit260.clueTeam3.model.Character;
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.TransitionTypeScene;

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
        
        
        MansionMap mapOne = new MansionMap();
        
        mapOne.setColumnCount(2);
        mapOne.setRowCount(5);
        
        String mansionMapInfo = mapOne.toString();
        System.out.println(mansionMapInfo);
        
        
        Room roomOne = new Room();
        
        roomOne.setName("Library");
        roomOne.setDescription("The room with the books");
        roomOne.setAttribute(5);
        
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
        
        
        Weapon weaponOne = new Weapon();
        
        weaponOne.setDescription("Sharp, be careful not to cut yourself");
        weaponOne.setLocation("Library");
        weaponOne.setWeaponType("Dagger");
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
        
        
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
                
                
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Room 1: Hallway");
        sceneOne.setTravelTime(8.00);
        sceneOne.setBlockedLocation("Blocked");
        sceneOne.setDisplaySymbol("Scene1");
        sceneOne.setAmountAvailable(5);
        sceneOne.setResourceType("Weapon Clue");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        
        TransitionTypeScene transitionTypeSceneOne = new TransitionTypeScene();
        
        transitionTypeSceneOne.setNoOfSpaces("4");
        
        String transitionTypeSceneInfo = transitionTypeSceneOne.toString();
        System.out.println(transitionTypeSceneInfo);
        
        
        ResourceTypeScene resourceTypeSceneOne = new ResourceTypeScene();
        
        resourceTypeSceneOne.setAmountAvailable(3.0);
        resourceTypeSceneOne.setResourceType("Clue");
        
        String resourceTypeSceneInfo = resourceTypeSceneOne.toString();
        System.out.println(resourceTypeSceneInfo);
        
        
    }
    
}
