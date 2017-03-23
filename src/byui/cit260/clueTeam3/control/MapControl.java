/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.Detective;
import byui.cit260.clueTeam3.model.Direction;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.MansionMap;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Point;
import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.Room;
import byui.cit260.clueTeam3.model.Scene;
import clueteam3.ClueTeam3;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author whitnieschwarz
 */
public class MapControl {
    
    
    public static MansionMap createMansionMap() throws MapControlException {
    
        MansionMap mansionMap = new MansionMap(5,5); //swapped these LB
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(mansionMap, scenes);
        
        return mansionMap;
    }
    
    public static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[ResourceTypeScene.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Welcome to the game..");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[ResourceTypeScene.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congrats..");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[ResourceTypeScene.finish.ordinal()] = finishScene;
        
        /*Scene clueScene = new Scene();
        clueScene.setDescription("Look, it's a clue..");
        clueScene.setMapSymbol("CL");
        clueScene.setBlocked(false);
        clueScene.setTravelTime(300);
        scenes[ResourceTypeScene.clue.ordinal()] = clueScene;
        
        Scene weaponScene = new Scene();
        weaponScene.setDescription("A weapon, that's suspicious..");
        weaponScene.setMapSymbol("WP");
        weaponScene.setBlocked(false);
        weaponScene.setTravelTime(300);
        scenes[ResourceTypeScene.weapon.ordinal()] = weaponScene;
        
        Scene characterScene = new Scene();
        characterScene.setDescription("Look its - let's go talk to them..");
        characterScene.setMapSymbol("CT");
        characterScene.setBlocked(false);
        characterScene.setTravelTime(300);
        scenes[ResourceTypeScene.character.ordinal()] = characterScene;*/
        
        Scene roomScene = new Scene();
        roomScene.setDescription("Let's explore the room..");
        roomScene.setMapSymbol("RM");
        roomScene.setBlocked(false);
        roomScene.setTravelTime(300);
        scenes[ResourceTypeScene.room.ordinal()] = roomScene;
        
        Scene hallScene = new Scene();
        hallScene.setDescription("You are in the hall..");
        hallScene.setMapSymbol("HL");
        hallScene.setBlocked(false);
        hallScene.setTravelTime(300);
        scenes[ResourceTypeScene.hall.ordinal()] = hallScene;
        
