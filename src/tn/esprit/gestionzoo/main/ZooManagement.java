package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {

        Animal lion=new Animal("Asad","Simba",90,true);
        Animal bagra=new Animal("Thadyiyet","Mariem",90,true);
        Animal ma3za=new Animal("Thadyiyet","Chahd",10,true);
        Zoo myZoo=new Zoo("Zoo","ariana",4);
        Zoo tonZoo=new Zoo("meow","tunis",5);





        System.out.println(lion.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(bagra));
        System.out.println(myZoo.addAnimal(ma3za));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));

        myZoo.removeAnimal(ma3za);
        myZoo.displayAnimals();
        if(myZoo.isZoofull()){
            System.out.println("zoo complet");
        }else{
            System.out.println("zoo mrgl");
        }

        tonZoo.addAnimal(lion);
        tonZoo.addAnimal(bagra);

        tonZoo.displayAnimals();
        Zoo superZoo=myZoo.comparerZoo(myZoo,tonZoo);

    }
}