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
public class BestTimeTest {
    private String userName = "Miquelyn";
    private String totalTime = "6:25";
    private int topTen = 10;
    private int seconds = 0;
    private int minutes = 0;
    private int decimals = 60;

    public BestTimeTest() {
        
    }
    
    public void displayUserName() {
        System.out.println(this.userName);
    }
    public void bestTime() {
        double secondsDecimal = (double)seconds / decimals;
        double totalTime = (double)minutes + secondsDecimal;
        if (totalTime <= 0 || totalTime > 100 || seconds < 0){
            System.out.println("Bummer! \n" + "Invald Time");
            System.out.println("The input was " + minutes + " minutes " + seconds + " seconds");
        }
        else {
            System.out.println("The input was " + minutes + " minutes " + seconds + " seconds");
            System.out.println("Contgradulations! \n" + "Your Time " + totalTime);//int will only output the minutes can be taken out later
        }
    }
    
    public void displayTotalTime() {
        System.out.println(this.totalTime);
    }
    
    public static void main(String[] args){
        BestTimeTest btt = new BestTimeTest();
        btt.bestTime();
    }
}
