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

    public CheckAnswer() {
    }
    
    public void checking(){
        
      
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
       } 

   
    

        
    