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
    
   
    private double getWinningPercentage() {
        double totalScore = wins + losses;
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = wins / totalScore;
        System.out.println("You have won "
                + getWinningPercentage() + "% of the games."
                + wins + " wins, "
                + losses + " losses");
        return winLossRatio*100;
    }
        
        
    }
