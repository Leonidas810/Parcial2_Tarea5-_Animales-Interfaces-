package oop.parcial2.animal;

public class Halcon extends Animal implements AnimalQueVuela{

    public Halcon(boolean eat){
        super("Halcon",eat);
    }

    @Override
    public String toString(){
        return "Halcon";
    }

    @Override
    public void volar() {

    }
}
