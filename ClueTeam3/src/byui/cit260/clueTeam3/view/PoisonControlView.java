/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

/**
 *
 * @author catrinalonghurst1
 */
public class PoisonControlView extends View{
      
    private final String poisonControl;

    
    public PoisonControlView() {
        
        //displays the posion prompt
        super("\nPlease enter the amount of Poison missing from "
                + "the vile.");
        
    }
    
    
    @Override
    public boolean doAction(String amtPoison) {
        
        if (amtPoison != 69) {
        System.out.println ("\nInvalid entry. Please try again." );
        return false;
    }
        if (amtPoison == 69) 
        return true;

       
  
    }

    public double doAction(double amtPoison) 
    
    {  
        double poisonPerMinute = 0.05;
        double timePoison = amtPoison / (poisonPerMinute*60);
        timePoison = Math.round (timePoison *10) / 10;
        return timePoison;
    }

        
    }


    