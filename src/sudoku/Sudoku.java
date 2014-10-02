/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author David
 */
public class Sudoku {
    //instance variables
    private String difficulty = "easy";
    private String playerName = "Sian";

    public void displayDifficulty(){
        System.out.println(difficulty);
    }
    public void displayPlayerName(){
        System.out.println(playerName);
    }
    public static void main(String[] args) {
        //creating and using objects
        Sudoku sudoku = new Sudoku();
        sudoku.displayDifficulty();
        sudoku.displayPlayerName();
        Grid grid = new Grid();
        grid.displaySize();
        grid.displayPosition();
    }
    
}
