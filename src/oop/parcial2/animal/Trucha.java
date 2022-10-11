package oop.parcial2.animal;

public class Trucha extends Animal implements AnimalQueNada{

    public Trucha(boolean eat){
        super("Trucha",eat);
    }
    @Override
    public String toString(){
        return "Trucha";
    }

    @Override
    public void nadar() {

    }
}
