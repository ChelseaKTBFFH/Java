package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {

        Animal tiger = new Animal("Felidae", "Tiger", 12, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 25, true);
        Animal goat = new Animal("Bovidae", "Goat", 8, true);
        Animal duck = new Animal("Anatidae", "Duck", 3, false);
        Animal dog = new Animal("Canidae", "Dog", 6, true);
        Animal cat = new Animal("Felidae", "Cat", 5, true);
        Animal badAgeAnimal = new Animal("Unknown", "Baby", -2, false);

        Zoo myZoo = new Zoo("Wild Haven", "Ariana", 3);

        try {
            myZoo.addAnimal(tiger);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(giraffe);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            myZoo.addAnimal(goat);
            System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

            // test zoo plein
            myZoo.addAnimal(duck);

            // test âge négatif
            myZoo.addAnimal(badAgeAnimal);

        } catch (ZooFullException e) {
            System.err.println("Erreur : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.err.println("Erreur d'âge : " + e.getMessage());
        }

        myZoo.displayAnimals();
    }
}
