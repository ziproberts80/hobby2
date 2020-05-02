
package personapp;


public class PersonApp {

    public static void main(String[] args) {
      
      Nurse nurse1 = new Nurse("Nurse", "Florence", "Nightingale", "General Nurse");
      
      System.out.println(nurse1);
        
      String[] nurseWorkArray = nurse1.duties();
      
      for(String nurseWork : nurseWorkArray) {
           System.out.println(nurseWork);
       }
      
      System.out.println("\n**************************************\n");
     
       Doctor dr = new Doctor("Dr", "Jonas", "Salk", "Personal Doctor");
       System.out.println(dr);
        
       String[] doctorWorkArray = dr.duties();
       for(String drWork : doctorWorkArray) {
           System.out.println(drWork);
       }
 
      
       System.out.println("\n**************************************\n");
     
       Surgeon drSurgeon = new Surgeon("Dr", "Paul", "Nassif", "Surgeon");
       drSurgeon.setOccupation("plastic");
        
        
       System.out.println(drSurgeon);
        
       String[] surgeonWorkArray = drSurgeon.duties();
       for(String surgeonWork : surgeonWorkArray) {
           System.out.println(surgeonWork);
       }
       
    }
    
}
