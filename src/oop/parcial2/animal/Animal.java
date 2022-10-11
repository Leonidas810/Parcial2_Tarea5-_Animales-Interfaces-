package oop.parcial2.animal;

public class Animal {
    private final String name;
    private final boolean eat;

    public Animal(String name,boolean eat){
        this.name=name;
        this.eat=eat;
    }

    public boolean isEat() {
        return eat;
    }

    public String getName(){
        return name;
    }
}
