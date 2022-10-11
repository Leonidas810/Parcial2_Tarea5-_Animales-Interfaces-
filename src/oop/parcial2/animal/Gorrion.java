package oop.parcial2.animal;

public class Gorrion extends Animal implements AnimalQueVuela{

    public Gorrion(boolean eat){
        super("Gorrion",eat);
    }
    @Override
    public String toString(){
        return "Gorrion";
    }

    @Override
    public void volar() {

    }
}
