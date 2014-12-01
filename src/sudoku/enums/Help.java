/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.enums;

/**
 *
 * @author Jessica, Miquelyn, Heidi, Jessica
 */
public enum Help {
    BOARD ("\tThe game board for Sudoku consist of a 9x9 grid"
                + "\n\twith nine 3x3 subgrids. A Player fills in all empty cells wtih "
                + "\n\t1 through 9."),
    INSTRUCTIONS ("\tThe objective of the game is to place the numbers 1 through 9 in the empty cells. "
        + "\n\tEach number can appear only once in each column and row."
        + "\n\tEach number can appear only once in each 3x3 sub-square."),
    SCORE ("\tEach second is worth 1 point. You start with 6,000 points. "
        + "\n\tFor every second it takes you to complete the game, the "
        + "\n\tscore will decrease 1 point.."),
    DIFFICULTY ("\tThe game board for Sudoku consist of a 9x9 grid"
        + "\n\twith nine 3x3 subgrids. A Player fills in all empty cells wtih "
        + "\n\t1 through 9. When a level is chosen, numbers are filled into the"
        + "\n\tplaying board. The user then fills in the rest of the board."
        + "\n\tEasy: 28 cells filled"
        + "\n\tMedium: 24 cells filled"
        + "\n\tHard: 20 cells filled"),
    HINT ("\n\tIf player becomes stuck while playing press the Hint button"
        + "\n\tand the board will automatically fill in one cell for you."),
    QUIT ("Quit");  
    
    String helpText;
    
    private Help(String helpText) {
        this.helpText = helpText;
    }
    
    public String getHelpText() {
        return helpText;
    }
    
}
