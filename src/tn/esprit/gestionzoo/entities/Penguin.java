package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float SwimmingDepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return super.toString()+" Swimming Depth: "+swimmingDepth;
    }

    @Override
    public void swim(){
        System.out.println("This Penguin is swimming");
    }
}
