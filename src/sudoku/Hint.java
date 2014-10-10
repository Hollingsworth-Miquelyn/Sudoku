/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Random;

/**
 *
 * @author Jessica
 */
public class Hint {
    private String Hint = "1";
    
    public int getHint(Grid referanceGrid){
        Random randomRow = new Random();
        Random randomColumn = new Random();
        
        //Will be moved into grid when grid class is built and working
        int[][] boardOneAnswer = { {4, 5, 2, 3, 9, 1, 8, 7, 6},
                                   {3, 1, 8, 6, 7, 5, 2, 9, 4},
                                   {6, 7, 9, 4, 2, 8, 3, 1, 5},
                                   {8, 3, 1, 5, 6, 4, 7, 2, 9},
                                   {2, 4, 5, 9, 8, 7, 1, 6, 3},
                                   {9, 6, 7, 2, 1, 3, 5, 4, 8},
                                   {7, 9, 6, 8, 5, 2, 4, 3, 1},
                                   {1, 8, 3, 7, 4, 9, 6, 5, 2},
                                   {5, 2, 4, 1, 3, 6, 9, 8, 7}};
        // The 0s will be the empty spaces the player will fill in there are 28 numbers filled in so it will be a easy game.
        int[][] boardOneEmpty = { {4, 0, 0, 3, 0, 1, 0, 0, 6},
                                  {0, 0, 8, 0, 7, 0, 0, 9, 0},
                                  {0, 0, 0, 4, 0, 0, 3, 0, 0},
                                  {0, 3, 0, 0, 0, 4, 0, 0, 9},
                                  {0, 4, 0, 0, 0, 0, 1, 0, 0},
                                  {0, 0, 0, 2, 0, 3, 0, 4, 0},
                                  {0, 9, 0, 0, 5, 0, 4, 0, 1},
                                  {1, 0, 3, 7, 0, 9, 0, 0, 0},
                                  {0, 0, 0, 1, 0, 0, 9, 0, 7}};
                
        //We will get the board from referanceGrid that is passed from grid class
        double hint = 0;
        int randomRowNumber = 0;
        int randomColumnNumber = 0;
        boolean foundHint = false;
        
        while(foundHint == false) {
            //Choosing a ramdom number between 9 and 1 in a Row
            randomRowNumber = randomRow.nextInt((8 - 0) + 0) + 1;
            
            //Choosing a ramdom number between 9 and 1 in a Column
            randomColumnNumber = randomColumn.nextInt((8 - 0) + 0) + 1;

            int potentialHint = boardOneEmpty[randomRowNumber][randomColumnNumber];
            
            if(potentialHint == 0){
                hint = boardOneAnswer[randomRowNumber][randomColumnNumber];
                foundHint = true;
            }    
        }
        
        int displayedRowNumber = randomRowNumber + 1; // must add one because matrix begins at zero and will now display correct row and column to user
        int displayedColumnNumber = randomColumnNumber + 1;
        
        String hintDisplay = "For Row " + displayedRowNumber + " And Column " + displayedColumnNumber + " the answer is \"" + hint + "\" \n Enjoy your hint";
        System.out.println(hintDisplay);
        
        return (int)hint;
    }
}
