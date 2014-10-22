/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;
/**
 *
 * @author  Miquelyn Hollingsworth, Jessical Marshall, Jessica West, Heidi Spackman
 */
public class Location {
    public int row;
    public int column;
    public Player player;

    Location() {
    }
        
    public void occupyLocation(Player player) {
        this.player = player;
    }
    
}
