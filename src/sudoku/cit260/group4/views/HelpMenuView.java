/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.cit260.group4.views;
import java.io.Serializable;
import java.util.Scanner;
import sudoku.controls.HelpMenuControl;
import sudoku.miscellaneous.Serial;
import sudoku.controls.Sudoku;
import sudoku.miscellaneous.SudokuError;
import sudoku.interfaces.EnterInfo;
import exception.SudokuException;

/**
 *
 * @author Heidi Spackman, Miquelyn Hollingsworth, Jessica West, Jessical Marshall
 */
public class HelpMenuView extends Menu implements EnterInfo {
   
        
    private static final String[][] menuItems = {
        {"B", "The Board"},
        {"I", "Sudoku Instructions"},
        {"S", "Score"},
        {"D", "Difficulty Help"},
        {"H", "Hint"},
        {"Q", "Quit Help"}        
    };
    
    public HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView() {
         super(HelpMenuView.menuItems);    
    }
    
        public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }
    
    public void setHelpMenuControl(HelpMenuControl helpMenuControl){
        this.helpMenuControl = helpMenuControl;
    }
    
    @Override
    public String getInput(Object object) {
              
        String command = null; 
        Scanner inFile = Sudoku.GetInputFile();
        
        do {
            try {
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.displayHelp(Help.BOARD);
                    break;
                case "I":
                    this.displayHelp(Help.INSTRUCTIONS);
                    break;                  
                case "S":
                    this.displayHelp(Help.SCORE);
                    break; 
                case "D":
                    this.displayHelp(Help.DIFFICULTY);
                    break; 
                case "H":
                    this.displayHelp(Help.HINT);
                    break;
                case "Q":
                    break;
                default: 
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("\n + e.getmessage()");
            }
        } while (!command.equals("Q"));  
        
        return command;
    }
    
    private void displayHelp(Help helpText) {
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText.getHelpText());
        System.out.println("\t" + dividerLine.toString());
    }
    
    //nested class to define the text for each help item in the menu
    private enum Help {
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
/*
        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
*/  
    
}
    
