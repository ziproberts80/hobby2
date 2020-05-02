
package dateapp;

import java.time.*; 
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;  

public class DateApp {

   public static void main( String[] args) { 
         
         LocalDate date = LocalDate.now(); 
         int month = date.getMonthValue(); 
         int today = date.getDayOfMonth();
         int year  = date.getYear();

         System.out.println(month + "/" + today + "/" + year);
         System.out.println(year + "-" + month + "-" + today);
         System.out.printf("%04d/%02d/%02d\n", year, month, today);
          System.out.printf("%04d-%02d-%02d\n", year, month, today);
         
         DayOfWeek weekday = date.getDayOfWeek();
         int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday 
         
         String dayName;
         
         switch(value){
             case 1:
                 dayName = "Monday";
                 break;
             case 2:
                dayName = "Tuesday";
                 break;

             case 3:
                dayName = "Wednesday";
                 break;

             case 4:
                dayName = "Thursday";
                 break;

             case 5:
                dayName = "Friday";
                 break;

             case 6:
                dayName = "Saturday";
                 break;

             case 7:

                dayName = "Sunday";
                 break;
             default:
                dayName = "Unknown Day";
                 break;
                 
         }
         
         System.out.println("Today is " + dayName);
         
         
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime nowTime = LocalDateTime.now();  
        System.out.println("Before Formatting: " + nowTime);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = nowTime.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
 
        } 
 }
     

