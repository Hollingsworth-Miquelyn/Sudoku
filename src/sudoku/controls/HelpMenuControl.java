/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.controls;
import exception.SudokuException;
import java.io.Serializable;
import sudoku.enums.ErrorType;
import sudoku.miscellaneous.Serial;
import  sudoku.enums.Help;
import static sudoku.enums.Help.INSTRUCTIONS;
/**
 *
 * @author Miquelyn
 */
public class HelpMenuControl implements Serial {
    
    public String getHelpText(Help command) throws SudokuException{ 
        String helpText = "";
        switch (command) {
            case BOARD:
            case INSTRUCTIONS:
            case SCORE:
            case DIFFICULTY:
            case HINT:
            case QUIT:
                helpText = command.getHelpText();
                break;
            default:
                throw new SudokuException(ErrorType.ERROR105.getMessage());
        }
        return helpText;
    }
    
    /*
    public HelpMenuControl() {
        
    } 
//Group - Heidi Spackman, Miquelyn Hollingsworth, Jessica West, Jessica Marshall 
    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku consist of a 9x9 grid"
                + "\n\twith nine 3x3 subgrids. A Player fills in all empty cells wtih "
                + "\n\t1 through 9.");
        displayHelpBorder();
    }
    
    //Jessica West Lesson 4 Individual Function
     public void displayDifficultyHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Sudoku consist of a 9x9 grid"
                + "\n\twith nine 3x3 subgrids. A Player fills in all empty cells wtih "
                + "\n\t1 through 9. When a level is chosen, numbers are filled into the"
                + "\n\tplaying board. The user then fills in the rest of the board."
                + "\n\tEasy: 28 cells filled"
                + "\n\tMedium: 24 cells filled"
                + "\n\tHard: 20 cells filled");
        displayHelpBorder();
    }
    //Jessica Marshall Lesson 4 Individual Function
      public void displayHintHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tIf player becomes stuck while playing press the Hint button"
                + "\n\tand the board will automatically fill in one cell for you.");
        displayHelpBorder();
    }
     
     //Heidi Spackman Lesson 4 Individual Function   Instructions
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to place the numbers 1 through 9 in the empty cells. "
                + "\n\tEach number can appear only once in each column and row."
                + "\n\tEach number can appear only once in each 3x3 sub-square."

                ); 
        displayHelpBorder();
    }
            
                      
              
   
     //Miquelyn Hollingsworth Lesson 4 Individual Funtion            
    public void displayScoreHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\n\tEach second is worth 1 point. You start with 6,000 points. "
                + "\n\tFor every second it takes you to complete the game, the "
                + "\n\tscore will decrease 1 point.."
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
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  */

    
}


    

