/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Weapon;

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
    }
    
}
