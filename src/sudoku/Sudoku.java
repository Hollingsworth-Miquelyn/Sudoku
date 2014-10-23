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
    private String name;

    public Sudoku(){
        
    }
    
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        this.name = input.next();
    }
    public void displayWelcomeUser(){
        System.out.println("\nWelcome " + this.name + "\n");
    }
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.getName();
        sudoku.displayWelcomeUser();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        mainMenu.display();
        
        /*HelpMenuView helpMenuView = new HelpMenuView();
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
                
        DifficultyHelpMenuView difficultyHelpMenuView = new DifficultyHelpMenuView();
        difficultyHelpMenuView.getInput();
        difficultyHelpMenuView.display();
        
        
        DifficultyHelpMenuControl difficultyHelpMenuControl = new DifficultyHelpMenuControl();
        difficultyHelpMenuControl.displayHelpHard();
        difficultyHelpMenuControl.displayHelpMedium();
        difficultyHelpMenuControl.displayHelpEasy();
        
        difficultyHelpMenuControl.displayHelpBorder();*/
        
        
        Board grid = new Board();
        grid.createBoardLocations(9, 9);
        grid.clearTheBoard();
        //grid.occupyLocation(null, row, column);
        
        Location location = new Location();
        
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
