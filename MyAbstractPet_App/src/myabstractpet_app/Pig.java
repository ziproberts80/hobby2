
package myabstractpet_app;


public class Pig extends Pet {

     public Pig(String name, String animalType) {
        super(name,animalType );
    }
    
    
    
    @Override
    public void petSounds() {
        System.out.println("I make sounds like: Oink , Oink");
    }

    @Override
    public void foodPetEats() {
        System.out.println("I eat Pig Chow");
     }
    
}
