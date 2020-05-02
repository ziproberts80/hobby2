
package myabstractpet_app;


public class Dog extends Pet {

     public Dog(String name, String animalType) {
        super(name,animalType );
    }
    
    
    
    @Override
    public void petSounds() {
        System.out.println("I make sounds like: Woof Woof");
    }

    @Override
    public void foodPetEats() {
        System.out.println("I eat Dog Chow");
     }
    
}
