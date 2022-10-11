package oop.parcial2.animal;

public class Perro extends Animal implements AnimalQueCamina{
    public Perro(boolean eat) {
        super("Perro", eat);

    }
    @Override
    public String toString(){
        return "Perro";
    }

    @Override
    public void caminar() {

    }
}
