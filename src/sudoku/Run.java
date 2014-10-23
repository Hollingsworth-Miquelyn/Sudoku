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
    //private String numbers = "1, 2, 3, 4, 5, 6, 7, 8, 9";
    //public double timer = 3.17;
    int empty_board[][] = { {4,0,0,3,0,1,0,0,6},
            {0,0,8,0,7,0,0,9,0},
            {0,0,0,4,0,0,3,0,0}};
    
    public Run(){
        
    }
    
    public void emptyEasyBoard() {
    System.out.println("This is a test board.");
    display(empty_board);
    }

    public static void display(int x[][]) {
        for (int row=0; row < x.length; row++){
            for(int column=0; column < x[row].length; column++) {
                    System.out.print(x[row][column] + "|");
           }
            System.out.println();
            System.out.println("- - - - - - - - -");
        }
    }
        
    /*public void displayTimer(){
        System.out.println(this.timer);
    }*/ 
    
    
}
