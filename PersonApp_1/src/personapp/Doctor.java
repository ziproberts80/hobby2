
package personapp;


public class Doctor extends Person{
    
    public Doctor(String salutation, String firstName, String lastName, String occupation) {
         super(salutation,firstName, lastName, occupation);     
      }


    public String[] duties(){
        
     
        String[] doctorDuities =    { "Review Lab Tests",
                                      "Write RX Meds",
                                      "Write medical record of patients progress",
                                      "Talk and listen to Patient "
                                     };
        return doctorDuities;
    }
    
}
