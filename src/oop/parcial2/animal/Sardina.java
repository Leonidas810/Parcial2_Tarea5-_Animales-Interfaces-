package oop.parcial2.animal;

public class Sardina extends Animal implements AnimalQueNada{

    public Sardina(boolean eat){
        super("Sardina",eat);
    }

    @Override
    public String toString(){
        return "Sardina";
    }

    @Override
    public void nadar() {

    }
}
