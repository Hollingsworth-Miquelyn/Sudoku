/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.enums;

/**
 *
 * @author Jessica
 */
public enum Help {
    B ("Board Help"),
    G ("Game Help"),
    S ("Suduko Help"),
    D ("Difficulty Help"),
    H ("Hint Help"),
    Q ("Quit");  
    
    String value;
    
    Help(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
}