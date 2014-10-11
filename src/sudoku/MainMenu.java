/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

import java.util.Scanner;
/**
 *
 * @author Miquelyn
 */
public class MainMenu {
      
    public void displayMenu(){
        System.out.println("1) New Game\n2) Help\n3) Exit");
        System.out.println("Select: ");
    }
    
    public MainMenu (){
        Scanner in = new Scanner (System.in);
        
        displayMenu();
        switch (in.nextInt()){
            case 1:
                System.out.println("You selected New Game");//need to take user to new game menu options
                break;
            case 2:
                System.out.println("********************************************************\n"
                        + "********************INSTRUCTIONS************************\n"
                        + "Fill the empty cells with the numbers 1-9.\n" 
                        + "Each number can appear only once in each column and row.\n"
                        + "Each number can appear only once in each 3x3 sub-square.\n"
                        +"********************************************************\n"
                        +"********************************************************\n");
                break;
            case 3:
                System.out.println("Are you sure you want to exit the game?");
                break;
            default:
                System.err.println("Unrecognized option");
                break;
        }
    }
}
