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
    private static Scanner inFile= new Scanner(System.in);
    private String difficulty = "easy";
    private double bestTime = 5.25;
    private String name;

    public Sudoku(){
        
    }
    public static Scanner GetInputFile(){
        return Sudoku.inFile;
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
        sudoku.displayGoodbyUser();
           
        CheckAnswer checkAnswer = new CheckAnswer();
        checkAnswer.answerTest();
        checkAnswer.checking();
        
        BestTime bestTime = new BestTime();
        bestTime.bestScore();
        bestTime.averageScore();
        
    }
    public void displayGoodbyUser(){
        System.out.println("\nThanks for playing " + this.name + "\n");
    }
    
}
