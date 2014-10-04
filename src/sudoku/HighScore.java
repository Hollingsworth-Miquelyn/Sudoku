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
public class HighScore {
    private String userName = "Miquelyn";
    private String totalTime = "6:25";
    private int topTen = 10;

    public HighScore() {
        
    }
    
    public void displayUserName() {
        System.out.println(this.userName);
    }
    
    public void displayTotalTime() {
        System.out.println(this.totalTime);
    }

}
