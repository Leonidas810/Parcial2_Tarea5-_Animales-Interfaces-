package oop.parcial2.animal;

public class Gato extends Animal implements AnimalQueCamina{

    public Gato(boolean eat){
        super("Gato",eat);
    }

    @Override
    public String toString(){
        return "Gato";
    }
     @Override
     public void caminar() {

      }
}
