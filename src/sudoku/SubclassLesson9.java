/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author Jessica Marshall
 */
public class SubclassLesson9 extends MenuLesson9 {
    
    static final String[][] menuItems = {
        {"E", "Level Easy"},
        {"M", "Level Medium"},
        {"H", "Level Hard"},
        {"Q", "Quit New Game"},
    };
    //create instance of the NewGameControl (action) class
    private SubclassLesson9 subclassLesson9 = new SubclassLesson9();
    
    //default constructor
    public SubclassLesson9() {
         super(SubclassLesson9.menuItems);
    }
    
    //display new game menu and get end users input selection
    @Override
   public String executeCommands(Object object) {
       
    String command;
        Scanner inFile = Sudoku.GetInputFile();
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    this.subclassLesson9.startEasyGame();
                    break;
                case "M":
                    this.subclassLesson9.startMediumGame();
                    break;
                case "H":
                    this.subclassLesson9.startHardGame();
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

    private void startHardGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startMediumGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startEasyGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
