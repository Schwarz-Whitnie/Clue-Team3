/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author catrinalonghurst1
 */
public class MapCodeView extends View{

    private String description;
    private boolean accused;
    private String mapCode;
    
    private static PrintWriter outfile = null;
    private static BufferedReader infile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MapCodeView.logFile = logFile;
    }

    public String getMapCode() {
        return mapCode;
    }

    public static PrintWriter getOutfile() {
        return outfile;
    }

    public static BufferedReader getInfile() {
        return infile;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public BufferedReader getKeyboard() {
        return keyboard;
    }

    public PrintWriter getConsole() {
        return console;
    }
    
    
    public MapCodeView() {
        
        super ("------------------------------------------"
            + "\n| Map Code                              |"
            + "\n----------------------------------------"
            + "\nCO  - Conservatory"
            + "\nBR  - Billiard Room"
            + "\nLI  - Library"
            + "\nLO  - Lounge"
            + "\nDR  - Dining Room"
            + "\nKI  - Kitchen" 
            + "\nBR  - Ballroom" 
            + "\nSY  - Study" 
            + "\nHW  - Hall" 
            + "\nPW  - Passageway"                 
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ");
            
    }
     

    
    public MapCodeView (String description, boolean accused) {
        this.description = description;
        this.accused = accused;
}

    /* public DetectiveNotebook(int rowCount, int columnCount) {
        
        if(rowCount<1 || columnCount <1) {
            System.out.println("The number of rows and columns must be bigger than 1");
            return;
        }

        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.notebook = new DetectiveNotebook[rowCount][columnCount];
        for (int row=0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                //create and initialize new clue object instance
                Clue clues = new Clue();
            }
        }

} */

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
    this.description = description;
}

    public boolean isAccused() {
        return accused;
    }

    public void setAccused(boolean accused) {
        this.accused = accused;
    }
    

    @Override
    public String toString() {
    return "MapCodeView" + "description=" + description; 
}

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
        
}
 



    

   
