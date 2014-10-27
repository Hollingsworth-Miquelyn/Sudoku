/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Jessical Marshall
 */

public class Board {
    int[][] boardEasyAnswer = {{4, 5, 2, 3, 9, 1, 8, 7, 6},
                               {3, 1, 8, 6, 7, 5, 2, 9, 4},
                               {6, 7, 9, 4, 2, 8, 3, 1, 5},
                               {8, 3, 1, 5, 6, 4, 7, 2, 9},
                               {2, 4, 5, 9, 8, 7, 1, 6, 3},
                               {9, 6, 7, 2, 1, 3, 5, 4, 8},
                               {7, 9, 6, 8, 5, 2, 4, 3, 1},
                               {1, 8, 3, 7, 4, 9, 6, 5, 2},
                               {5, 2, 4, 1, 3, 6, 9, 8, 7}};
    // The 0s will be the empty spaces the player will fill in there are 28 numbers filled in so it will be a easy game.
    int[][] boardEasyEmpty = { {4, 0, 0, 3, 0, 1, 0, 0, 6},
                              {0, 0, 8, 0, 7, 0, 0, 9, 0},
                              {0, 0, 0, 4, 0, 0, 3, 0, 0},
                              {0, 3, 0, 0, 0, 4, 0, 0, 9},
                              {0, 4, 0, 0, 0, 0, 1, 0, 0},
                              {0, 0, 0, 2, 0, 3, 0, 4, 0},
                              {0, 9, 0, 0, 5, 0, 4, 0, 1},
                              {1, 0, 3, 7, 0, 9, 0, 0, 0},
                              {0, 0, 0, 1, 0, 0, 9, 0, 7}};
   
    int [][] boardMediumAnswer = {{9, 2, 5, 6, 3, 1, 8, 4, 7},
                                  {6, 1, 8, 5, 7, 4, 2, 9, 3},
                                  {3, 7, 4, 9, 8, 2, 5, 6, 1},
                                  {7, 4, 9, 8, 2, 6, 1, 3, 5},
                                  {8, 5, 2, 4, 1, 3, 9, 7, 6},
                                  {1, 6, 3, 7, 9, 5, 4, 8, 2},
                                  {2, 8, 7, 3, 5, 9, 6, 1, 4},
                                  {4, 9, 1, 2, 6, 7, 3, 5, 8},
                                  {5, 3, 6, 1, 4, 8, 7, 2, 9}};
    
    int[][] boardMediumEmpty = { {9, 0, 0, 6, 0, 0, 8, 0, 0},
                                 {0, 1, 0, 0, 7, 0, 0, 9, 0},
                                 {0, 0, 4, 9, 0, 2, 0, 0, 1},
                                 {7, 0, 0, 8, 0, 0, 1, 0, 0},
                                 {0, 5, 0, 0, 1, 0, 0, 7, 0},
                                 {1, 0, 3, 0, 0, 5, 0, 0, 2},
                                 {2, 0, 0, 3, 0, 0, 6, 0, 0},
                                 {0, 9, 0, 0, 6, 0, 0, 5, 0},
                                 {0, 0, 6, 0, 0, 8, 7, 0, 9}};
    
    int[][] boardHardAnswers = {{9, 6, 3, 1, 7, 4, 2, 5, 8},
                                {1, 7, 8, 3, 2, 5, 6, 4, 9},
                                {2, 5, 4, 6, 8, 9, 7, 3, 1},
                                {8, 2, 1, 4, 3, 7, 5, 9, 6},
                                {4, 9, 6, 8, 5, 2, 3, 1, 7},
                                {7, 3, 5, 9, 6, 1, 8, 2, 4},
                                {5, 8, 9, 7, 1, 3, 4, 6, 2},
                                {3, 1, 7, 2, 4, 6, 9, 8, 5},
                                {6, 4, 2, 5, 9, 8, 1, 7, 3}};
    
    int[][] boardHardEmpty = {{9, 0, 0, 0, 0, 0, 2, 0, 0},
                              {0, 7, 0, 0, 0, 0, 0, 4, 0},
                              {0, 0, 4, 0, 0, 0, 0, 0, 1},
                              {8, 0, 0, 4, 0, 0, 0, 0, 0},
                              {0, 9, 0, 0, 5, 0, 0, 0, 0},
                              {0, 0, 5, 0, 0, 1, 0, 0, 0},
                              {0, 0, 0, 7, 0, 0, 4, 0, 0},
                              {0, 0, 0, 0, 4, 0, 0, 8, 0},
                              {0, 0, 0, 0, 8, 0, 0, 0, 3}};
    
    private int[][] chosenBoard;
    private int[][] chosenAnswerBoard;

    public void setBoard(String boardDifficulty) {
        switch (boardDifficulty) {
            case "E":
                this.chosenBoard = boardEasyEmpty;
                this.chosenAnswerBoard = boardEasyAnswer;
                break;
            case "M":
                this.chosenBoard = boardMediumEmpty;
                this.chosenAnswerBoard = boardMediumAnswer;            
                break;
            case "H":
                this.chosenBoard = boardEasyEmpty;
                this.chosenAnswerBoard = boardEasyAnswer;
                break;
            default: 
                new SudokuError().displayError("Invalid command. Please enter a valid command.");                  
        }
    }
    
    public void setCoordinates(int xCoordinate, int yCoordinate, int answer) {
        this.chosenBoard[xCoordinate][yCoordinate] = answer;
    }

    public int[][] getBoard(){
        return chosenBoard;
    }

    public int[][] getAnswerBoard(){
        return chosenAnswerBoard;
    }
    
    
/*
    
    @author Miquelyn Hollingsworth, Jessica Marshall, Jessica West, Heidi Spackman
    
    
    public int rowCount = 9;
    public int columnCount = 9;
   
    public Location[][] boardLocations;

    public Board() {
    }

    public Board(int noRows, int noColumns) {
  
        this.createBoardLocations(noRows, noColumns);
    }


    public void createBoardLocations(int noRows, int noColumns) {
        this.rowCount= noRows;
        this.columnCount= noColumns;
        
        // add locations to the board
        this.boardLocations = new Location[noRows][noColumns];
        for (int row = 0; row < noRows; row++) { // for every row
            // for every column in the row
            for (int column = 0; column < noColumns; column++) { 
                this.boardLocations[row][column] = new Location();           
            }            
        }   
    }
    
    
    public void clearTheBoard() {
        // add locations to the board
        for (int row = 0; row < this.rowCount; row++) {
            for (int column = 0; column < this.columnCount; column++) {
                Location location = this.boardLocations[row][column];
                location.player = null;           
            }            
        }    
    }

    public void occupyLocation(Player player, int row, int column) {
        Location location = this.boardLocations[row][column];
        
        if ( location.player != null) { // location already occupied
            new SudokuError().displayError("This location is already occupied. "
                    + "Try a different location.");
        }
        
        location.player = player;
    }
*/

}
