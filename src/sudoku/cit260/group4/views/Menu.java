
package sudoku.cit260.group4.views;

import sudoku.cit260.group4.views.MainMenuView;
import java.util.Scanner;
import sudoku.controls.Sudoku;
import sudoku.miscellaneous.SudokuError;
import exception.MenuException;
import exception.SudokuException;
import sudoku.miscellaneous.SudokuError;
import sudoku.enums.ErrorType;
//import sudoku.interfaces.DisplayInfo;
//import sudoku.interfaces.EnterInfo;

/**
 *
 * @author Jessica M, Jessica W, Miquelyn, Heidi
 */
public abstract class Menu /*implements DisplayInfo, EnterInfo*/ {
    private String [][] menuItems = null;

    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
     //public abstract String executeCommands(Object object);
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
       public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\tPress Q at any time to go back.");
        System.out.println("\t===============================================================\n");
    }   
       
    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() throws SudokuException {
        
        Scanner inFile = Sudoku.GetInputFile();
        String command;
        boolean valid = false;
        
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                throw new SudokuException(ErrorType.ERROR105.getMessage());  
            }
            return command;
                
        } while (!valid);
        
    }
   
}