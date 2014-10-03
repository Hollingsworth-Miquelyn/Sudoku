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
    private String correct = "Correct Good Job";
    private String wrong = "Wrong You Suck";

    public CheckAnswer () {
    }
    
    public void isCorrect(int answer){
        if(answer == 1) {
            System.out.println(correct);
        } else {
            System.out.println(wrong);
        }
        
    }

}