
package inhert;


public class Student extends Person{
    
    public Student (String fn, String ln){
        super(fn,ln);
        
    }
    
 
    public String toString(){
        return("You are " + super.firstName + " " + super.lastName);
    }
    
    public String workLoad(){
        return("You are taking 10 classes in the evening school");
    }
    
}
