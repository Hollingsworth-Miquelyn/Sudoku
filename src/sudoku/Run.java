/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Sian
 */
public class Run {
    private String numbers = "1, 2, 3, 4, 5, 6, 7, 8, 9";
    public double timer = 3.17;
    
    public Run(){
        
    }
    
    public void displayNumbers(){
        System.out.println(this.numbers);
    }
    
    public void displayTimer(){
        System.out.println(this.timer);
    }
}
