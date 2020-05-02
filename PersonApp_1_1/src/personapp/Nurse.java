
package personapp;


public class Nurse extends Person{
    

    public Nurse(String salutation, String firstName, String lastName, String occupation) {
         super(salutation,firstName, lastName, occupation);     
      }


    public String[] duties(){
        
     
        String[] nurseDuities =    { "Take vital signs",
                                     "Give Meds",
                                     "Write medical record of patients progress",
                                     "Update Doctor on patient's progress"
                                     };
        return nurseDuities;
    }
    
}
