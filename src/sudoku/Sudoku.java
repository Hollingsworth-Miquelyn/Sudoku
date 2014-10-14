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
    private String help = "Fill the empty cells with numbers 1-9.\n" +
        "Each number can appear only once in each column and row.\n" +
        "Each number can appear only once in each 3x3 sub-square.";

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
        System.out.println(this.help);
    }
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.displayDifficulty();
        sudoku.displaybestTime();
        sudoku.getName();
        sudoku.displayHelp();
        
        MainMenu mainMenu = new MainMenu();
            
        Grid grid = new Grid();
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
