
package personapp;


public class PersonApp {

    public static void main(String[] args) {
      /*
        
        Person gary = new Person("Mister", "Gary", "Clifford", "Educator");
        System.out.println(gary);
        
      Person[] department = new Person [10];
      
      department[0] = new Person("Mr",   "Dick", "Cavett", "Accountant");
      department[1] = new Person("Miss", "Lucille", "Ball", "Finace Advisor");
      department[2] = new Person("Mister",   "Johnny", " Carson", "Sr Accountant");
      department[3] = new Person();
      department[4] = new Person("mr",   "Robin", " Williams", "Data Analyst");
      department[5] = new Person("mr.",   "Tom", "Hanks", "Accountant");
      department[6] = new Person("doc",   "Don", "Rickles", "Sr Data Analyst");
      department[7] = new Person("Doc",   "David", "Letterman", "Department Head");
      department[8] = gary;
      department[9] = new Person("Mr", "David", "Bowie", "Accountant");
     
      for(Person p : department )
            System.out.println(p);
        */
      
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
       System.out.println(drSurgeon);
        
       String[] surgeonWorkArray = drSurgeon.duties();
       for(String surgeonWork : surgeonWorkArray) {
           System.out.println(surgeonWork);
       }
       
    }
    
}
