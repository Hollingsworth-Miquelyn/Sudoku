
package sudoku;
import java.io.Serializable;

import java.util.Scanner;

/**
 *
 * @author Jessica Marshall
 */
public class PlayGameControl implements Serial{
    static final String[][] menuItems = {
        {"X", "Enter X Coordinate"},
        {"Y", "Enter Y Coordnate"},
        {"A", "Enter Answer"},
    };
    
    public PlayGameControl() {
        
    }
    
    public void enterCoordinates(Board userBoard) {
        String command, xCoordinate, yCoordinate, answer;
        
        System.out.println("Enter Column Coordinate:");
        
        Scanner inFile = new Scanner(System.in);
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        xCoordinate = command;
        
        System.out.println("Enter Row Coordinate:");
        
        inFile = new Scanner(System.in);
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        yCoordinate = command;
        
        System.out.println("Enter Your Answer:");
        
        inFile = new Scanner(System.in);
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        answer = command;
        
        int newXCoordinate = Integer.parseInt(xCoordinate);
        int newYCoordinate = Integer.parseInt(yCoordinate);
        int newAnswer = Integer.parseInt(answer);
        
        //Update the users board with their answer
        userBoard.setCoordinates(newYCoordinate - 1, newXCoordinate - 1, newAnswer);
    }
    
    public void requestHint(Board userBoard) {
        Hint findingHint = new Hint();
        //Get a random hint from the answer board that was not filled by user
        String ourHint = findingHint.getHint(userBoard.getBoard(), userBoard.getAnswerBoard());
        System.out.println(ourHint);
    }
}
