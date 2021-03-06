/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;



/**
 *
 * @author whitnieschwarz
 */
public enum RoomEnum implements Serializable {
    
    BillardRoom("Billard Room"),
    Ballroom("Ballroom"),
    Library("Library"),
    Study("Study"),
    Hall("Hall"),
    Lounge("Lounge"),
    DiningRoom("Dining Room"),
    Kitchen("Kitchen"),
    Conservatory("Conservatory");
    
    private String description;
    private String status;
    public String accused;
 
     public String getAccused() {
        return accused;
    }

    public void setAccused(String accused) {
        this.accused = accused;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Room[] room;

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }
    RoomEnum() {
        
    }
    RoomEnum(String description) {
        this.description = description;
                }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Room{" + "description=" + description + "}";
    }
}
    

