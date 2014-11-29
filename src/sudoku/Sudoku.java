

package sudoku;

import sudoku.cit260.group4.views.MainMenuView;
import java.util.Scanner;


/**
 *
 * @author Miquelyn Hollingsworth, Jessica Marshall, Jessica West, Heidi Spackman
 */

public class Sudoku {

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
        Sudoku sudoku = new Sudoku();
                System.out.println("\t===============================================================");
                System.out.println(
                "\tWelcome to Sudoku!!"
                + "\n\tTo play start a new game and select a board you wish to play from and fill in all the entire 9x9 board."
                + "\n\tFill in 1-9 on each column and 1-9 on each row as well as 1-9 on each 3x3 subsquares."
                + "\n\tGood Luck!");
                System.out.println("\t===============================================================\n");
        sudoku.getName();
        sudoku.displayWelcomeUser();
               
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
        sudoku.displayGoodbyUser();
    }
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
