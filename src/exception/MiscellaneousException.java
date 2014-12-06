/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Jessica
 */
public class MiscellaneousException extends Exception {

    public MiscellaneousException() {
    }

    public MiscellaneousException(String message) {
        super(message);
    }

    public MiscellaneousException(String message, Throwable cause) {
        super(message, cause);
    }

    public MiscellaneousException(Throwable cause) {
        super(cause);
    }
    
}
