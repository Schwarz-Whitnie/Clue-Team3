/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;
import byui.cit260.clueTeam3.control.CharacterControl;
import clueteam3.ClueTeam3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author catrinalonghurst1
 */

public class PoisonControlView {
      
    private String poisonPrompt;
    private String poisonControl;
    private double timePoison;
    protected final BufferedReader keyboard = ClueTeam3.getInFile();
    protected final PrintWriter console = ClueTeam3.getOutFile();
    
    public PoisonControlView() {
        
        //displays the posion prompt
        this.poisonPrompt = "\nPlease enter the amount of Poison administered to Mr. Boddy:";
        this.displayBanner();
    }
   public void displayBanner() {
        
        System.out.println(
              "\n************************************************************************"
            + "\n*                                                                      *"        
            + "\n* Good job, you helped us figure out how much poison was given to Mr.  *"
            + "\n* Boddy. Using the information gained above, help us determine when    *"
            + "\n  the poison was administered to Mr. Boddy.                            *"
            + "\n                                                                       *"  
            + "\n************************************************************************"  
             );
    }
    
    void displayPoisonPrompt() {
        boolean done = false;
        do{
            String amtPoison = this.getAmountPoison();
            if (amtPoison.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
        done = this.doAction(amtPoison);  
        
        } while (!done);
    }
    
    private String getAmountPoison() {
        String value = ""; //value to be returned
        boolean valid = false;
        try {
        while (!valid) {
            this.console.println("\n" + this.poisonPrompt);
            
            
                value = this.keyboard.readLine();
            
               // Logger.getLogger(PoisonControlView.class.getName()).log(Level.SEVERE, null, ex);
            
            value = value.trim();
            
            if (value.length() < 0) { // value is blank
                ErrorView.display(this.getClass().getName(),"\n Value cannot be blank");
                continue;
            }
            
            break; //end loop
        }
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
        }
        return value; //return the value entered. 
    }

   public boolean doAction(String amtPoison) {
        
       if (amtPoison.equals("68")) {
           ErrorView.display(this.getClass().getName(),"\nInvalid entry. Try again");
           return false;
       } 
        
       double p = Double.parseDouble(amtPoison);
       
       CharacterControl characterControl = new CharacterControl();
       timePoison = CharacterControl.calcTimePoison(p);
       
       this.displayNextView(characterControl);
       return true;
   }
   
   private void displayNextView(CharacterControl characterControl) {
        
       
       this.console.println(
                 "\n=============================================="
               + "\nThe poison was administered " + timePoison +
                 "hours ago. "
               + "\nGood work!"
               + "\n==============================================");
            
   
    }

        
    }



