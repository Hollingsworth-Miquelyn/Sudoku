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
public class BestTime {
    private String userName = "Miquelyn";
    private String totalTime = "6:25";
    private int topTen = 10;
    private int seconds = 15;
    private int minutes = 6;
    private int decimals = 60;

    public BestTime() {
        
    }
    
    public void displayUserName() {
        System.out.println(this.userName);
    }
    public void bestTime() {
        double secondsDecimal = (double)seconds / decimals;
        double totalTime = (double)minutes + secondsDecimal;
        if (totalTime <= 0 || totalTime > 100 || seconds < 0){
            System.out.println("Bummer! \n" + "Invald Time");
        }
        else {
            System.out.println("Contgradulations! \n" + "Your Time" + totalTime);//int will only output the minutes can be taken out later
        }
    }
    
    public void displayTotalTime() {
        System.out.println(this.totalTime);
    }
}
//This is a test throw away