package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    private String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    //getter
    public String getHabitat() {
        return habitat;
    }

    //setter
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return super.toString()+" habitat: "+habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj){
        if(null==obj){
            return false;
        }
        if(obj instanceof Aquatic aquatic){
            return getName().equals(aquatic.getName()) && getAge()==aquatic.getAge() && habitat.equals(aquatic.habitat);
        }
        return false;
    }

}

