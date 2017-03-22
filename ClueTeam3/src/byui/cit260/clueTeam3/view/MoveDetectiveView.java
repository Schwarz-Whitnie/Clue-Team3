/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.MapControl;
import byui.cit260.clueTeam3.exeptions.MapControlException;
import byui.cit260.clueTeam3.model.Detective;
import java.awt.Point;

/**
 *
 * @author whitnieschwarz
 */
public class MoveDetectiveView extends View {
   
    public MoveDetectiveView() {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Select Detective to move                       |"
            + "\n---------------------------------------------"
            + "\nL - Detective");
    }

    @Override
    public boolean doAction(String choice)  {
        Detective detective = null;
        
        try {
            Point coordinates = null;
            MapControl.moveDetectiveToLocation(detective, coordinates);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
    
        ErrorView.display("MoveDetectiveView", "Invalid Selection");
        return false;
    
    }


   
    
}

