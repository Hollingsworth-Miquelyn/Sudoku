/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Heidi Spackman
 */
public class Boardhint {
    
    
    
    public static void finum () {
         int[][] boardOneAnswer = { {4, 5, 2, 3, 9, 1, 8, 7, 6},
                                   {3, 1, 8, 6, 7, 5, 2, 9, 4},
                                   {6, 7, 9, 4, 2, 8, 3, 1, 5},
                                   {8, 3, 1, 5, 6, 4, 7, 2, 9},
                                   {2, 4, 5, 9, 8, 7, 1, 6, 3},
                                   {9, 6, 7, 2, 1, 3, 5, 4, 8},
                                   {7, 9, 6, 8, 5, 2, 4, 3, 1},
                                   {1, 8, 3, 7, 4, 9, 6, 5, 2},
                                   {5, 2, 4, 1, 3, 6, 9, 8, 7}};
         int value = 9;
         int col = 5;
         int row;
         
        for (row = 0; row < boardOneAnswer.length; row++){
            if (boardOneAnswer[row][col] == value) System.out.println("You have a number " + value);
            else{System.out.println("You dont have a number " + value);
            
            }  
            System.out.println( " on row " + (row+1) + " .");
    }
    } 
}