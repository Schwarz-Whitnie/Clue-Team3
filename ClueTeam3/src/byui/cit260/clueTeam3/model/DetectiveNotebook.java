/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.model;

import java.io.Serializable;
import java.util.Objects;

public class DetectiveNotebook implements Serializable {
    
    private String description;
    private double rowCount;
    private double columnCount;
    private DetectiveNotebook[] notebook;
    private String roomsNotebook;
    private boolean accused;

    private Game[] game;

    public DetectiveNotebook() {

}
    private static DetectiveNotebook[] createDetectiveNotebook() {
        // create and array(list of detective notebook items
        
        DetectiveNotebook[] notebook = new DetectiveNotebook[8];
        
        DetectiveNotebook candlestick = new DetectiveNotebook();
        candlestick.setAccused(false);
        notebook[Weapon.candlestick.ordinal()] = candlestick;
        
        DetectiveNotebook knife = new DetectiveNotebook();
        knife.setAccused(false);
        notebook[Weapon.knife.ordinal()] = knife;
        
        DetectiveNotebook rope = new DetectiveNotebook();
        rope.setAccused(false);
        notebook[Weapon.rope.ordinal()] = rope;
        
        DetectiveNotebook dumbbell = new DetectiveNotebook();
        dumbbell.setAccused(false);
        notebook[Weapon.dumbbell.ordinal()] = dumbbell;
        
        DetectiveNotebook poison = new DetectiveNotebook();
        poison.setAccused(false);
        notebook[Weapon.poison.ordinal()] = poison;
        
        DetectiveNotebook leadPipe = new DetectiveNotebook();
        leadPipe.setAccused(false);
        notebook[Weapon.leadPipe.ordinal()] = leadPipe;
        
        DetectiveNotebook revolver = new DetectiveNotebook();
        revolver.setAccused(false);
        notebook[Weapon.revolver.ordinal()] = revolver;
        
        DetectiveNotebook wrench = new DetectiveNotebook();
        wrench.setAccused(false);
        notebook[Weapon.wrench.ordinal()] = wrench;
        
        return null;
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
    public boolean isAccused() {
        return accused;
    }

    public void setAccused(boolean accused) {
        this.accused = accused;
    }

    public String getDescription() {
    return description;
}

    public void setDescription(String description) {
    this.description = description;
}

    @Override
    public String toString() {
    return "DetectiveNotebook" + "description=" + description; 
}

    @Override 
    public int hashCode() {
    int hash = 7;
    hash = 53 * hash + Objects.hashCode(this.description);
       
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
        return true;
    }
            

    public void setCoordinates(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
 