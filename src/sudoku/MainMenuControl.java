/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Miquelyn Hollingsworth
 */
public class MainMenuControl {
    
public void newGame() {
        System.out.println();        
        System.out.println( 
                "\tThis will start the New Game Menu"
                );
    }        
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}

