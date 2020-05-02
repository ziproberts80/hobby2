
package personapp;

/**
 * This is a generic person class that will be used to show
 * inheritance 
 * 
 * 
 * 
 * @author Gary Cliford
 * @version 1.0
 */
public class Person {
  
    /**
     * 
     * This is protected properties that can be accessed from the child class
     * 
     */
    protected String salutation;
    protected String firstName;
    protected String lastName;
    protected String occupation;

    public Person(String salutation, String firstName, String lastName, String occupation) {
        this.salutation = salutation;
        this.firstName =  firstName;
        this.lastName =   lastName;
        this.occupation = occupation;
        setSalutation();
    }

    public Person() {
        this.salutation = "Unknown";
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.occupation = "Unknown";
    }

    private void setSalutation() {
          
        switch(this.salutation.toUpperCase()){
            case "MRS":
            case "MRS.":
            case "MISS":
            case "MISS.":
                this.salutation = "Ms.";  
                break;
            case "DR":
            case "DR.":
            case "DOC":
               this.salutation =  "Doctor";
               break;
            case "MR":
            case "MISTER":
            case "MR.":
               this.salutation =  "Mr.";
               break;
            default:
                this.salutation = salutation;
        }    
       
        
   
  }


    @Override
    public String toString() {
        
     String output;
     output = String.format("%s %s %s\nOccupation: %s\n", this.salutation, 
                                                          this.firstName, 
                                                          this.lastName,
                                                          this.occupation);
    return output;
    }    
}
