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
public class GameHelpMenuControl {
    public GameHelpMenuControl() {
        
    } 
    public void displayObjectiveHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to place the numbers 1 through 9 in the empty cells. "
                + "\n\tEach number can appear only once in each column and row."
                + "\n\tEach number can appear only once in each 3x3 sub-square."
                +"\n\tTo win the game, all the numbers are filled in correctly"

                ); 
        displayHelpBorder();
    }
     public void displayThreeHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe 3x3 sub-grid will hold the numbers 1 - 9 that cannot be repeated within that sub-grid. "
                + "\n\tPlease keep in mind that the numbers going into any of the "
                + "\n\tnine sub-grids also cannot duplicate any numbers from any rows or columns "
                +"\n\tthat are connected to the 3x3 grid."
                ); 
        displayHelpBorder();
    }
      public void displayNineHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe 9x9 grid is made up of nine 3x3 sub-grids or of nine rows and nine columns. "
                + "\n\tEach row or column can have only one instance of a number from 1 - 9."

                ); 
        displayHelpBorder();
    }
     public void displayError() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA number that must be used in the grid "
                + "\n\thas to be a number from one to nine.  "
                + "\n\tExample: 1,2,3,4,5,6,7,8,9."
                ); 
        displayHelpBorder();
    }
     public void displayHelpBorder() {       
        System.out.println(
        "\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
