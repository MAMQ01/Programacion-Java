package Unidad9Java.ejercicioGuiado;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> listaAnimales = new ArrayList<>();

    public boolean añadirAnimal(ArrayList<Animal> listaAnimales, Animal animalAgregar){
        return false;
    }

    public boolean eliminarAnimal(ArrayList<Animal> listaAnimales, Animal animalEliminar){
        return true;
    }

    public void listaAnimales(){
        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }

}
