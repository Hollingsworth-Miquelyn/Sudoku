/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku.cit260.group4.views;

import java.util.Scanner;
import java.io.Serializable;
import sudoku.Board;
import sudoku.controls.PlayGameControl;
import sudoku.Serial;
import sudoku.controls.Sudoku;
import sudoku.SudokuError;
/**
 *
 * @author Jessica Marshall
 */
public class PlayGameView implements Serial {
    static final String[][] menuItems = {
        {"C", "Enter Coordinates and Answer"},
        {"H", "Request Hint"},
        {"Q", "Quit Game"},
    };
    //create instance of the PlayGameControl (action) class
    private PlayGameControl playGameControl = new PlayGameControl();
    
    //default constructor
    public PlayGameView() {
        
    }

    public PlayGameControl getPlayGameControl() {
        return playGameControl;
    }

    public void setPlayGameControl(PlayGameControl playGameControl) {
        this.playGameControl = playGameControl;
    }
        
    //Play Game Menu and Board
   public void getInput(Board userBoard) {
       
    String command;
        Scanner inFile = Sudoku.GetInputFile();
        
        do {
            
            this.display(userBoard); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "C":
                    this.playGameControl.enterCoordinates(userBoard);
                    break;
                case "H":
                    this.playGameControl.requestHint(userBoard);
                    break;
                case "Q":
                    break;
                default:
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));
        
        return;
   }
   
   //displays the game menu and board
   public final void display(Board userBoard) {
        System.out.println("\n\t      1  2  3  4  5  6  7  8  9");  //this is adding x axis coodinates
        System.out.println("\t    -----------------------------");       
        int ourBoard[][] = userBoard.getBoard();
        for (int i = 0; i < 9; i ++) {// row
            System.out.print("\t" + (i+1) + "  |  ");//this is adding y axis coodinates
            for (int j = 0; j < 9; j++) {//column
                if(ourBoard[i][j] != 0) {
                    System.out.printf("%-3s",ourBoard[i][j]);
                }
                else {
                    System.out.printf("%-3s","_");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("\t    ----------------------------\n");
        
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < PlayGameView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
