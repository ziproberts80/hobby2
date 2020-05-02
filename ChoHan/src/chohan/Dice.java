
package chohan;

import java.util.Random;

public class Dice {

    
    public static String throwDice(){
        
            int die1;
            int die2;
            int result ;
            String oddEven;
    
        Random randomDie1Value = new Random();
        Random randomDie2Value =  new Random() ;
        
        die1 = randomDie1Value.nextInt(6) +1;
        die2 = randomDie2Value.nextInt(6) +1;
        
        result = die1 + die2;
        
        System.out.printf("Dice1 is %d, \nDice2 is %d,\n Total is %d", die1, die2, result);
        
        if (result %2 == 0){
           return "Even";
        }
        else{
            return "Odd";
            
        }
        
        
    }
    
    
}
