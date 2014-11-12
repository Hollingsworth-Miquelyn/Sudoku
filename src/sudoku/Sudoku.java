

package sudoku;

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
    
    private static Scanner inFile= new Scanner(System.in);
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
        sudoku.getName();
        sudoku.displayWelcomeUser();
               
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        sudoku.displayGoodbyUser();
    }
    public void displayGoodbyUser(){
        System.out.println("\nThanks for playing " + this.name + "\n");
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
