package oop.parcial2.animal;

public class Tortuga extends Animal implements AnimalQueCamina,AnimalQueNada{

    public Tortuga( boolean eat) {
        super("Tortuga", eat);
    }

    @Override
    public String toString(){
        return "Tortuga";
    }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }
}
