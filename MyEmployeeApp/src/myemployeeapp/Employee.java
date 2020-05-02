
package myemployeeapp;


public class Employee {

    private String salutation;
    private String firstName;
    private String lastName;
    private double salary;
    private String workStatus;

    public Employee() {
    }

    public Employee(String salutation, String firstName, String lastName, 
                double salary, String workStatus) {
        this.salutation = setSalutation(salutation);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workStatus =  setWorkStatus(workStatus);
    }

    Employee(String mike, String bernstein, double d, String term) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSalutation() {
        return salutation;
    }

    public String setSalutation(String salutation) {
           String employeeSalutation;
           
        switch(salutation.toUpperCase()){
            case "MRS":
            case "MRS.":
              employeeSalutation = "Ms";  
               break;
            case "DR":
            case "DR.":
               employeeSalutation =  "Doctor";
               break;
            default:
                employeeSalutation = salutation;
        }    
        
        return employeeSalutation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkStatus() {
        
        return workStatus;
    }

    public String setWorkStatus(String workStatus) {
        
        String employeeStatus;
        
        switch (workStatus.toUpperCase()){
            case "ACTIVE":
               employeeStatus = "Active"; 
               break;
             case "TERMINATED":
               employeeStatus = "Terminated";
               break;
             default:
                employeeStatus = "Unknown";            
        }
       
        return employeeStatus;
        
    }

    @Override
    public String toString() {
        return "Employee{" + "salutation=" + salutation + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", workStatus=" + workStatus + '}';
    }
    
    
    
}
