package oop.parcial2.animal;

public class Tilapia extends Animal implements AnimalQueNada{

    public Tilapia(boolean eat){
        super("Tilapia",eat);
    }

    @Override
    public String toString(){
        return "Tilapia";
    }

    @Override
    public void nadar() {

    }
}
