/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;
import static sudoku.HelpMenuView.menuItems;
/**
 *
 * @author Miquelyn Hollingsworth
 */
public class NewGameView {
    
    static final String[][] menuItems = {
        {"E", "Level Easy"},
        {"M", "Level Medium"},
        {"H", "Level Hard"},
        {"Q", "Quit New Game"},
    };
    //create instance of the NewGameControl (action) class
    private NewGameControl newGameControl = new NewGameControl();
    
    //default constructor
    public NewGameView() {
        
    }
    
    //display new game menu and get end users input selection
   public void getInput() {
       
    String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    this.newGameControl.startEasyGame();
                    break;
                case "M":
                    this.newGameControl.startMediumGame();
                    break;
                case "H":
                    this.newGameControl.startHardGame();
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
   
   //displays the new game menu
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < NewGameView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}