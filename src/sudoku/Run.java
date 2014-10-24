/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;



/**
 *
 * @author Miquelyn
 * 
 */
public class Run {
    int[][] grid;
    
    public Run(int row, int col){
        grid = new int[row][col];
    }
        
    public void displayBoard(int x){ 
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++){
            grid[i][j] = x;
        }
        }    
    }
}
    
    

