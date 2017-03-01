/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.view.StartProgramView;

/**
 *
 * @author Treya
 */
public class ClueTeam3 {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ClueTeam3.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ClueTeam3.player = player;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    }
    
    
}
