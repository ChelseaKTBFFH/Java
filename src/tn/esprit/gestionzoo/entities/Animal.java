package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age");
        }
        else  {
            this.age = age;
        }
    }
    int getAge(){
        return this.age;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    boolean isMammal() {
        return this.isMammal;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return "Family: "+family+" name: "+name+" age: "+age+" isMammal: "+isMammal;
    }



}