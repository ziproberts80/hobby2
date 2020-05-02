/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyes;

import diceapp.Die;

/**
 *
 * @author Cliff
 */
public class SnakeEyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Die dice01  = new Die();
        System.out.println("Dice1 has a value of " + dice01.rollDie());
    }
    
}
