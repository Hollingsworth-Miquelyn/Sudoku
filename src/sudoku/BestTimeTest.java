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
    private int seconds = 15;
    private int minutes = 5;
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
    
    public void highScore(){
        int seconds = 7;
        int minutes = 45;
        int maxScore = 6000;
        double minutesConversion = (double)minutes * 60;
        double totalTime = (double)seconds + minutesConversion;
        if (totalTime <= 0 || totalTime > 100 || seconds < 0){
            System.out.println("Bummer! \n" + "Invald Time");
        }
        else {
            int score = maxScore - (int)totalTime;
            System.out.println("Congratulations! \n Your game score is " + score + "!");
        }    
    }
}
