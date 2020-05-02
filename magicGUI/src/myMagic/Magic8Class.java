
package myMagic;

import java.util.Random;

public class Magic8Class {

    public Magic8Class() {
    }

     Random ran = new Random();
     
     final String[] ANSWERS = new String[] { "As I see it, yes",
                                             "Ask again later",
                                             "Better not tell you now",
                                             "Cannot predict now",
                                             "Concentrate and ask again", 
                                             "Don’t count on it", 
                                             "It is certain",
                                             "It is decidedly so",
                                             "Most likely",  
                                             "My reply is no",
                                             "My sources say no",
                                             "Outlook not so good",   
                                             "Outlook good",
                                             "Reply hazy, try again", 
                                             "Signs point to yes",
                                             "Very doubtful",
                                             "Without a doubt",  
                                             "Yes!",  
                                             "Yes, definitely",  
                                             "You may rely on it"
                                           };

    @Override
    public String toString() {
        int index = ran.nextInt(19);
        
        return ANSWERS[index];
    }


     
     
     
                                
        
     
        
     
}
