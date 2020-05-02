
package workerapp;


public class WorkerApp {

    public static void main(String[] args) {
     
        
        Worker mary = new Worker("Dr", "Mary", "Wilson",25000, "Active");
        Worker ted = new Worker("Mister", "Ted", "Wilson",35000, "Term");
        Worker claire = new Worker("Doc", "Claire", "Wilson",45000, "Active");
        Worker karen = new Worker("Mrs.", "Karen", "Wilson",55000, "Terminated");
        Worker cathy = new Worker("Mrs.", "Cathy", "Wilson",65000, "Gone");
   
         System.out.println(mary + "\n");
         System.out.println(ted + "\n");
         System.out.println(claire + "\n");
         System.out.println(karen + "\n");
         System.out.println(cathy + "\n");
        
    }
    
}
