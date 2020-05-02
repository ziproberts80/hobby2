
package myabstractpet_app;


public class Duck extends Pet {

     public Duck(String name, String animalType) {
        super(name,animalType );
    }
    
    
    
    @Override
    public void petSounds() {
        System.out.println("I make sounds like: Quack Quack");
    }

    @Override
    public void foodPetEats() {
        System.out.println("I eat Duck Chow");
     }
    
}
