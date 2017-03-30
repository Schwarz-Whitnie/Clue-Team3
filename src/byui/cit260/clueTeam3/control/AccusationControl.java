/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.control;

/**
 *
 * @author whitnieschwarz
 */
public class AccusationControl {
    
    public static String makeAnAccusation(String guessRoom, String guessWeapon, String guessSuspect) {
        
        String answerRoom = "Study";
        String answerWeapon = "Poison";
        String answerSuspect = "Colonel Mustard";
        
        if (guessRoom.equals(answerRoom) && guessWeapon.equals(answerWeapon) && guessSuspect.equals(answerSuspect)) {
            System.out.println("****Correct! You solved the mystery.****");
        }
        if (guessRoom.equals(answerRoom)){
            System.out.println("\n****" + guessRoom + " is guilty!****");
        }
        if (!guessRoom.equals(answerRoom)){
            System.out.println("\n" + guessRoom + " is not guilty.");
        }
        if (guessWeapon.equals(answerWeapon)){
            System.out.println("\n****" + guessWeapon + " is guilty!****");
        }
        if (!guessWeapon.equals(answerWeapon)){
            System.out.println("\n" + guessWeapon + " is not guilty.");
        }
        if (guessSuspect.equals(answerSuspect)){
            System.out.println("\n****" + guessSuspect + " is guilty!****");
        }
        if (!guessSuspect.equals(answerSuspect)){
            System.out.println("\n" + guessSuspect + " is not guilty.");
        }
        /*else if (guessRoom.equals(answerRoom) || guessWeapon.equals(answerWeapon) || guessSuspect.equals(answerSuspect)) {
            System.out.println("At least one of your accusations is correct!");
        }*/
        else /*(!guessRoom.equals(answerRoom) || !guessWeapon.equals(answerWeapon) || !guessSuspect.equals(answerSuspect))*/{
            System.out.println("Sorry, none of your accusations are correct.");
        }       
        
        return null;
}
}