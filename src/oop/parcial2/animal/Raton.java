package oop.parcial2.animal;

public class Raton extends Animal implements AnimalQueCamina{

    public Raton(boolean eat){
        super("Raton",eat);
    }

    @Override
    public String toString(){
        return "Raton";
    }

    @Override
    public void caminar() {

    }
}
