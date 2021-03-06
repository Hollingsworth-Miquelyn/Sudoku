/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;
import sudoku.miscellaneous.SudokuError;
import java.io.Serializable;
/**
 *
 * @author Miquelyn
 */
public abstract class BestTime implements Serializable{
    private int topTen = 10;
    private int seconds = 0;
    private int minutes = 0;
    private int decimals = 60;

    public BestTime() {
    }

    public int getTopTen() {
        return topTen;
    }

    public void setTopTen(int topTen) {
        this.topTen = topTen;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }
 
    public void bestTime() {
        double secondsDecimal = (double)seconds / decimals;
        double totalTime = (double)minutes + secondsDecimal;
        if (totalTime <= 0 || totalTime > 100 || seconds < 0){
            System.out.println("Bummer! \n" + "Invalid Time");
        }
        else {
            System.out.println("Contgratulations! \n" + "Your Time" + totalTime);//int will only output the minutes can be taken out later
        }
    }

    public void bestScore() {
       int pastScores[] = {15, 19, 8, 12, 20};
       int pastScores2[] = doSelectionSort(pastScores);
       int sum = 0;
       int min, max;
        min = max = pastScores[0];
        
        for(int i:pastScores2){
            System.out.print(i);
            System.out.print(", ");
        }
       for(int i = 1; i < pastScores.length; i++) {
        if(pastScores[i] < min) min = pastScores[i];
        if(pastScores[i] > max) max = pastScores[i];
        }
       
       //Miquelyn Hollingsworth Lesson 6
       for(int x: pastScores) {
           sum += x;
       }
       System.out.println("Total time played: " + sum + "minutes");
          
        if (pastScores.length > 1) {
                if (min <= 0 ) { 
                    System.out.println("Invalid Amount");
                } 
                else {
                    System.out.println("Your best time is " + min 
                + " minutes and your worst time is " + max + " minutes");
                    
                }
            }
            else if (pastScores.length <= 1 || min < 0) { // only one score entered?
                if (pastScores.length == 1) { 
                    System.out.println("Your best time is " + min);
                } 
                else { // not enough scores
                    new SudokuError().displayError(
                        "Not enough scores to display best time");
        
                }
            }
        
    }
 
    public void highScore(){
        int maxScore = 6000;
        double minutesConversion = (double)minutes * 60;
        double totalTime = (double)seconds + minutesConversion;
        if (totalTime <= 0 || totalTime > 6000 || seconds < 0){
            System.out.println("Sorry! \n" + "Invalid input.");
        }
        else {
            int score = maxScore - (int)totalTime;
            System.out.println("Congratulations! \nYour game score is " + score + "!");
        }    
    }


public static int[] doSelectionSort ( int [ ] pastScores )
{
     for (int i = 0; i < pastScores.length - 1; i++)
     {
         int index = i;
         for (int j = i + 1; j <pastScores.length; j++)
             if (pastScores[j] < pastScores[index])
                 index = j;
         int smallerNumber = pastScores[index];
         pastScores[index] = pastScores[i];
         pastScores[i] = smallerNumber;
      }
     return pastScores;
}
    
}
