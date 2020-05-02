
package primitives;

public class Primitives {


    public static void main(String[] args) {
        
        String name;
        String returnValue;
        name = "Paul";
         
        System.out.println("Name is : " + name);
         
        returnValue = changeString(name);
        
        System.out.println("Name is : " + name);
        
    }
    
    public static String changeString(String s){
        s = "Michael";
        return s;
    }
    
}
