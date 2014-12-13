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
    BOARD ("The game board for Sudoku consist of a 9x9 grid"
                + "twith nine 3x3 subgrids. A Player fills in all empty cells wtih "
                + "1 through 9."),
    INSTRUCTIONS ("The objective of the game is to place the numbers 1 through 9 in the empty cells. "
        + "Each number can appear only once in each column and row."
        + "Each number can appear only once in each 3x3 sub-square."),
    SCORE ("Each second is worth 1 point. You start with 6,000 points. "
        + "For every second it takes you to complete the game, the "
        + "score will decrease 1 point.."),
    DIFFICULTY ("The game board for Sudoku consist of a 9x9 grid"
        + "with nine 3x3 subgrids. A Player fills in all empty cells wtih "
        + "1 through 9. When a level is chosen, numbers are filled into the"
        + "playing board. The user then fills in the rest of the board."
        + "Easy: 28 cells filled"
        + "Medium: 24 cells filled"
        + "Hard: 20 cells filled"),
    HINT ("If player becomes stuck while playing press the Hint button"
        + "and the board will automatically fill in one cell for you."),
    QUIT ("Quit");  
    
    String helpText;
    
    private Help(String helpText) {
        this.helpText = helpText;
    }
    
    public String getHelpText() {
        return helpText;
    }
    
}
