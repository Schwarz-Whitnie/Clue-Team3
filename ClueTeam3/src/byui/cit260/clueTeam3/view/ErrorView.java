/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.view;

import clueteam3.ClueTeam3;
import java.io.PrintWriter;

/**
 *
 * @author whitnieschwarz
 */
public class ErrorView {
    
       private static final PrintWriter errorFile = ClueTeam3.getOutFile();
   private static final PrintWriter logFile = ClueTeam3.getLogFile();

   public static void display(String className, String errorMessage) {

       errorFile.println(
                   "-------------------------------------------------------"
                 + "\n- ERROR - " + errorMessage
                 + "\n-------------------------------------------------------");

        // log error
        logFile.println(className + " - " +  errorMessage); 
    }
    
}
