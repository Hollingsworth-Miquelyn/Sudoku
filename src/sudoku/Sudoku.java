/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;


/**
 *
 * @author Miquelyn Hollingsworth, Jessica Marshall, Jessica West, Heidi Spackman
 */
public class Sudoku {
    private String difficulty = "easy";
    private double bestTime = 5.25;
    private String name = "Sian";

    public Sudoku(){
        
    }
    
    public void displayDifficulty(){
        System.out.println(difficulty);
    }
    
    public void displaybestTime(){
        System.out.println(this.bestTime);
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        this.name = input.next();
    }
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + "\n");
    }
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.displayDifficulty();
        sudoku.displaybestTime();
        sudoku.getName();
        sudoku.displayHelp();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        mainMenu.display();
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
        helpMenuView.display();
      
        HelpMenuControl helpMenuControl = new HelpMenuControl();
        helpMenuControl.displayBoardHelp();
        helpMenuControl.displayDifficultyHelp();
        helpMenuControl.displayHintHelp();        
        helpMenuControl.displayGameHelp();
        helpMenuControl.displayScoreHelp();
        helpMenuControl.displayError();
        helpMenuControl.displayHelpBorder();
        
        GameHelpMenuView gameHelpMenuView = new GameHelpMenuView();
        gameHelpMenuView.getInput();
        gameHelpMenuView.display();
        
        GameHelpMenuControl gameHelpMenuControl = new GameHelpMenuControl();
        gameHelpMenuControl.displayObjectiveHelp();
        gameHelpMenuControl.displayThreeHelp();
        gameHelpMenuControl.displayNineHelp();
        gameHelpMenuControl.displayError();
        gameHelpMenuControl.displayHelpBorder();
                
        Board grid = new Board();
        grid.displaySize();
        grid.displayPosition();
        
        CheckAnswer checkAnswer = new CheckAnswer();
        checkAnswer.checking();
        
        
        Hint findingHint = new Hint();
        int ourHint = findingHint.getHint(grid);
        
        Run run = new Run();
        run.displayNumbers();
        run.displayTimer();        
        
        BestTime bestTime = new BestTime();
        bestTime.displayUserName();
        bestTime.bestTime();
        bestTime.highScore();
        
        Player player = new Player();
        player.getWinningPercentage();
        

    }
    
}
