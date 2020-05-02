
package myabstractpet_app;


public class MyAbstractPet_App {

    public static void main(String[] args) {
       
        Pet baconBits = new Pig("Nate", "Pig");
        Pet daffy = new Duck("Daffy", "Duck");
        Pet goofy = new Dog("Goofy", "Dog");
        Pet RR = new RoadRunner("RR", "Road Runner");
        
        System.out.println(baconBits);
        baconBits.foodPetEats();
        baconBits.petSounds();
        System.out.println("\n***************************************\n");
        
        System.out.println(daffy);
        daffy.foodPetEats();
        daffy.petSounds();
        System.out.println("\n***************************************\n");

        System.out.println(goofy);
        goofy.foodPetEats();
        goofy.petSounds();
        System.out.println("\n***************************************\n");

        System.out.println(RR);
        RR.foodPetEats();
        RR.petSounds();
        System.out.println("\n***************************************\n");



        
        
        
    }
    
}
