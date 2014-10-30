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
    private int seconds = 0;
    private int minutes = 0;
    private int decimals = 60;

    public BestTime() {
        
    }
    //This will pull the username from the intial username input
    public void displayUserName() {
        System.out.println(this.userName);
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
        int min, max;
        min = max = pastScores[0];
        
        for(int i = 1; i < pastScores.length; i++) {
        if(pastScores[i] < min) min = pastScores[i];
        if(pastScores[i] > max) max = pastScores[i];
        }
        
          
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



    @SuppressWarnings({"empty-statement", "empty-statement"})
    public static void ExchangeSort ()
{
     int i, j, temp;  //be sure that the temp variable is the same "type" as the array
     int pastScores[] = {15, 19, 8, 12, 20};
     for ( i = 0; i < pastScores.length - 1; i ++ )  
     {
          for ( j = i + 1; j < pastScores.length; j ++ )
          {
               if( pastScores[ i ] < pastScores[ j ] )         //sorting into descending order
               {
                       temp = pastScores[ i ];   //swapping
                       pastScores[ i ] = pastScores[ j ];
                       pastScores[ j ] = temp; 
                }           
          }
     }
     System.out.print("Sorted Times are:");
     for(i=0; i < pastScores.length; i++);
        System.out.print(" " + pastScores[i]);
        System.out.println();
}
}