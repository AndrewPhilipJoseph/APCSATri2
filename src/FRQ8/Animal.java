package FRQ8;

public class Animal {
   private String foodType;
   private String species;
   private String name;


   public Animal(String food, String animalType, String named) {
       foodType = food;
       species = animalType;
       name = named;
   }

   public String toString() {
       return(name + " the " + species + "is a " + foodType);
   }
}

class Herbivore extends Animal {

    public Herbivore(String animalType, String named) {
        super("herbivore", animalType, named);
    }
}


class Elephant extends Herbivore {

    private double tuskLength;

    public Elephant(String named, double tusk) {
        super("elephant", named);
        tuskLength = tusk;
    }

    public String toString() {
        return(super.toString() + " and has tusks of " + String.valueOf(tuskLength) + " in length");
    }
}