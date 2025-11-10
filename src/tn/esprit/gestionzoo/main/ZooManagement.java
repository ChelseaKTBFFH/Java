package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {

        Animal tiger = new Animal("Felidae", "Tiger", 12, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 25, true);
        Animal goat = new Animal("Bovidae", "Goat", 8, true);
        Animal duck = new Animal("Anatidae", "Duck", 3, false);
        Animal badAgeAnimal = new Animal("Unknown", "Baby", -2, false);

        Zoo myZoo = new Zoo("Wild Haven", "Ariana", 3);

        try {
            myZoo.addAnimal(tiger);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(giraffe);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(goat);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            // Test zoo plein
            myZoo.addAnimal(duck);

            // Test âge négatif
            myZoo.addAnimal(badAgeAnimal);

        } catch (ZooFullException e) {
            System.err.println("Erreur : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Erreur d'âge : " + e.getMessage());
        }

        myZoo.displayAnimals();

        System.out.println("\n=== Tests des interfaces et enums ===");

        // Test de la classe Aquatic (Carnivore)
        Aquatic dolphin = new Aquatic("Delphinidae", "Dolphin", 10, true, "Ocean");
        dolphin.eatMeat(Food.MEAT);
        dolphin.eatMeat(Food.PLANT);

        // Test de la classe Penguin (hérite d’Aquatic)
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 4, false, "Arctic", 25.5f);
        penguin.eatMeat(Food.MEAT);

        // Test de la classe Terrestrial (Omnivore)
        Terrestrial bear = new Terrestrial("Ursidae", "Bear", 15, true, 4);
        bear.eatPlant(Food.PLANT);
        bear.eatMeat(Food.MEAT);
        bear.eatPlantAndMeet(Food.BOTH);
    }
}
