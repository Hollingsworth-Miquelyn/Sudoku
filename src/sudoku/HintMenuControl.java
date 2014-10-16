/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Jessica Marshall
 */
public class HintMenuControl {
    
    public HintMenuControl() {
        
    }   
    
    //Jessica Marshall Lesson 4 Individual Function
      public void displayHintHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tIf player becomes stuck while playing press the Hint button"
                + "\n\tand the board will automatically fill in one cell for you.");
        displayHelpBorder();
    }

     public void displayError() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"X\" and \"O\"."
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}