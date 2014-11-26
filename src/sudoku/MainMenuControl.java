/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
import sudoku.cit260.group4.views.NewGameView;
import sudoku.cit260.group4.views.HelpMenuView;
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
        HelpMenuView helpMenu = new HelpMenuView() {

            @Override
            public String executeCommands(Object object) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        helpMenu.executeCommands(null);
    }
    
}

