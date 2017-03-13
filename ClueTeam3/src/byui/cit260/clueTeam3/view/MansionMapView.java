/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.model.ResourceTypeScene;
import byui.cit260.clueTeam3.model.Room;
import java.util.Scanner;

/**
 *
 * @author camer
 */
/*public class MansionMapView {
    
    private final String row;
    private final String column;
    
    public MansionMapView() {
        
        this.row = "\nEnter row number: ";
        this.column = "\nEnter column number: ";
        this.displayBanner();
    }
        
        public void displayBanner() {
         
        System.out.println 
             ("\n   1    2       3    4     5      6    7"
            + "\n  ---------   ---------   ----   ---------"
            + "\n1| RM | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n2| ?? | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n  ---------   ---------  |    |  --------- "
            + "\n3| ?? | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n4| ?? | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n  ---------   ---------  |    |  --------- "
            + "\n5| ?? | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n6| ?? | ?? | | ?? | ?? | | ?? | | ?? | ?? |"
            + "\n  ---------   ---------   ----   ---------");    
        }
        
         public void display() {
        
            boolean done = false; //set flag to not done
            do {
            //prompt for and get players name
            String row = this.getRow();
            if (row.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            String column = this.getColumn();
            if (column.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(row, column);
                     
            } while (!done);
        }
    
    private String getRow() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.row);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 0) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }

    private String getColumn() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.column);
            
            value = keyboard.nextLine(); //get next line typed one keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 0) { //value is blank
                System.out.println("\nInvalid value: You must enter a value");
                continue;
            }
            
            break; //end the loop
        }
        return value; // return the value entered
    }
    
    public boolean doAction(String row, String column) {
       if (row.equals("-1")) {
           System.out.println("\nInvalid weight: "
                   + "The row entered must be greater than 0");
           return false;
       }
       
       if (column.equals("-1")) {
           System.out.println("\nInvalid poison amount: "
                   + "The column entered must be greater than 0");
           return false;
       }
       
        //double r = Double.parseDouble(row);
        
        //double c = Double.parseDouble(column);
        int r = Integer.parseInt(row);
        int c = Integer.parseInt(column);
       
       //call createPlayer() control function
       ResourceTypeScene scenes = new ResourceTypeScene; 
       Room[r][c].setVisited(true);
             
             
       return true; //success
    }
    }*/

  