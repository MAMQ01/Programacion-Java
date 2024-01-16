package EJerciciosArrayList;

import java.util.ArrayList;
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
                case 'c': eliminarPorPosicion(0);
                    break;
                case 'd': eliminarPorValor(0);
                    break;
                case 'e': ordenarLista(0);
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
        return opcionSeleccionada;
    }

    public static double pideAltura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su altura: ");
        Double altura = sc.nextDouble();
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
        System.out.println("Menu añadir altura");
        arrayList.add(alturaAlumnos);
        System.out.println("----------------------------"+arrayList.get(0));
        return arrayList;
    }

    public static void mostrarListaActual(ArrayList<Double> arrayAlturas){
        System.out.println("Menu mostrarListaActual");
        for (Double elemento : arrayAlturas) {
            int contador = 0;
            System.out.println("Este es el elemento #"+(contador+1)+" :"+elemento);
            contador++;
        }
    }

    public static int eliminarPorPosicion(int posicionAEliminar){
        System.out.println("Menu eliminarPosicion");
        int cantidadEliminaciones=0;
        return cantidadEliminaciones;
    }

    public static void eliminarPorValor(int alturaAlumnos){
        System.out.println("Menu eliminarPorValor");
    }

    public static void ordenarLista(int alturaAlumnos){
        System.out.println("Menu ordenarLista");
    }

}
