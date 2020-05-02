
package inhert;


public class Inhert {

    public static void main(String[] args) {
      
        Student s = new Student("gary","clifford");
        System.out.println(s);
        System.out.println(s.workLoad());
        
        
        Teacher t = new Teacher("Charles", "Darwin");
        System.out.println(t);
        System.out.println(t.workLoad());
        
        Person p = new Teacher("Paul","Clifford");
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println((Teacher)p.workLoad());
       
        
        
    }
    
}
