/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Scanner;

/**
 *
 * @author Jessica West
 */
public class DifficultyHelpMenuView {
     private final static String[][] menuItems = {
        {"H", "Hard"},
        {"M", "Medium"},
        {"E", "Easy"},
        {"Q", "Quit Help"}        
    };
    
    private DifficultyHelpMenuControl difficultyHelpMenuControl = new DifficultyHelpMenuControl();
    
    public DifficultyHelpMenuView() {
        
    } 
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "H":
                    this.difficultyHelpMenuControl.displayHelpHard();
                    break;
                case "M":
                    this.difficultyHelpMenuControl.displayHelpMedium();
                    break;                  
                case "E":
                    this.difficultyHelpMenuControl.displayHelpEasy();
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

        for (int i = 0; i < DifficultyHelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    }
    
}