/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

import byui.cit260.clueTeam3.model.DetectiveNotebook;
import byui.cit260.clueTeam3.model.RoomEnum;
import byui.cit260.clueTeam3.model.Status;
import byui.cit260.clueTeam3.model.Suspects;
import byui.cit260.clueTeam3.model.Weapon;
import byui.cit260.clueTeam3.view.AmountPoisonView;
import clueteam3.ClueTeam3;

/**
 *
 * @author whitnieschwarz
 */
public class AccusationControl {
    
    public static String makeAnAccusation(String guessRoom, String guessWeapon, String guessSuspect) {
        
        String answerRoom = "Study";
        String answerWeapon = "Poison";
        String answerSuspect = "ColonelMustard";
       
        DetectiveNotebook detectiveNotebook = ClueTeam3.getCurrentGame().getNotebook();
        
        RoomEnum roomEnum = RoomEnum.valueOf(guessRoom);
        Weapon weapon = Weapon.valueOf(guessWeapon);
        Suspects suspects = Suspects.valueOf(guessSuspect);
        
       
        if (guessRoom.equals(answerRoom) && guessWeapon.equals(answerWeapon) && guessSuspect.equals(answerSuspect)) {
            System.out.println("****Correct! You solved the mystery.****");
        }
        if (guessRoom.equals(answerRoom)){
            System.out.println("\n****" + guessRoom + " is guilty!****");
            detectiveNotebook.setRoomStatus(roomEnum, Status.guilty);
        }
        else /*(!guessRoom.equals(answerRoom))*/{
            System.out.println("\n" + guessRoom + " is not guilty.");
            detectiveNotebook.setRoomStatus(roomEnum, Status.not_guilty);
        }
        if (guessWeapon.equals(answerWeapon)){
            System.out.println("\n****" + guessWeapon + " is guilty!****");
            detectiveNotebook.setWeaponStatus(weapon, Status.guilty);
        }
        if (!guessWeapon.equals(answerWeapon)){
            System.out.println("\n" + guessWeapon + " is not guilty.");
            detectiveNotebook.setWeaponStatus(weapon, Status.not_guilty);
        }
        if (guessSuspect.equals(answerSuspect)){
            System.out.println("\n****" + guessSuspect + " is guilty!****");
            detectiveNotebook.setSuspectsStatus(suspects, Status.guilty);
        }
        if (!guessSuspect.equals(answerSuspect)){
            System.out.println("\n" + guessSuspect + " is not guilty.");
            detectiveNotebook.setSuspectsStatus(suspects, Status.not_guilty);
        }
        if (guessWeapon.equals(answerWeapon)){
            AmountPoisonView amountPoisonView = new AmountPoisonView();
            amountPoisonView.display();
        }
        /*else if (guessRoom.equals(answerRoom) || guessWeapon.equals(answerWeapon) || guessSuspect.equals(answerSuspect)) {
            System.out.println("At least one of your accusations is correct!");
        }*/
        //else /*(!guessRoom.equals(answerRoom) || !guessWeapon.equals(answerWeapon) || !guessSuspect.equals(answerSuspect))*/{
          //  System.out.println("Sorry, none of your accusations are correct.");
        //}       
        
        return null;
}
}
