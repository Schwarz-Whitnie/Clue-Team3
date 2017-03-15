/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;


/**
 *
 * @author Cameron
 */
public class MansionMap implements Serializable {
    
    private int rowCount;
    private int columnCount;
    private Room[][] rooms = new Room[5][5];
    
    // private Game[] game;

    public MansionMap() {
    }
    
    public MansionMap(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.rooms = new Room[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
               // create and initialize new Room object instance
                Room room = new Room();
                room.setColumn(column);
                room.setRow(row);
                room.setVisited(false);
                
                // assign the Room object to the current position in the array 
                rooms[row][column] = room;
        }
    }
    }

     public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    public Room[][] getRooms() {
        return rooms;
    }
    
    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    //public Game[] getGame() {
    //    return game;
    //}

   // public void setGame(Game[] game) {
    //    this.game = game;
    // }    
    
    @Override
    public String toString() {
        return "MansionMap{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.rowCount ^ (this.rowCount >>> 31));
        hash = 37 * hash + (int) (this.columnCount ^ (this.columnCount >>> 31));
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
        final MansionMap other = (MansionMap) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
}
