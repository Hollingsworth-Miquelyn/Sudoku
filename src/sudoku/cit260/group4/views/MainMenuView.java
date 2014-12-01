/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.cit260.group4.views;
import java.io.Serializable;
import java.util.Scanner;
import sudoku.controls.MainMenuControl;
import sudoku.Serial;
import sudoku.controls.Sudoku;
import sudoku.SudokuError;
import sudoku.interfaces.EnterInfo;
/**
 *
 * @author Miquelyn Hollingsworth
 */
public class MainMenuView extends Menu implements EnterInfo {                 
    
    static final String[][] menuItems = {
        {"N", "New Game"},
        {"H", "Help"},
        {"Q", "Quit Sudoku"}      
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
         super(MainMenuView.menuItems);
    }
        
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
   @Override
    public String getInput(Object object) {       

        String command;
        Scanner inFile = Sudoku.GetInputFile();
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "N":
                    this.mainMenuControl.newGame();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "Q":
                    break;
                default: 
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;                    
            }
        } while (!command.equals("Q"));

        return command;
    }
/*
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }   
 */  

    
}
