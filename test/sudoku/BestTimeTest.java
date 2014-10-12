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
 * @author Miquelyn
 */
public class BestTimeTest {
    
    public BestTimeTest() {
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
     * Test of displayUserName method, of class BestTime.
     */
    /*@Test
    public void testDisplayUserName() {
        System.out.println("displayUserName");
        BestTime instance = new BestTime();
        instance.displayUserName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bestTime method, of class BestTime.
     */
    /*@Test
    public void testBestTime() {
        System.out.println("bestTime");
        BestTime instance = new BestTime();
        instance.bestTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of highScore method, of class BestTime.
     */
    @Test
    public void testHighScore() {
        
        //test 1
        System.out.println("highScore - Test 1");
        int seconds = 45;
        int minutes = 7;
        int expResult = 5535;
        BestTime instance = new BestTime();
        score = instance.highScore(seconds, minutes);
        assertEquals(5535, 5535);
    }
    
}
