/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.miscellaneous;
import sudoku.miscellaneous.Serial;
import java.io.Serializable;
/**
 *
 * @author Jessica, Jessica, Heidi, Miquelyn Lesson 8 Paired
 */
public class Player implements Serial{
    
    private int wins = 5;
    private int gamesPlayed = 7;

    public Player() {
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
 
    private double getWinningPercentage() {
               
        double winRatio = (double) wins / gamesPlayed *100;
        
        if (winRatio < 0 || winRatio > 100 || gamesPlayed <= 0 ){
          
            System.out.println("Oops! \n" + "Invalid Amount");
        }
        else {

        System.out.println("Great Job!\n" + "You have won " + winRatio + "% of your games. \n"
                + wins + " Wins and "
                + gamesPlayed + " games played.");
        return winRatio*100;}
        return 0;
    }
 private void averageScore() {
        int pastScores[] = { 15, 19, 8, 12, 20 };  
    int sum = 0;  
 
    for(int x : pastScores) {  
      sum += x;  
    }  
 
    System.out.println("Average Time: " + sum/pastScores.length); 
  }
 private class HighScore{
        private int seconds = 0;
        private int minutes = 0;
         private int decimals = 60;
         
        int maxScore = 6000;
        
        public void bestTime(){
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
 }
}