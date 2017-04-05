/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import byui.cit260.clueTeam3.exeptions.GameControlException;
import java.io.Serializable;
import java.util.Objects;
public class DetectiveNotebook implements Serializable {
    
    public String description;
    private Status[] weaponStatus = new Status [8];
    private Status[] roomStatus = new Status [9];
    private Status[] suspectsStatus = new Status [6];
    
  public DetectiveNotebook() {
      
      
      for (int i = 0; i < roomStatus.length; i++) {
        roomStatus[i] = Status.not_accused;
        }
      for (int i = 0; i < weaponStatus.length; i++) {
        weaponStatus[i] = Status.not_accused;
        }
      for (int i = 0; i < suspectsStatus.length; i++) {
        suspectsStatus[i] = Status.not_accused;
        }
  }  

     public DetectiveNotebook(String description, boolean accused) {
        this.description = description;
    }

    public Status getRoomStatus(RoomEnum roomEnum) {
        return roomStatus[roomEnum.ordinal()];
    }

    public void setRoomStatus(RoomEnum roomEnum, Status status) {
        roomStatus[roomEnum.ordinal()] = status;
    }

    public Status getWeaponStatus(Weapon weapon) {
        return weaponStatus[weapon.ordinal()];
    }

    public void setWeaponStatus(Weapon weapon, Status status) {
        weaponStatus[weapon.ordinal()] = status;
    }
    
    public Status getSuspectsStatus(Suspects suspects) {
        return suspectsStatus[suspects.ordinal()];
    }

    public void setSuspectsStatus(Suspects suspects, Status status) {
        suspectsStatus[suspects.ordinal()] = status;
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

    /*public boolean isAccused() {
        return accused;
    }

    public void setAccused(boolean accused) {
        this.accused = accused;
    }*/
    

    @Override
    public String toString() {
    return "DetectiveNotebook" + "description=" + description; 
}

    @Override 
     public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.weaponStatus);
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
        if (!Objects.equals(this.weaponStatus, other.weaponStatus)) {
            return false;
        }
        return true;
    }
           
    
}
 