package min;

import java.util.Arrays;

public class Min {

    public static void main(String[] args) {
        int arr[] = {25, 9, 20, 12, 15, 5};

        for (int s : arr) {
            System.out.println(s);
        }
        
        System.out.println("\n\n***********************************\n\n");
   
        Arrays.sort(arr);

        for (int s : arr) {
            System.out.println(s);
        }
        
        
        double mean = 0.0;
        int num = 0;
        int counter= 0;
        
        
        for (int i: arr){
            num += i ;
           counter++;
            
        }
        
         System.out.println("num is " + num + "counter is " + counter);
         System.out.println("Mean is " + (double) num/counter);
        
        System.out.println(arr.length);

    }

}
