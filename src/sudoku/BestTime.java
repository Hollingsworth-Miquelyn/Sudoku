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
    private double seconds = .25;
    private double minutes = 6;
    private int decimals = 60;

    public BestTime() {
        
    }
    
    public void displayUserName() {
        System.out.println(this.userName);
    }
    public void bestTime() {
        double secondsDecimal = seconds / decimals;
        double totalTime = minutes + secondsDecimal;
        if (totalTime < 0 || totalTime > 100){
            System.out.println("Bummer! \n" + "Invald Time");
        }
        else {
            System.out.println("Contgradulations! \n" + "Your Time" + (int)totalTime);//int will only output the minutes can be taken out later
        }
    }
    
    public void displayTotalTime() {
        System.out.println(this.totalTime);
    }
}
