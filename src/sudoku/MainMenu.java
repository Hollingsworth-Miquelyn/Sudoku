/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author Miquelyn
 */
public class MainMenu {
      //private so that no one can chage the variables without permission
    private String help = "The instructions will go here.";
    private String exit = "Are you sure you want to exit the game?";
    
    public MainMenu (){
    }
    
    public void displayInstructions(){
        System.out.println(help);
    }
    public void displayExit(){
        System.out.println(exit);
    }
}
