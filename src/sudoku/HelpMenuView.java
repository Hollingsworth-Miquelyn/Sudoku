/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author Heidi Spackman, Miquelyn Hollingsworth, Jessica West, Jessical Marshall
 */
public class HelpMenuView {
   
        
    static final String[][] menuItems = {
        {"B", "The Board"},
        {"G", "Sudoku Instructions"},
        {"S", "Score"},
        {"D", "Difficulty Help"},
        {"H", "Hint"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = Sudoku.GetInputFile();
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "S":
                    this.helpMenuControl.displayScoreHelp();
                    break; 
                case "D":
                    this.helpMenuControl.displayDifficultyHelp();
                    break; 
                case "H":
                    this.helpMenuControl.displayHintHelp();
                    break;
                case "Q": 
                    break;
                default: 
                    new SudokuError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
    
