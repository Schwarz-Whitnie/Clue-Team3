/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.GameControl;
import byui.cit260.clueTeam3.exeptions.GameControlException;
import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Point;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import clueteam3.ClueTeam3;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Treya
 */
public class GameMenuView extends View {

    public GameMenuView() {
        
        super ("----------------------------------------"
            + "\n| Game Menu                            |"
            + "\n----------------------------------------"
            + "\nM - Map of Mansion" 
            + "\nL - Move to New Room"
            + "\nN - View Detective Notebook"
            + "\nA - Make an Accusation"
            + "\nS - List of Suspects"
            + "\nW - List of Weapons"
            + "\nR - List of Rooms"
            + "\nT - Check Time"
            + "\nP - Print Detective Notebook"    
            + "\nQ - Quit"
            + "\n----------------------------------------"
            + "\nPlease enter a command: ");
    }
    

    @Override
    public boolean doAction (String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "M": //view list
                this.mansionMap();
                break;
            case "S": //view list
                this.suspectList();
                break;
            case "W": //view list
                this.weaponList();
                break;
            case "R": //view list
                this.roomList();
                break;
            case "L": //move to new room
                this.moveRooms();
                break;
            case "N": //view detective notebook
                this.displayDetectiveNotebook();
                break;
            case "A": //make an accusation
                this.makeAccusation();
                break;
            case "P": // print detective notebook report
                this.printDetectiveNotebook();
                break;
            case "T": // print detective notebook report
                this.checkTime();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display("GameMenuView", "*** Invalid selection *** Try again");   
        }
        
