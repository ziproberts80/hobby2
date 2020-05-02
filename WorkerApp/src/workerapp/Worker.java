
package workerapp;

/**
 *
 * @author Cliff
 */
public class Worker {

    /**
     *
     */
    private String salutation;

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private double salary;

    /**
     *
     */
    private String workStatus;

    /**
     *
     * @param salutation
     * @param firstName
     * @param lastName
     * @param salary
     * @param workStatus
     */
    public Worker(String salutation, String firstName, String lastName, double salary, String workStatus) {
        this.salutation = setSalutation(salutation);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workStatus = setWorkStatus(workStatus);
    }

    /**
     *
     * @return
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     *
     * @param salutation
     * @return
     */
    private String setSalutation(String salutation) {
           String employeeSalutation;
           
        switch(salutation.toUpperCase()){
            case "MRS":
            case "MRS.":
            case "MISS":
            case "MISS.":
                employeeSalutation = "Ms";  
                break;
            case "DR":
            case "DR.":
            case "DOC":
               this.employeeSalutation =  "Doctor";
               break;
            case "MR":
            case "MISTER":
               employeeSalutation =  "Mr.";
               break;
            default:
                this.employeeSalutation = salutation;
        }    
        
        return employeeSalutation;
    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     */
    public String getWorkStatus() {
        
        return workStatus;
    }

    /**
     *
     * @param workStatus
     * @return
     */
    private String setWorkStatus(String workStatus) {
        
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

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  salutation + " " + firstName +  " " + lastName + "\nSalary:" + salary + "\nWork Status: " + workStatus ;
    }
    
    
    
}
    
