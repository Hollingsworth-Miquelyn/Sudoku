

package sudoku.controls;

import sudoku.cit260.group4.views.MainFrame;
import sudoku.cit260.group4.views.MainMenuView;
import java.util.Scanner;
import exception.SudokuException;
import sudoku.enums.ErrorType;
import sudoku.cit260.group4.views.MainFrame;
import sudoku.cit260.group4.views.NewGameFrame;


/**
 *
 * @author Miquelyn Hollingsworth, Jessica Marshall, Jessica West, Heidi Spackman
 */

public class Sudoku {
    private static MainFrame mainFrame;
    public static NewGameFrame newGameFrame;

    public static Scanner getInFile() {
        return inFile;
    }

    public static void setInFile(Scanner inFile) {
        Sudoku.inFile = inFile;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    static Scanner inFile= new Scanner(System.in);
    private String name;

    public static Scanner GetInputFile(){
        return Sudoku.inFile;
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        this.name = input.next();
    }
    public void displayWelcomeUser(){
        System.out.println("\nWelcome " + this.name + "\n");
    }
    
    public static void main(String[] args) {    
        Sudoku sudoku = null;
        try {
            sudoku = new Sudoku();
           
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Sudoku.mainFrame = new MainFrame();
                    
                    Sudoku.mainFrame.setVisible(true);
                }
            });
        }
        catch (Throwable ex){
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());
        }
        finally {
            if (Sudoku.mainFrame != null) {
                Sudoku.mainFrame.dispose();
            }
        }
    }
        
        
        
        
/*        
                System.out.println("\t========================================================================");
                System.out.println(
                "\tWelcome to Sudoku!!"
                + "\n\tTo play start a new game and select a board you wish to play from."
                + "\n\tFill in 1-9 on each column, 1-9 on each row, 1-9 on each 3x3 subsquares."
                + "\n\tGood Luck!");
                System.out.println("\t========================================================================\n");
        sudoku.getName();
        sudoku.displayWelcomeUser();
               
        MainMenuView mainMenu = new MainMenuView();
        try {
        mainMenu.getInput(null);
        }
        catch (Throwable ex){
            System.out.println(ErrorType.ERROR108.getMessage());
        }
        finally {
    //Change later to not close game when there is an error in corrdinates        
    Sudoku.inFile.close();
    }
        sudoku.displayGoodbyUser();
    }
*/
      
    public void displayGoodbyUser(){
        System.out.println("\n\tThanks for playing " + this.name + "!\n");
    }
private class GetName{
    private String name;
    
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        this.name = input.next();
    }
}

}
