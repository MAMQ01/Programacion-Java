package Unidad9Java.macotas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    private ArrayList<Mascotas> lista = new ArrayList<>();

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Perro salchicha = new Perro("Milo", LocalDate.of(2000, 10, 20), "Salchicha", 10);
        inventario.anyadirMascota(inventario.lista, salchicha);
        Canario canarioLujo = new Canario("Pepe", LocalDate.of(2001, 10, 20), "Puntiagudo", true, false, Canario.Color.AZUL);
        inventario.anyadirMascota(inventario.lista, canarioLujo);
        Perro salchichaDos = new Perro("Milo", LocalDate.of(2000, 10, 20), "Salchicha", 10);
        inventario.anyadirMascota(inventario.lista, salchichaDos);
        Canario canarioLujoDos = new Canario("Pepe", LocalDate.of(2001, 10, 20), "Puntiagudo", true, false, Canario.Color.AZUL);
        inventario.anyadirMascota(inventario.lista, canarioLujoDos);

        //inventario.mostrarListaMascotas();
        inventario.mostrarListaMascotas();
        inventario.mostrarMascota(salchicha);
        System.out.println("________________________________");
        inventario.vaciarInventario();
        inventario.mostrarListaMascotas();
    }

    public ArrayList<Mascotas> getLista() {
        return lista;
    }
    public void setListadoMascotasEnTienda(ArrayList<Mascotas> lista) {
        this.lista = lista;
    }

    public void mostrarListaMascotas(){
        for (Mascotas mascota : lista) {
            if (mascota instanceof Aves){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() +" y su nombre es: " + mascota.getNombre());
            } else if (mascota instanceof Canario){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() + " y su nombre es: " + mascota.getNombre());
            } else if (mascota instanceof Canario){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() + " y su nombre es: " + mascota.getNombre());
            } else if (mascota instanceof Loro){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() + " y su nombre es: " + mascota.getNombre());
            } else if (mascota instanceof Gato){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() + " y su nombre es: " + mascota.getNombre());
            } else if (mascota instanceof Perro){
                System.out.println("Su tipo es " + mascota.getClass().getSimpleName() + " y su nombre es: " + mascota.getNombre());
            }
        }
    }

    public void mostrarMascota(Mascotas mascota){
        System.out.println(mascota.muestra());
    }

    public void anyadirMascota(ArrayList<Mascotas> lista, Mascotas mascota){
        ArrayList<Mascotas> nuevaLista = lista;
        nuevaLista.add(mascota);
    }

    public void eliminarMascota(ArrayList<Mascotas> lista, Mascotas mascota){
        ArrayList<Mascotas> nuevaLista = lista;
        nuevaLista.remove(mascota);
    }

    public void vaciarInventario(){
        Iterator<Mascotas> iter = lista.iterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
    }
    
    //No entiendo por que me sale error parece Exception in thread "main" java.util.ConcurrentModificationException
    /* public void vaciarInventario(){
        for (Mascotas mascotas : lista) {
            eliminarMascota(lista, mascotas);
        }
    } */

}
