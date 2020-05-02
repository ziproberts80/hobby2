/**
 *   This package will hold the Employee class and initially the test
 *   harness for it
 * 
 * 
 * 
 * 
 * @author Gary Clifford   original  by Cay S. Horstmann
 * @version Core Java 11th edition
 * 
 */
package employeeapp;

import java.time.*;


/**
 * This will hold the properties and behaviors 
 * of our employees
 * 
 * 
 * 
 * 
 * 
 * @author Gary Clifford
 * @version 1.0 as of March 27th
 */
public class Employee {
   /**
    * String: name is full name of the employees
    */
   private String name;
   
   /** 
    * double: Current salary of employee
    */
   private double salary;
   
   /**
    * LocalDate:  the hiring date of employee
    */
   private LocalDate hireDay;

   /**
    * 
    * 
    * 
    * 
    * @param n     String: full name of employee
    * @param s     double: salary of employee
    * @param year  int: Year of Hire
    * @param month int: Calendar month of hire  1=Jan, 2=Feb, 3=Mar, etc 
    * @param day   int: day of hire
    */
   public Employee(String n, double s, int year, int month, int day)
   {
      this.name = n;
      this.salary = s;
      this.hireDay = LocalDate.of(year, month, day);
   }

    /**
     *
     * @return String: Employee Information
     */
    @Override
    public String toString() {
        
        String employee;
        employee = "\nEmployee: " + this.name + "\n";
        employee += String.format("Salary: $%.2f \n",this.salary );
        employee += "Hiredate: " + this.hireDay + "\n";
       
        return employee;
        
    }

    /**
     *
     * @param byPercent: double How much of a raise increase Percentage as
     *        whole number
     */
    public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}
