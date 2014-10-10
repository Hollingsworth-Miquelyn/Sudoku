/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heidi Spackman
 */
public class CheckAnswerTest {
    
    public CheckAnswerTest() {
    }

    /**
     * Test of checkAnswer method, of class CheckAnswer.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswers");
        int row;
        int cell1=1;
        int cell2=2;
        int cell3=3;
        int cell4=4;
        int cell5=5;
        int cell6=6;
        int cell7=7;
        int cell8=8;
        int cell9=9;	
        int cellanswer = 0;
        double expResult = 45;
        CheckAnswer instance = new CheckAnswer();
        int result;
        result = instance.checkAnswers(cellanswer);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswers method, of class CheckAnswer.
     */
   
    
}
