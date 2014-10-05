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
    
    public long wins = 0;
    public long losses = 0;
    public String marker;
    
    

    public Player() {
    }

    public Player(String marker) {
        this.marker = marker;
    }
    
   
    public double getWinningPercentage() {
        double totalScore = wins + losses;
        
        double winLossRatio = wins / totalScore *100;
        
        System.out.println("You have won " + winLossRatio + "% of the games."
                + wins + " wins and "
                + losses + " losses");
        return winLossRatio*100;
    }
           
}
