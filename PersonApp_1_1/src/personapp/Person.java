
package personapp;

public class Person {
  
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
    
    public String[] duties(){
        
     
        String[] genericDuities =    { "Write medical record of patients progress",
                                       "Talk and listen to Patient "
                                     };
        return genericDuities;
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
