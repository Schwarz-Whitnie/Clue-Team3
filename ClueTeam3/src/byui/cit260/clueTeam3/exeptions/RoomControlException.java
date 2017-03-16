/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.clueTeam3.exeptions;

/**
 *
 * @author catrinalonghurst1
 */
public class RoomControlException extends Exception {

    public RoomControlException() {
    }

    public RoomControlException(String message) {
        super(message);
    }

    public RoomControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RoomControlException(Throwable cause) {
        super(cause);
    }

    public RoomControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
