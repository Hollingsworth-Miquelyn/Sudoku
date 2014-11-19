/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import java.io.Serializable;
/**
 *
 * @author Miquelyn Hollingsworth
 */
public class MainMenuControl implements Serial{

    public MainMenuControl() {
    }
    
public void newGame() {
        NewGameView newGame = new NewGameView();
        newGame.executeCommands(null);
    }        
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.executeCommands(null);
    }
    
}

