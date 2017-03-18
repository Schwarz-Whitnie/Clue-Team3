/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.GameControl;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import clueteam3.ClueTeam3;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
            + "\nS - List of Suspects"
            + "\nW - List of Weapons"
            + "\nR - List of Rooms" 
            + "\nL - Move to New Room"
            + "\nN - View Detective Notebook"
            + "\nA - Make an Accusation"
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
                this.viewDetectiveNotebook();
                break;
            case "A": //make an accusation
                this.makeAccusation();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
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
        
        for (int i = 0; i < map.getRowCount(); i++) {    
            Room[] rowLocations = rooms[i];
            this.printRowDivider(out, noColumns);
            out.println(); // move down one i
            if (i < 9)
                out.print(" " + (i+1));
            else 
                out.print(i+1);
            
            // for every column in the row
            for (int column = 0; column < noColumns; column++) {
                out.print("|"); // print column divider
                Room room = rowLocations[column];
                if (room != null && room.isVisited()) { // if location is visited 
                    
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
            
            out.print("|"); // print column divider
        }
        
        this.printRowDivider(out, noColumns);
    }
    
    private void printColumnHeaders(PrintWriter out, int columnCount) {
        for (int i = 1; i < columnCount+1; i++) {
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
    }

    private void weaponList() {
        //display the list of weapons
        ListWeaponsView listWeapons = new ListWeaponsView();
        listWeapons.display();
    }

    private void roomList() {
        //display the list of rooms
        ListRoomsView listRooms = new ListRoomsView();
        listRooms.display();
    }

    private void moveRooms() {
        System.out.println("*** Move Rooms ***");
    }

    private void viewDetectiveNotebook() {
        //display detective notebook
        
        //this.viewDetectiveNotebook(ClueTeam3.getOutFile());
        DetectiveNotebook detectiveNotebook = new DetectiveNotebook();
        detectiveNotebook.cre();
        System.out.println("*** View Detective Notebook ***");
         
    }

    private void makeAccusation() {
        System.out.println("*** Make an Accusation ***");
    }
    
    public void printReport() throws FileNotFoundException {
        // get the filepath and name of the 
        
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
            
            this.viewMansionMap(reportFile);
            
            
            ClueTeam3.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");
            
        }

    }

    
}
