/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jessica
 */
public class HintTest {
    
    public HintTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHint method, of class Hint.
     */
    @Test
    public void testGetHint() {
        System.out.println("getHint");
        int[][] ourEmptyBoard = null;
        int[][] ourAnswerBoard = null;
        Hint instance = new Hint();
        String expResult = "";
        String result = instance.getHint(ourEmptyBoard, ourAnswerBoard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
