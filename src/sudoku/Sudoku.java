/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;

/**
 *
 * @author Sian
 */
public class Sudoku {
    private String difficulty = "easy";
    private int highScore = 135;
    private String name = "Sian";
    private String help = "Fill the empty cells with numbers 1-9.\n" +
        "Each number can appear only once in each column and row.\n" +
        "Each number can appear only once in each 3x3 sub-square.";

    public Sudoku(){
        
    }
    
    public void displayDifficulty(){
        System.out.println(this.difficulty);
    }
    public void displayhighscore(){
        System.out.println(this.highScore);
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
        sudoku.displayhighscore();
        sudoku.getName();
        sudoku.displayHelp();
        
        Grid grid = new Grid();
        grid.displaySize();
        grid.displayPosition();
        
        CheckAnswer answerCheck = new CheckAnswer();
        answerCheck.isCorrect(1);
        
        Hint findingHint = new Hint();
        findingHint.getHint(grid);
        
        Run run = new Run();
        run.displayNumbers();
        run.displayTimer();
    }
    
}
