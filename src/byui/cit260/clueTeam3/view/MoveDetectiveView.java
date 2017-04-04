/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.MapControl;
import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.Game;
import byui.cit260.clueTeam3.model.Player;
import byui.cit260.clueTeam3.model.Point;
import byui.cit260.clueTeam3.model.Direction;
import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author whitnieschwarz
 */
public class MoveDetectiveView  {
   
    
 protected final BufferedReader keyboard = ClueTeam3.getInFile();
        
        
        

        
    
        public boolean moveDetective() throws MapControlException {
        Game game = ClueTeam3.getCurrentGame();
        
        Player player = game.getPlayer(); 
        
        boolean done = false;
        do {
            System.out.println("\nYou can move up (U), down(D), left(L) or right (R)");
            try {
                 //prompt for and get the row and column numbers
                System.out.println("\nEnter the direction and distance to move (e.g. U 2) ");
                Movement movement = this.getCoordinates(); // get the row and column
                if (movement == null) // entered "Q" to quit
                    break;
                
                
                // move actor to specified location
                Point blockedLocation = MapControl.moveDetectiveToLocation(player, 
                                                       movement.direction, 
                                                       movement.distance);
                
                        Point playerLocation = new Point();
        playerLocation.setRow(ClueTeam3.getCurrentGame().getPlayer().getCoordinates().getRow());
        playerLocation.setColumn(ClueTeam3.getCurrentGame().getPlayer().getCoordinates().getColumn());
        
        System.out.println("\nYou are at location " + playerLocation.getRow() + ", " + playerLocation.getColumn());
                
//                Point coordinates = game.getPlayersLocation();
//                Point newPosition = new Point(coordinates.getRow(), coordinates.getColumn());
      
/*                String locationDescription;
                String message = "";
                if (blockedLocation != null) {
                    locationDescription = MapControl.getRoom(blockedLocation).getScene().getDescription();
                    message = "The path was blocked at position " 
                                    +   blockedLocation.getRow() + ", " + blockedLocation.getColumn() + ".\n"
                                    +   this.getBlockedMessage(locationDescription)
                                    +   "\n\n" + player + " is currently in position " 
                                    +   newPosition.getRow() + ", " + newPosition.getColumn();  
                    this.console.println(message);
                    
                }
                else {
                    locationDescription = MapControl.getRoom(newPosition).getScene().getDescription();
                    message = player + " was successfully moved to position " 
                            + newPosition.getRow() + ", " + newPosition.getColumn() + ".\n"
                            + this.getBlockedMessage(locationDescription);
                    this.console.println(message);                
                }
                */
                done = true;
            } catch (MapControlException ex) {
                    ErrorView.display("MoveActorView", ex.getMessage());
            }       
        } while (!done);

    

        return false;  
    }
    
    public Movement getCoordinates() throws MapControlException {
        Movement movement = null;
        
        String value = null;
     try {
         value = this.keyboard.readLine();
     } catch (IOException ex) {
         Logger.getLogger(MoveDetectiveView.class.getName()).log(Level.SEVERE, null, ex);
     }
        value = value.trim().toUpperCase();
        if (value.equals("Q"))
            return null;
        
                //tokenize values int string
        String[] values = value.split(" ");
        
        
        if (values.length < 2) {
            ErrorView.display(this.getClass().getName(),
                              "You must enter both a direction and distance.");
            return null;
        }
        
        // get the direction
        Direction direction;
        switch (value.charAt(0)) {
            case 'U' : direction = Direction.U;
                break;
            case 'D' : direction = Direction.D;
                break;
            case 'L' : direction = Direction.L;
                break;
            case 'R' : direction = Direction.R;
                break;
            default: 
                ErrorView.display(this.getClass().getName(),
                                 "The direction must be U, D, L or R");
                return null;
        }

        // convert the distance to a number
        int distance = Integer.parseInt(values[1]);
        if (distance < 1) {
            ErrorView.display(this.getClass().getName(),
                    "The distance must be greater than zero.");
            return null;     
        }
        movement = new Movement(direction, distance);
        
        return movement;
    }

    
    
    
    private class Movement {
        
        Direction direction;
        int distance;
        
        public Movement(Direction direction, int distance) {
            this.direction = direction;
            this.distance = distance;
        }
    }
    
   /* @Override
    public boolean doAction(String choice)  {
        Player player = null;
        
        try {
            Point coordinates = null;
            MapControl.moveDetectiveToLocation(player, coordinates);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
    
        ErrorView.display("MoveDetectiveView", "Invalid Selection");
        return false;
    
    }


   
    
    
    


//Switch Statement Backup

  /*  public MoveDetectiveView() {
        super(""
            + "\nCO - Conservatory"
            + "\nBR - Billiard Room"
            + "\nLI - Library"
            + "\nLO - Lounge"   
            + "\nDR - Dining Room"
            + "\nKI - Kitchen"
            + "\nBR - Ballroom"
            + "\nST - Study"  
            + "\nHW - Hall"
            + "\nPW - Passageway"
            + "\nPlease enter a room");
    }
    
    @Override
    public boolean doAction (String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "CO":
                this.conservatory();
                break;
                case "BI": 
                this.billiardRoom();
                break;
            case "LI": 
                this.library();
                break;
            case "LO": 
                this.lounge();
                break;
            case "DR": 
                this.diningRoom();
                break;
            case "KI": 
                this.kitchen();
                break;
            case "BR": 
                this.ballroom();
                break;
            case "SY": 
                this.study();
                break;
            case "HW": 
                this.hallway();
                break;
            case "PW": 
                this.passageway();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display("MoveDetectiveView", "*** Invalid selection *** Try again");   
        }
        
         return false;
    }
    
    private void conservatory() {
        System.out.println("You are in the conservatory");
        }
    
    private void billiardRoom(){
       System.out.println("You are in the billiard Room"); 
    }
    
    private void library() {
        System.out.println("You are in the library");
        }
    
    private void lounge(){
       System.out.println("You are in the lounge"); 
    }
    
    private void diningRoom() {
        System.out.println("You are in the dining Room");
        }
    
    private void kitchen(){
       System.out.println("You are in the kitchen"); 
    }
    
    private void ballroom() {
        System.out.println("You are in the ballroom");
        }
    
    private void study(){
       System.out.println("You are in the study"); 
    }
    
    private void hallway() {
        System.out.println("You are in the hallway");
        }
    
    private void passageway(){
       System.out.println("You are in the passageway"); 
    } 
    
   
    
    */
    
}

