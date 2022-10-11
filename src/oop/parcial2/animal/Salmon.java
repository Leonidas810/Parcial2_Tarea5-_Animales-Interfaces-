package oop.parcial2.animal;

public class Salmon extends Animal implements AnimalQueNada{

    public Salmon(boolean eat){
        super("Salmon",eat);
    }

    @Override
    public String toString(){
        return "Salmon";
    }

    @Override
    public void nadar() {

    }
}
