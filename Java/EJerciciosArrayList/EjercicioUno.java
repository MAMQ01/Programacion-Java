package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        /* Realiza un programa que tenga un ArrayList llamado AlturaAlumnos que mantenga una
        lista con las alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50
        redondeados a dos decimales. El programa tendrá las siguientes funciones (accesibles
        mediante un menú): */

        /**
        a) Añadir altura.
        b) Mostrar lista actual con el número de posición.
        c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura
        en dicha posición.
        d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las
        posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
        e) Ordenar la lista
         */
        
        mostrarMenu();

        
    }
    
    
    public static void mostrarMenu(){
        char opcionSeleccionada = 'f';
        ArrayList<Double> arrayAlturas = new ArrayList<>();
        do {
            opcionesASeleccionar();
            opcionSeleccionada =  pideOpcionChar();
            switch (opcionSeleccionada) {
                case 'a': anadirAltura(arrayAlturas, pideAltura());
                    break;
                case 'b': 
                    mostrarListaActual(arrayAlturas); 
                    System.out.println(arrayAlturas);
                    break;
                case 'c': 
                    eliminarPorPosicion(arrayAlturas, pidePosicionAEliminar());
                    break;
                case 'd': eliminarPorValor(arrayAlturas, pideValorAEliminar());
                    break;
                case 'e': ordenarLista(arrayAlturas);
                    break;
                case '0': System.exit(0);
                    break;
                default:
                System.err.println("Introdujo una opción no válida.");
                    break;
            }
        } while (opcionSeleccionada!='0');
    }

    public static char pideOpcionChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea: ");
        char opcionSeleccionada = sc.nextLine().charAt(0);
        sc.close();
        return opcionSeleccionada;
    }

    public static double pideAltura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su altura: ");
        Double altura = sc.nextDouble();
        sc.close();
        return altura;
    }

    public static void opcionesASeleccionar(){
        System.out.println(
            """
            El menú que puede selecionar es: 
            a) Añadir altura
            b) Mostrar lista actual con el número de posición
            c) Eliminar por posición
            d) Eliminar por valor
            e) Ordenar lista

            0) SALIR
            """);
    }

    public static ArrayList<Double> anadirAltura(ArrayList<Double> arrayList, double alturaAlumnos){
        System.out.println("Menú añadir altura");
        arrayList.add(alturaAlumnos);
        System.out.println("----------------------------"+arrayList.get(0));
        return arrayList;
    }

    public static void mostrarListaActual(ArrayList<Double> arrayAlturas){
        System.out.println("Menú mostrarListaActual");
        int contador = 1;
        for (int i = 0; i < arrayAlturas.size(); i++) {
            System.out.println("Éste es el elemento #"+contador+" :"+arrayAlturas.get(i));
            contador++;
        }
    }

    public static double eliminarPorPosicion(ArrayList<Double> arrayList, int posicionAEliminar){
        System.out.println("Menú eliminarPosicion");
        double arrayConPosicionEliminada = arrayList.remove(posicionAEliminar);
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
        sc.close();
        return posicion;
    }

    public static void eliminarPorValor(ArrayList<Double> arrayList, double elementoAEliminar) {
        System.out.println("Menu eliminarPorValor");
        int contadorElementosBorrados = 0;
        ListIterator<Double> iterador = arrayList.listIterator();
        while (iterador.hasNext()) {
            double elementoActual = iterador.next();
            if (elementoActual == elementoAEliminar) {
                contadorElementosBorrados++;
                iterador.remove();
                System.out.println("El elemento #"+contadorElementosBorrados+":"+elementoAEliminar);
            }
        }
        System.out.println("Lista después de eliminar por valor: " + arrayList);
    }

    public static double pideValorAEliminar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiere eliminar: ");
        double aEliminar = sc.nextDouble();
        sc.close();
        return aEliminar;
    }

    public static ArrayList<Double> ordenarLista(ArrayList<Double> arrayList){
        System.out.println("Menú ordenarLista");
        System.out.println("Mostrando el array list antes: "+arrayList);
        Collections.sort(arrayList);
        System.out.println("Mostrando el array list después: "+arrayList);
        return arrayList;
    }

}
