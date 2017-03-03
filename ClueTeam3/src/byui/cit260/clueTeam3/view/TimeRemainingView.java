/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import byui.cit260.clueTeam3.control.TimeControl;
import byui.cit260.clueTeam3.model.Time;

/**
 *
 * @author whitnieschwarz
 */
public class TimeRemainingView extends View {
    
    public TimeRemainingView() {
        super ("\nPlease enter number of rooms passed through:");
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        
        System.out.println(
              "\n************************************************************************"
            + "\n*                                                                      *"        
            + "\n* This is a text-based role play game that is based off of and follows *"
            + "\n* the same storyline line as board game ‘Clue’. The user assumes       *"
            + "\n* the role of a detective in the case of a murder-mystery.             *"
            + "\n*                                                                      *"
            + "\n* The game begins right after the murder of Mr. Boddy, at his large    *"
            + "\n* mansion. The victim was a wealthy and powerful business man, who     *"
            + "\n* knows the weaknesses and secrets of his “friends” and enemies.       *"
            + "\n* Mr. Boddy threatens to exploit these weaknesses and secrets through  *"
            + "\n* blackmail and is murdered shortly after.                             *"
            + "\n*                                                                      *"
            + "\n* To solve the case and win the game, the detective must determine     *"
            + "\n* the answers to the questions: Who murdered Mr. Boddy? Where was he   *"
            + "\n* murdered? What weapon was used? And why did they murder him?         *"
            + "\n*                                                                      *"  
            + "\n************************************************************************"  

        );
    }

    @Override
    public boolean doAction(double value) {
       
       //call calcTotalTime() control function
       Time time = TimeControl.calcTotalTime(value);
       
       if (time == null) { //if unsuccessful
           System.out.println("\nError creating the time.");
           return false;
       }
       
       //display next view
       this.displayNextView(player);
       
       return true; //success
    }

    private void displayNextView(Player player) {
        System.out.println(
                "\n=============================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n============================================"
                );
        
        //create the MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.display();
    
}
