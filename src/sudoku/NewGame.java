/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Jessica
 */
class NewGame {
    //declare instance variable
    int cellsFilled;
}

class DifficultyLevel{
public static void main (String args[]){
//declare objects
NewGame easy = new NewGame();
NewGame medium = new NewGame();
NewGame difficult = new NewGame();

//assign values to objects (amount of cells that will be filled in the levels)
easy.cellsFilled = 28;
medium.cellsFilled  = 24;
difficult.cellsFilled = 20;

System.out.println("Easy level will have " + easy + "cells and medium will have " 
        + medium + ", difficult will have " + difficult);
}
}