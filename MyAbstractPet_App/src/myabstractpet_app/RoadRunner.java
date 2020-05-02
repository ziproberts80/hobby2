
package myabstractpet_app;

public class RoadRunner  extends Pet {

     public RoadRunner(String name, String animalType) {
        super(name,animalType );
    }
    
    
    
    @Override
    public void petSounds() {
        System.out.println("I make sounds like: Beep!! Beep!!");
    }

    @Override
    public void foodPetEats() {
        System.out.println("I eat Roadrunner Chow");
     }
    
}
