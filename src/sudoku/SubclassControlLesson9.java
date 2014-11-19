package sudoku;

/**
 *
 * @author Jessica Marshall
 */
public class SubclassControlLesson9 {
    
    public SubclassControlLesson9() {
        
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