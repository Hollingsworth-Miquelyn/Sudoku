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
public class NewGameControl {
    
    public NewGameControl() {
        
    }
    
    public void startEasyGame() {
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("E");
        playGame.getInput(userBoard);
    }
    
    public void startMediumGame() {
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("M");
        playGame.getInput(userBoard);
    }
    
    public void startHardGame() {
        PlayGameView playGame = new PlayGameView();
        Board userBoard = new Board();
        userBoard.setBoard("H");
        playGame.getInput(userBoard);
    }
}
