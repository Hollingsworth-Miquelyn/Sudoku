/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;
import java.io.Serializable;
/**
 * @author  Jessica lesson2
 * @author Heidi Spackman 
 * @author Miquelyn Hollingsworth
 */
public class CheckAnswer implements Serial {
    
    private int row=8;
    private int cell1=90;
    private int cell2=-1;
    private int cell3=3;
    private int cell4=4;
    private int cell5=5;
    private int cell6=7;
    private int cell7=9;
    private int cell8=6;
    private int cell9=2;	
    public int cellanswer;
    public boolean b;
    //creating answer grid
    private int[][] boardEasyAnswer = { {4, 5, 2, 3, 9, 1, 8, 7, 6},
                                   {3, 1, 8, 6, 7, 5, 2, 9, 4},
                                   {6, 7, 9, 4, 2, 8, 3, 1, 5},
                                   {8, 3, 1, 5, 6, 4, 7, 2, 9},
                                   {2, 4, 5, 9, 8, 7, 1, 6, 3},
                                   {9, 6, 7, 2, 1, 3, 5, 4, 8},
                                   {7, 9, 6, 8, 5, 2, 4, 3, 1},
                                   {1, 8, 3, 7, 4, 9, 6, 5, 2},
                                   {5, 2, 4, 1, 3, 6, 9, 8, 7}};
     

    public CheckAnswer() {
    }
    
    private void answerTest(){
        System.out.print(boardEasyAnswer);
    }
    
    private void checking(){
        
      
            if(cell1 < 1){ 
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell2 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell3 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell4 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell5 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell6 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell7 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell8 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else if (cell9 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                b = false;
                }
                else {
                
                   
                        cellanswer = cell1+cell2+cell3+cell4+cell5+cell6+cell7+cell8+cell9;
                        if (cellanswer == 45 & b == false){
                             System.out.println("Row " + row + " Correct!");
                        }
                            else {
                                System.out.println("Wrong Answer! Try Again!");
                                                       }
                        System.out.println(cellanswer);
                    }
        
            }

    //returns true if column is correct.
    private static boolean colContains(int[][] boardEasyAnswer, int col, int value){
        for (int row = 0; row < boardEasyAnswer.length; row++){
            if (boardEasyAnswer[row][col] == value)
                return true;
        }
        return false; //number is not in the column
     
    }
}

   
    

        
    