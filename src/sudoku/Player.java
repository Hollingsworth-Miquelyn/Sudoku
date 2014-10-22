/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Jessica
 */
public class Player {
    
    private int wins = 5;
    private int gamesPlayed = 7;
    public String marker;
    
    

    public Player() {
    }

    public Player(String marker) {
        this.marker = marker;
    }
    
   
    public double getWinningPercentage() {
               
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
           
}
