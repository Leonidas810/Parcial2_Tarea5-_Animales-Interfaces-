package oop.parcial2.animal;

public class Aguila extends Animal implements AnimalQueVuela{

    public Aguila(boolean eat){
        super("Aguila",eat);
    }
    @Override
    public String toString(){
        return "Aguila";
    }

    @Override
    public void volar() {

    }
}
