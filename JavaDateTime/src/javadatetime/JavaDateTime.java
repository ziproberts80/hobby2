
package javadatetime;

import java.util.*;
import java.time.*;
import users.cliff.documents.NetBeansProjectsXXX.Ball.*;


public class JavaDateTime {


    public static void main(String[] args) {
        
        
        System.out.println("\nLocalTime: "+ LocalTime.now().toString()); 
        System.out.println("\nLocalDateTime: "+ LocalDateTime.now().toString()); 

        System.out.println("\nZonedDateTime: "+ ZonedDateTime.now().toString()); 

        System.out.println("\nOffsetTime: "+ OffsetTime.now().toString()); 
        System.out.println("\nOffsetDateTime: "+ OffsetDateTime.now().toString()); 

        System.out.println("\nMonthDay: "+ MonthDay.now().toString()); 
        System.out.println("\nYearMonth: "+ YearMonth.now().toString()); 
        System.out.println("\nInstant: "+ Instant.now().toString()); 



                          
        
     
    }
    
}
