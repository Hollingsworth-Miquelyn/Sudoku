/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author Heidi Spackman
 */
public class GameHelpMenuView {
     private final static String[][] menuItems = {
        {"1", "Objective"},
        {"2", "How To Fill A 3x3 Grid"},
        {"3", "How TO Fill A 9x9 Grid"},
        {"Q", "Quit Help"}        
    };
    
    private GameHelpMenuControl gameHelpMenuControl = new GameHelpMenuControl();
    
    public GameHelpMenuView() {
        
    } 
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.gameHelpMenuControl.displayObjectiveHelp();
                    break;
                case "2":
                    this.gameHelpMenuControl.displayThreeHelp();
                    break;                  
                case "3":
                    this.gameHelpMenuControl.displayNineHelp();
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

    public final void display() {
        System.out.println("\n\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameHelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    }
    
}
