/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueteam3;

import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author Treya
 */
public class ClueTeam3 {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        try {
            
            // open charcter stream files for end user input and output
            ClueTeam3.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            ClueTeam3.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            ClueTeam3.logFile = new PrintWriter(filePath);


            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return; 

        } catch (Throwable e) {
              
                System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }

        finally {
            try {
                if (ClueTeam3.inFile != null)
                    ClueTeam3.inFile.close();
                
                if (ClueTeam3.outFile != null)
                    ClueTeam3.outFile.close();
                
                if (ClueTeam3.logFile != null)
                    ClueTeam3.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }   
        }
       
    }
    
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
    
     public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ClueTeam3.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ClueTeam3.inFile = inFile;
    }



    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ClueTeam3.logFile = logFile;
    }
}
