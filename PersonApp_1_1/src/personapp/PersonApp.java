
package personapp;


public class PersonApp {

    public static void main(String[] args) {

  // all People are Person.  Call Person behaviors get Person Method
  // call duties we get the override duties in the other classes not person  
      
      Person nurse1 = new Nurse("Nurse", "Florence", "Nightingale", "General Nurse");
      Person dr = new Doctor("Dr", "Jonas", "Salk", "Personal Doctor");
      Person drSurgeon = new Surgeon("Dr", "Paul", "Nassif", "Surgeon");
    
    // nurse  
      System.out.println(nurse1);
        
      String[] nurseWorkArray = nurse1.duties();
      
      for(String nurseWork : nurseWorkArray) {
           System.out.println(nurseWork);
       }
  
      System.out.println("\n**************************************\n");
     
    // Doctor
    
       System.out.println(dr);
        
       String[] doctorWorkArray = dr.duties();
       for(String drWork : doctorWorkArray) {
           System.out.println(drWork);
       }
 
      
       System.out.println("\n**************************************\n");
     
       
       // Surgeon
 
       System.out.println(drSurgeon);
        
       String[] surgeonWorkArray = drSurgeon.duties();
       for(String surgeonWork : surgeonWorkArray) {
           System.out.println(surgeonWork);
       }
       
    }
    
}
