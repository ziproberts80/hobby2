
package personapp;


public class Surgeon extends Person {
    
       
      public Surgeon(String salutation, String firstName, String lastName, String occupation) {
         super(salutation,firstName, lastName, occupation);     
      }

        public String[] duties(){
        
     
        String[] surgeonDuities =    { "Consult with Patient",
                                     "Consult with other Doctors",
                                     "Operate on Patient",
                                     "Conduct follow-up after surgery"
                                     };
        return surgeonDuities;
    }

}
