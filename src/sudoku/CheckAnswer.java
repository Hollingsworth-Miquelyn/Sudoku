/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 * @author  Jessica lesson2
 * @author Heidi Spackman Lesson3 (changed everything)
 */
public class CheckAnswer {
    private int row=5;
    private int cell1=11;
    private int cell2=8;
    private int cell3=7;
    private int cell4=-5;
    private int cell5=9;
    private int cell6=6;
    private int cell7=4;
    private int cell8=2;
    private int cell9=3;	
    public int cellanswer;


    public CheckAnswer() {
    }
    
    public void checking(){
        
        //for (row = 1; row<10; row++){
            if(cell1 < 1){ 
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
            }
                else if (cell2 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell3 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell4 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell5 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell6 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell7 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell8 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else if (cell9 < 1){
                System.out.println("Error, cannot have a negative number as an answer.\n Try Again!");
                }
                else {}
                   for (row = 1; row<10; row++){
                        cellanswer = cell1+cell2+cell3+cell4+cell5+cell6+cell7+cell8+cell9;
                        if (cellanswer==45){
                             System.out.println("Row " + row + " Correct!");
                        }
                            else {
                                System.out.println("Wrong Answer! Try Again!");
                                                       }
                        System.out.println(cellanswer);
                    }
        
                
       } 

   
    }

//}
        
    