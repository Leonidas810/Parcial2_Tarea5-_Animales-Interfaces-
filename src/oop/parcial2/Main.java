package oop.parcial2;
import oop.parcial2.animal.*;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<AnimalQueCamina> animalsQueCamina= new LinkedList<>();
        List<AnimalQueVuela> animalsQueVuela= new LinkedList<>();
        List<AnimalQueNada> animalsQueNada= new LinkedList<>();

        //Animales que Nadan
        animalsQueNada.add(new  Trucha(true));
        animalsQueNada.add(new Sardina(true));
        animalsQueNada.add(new Salmon(true));
        animalsQueNada.add(new Tilapia(true));
        animalsQueNada.add(new Tortuga(true));
        animalsQueNada.add(new Pato(true));

        //Animales que Vuelan
        animalsQueVuela.add(new Aguila(true));
        animalsQueVuela.add(new Condor(true));
        animalsQueVuela.add(new Gorrion(true));
        animalsQueVuela.add(new Halcon(true));

        //Animales que Caminan
        animalsQueCamina.add(new Perro(true));
        animalsQueCamina.add(new Gato(true));
        animalsQueCamina.add(new Pato(true));
        animalsQueCamina.add(new Tortuga(true));
        animalsQueCamina.add(new Raton(true));

        for(AnimalQueNada animalQueNada: animalsQueNada){
            System.out.println("Name con toString " + animalQueNada.toString());
            System.out.println("Name con getName: " + animalQueNada.getName());
            System.out.println("---------------------------------------");
        }
        for(AnimalQueVuela animalQueVuela: animalsQueVuela){
            System.out.println("Name con toString " + animalQueVuela.toString());
            System.out.println("Name con getName: " + animalQueVuela.getName());
            System.out.println("---------------------------------------");
        }
        for(AnimalQueCamina animalQueCamina: animalsQueCamina){
            System.out.println("Name con toString " + animalQueCamina.toString());
            System.out.println("Name con getName: " + animalQueCamina.getName());
            System.out.println("---------------------------------------");
        }


    }
}
