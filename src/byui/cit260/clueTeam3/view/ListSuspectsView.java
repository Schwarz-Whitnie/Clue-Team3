/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.exeptions.GameControlException;
import byui.cit260.clueTeam3.exeptions.ListSuspectsViewException;
import byui.cit260.clueTeam3.model.Clue;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Suspects;
import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;



/**
 *
 * @author catrinalonghurst1
 */
public class ListSuspectsView extends View {

    static void getSortedListSuspectsView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String description;
    private boolean accused;
    private String suspects;
    
    private static PrintWriter outfile = null;
    private static BufferedReader infile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ListSuspectsView.logFile = logFile;
    }

    public String getSuspects() {
        return suspects;
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
    
    
    public ListSuspectsView() {
        
        super ("------------------------------------------"
            + "\n| List of Suspects                      |"
            + "\n----------------------------------------"
            + "\nC  - Colonel Mustard"
            + "\nW  - Mrs. White"
            + "\nPP - Professor Plum"
            + "\nP  - Mrs. Peacock"
            + "\nS  - Miss Scarlet"
            + "\nG  - Mr. Green"    
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ");
            
    }
     

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "C": //Colonel Mustard
                this.mustard();
                break;
            case "W": //hMrs. White
                this.white();
                break;
            case "PP": //Professor Plum
                this.plum();
                break;
            case "P": //Mrs. Peacock
                this.peacock();
                break;
            case "S": //Miss Scarlet
                this.scarlet();
                break;
            case "G": //Mr. Green
                this.green();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        
         return false;
    }
 
    
    public ListSuspectsView (String description, boolean accused) {
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
    return "ListSuspectsView" + "description=" + description; 
}

    @Override 
     public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.accused);
        return hash;
}

   @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetectiveNotebook other = (DetectiveNotebook) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.accused, other.accused)) {
            return false;
        }
        return true;
    }
    

    
    
    private void mustard() {
          System.out.println("Colonel Mustard is a dignified, dapper and "
                  + "\n dangerous military man. ");
    }

    private void white() {
        System.out.println("Mrs. White is a frazzled servant of the mansion, "
                + "\n with a possible grudge against her employer.");
    }

    private void plum() {
        System.out.println("Professor Plum is a quick witted professor, who"
                + "\n is widely seen as an intellectual, although his "
                + "\n intelligence is tempered with homicidal tendencies.");
    }

    private void peacock() {
        System.out.println("Mrs. Peacock is an elderly yet still attractive"
                + "\n woman who maintains her dignity at all times. She has "
                + "\n had three marriages ending disasterously in the death"
                + "\n of her husband.");
    }

    private void scarlet() {
        System.out.println("Miss Scarlet is an aspiring acress with more "
                + "\n aspiration than talent. She has now become a cunning"
                + "\n young gold digger.");
    }

    private void green() {
        System.out.println("Mr. Green is a con man, who has settled with the "
                + "\n identity of Reverand Green. He has taken money from "
                + "\n everyone from mobsters to businessmen.");
    }
    
    
    private static Suspects[] createSuspects() throws ListSuspectsViewException {
        // create and array(list of detective notebook items
        
        
        ListSuspectsView[] suspect = new ListSuspectsView[6];
        
        ListSuspectsView mustard = new ListSuspectsView();
        mustard.setDescription("Col. Mustard");
        mustard.setAccused(true);
        suspect[Suspects.suspectOne.ordinal()] = mustard;
        
        ListSuspectsView white = new ListSuspectsView();
        white.setDescription("Mrs. White");
        white.setAccused(false);
        suspect[Suspects.suspectTwo.ordinal()] = white;
        
        ListSuspectsView plum = new ListSuspectsView();
        plum.setDescription("Professor Plum");
        plum.setAccused(true);
        suspect[Suspects.suspectThree.ordinal()] = plum;
        
        ListSuspectsView peacock = new ListSuspectsView();
        peacock.setDescription("Mrs. Peacock");
        peacock.setAccused(false);
        suspect[Suspects.suspectFour.ordinal()] = peacock;
        
        ListSuspectsView scarlet = new ListSuspectsView();
        scarlet.setDescription("Mrs. Scarlet");
        scarlet.setAccused(true);
        suspect[Suspects.suspectFive.ordinal()] = scarlet;
        
        ListSuspectsView green = new ListSuspectsView();
        green.setDescription("Mr. Green");
        green.setAccused(false);
        suspect[Suspects.suspectSix.ordinal()] = green;
        
        return null;
        
    }

        public static void saveGame(Game game, String filepath) 
        throws GameControlException {
        
    try( FileOutputStream fops = new FileOutputStream(filepath)) {
        ObjectOutputStream output = new ObjectOutputStream(fops);
        
        output.writeObject(game);
    }
    catch(IOException ex) {
        throw new GameControlException(ex.getMessage());
    }
    
        }
}
   /* public static Suspects[] getSortedSuspects() throws GameControlException {
        
        // get inventory list for the current game
       Suspects[] originalSuspects = 
               suspects.getSuspect();
        
        // clone (make a copy) orignalList
        Suspects[] suspectList = originalSuspects.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        Suspects tempSuspects;
        for (int i = 0; i < suspectList.length-1; i++) {
            for (int j = 0; j < suspectList.length-1-i; j++) {
                if (suspectList[j].getDescription().
                        compareToIgnoreCase(suspectList[j + 1].getDescription()) > 0) {
                    tempSuspects = suspectList[j];
                    suspectList[j] = suspectList[j+1];
                    suspectList[j+1] = tempSuspects;
                    throw new GameControlException("Can not display notebook"
                                                  + " because error.");
               }
            }
        }
        
        return suspectList;
    }    

 //public static Suspects[] getsuspect() {    
   // return getSuspects;
//}    */




    
