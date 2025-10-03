package tn.esprit.gestionzoo.entities;

//instruction 5 + 6
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    //instruction 14
    static final int nbrCages=25;
    private int nbrAnimals;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages]; //always in constructor
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }


    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Name is empty");
        }
        else  {
            this.name = name;
        }
    }
    String getName() {
        return this.name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    String getCity() {
        return this.city;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    public int getNbrAnimals() {
        return this.nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NbrCages: "+nbrCages);
    }

    @Override
    public String toString(){

        return "Name: "+name+" City: "+city+" NbrCages: "+nbrCages;
    }

    //instruction 10
    public boolean addAnimal(Animal animal){
        //instruction 12
        if(this.searchAnimal(animal)!=-1 || isZoofull()){
            return false;
        }

        this.animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    //instruction 11
    public void displayAnimals(){
        for (int i=0;i<animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0;i<animals.length;i++){
            if(animals[i] !=null && animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    //instruction 13
    public boolean removeAnimal(Animal animal) {
        int i = this.searchAnimal(animal);
        if (i != -1) {
            this.animals[i] = null;
            nbrAnimals--;
            for(int j=i+1;j<nbrAnimals && this.nbrAnimals <= nbrCages;j++){
                this.animals[j] = this.animals[j+1];
                return true;
            }
        }
        return false;
    }

    //instruction 15
    public boolean isZoofull(){

        return nbrAnimals>=nbrCages;
    }

    //instruction 16
    public Zoo comparerZoo(Zoo z1 , Zoo z2){

        if(z1.nbrAnimals>z2.nbrAnimals){
            System.out.println("le tn.esprit.gestionzoo.entities.Zoo:" + z1.name +" a plus d'animaux");
            return z1;
        } else if (z2.nbrAnimals> z1.nbrAnimals) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo:" + z2.name +" a plus d'animaux");
            return z2;
        }else{
            System.out.println("les zoos ont le meme nombre d'animaux");
            return null;
        }
    }

}

