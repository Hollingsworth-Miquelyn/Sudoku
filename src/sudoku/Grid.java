/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Stephen
 */
public class Grid {
    //private so that no one can chage the variables without permission
    private int size = 81;
    private int position = 3;
    
    public void displaySize(){
        System.out.println(size);
    }
    public void displayPosition(){
        System.out.println(position);
    }
}

    