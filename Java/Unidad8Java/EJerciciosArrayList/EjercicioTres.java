package Unidad8Java.EJerciciosArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class EjercicioTres {
    public static void main(String[] args) {
        
        Productos productoUno = new Productos("Zapatos", 10);
        Productos productoDos = new Productos("Medias", 5);
        Productos productoTres = new Productos("Buzo", 8);
        Productos productoCuatro = new Productos("Jean", 16);
        Productos productoCinco = new Productos("Camiseta", 20);
        Productos productoSeis = new Productos("Camiseta", 20);

    
        ArrayList<Productos> arrayList = new ArrayList<>();
        arrayList.add(productoUno);
        arrayList.add(productoDos);
        arrayList.add(productoTres);
        arrayList.add(productoCuatro);
        arrayList.add(productoCinco);

        Iterator<Productos> iteradorProductos = arrayList.iterator();
        while (iteradorProductos.hasNext()) {
            Productos unProducto = iteradorProductos.next();
            System.out.println(unProducto); 
        }

        eliminarPorPosicion(arrayList, pidePosicionAEliminar());
        eliminarPorPosicion(arrayList, pidePosicionAEliminar());
        arrayList.removeAll(arrayList);
        mostrarListaActual(arrayList);
        insertaObjetoEnMedioDeLaLista(arrayList, productoSeis);
        mostrarListaActual(arrayList);
    }

    public static Productos eliminarPorPosicion(ArrayList<Productos> arrayList, int posicionAEliminar){
        System.out.println("Eliminó un objeto");
        Productos arrayConPosicionEliminada = arrayList.remove(posicionAEliminar);
        return arrayConPosicionEliminada;
    }

    public static int pidePosicionAEliminar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición que desea eliminar: ");
        int posicion = sc.nextInt();
        if(posicion>0){
            posicion--;
        }else{
            System.err.println("No tiene ningún elemento en su lista");
        }
        return posicion;
        //Por que aca el sc.close()/Scanner da problema
    }

    public static void mostrarListaActual(ArrayList<Productos> arrayList){
        System.out.println("Mostrar ArrayList Productos");
        Iterator<Productos> iteradorProductos = arrayList.iterator();
        /* System.out.println("Menú mostrarListaActual");
        int contador = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Éste es el elemento #"+contador+" :"+arrayList.get(i));
            contador++;
        } */
        /* for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(iteradorProductos.toString());
        }
        System.out.println("Aca salida por For i --------------------"); */
        /* for (Productos productos : arrayList) {
            System.out.println(productos);
        }
        System.out.println("Aca salida por For Each --------------------"); */
        while (iteradorProductos.hasNext()) {
            System.out.println(iteradorProductos.next());
        }
        System.out.println("Aca salida por For iterator.hasNext --------------------");
    }

    public static void insertaObjetoEnMedioDeLaLista(ArrayList<Productos> arrayList, Productos agregarProducto){
        int tamañoLista = arrayList.size();
        int posicionBuscada = tamañoLista/2;
        if (posicionBuscada >= 0 && posicionBuscada <= tamañoLista) {
            arrayList.add(posicionBuscada, agregarProducto);
        } else {
            System.out.println("Posición buscada no es válida");
        }
    }
}
