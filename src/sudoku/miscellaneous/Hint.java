
package sudoku.miscellaneous;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Jessica Marshall
 */
public class Hint implements Serial{

    public Hint() {
    }
    
    
    
    public String getHint(int[][] ourEmptyBoard, int[][] ourAnswerBoard){
        Random randomRow = new Random();
        Random randomColumn = new Random();
                
        //We will get the board from referanceGrid that is passed from grid class
        String hint = "";
        int randomRowNumber = 0;
        int randomColumnNumber = 0;
        boolean foundHint = false;
        
        while(foundHint == false) {
            //Choosing a ramdom number between 9 and 1 in a Row
            randomRowNumber = randomRow.nextInt((8 - 0) + 0) + 1;
            
            //Choosing a ramdom number between 9 and 1 in a Column
            randomColumnNumber = randomColumn.nextInt((8 - 0) + 0) + 1;

            int potentialHint = ourEmptyBoard[randomRowNumber][randomColumnNumber];
            
            if(potentialHint == 0){
                hint = ourAnswerBoard[randomRowNumber][randomColumnNumber]+"";
                foundHint = true;
            }    
        }
        
        int displayedRowNumber = randomRowNumber + 1; // must add one because matrix begins at zero and will now display correct row and column to user
        int displayedColumnNumber = randomColumnNumber + 1;
        
        String hintDisplay = "\n???????????????????????????????????????\nFor Row " + displayedRowNumber + " And Column " + displayedColumnNumber + " the answer is " + hint + "\n???????????????????????????????????????";
        
        return hintDisplay;    
    }
}
