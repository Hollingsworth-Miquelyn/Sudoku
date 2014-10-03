/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author Jessica
 */
public class Hint {
    private String Hint = "1";

    public Hint () {
        
    }
    
    public void getHint(Grid referanceGrid){
        //int hintPosition = referanceGrid.displayPosition();
        int hintPosition = 3; //The grid class does not return position so we are declaring and initializing it here.
        referanceGrid.displayPosition();
        if (hintPosition == 3) {
            System.out.println(Hint);
        }
    }
}
