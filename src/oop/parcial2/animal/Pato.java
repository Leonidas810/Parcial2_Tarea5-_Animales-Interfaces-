package oop.parcial2.animal;

public class Pato extends Animal implements AnimalQueCamina,AnimalQueNada{

    public Pato(boolean eat) {
        super("Pato", eat);
    }

    @Override
    public String toString(){
        return "Pato";
    }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }
}