         return false;
    }

    private void mansionMap() {
        
       this.viewMansionMap(ClueTeam3.getOutFile()); 
        //MansionMapView mansionMap = new MansionMapView();
        //mansionMap.display();
    }
    
    public void viewMansionMap(PrintWriter out) {
        int lineLength = 0;
        
        // get the map for the game
     //   Room[][] rooms = GameControl.getMapLocations();
        MansionMap map = ClueTeam3.getCurrentGame().getMansionMap(); //brings in the map saved before
        Room[][] rooms = map.getRooms();
        int noColumns = map.getColumnCount(); // get number columns in row
        
        this.printTitle(out, noColumns, "Map of the Mansion");
        this.printColumnHeaders(out, noColumns);
        
        Point playerLocation = new Point();
        playerLocation.setRow(ClueTeam3.getCurrentGame().getPlayer().getCoordinates().getRow());
        playerLocation.setColumn(ClueTeam3.getCurrentGame().getPlayer().getCoordinates().getColumn());
        
        for (int i = 0; i < map.getRowCount(); i++) {    
            Room[] rowLocations = rooms[i];
            this.printRowDivider(out, noColumns);
            out.println(); // move down one i
            if (i < 9)
                out.print(" " + (i));
            else 
                out.print(i);
            
            // for every column in the row
            for (int column = 0; column < noColumns; column++) {
                out.print(" | "); // print column divider
                Room room = rowLocations[column];
                if (room != null) { // if location is visited 
                    
                    Scene scene = room.getScene();
                    if (scene != null)
                        out.print(scene.getMapSymbol());
                    else
                        out.print("    ");
                }
                else {
                    out.print(" ?? ");
                }      
            }
            
            out.print(" | "); // print column divider
        }
        
        out.print(  
              "\n----------------------------------------"
            + "\n| Map Code                              |"
            + "\n----------------------------------------"
            + "\nCO  - Conservatory      KI - Kitchen"      
            + "\nBR  - Billiard Room     BR - Ballroom"    
            + "\nLI  - Library           SY - Study"        
            + "\nLO  - Lounge            HW - Hall"
            + "\nDR  - Dining Room       PW - Passageway");
        
        this.printRowDivider(out, noColumns);
        out.print("\nYou are at location " + playerLocation.getRow() + ", " + playerLocation.getColumn());
    }
    
    private void printColumnHeaders(PrintWriter out, int columnCount) {
        for (int i = 0; i < columnCount; i++) {
            if (i < 10) {
                out.print("   " + i + " ");
            }
            else {
                out.print("  " + i + " ");
            }
        }
    }

    private void printRowDivider(PrintWriter out, int noColumns) {
        out.println();
        out.print("  ");
        for (int i = 0; i < noColumns; i++) { // print row divider
                out.print("-----");
        }
        out.print("-");
    }

    private void printTitle(PrintWriter out, int columnCount, String title) {
        
        int titleLength = title.length();
        int lineLength = columnCount * 5 + 3;
        int startPosition = (lineLength / 2) - (titleLength / 2);
        out.println("\n");
        for (int i = 0; i < startPosition; i++) {
            out.print(" ");  
        }
        out.print(title);
        out.println("\n");
        
    }
    
    private void suspectList() {
        //display the list of suspects
       ListSuspectsView listSuspects = new ListSuspectsView();
        listSuspects.display();      
     
       /* StringBuilder line = null;
        
        try { 
            GameControl.getSortedDetectiveNotebook();
        } catch (GameControlException e) {
            this.console.println("Error reading input: " + e.getMessage());
        }
        Game game = ClueTeam3.getCurrentGame();
        ListSuspectsView[] suspect = Suspects.getSuspects();
        
        out.println("\n  List of Suspects");
        line = new StringBuilder("                     ");
        line.insert(0, "SUSPECT");
        line.insert(20, "STATUS");
        out.println(line.toString());
        
        // for each notebook item
        for (ListSuspectView listSuspectView : suspects) {
            line = new StringBuilder("                                                          ");
            line.insert(0, listSuspectView.getDescription());
            line.insert(23, listSuspectView.isAccused());
            
            // DISPLAY the description, the required amount and amount in stock
            out.println(line.toString()); */
        } 

    private void weaponList() {
        //display the list of weapons
        ListWeaponsView listWeapons = new ListWeaponsView();
        listWeapons.display();
    }

    private void roomList() {
       this.viewRoomList(ClueTeam3.getOutFile());
    }
    
    private void viewRoomList(PrintWriter out) {
        StringBuilder line = null;
        
        try { 
            GameControl.getSortedRoomNotebook();
        } catch (GameControlException e) {
            this.console.println("Error reading input: " + e.getMessage());
        }
        Game game = ClueTeam3.getCurrentGame();
        DetectiveNotebook[] roomNotebook = game.getRoomNotebook();
        
        out.println("\n  DETECTIVE NOTEBOOK");
        line = new StringBuilder("                     ");
        line.insert(0, "ROOM");
        line.insert(20, "STATUS");
        out.println(line.toString());
        
        // for each notebook item
        for (DetectiveNotebook detectiveRoomNotebook : roomNotebook) {
            line = new StringBuilder("                                                          ");
            line.insert(0, detectiveRoomNotebook.getDescription());
            line.insert(23, detectiveRoomNotebook.isAccused());
            
            // DISPLAY the description, the required amount and amount in stock
            out.println(line.toString());
        }
        //display the list of rooms
        //ListRoomsView listRooms = new ListRoomsView();
        //listRooms.display();
   }

    private void moveRooms() {
        //this.viewMansionMap(ClueTeam3.getOutFile());
        MoveDetectiveView moveDetectiveView = new MoveDetectiveView();     
        try { 
            moveDetectiveView.moveDetective();
        } catch (MapControlException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void displayDetectiveNotebook() {
       this.viewDetectiveNotebook(ClueTeam3.getOutFile());
    }
    
    private void viewDetectiveNotebook(PrintWriter out) {
        //display detective notebook
 
        StringBuilder line = null;
        
        try { 
            GameControl.getSortedDetectiveNotebook();
        } catch (GameControlException e) {
            this.console.println("Error reading input: " + e.getMessage());
        }
        Game game = ClueTeam3.getCurrentGame();
        DetectiveNotebook[] notebook = game.getNotebook();
        
        out.println("\n  DETECTIVE NOTEBOOK");
        line = new StringBuilder("                     ");
        line.insert(0, "WEAPON");
        line.insert(20, "STATUS");
        out.println(line.toString());
        
        // for each notebook item
        for (DetectiveNotebook detectiveNotebook : notebook) {
            line = new StringBuilder("                                                          ");
            line.insert(0, detectiveNotebook.getDescription());
            line.insert(23, detectiveNotebook.isAccused());
            
            // DISPLAY the description, the required amount and amount in stock
            out.println(line.toString());
        }
        
        //this.getSortedDetectiveNotebook(ClueTeam3.getOutFile());
        
       // System.out.println("*** View Detective Notebook ***");
         
    }

    private void makeAccusation() {
        AccusationView accusationPrompt = new AccusationView();
        accusationPrompt.displayPrompt();
    }
    
    public void printDetectiveNotebook() {
        // get the filepath and name of the file
        this.console.println("\nEnter the file path where the report is to be saved.");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        // Create a new printwriter
        try (PrintWriter reportFile = new PrintWriter(filePath)) {
            
            
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dateTime = formatter.format(currentTime);
            
            reportFile.println("Report printed: " + dateTime);
            
            this.viewDetectiveNotebook(reportFile);
            
            
            ClueTeam3.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");
            
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }
    }

    private void checkTime() {
        TimeRemainingView timeRemainingView = new TimeRemainingView();
        timeRemainingView.displayPrompt();
    }
    
}
