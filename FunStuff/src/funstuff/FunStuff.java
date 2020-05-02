
package funstuff;

import java.text.*;
import javax.swing.JOptionPane;

public class FunStuff {

 
    public static void main(String[] args) {
        
        DecimalFormat formatter = new DecimalFormat("$#,###.00");
        double salary = 123324523.99;
        
        String salaryFormated = formatter.format(salary);
        System.out.println(formatter.format(salary));
        
        JOptionPane.showMessageDialog(null,"Your salary is " + salaryFormated );
      
    }
    
}
paint