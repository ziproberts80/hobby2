
package temperatureconverterapp1;

import java.util.Scanner;

public class TemperatureConverterApp1 {

    public static void main(String[] args) {
           
     Scanner in = new Scanner(System.in);
     
       System.out.print("Enter C for you value being Celsius for F for: ");
       String value = in.nextLine();
       System.out.print("Enter your value for degree: ");
       double degree = in.nextDouble();
       TempConvert tc = new TempConvert();
       
       if(value.equalsIgnoreCase(value)) {
         tc.CtoF(degree);
        } 
        else 
        {
         tc.FtoC(degree);
        }
        
     System.out.println(tc);
    }
    
}
