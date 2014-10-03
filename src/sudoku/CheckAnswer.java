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
public class CheckAnswer {
    private String correct = "correct";
    private String wrong = "wrong";

    public CheckAnswer () {
    }
    
    public void isCorrect(int answer){
        if(answer == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }

}