package sudoku;

import java.util.Scanner;

/**
 *
 * @author Jessica Marshall
 */
public abstract class MenuLesson9 {
    String [][] menuItems = null;

    public MenuLesson9() {
    }
    
    public MenuLesson9(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
     public abstract String executeCommands(Object object);
    
    public String[][] getMenuItems() {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
       public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
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

    protected final String getCommand() {

        Scanner inFile = Sudoku.GetInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new SudokuError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
   
}