package oop.parcial2.animal;

public class Condor extends Animal implements AnimalQueVuela{

    public Condor(boolean eat){
        super("Condor",eat);
    }
    @Override
    public String toString(){
        return "Condor";
    }

    @Override
    public void volar() {

    }
}
