/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.controls;
import sudoku.cit260.group4.views.NewGameView;
import sudoku.cit260.group4.views.HelpMenuView;
import java.io.Serializable;
import sudoku.Serial;
/**
 *
 * @author Miquelyn Hollingsworth
 */
public class MainMenuControl implements Serial{

    public MainMenuControl() {
    }
    
    public void newGame() {
        NewGameView newGame = new NewGameView();
        newGame.getInput(null);
    }      
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView() {};
        helpMenu.getInput(null);
    }
}