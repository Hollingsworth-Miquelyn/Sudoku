/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Jessica, Miquelyn, Heidi, Jessica
 */

public class PlayException extends Exception {

    public PlayException() {
    }

    public PlayException(String message) {
        super(message);
    }

    public PlayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayException(Throwable cause) {
        super(cause);
    }
    
}
