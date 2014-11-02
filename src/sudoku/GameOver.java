/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Miquelyn Hollingsworth
 */
public class GameOver {
    Toolkit toolkit;
    
    Timer timer;
    
    public GameOver(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new ReturnMenu(), seconds * 1000);
    }
    class ReturnMenu extends TimerTask {
        public void run() {
            System.out.println("Game Over");
            toolkit.beep();
            System.exit(0);//stops the AWT thread and everything else
        }
    }
        
}
