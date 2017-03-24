/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;
import java.util.Objects;
public class DetectiveNotebook implements Serializable {
    
    public String description;
    public boolean accused;
  
  public DetectiveNotebook() {
      
  }  
    
    public DetectiveNotebook(String discription, boolean accused) {
        this.description = discription;
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
    return "DetectiveNotebook" + "description=" + description; 
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
           
    
}
 