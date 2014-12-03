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
public class SudokuException extends Exception {

    /**
     * Creates a new instance of <code>SudokuException</code> without detail
     * message.
     */


    public SudokuException() {
    }

    public SudokuException(String message) {
        super(message);
    }

    public SudokuException(String message, Throwable cause) {
        super(message, cause);
    }

    public SudokuException(Throwable cause) {
        super(cause);
    }
    
}
