
package myabstractpet_app;

public abstract class Pet {
    private String name;
    private String animalType;

    public Pet(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }
    
    
    
    public abstract void petSounds();
    public abstract void foodPetEats();

    @Override
    public String toString() {
        String output= "My Pet is a " + animalType + "\nand his name is " + name;
        return output;
    }
    
    
    
}
