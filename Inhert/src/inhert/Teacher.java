
package inhert;


public class Teacher extends Person{
    public Teacher(){
        
    }
    
    public Teacher(String fn, String ln){
        super(fn, ln);
    }
    
    public String toString(){
        return("You are " + super.firstName + " " + super.lastName);
    }
    
    public String workLoad(){
        return("You are teaching 2 class at evening schooll");
    }
}
