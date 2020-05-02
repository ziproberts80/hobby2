/******************************************************************
 *     
 *     Programmer: Gary Clifford
 *     Date:   3/16/2020
 * 
 *     Purpose:  This class represents a single Die (vs Dice) used
 *               in games of chance that contains six (6) sides
 *               where the face value is a single number represented
 *               by dots from 1 to 6 inclusively.
 * 
 *     Modification History
 *     ====================
 * 
 *     Programmer      Date         Modification 
 *     --------------  ----------   -----------------------------------
 *     Gary Clifford   3/16/2020    Initial code
 * 
 *******************************************************************/
package diceapp;

import java.util.Random;

/**
 * This class represents a real live Die used in board games
 * and games of chance.  It has 6 sides starting at its lowest
 * value of one (1) and its highest value of 6.  Numbers are generated
 * randomly
 *
 * 
 * @author Gary Clifford
 * @version 1.0   3/16/2020
 */
public class Die {
    
    /**
     * variable is SIDES representing the 6 faces of a typical
     * casino die
     * 
     */
    private final int SIDES = 6;
        
    /**
     *  This code simulates rolling the dice and coming to rest
     *  with its facevalue on top.  Values are between 1 and 6
     *  inclusively
     * 
     * 
     * @return int value between 1 to 6 inclusively
     */
    public int rollDie(){
    

      int roll;
    
      Random r = new Random();
    
      roll = r.nextInt(SIDES)+1;
    
      return roll;
    }    
}
