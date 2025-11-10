package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " habitat: " + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aquatic aquatic) {
            return getName().equals(aquatic.getName())
                    && getAge() == aquatic.getAge()
                    && habitat.equals(aquatic.habitat);
        }
        return false;
    }

    // Méthode de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande dans l’eau !");
        } else {
            System.out.println(getName() + " ne mange pas de plantes !");
        }
    }
}