        return scenes;
    }
    
        private static void assignScenesToLocations(MansionMap mansionMap, Scene[] scenes) {
    
        Room[][] rooms = mansionMap.getRooms();
        
        // starting point
        rooms[0][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[0][1].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[0][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[0][3].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[0][4].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        
        rooms[1][0].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[1][1].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[1][2].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[1][3].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[1][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        
        rooms[2][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[2][1].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[2][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[2][3].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[2][4].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        
        rooms[3][0].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[3][1].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[3][2].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[3][3].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[3][4].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        
        rooms[4][0].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[4][1].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[4][2].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        rooms[4][3].setScene(scenes[ResourceTypeScene.hall.ordinal()]);
        rooms[4][4].setScene(scenes[ResourceTypeScene.room.ordinal()]);
        
        HashMap<String, ArrayList<Point>> sceneLocations =
                new HashMap<String, ArrayList<Point>>();
        
        ArrayList<Point> roomCoordinates = new ArrayList<Point>();
        roomCoordinates.add(new Point(0,0));
        roomCoordinates.add(new Point(0,2));
        roomCoordinates.add(new Point(0,4));
        roomCoordinates.add(new Point(2,0));
        roomCoordinates.add(new Point(2,2));
        roomCoordinates.add(new Point(2,4));
        roomCoordinates.add(new Point(4,0));
        roomCoordinates.add(new Point(4,2));
        roomCoordinates.add(new Point(4,4));
        sceneLocations.put("Room", roomCoordinates);
        
        
        ArrayList<Point> hallCoordinates = new ArrayList<Point>();
        hallCoordinates.add(new Point(0,1));
        hallCoordinates.add(new Point(0,3));
        hallCoordinates.add(new Point(1,0));
        hallCoordinates.add(new Point(1,1));
        hallCoordinates.add(new Point(1,2));
        hallCoordinates.add(new Point(1,3));
        hallCoordinates.add(new Point(1,4));
        hallCoordinates.add(new Point(2,1));
        hallCoordinates.add(new Point(2,3));
        hallCoordinates.add(new Point(3,0));
        hallCoordinates.add(new Point(3,1));
        hallCoordinates.add(new Point(3,2));
        hallCoordinates.add(new Point(3,3));
        hallCoordinates.add(new Point(3,4));
        hallCoordinates.add(new Point(4,1));
        hallCoordinates.add(new Point(4,3));
        sceneLocations.put("Hallway", hallCoordinates);
}
        
public static void moveDetectiveToStartingLocation(MansionMap mansionMap) 
                   throws MapControlException {     
      
   //Detective[] detective = Detective.values();
   Game game = ClueTeam3.getCurrentGame();
   
   Player player = new Player();
   
   
    // for (Detective detective : detectives) { TS
         Point coordinates = new Point(0,2);
         MapControl.moveDetectiveToLocation(player, coordinates);
         game.setPlayer(player);
     //}
 }
 
 
public static Point moveDetectiveToLocation(Player player, Direction direction, int distance) 
                            throws MapControlException {
    
    Point blockedLocation = null;
        
        if (player == null  || direction == null  || distance < 1) {
            throw new MapControlException("actor, direction or distance is invalid");
        }
        
        Game game = ClueTeam3.getCurrentGame();    
        MansionMap mansionMap = ClueTeam3.getCurrentGame().getMansionMap();
        Point currentPosition = player.getCoordinates();
        Point newPosition = null;
        
        if (currentPosition == null) {
            throw new MapControlException("Actor is currently is not assigned "
                                          + "to a location");
        }
        
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();

        if (currentRow < 0  || currentRow >= mansionMap.getRowCount() ||
            currentColumn < 0  || currentColumn >= mansionMap.getColumnCount()) {
            throw new MapControlException("Actor is currently in an invalid "
                                          + "location");
        }
        
        // get new position
        int newRow = currentPosition.getRow() + (direction.getxIncrement() * distance);
        int newColumn = currentPosition.getColumn() + (direction.getyIncrement() * distance);
        
                   
        if (newRow < 0  || newRow >= mansionMap.getRowCount() ||
            newColumn < 0  || newColumn >= mansionMap.getColumnCount()) {
            throw new MapControlException("Trying to move to a location "
                                          + "outside bounds of the map");
        }  
        
        
        // Check to see if the path is blocked
        boolean blocked = false;
        Room[][] rooms = mansionMap.getRooms();
        
        int noOfRows = (newRow - currentRow) * direction.getxIncrement();
        int row = currentRow + direction.getxIncrement();      
        for (int i = 0; i < noOfRows; i++ ) {
            rooms[row][currentColumn].setVisited(true);
            
            if (rooms[row][currentColumn].getScene().isBlocked()){   
                blocked = true;
                newRow = row - direction.getxIncrement();
                blockedLocation = new Point(row+1, currentColumn+1);
                break;
            }
            
            row += direction.getxIncrement();
        }
        
        
        int noOfColumns = (newColumn - currentColumn) * direction.getyIncrement();
        int column = currentColumn + direction.getyIncrement();       
        for (int i = 0; i < noOfColumns; i++ ) {
            rooms[currentRow][column].setVisited(true);

            if (rooms[currentRow][column].getScene().isBlocked()){ 
                blocked = true;
                newColumn = column - direction.getyIncrement();
                blockedLocation = new Point(currentRow+1, column+1);
                break;
            }  
            column += direction.getyIncrement();
        } 
        
        
        if (currentRow != newRow || currentColumn != newColumn) {
            Room currentLocation = mansionMap.getRooms()[currentRow][currentColumn];
            currentLocation.removePlayer(player); // remove actor from old location

            // set actor to new location
            newPosition = new Point(newRow, newColumn);
            MapControl.moveDetectiveToLocation(player, newPosition);
        }

        
        return blockedLocation;
}


public static void moveDetectiveToLocation (Player player, Point coordinates) 
                 throws MapControlException {
//code 3-22-17
       MansionMap mansionMap = ClueTeam3.getCurrentGame().getMansionMap();
       int newRow = coordinates.getRow();
       int newColumn = coordinates.getColumn();
     
       if (newRow < 0 || newRow >= mansionMap.getRowCount() || 
             newColumn < 0 || newColumn >= mansionMap.getColumnCount()) {
            throw new MapControlException("Can not move actor to location " 
                                      + newRow + ", " + newColumn 
                                      + " because that location is outside "
                                      + " the bounds of the map."); 
         }
        player.setCoordinates(coordinates);
}
public static Room getRoom(Point coordinates) {
        return ClueTeam3.getCurrentGame().getMansionMap().getRooms()[coordinates.getRow()][coordinates.getColumn()];
 }
 
}

        
       
