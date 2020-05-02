
package junk;

import gratuityoop.*;


public class Junk {

    
    //global scope array; seen thru out class
    static String[] theBeatles =  {"John", "Paul", "George", "Ringo"};
 
    public static void main(String[] args) {
     

        String college = "MBCC";
        double hourlyRate = 15.00;
        double hoursWorked = 40.0;
       
        System.out.println("I attend " + college);
        
        System.out.println("This week I made " + payCheck(hourlyRate,hoursWorked ));
        printOutStuff();
        
        if (true){
         System.out.println("this prints if true");
        }
        else{
           System.out.println("this prints if false");        
        }
        
        printBandMembers();
    }
    
    public static double payCheck(double hourlyRate, double hoursWorked ){
        
        System.out.print("This will ");
        System.out.print("return ");
        System.out.print("the product  ");
        System.out.println("of hourly rate times hours worked ");
        return hourlyRate * hoursWorked;
        
    }
    
    public static void  printBandMembers(){
        
        System.out.println("\n**********************\n");
        
        for(int i = 0; i < theBeatles.length;i++){
        
            System.out.println(theBeatles[i]);
        }
    }
    
    public static void  printOutStuff(){
    
        int sum = 0;
        
        for (int i = 0; i <=10000; i++){
            

            sum += i;
            if (i == 5000){   // this is a error; do you see it?
                System.out.println("i is now 5");
            }
 
        }
            
        
        System.out.println("Sum has a value of " + sum); 
        
    }
}
