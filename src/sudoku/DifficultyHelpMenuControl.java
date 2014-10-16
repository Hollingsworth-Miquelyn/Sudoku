/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author: Jessica West
 */
public class DifficultyHelpMenuControl  {
      
    public DifficultyHelpMenuControl() {
        
    } 
 
        public void displayHelpHard() {
        System.out.println();
        displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku consist of a 9x9 grid with nine 3x3 subgrids. "
                + "\n\tA Player fills in all empty cells with numbers 1 through 9"
                + "\n\tWhen the easy level is selected, 20 numbers are already filled into the playing board."
                + "\n\tThe user would then fill in the rest of the blank cells.");
        displayHelpBorder();
    }
        
        public void displayHelpMedium() {
        System.out.println();
        displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku consist of a 9x9 grid with nine 3x3 subgrids. "
                + "\n\tA Player fills in all empty cells with numbers 1 through 9"
                + "\n\tWhen the easy level is selected, 24 numbers are already filled into the playing board."
                + "\n\tThe user would then fill in the rest of the blank cells.");
        displayHelpBorder();
    }
        public void displayHelpEasy() {
        System.out.println();
        displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku consist of a 9x9 grid with nine 3x3 subgrids. "
                + "\n\tA Player fills in all empty cells with numbers 1 through 9"
                + "\n\tWhen the easy level is selected, 28 numbers are already filled into the playing board."
                + "\n\tThe user would then fill in the rest of the blank cells.");
        displayHelpBorder();
    }
        public void displayHelpBorder() {       
        System.out.println(
        "\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}