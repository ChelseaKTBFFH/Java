package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {

        Animal tiger = new Animal("Leo", "Tiger", 12, true);
        Animal giraffe = new Animal("Mira", "Giraffe", 25, true);
        Animal goat = new Animal("Luna", "Goat", 8, true);
        Animal duck = new Animal("Quacky", "Duck", 3, false);
        Animal dog = new Animal("Rocky", "Dog", 6, true);
        Animal cat = new Animal("Milo", "Cat", 5, true);

        Zoo myZoo = new Zoo("Wild Haven", "Ariana", 10);
        Zoo yourZoo = new Zoo("Sunny Park", "La Marsa", 20);

        System.out.println(tiger.toString());

        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(giraffe));
        System.out.println(myZoo.addAnimal(goat));
        System.out.println(myZoo.addAnimal(duck));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(tiger));

        myZoo.removeAnimal(goat);
        myZoo.displayAnimals();

        if (myZoo.isZoofull()) {
            System.out.println("Zoo is full");
        } else {
            System.out.println("Zoo still has space");
        }

        yourZoo.addAnimal(dog);
        yourZoo.addAnimal(giraffe);
        yourZoo.addAnimal(goat);
        yourZoo.addAnimal(duck);
        yourZoo.addAnimal(cat);
        yourZoo.displayAnimals();

        Zoo bestZoo = myZoo.comparerZoo(myZoo, yourZoo);

        Terrestrial turtle = new Terrestrial("Shelly", "Turtle", 40, false, 4);
        Aquatic dolphin = new Dolphin("Splashy", "Dolphin", 15, true, "Ocean", 70);
        Aquatic penguin = new Penguin("Pingo", "Penguin", 7, false, "Antarctica", 300);

        System.out.println("New Animals added");
        System.out.println(turtle.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        penguin.swim();
        dolphin.swim();

        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(dolphin);

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(penguin.equals(dolphin));
    }
}
