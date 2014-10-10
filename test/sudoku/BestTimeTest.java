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
 * @author Sian
 */
public class BestTimeTest {
    private int seconds = 15;
    private int minutes = 5;
    private int decimals = 60;
    BestTimeTest bestTimeTest = new BestTimeTest();
    private double expResult = 5.25;
    private double result = bestTimeTest.BestTimeTest(seconds, minutes, decimals);
    
    public BestTimeTest() {
    double secondsDecimal = (double)seconds / decimals;
        double totalTime = (double)minutes + secondsDecimal;
        if (totalTime < 0 || totalTime > 100){
            System.out.println("Bummer! \n" + "Invald Time");
        }
        else {
            System.out.println("Contgratulations! \n" + "Your Time" + totalTime);
        }
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
    @Test
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
    @Test
    public void testBestTime() {
        int seconds = 15;
        int minutes = 5;
        int decimals = 60;
        BestTime instance = new BestTime();
        double expResult = 5.25;
        double result = instance.bestTime(seconds, minutes, decimals);
        
        System.out.println("bestTime");
        instance.bestTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTotalTime method, of class BestTime.
     */
    @Test
    public void testDisplayTotalTime() {
        System.out.println("displayTotalTime");
        BestTime instance = new BestTime();
        instance.displayTotalTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
