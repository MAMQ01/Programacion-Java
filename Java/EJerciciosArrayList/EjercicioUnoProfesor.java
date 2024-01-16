package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioUnoProfesor {

    /*
     * Ejercicio 1 – Alturas
     * Realiza un programa que tenga un ArrayList llamado AlturaAlumnos que mantenga
     * una
     * lista con las alturas de los alumnos de un centro. Serán valores positivos
     * entre 0,50 y 2,50
     * redondeados a dos decimales. El programa tendrá las siguientes funciones
     * (accesibles
     * mediante un menú):
     * a) Añadir altura.
     * b) Mostrar lista actual con el número de posición.
     * c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la
     * altura
     * en dicha posición.
     * d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas
     * las
     * posiciones en las que se encuentre dicha altura. Devuelve la cantidad de
     * eliminaciones.
     * e) Ordenar la lista
     */
    public static void main(String[] args) {
/*         ArrayList<Double> alturasAlumnos = new ArrayList<>();
        int opcionMenu = 0;
        do {
            opcionMenu=menu();
        } while (opcionMenu!='0');
        switch (opcionMenu {
            case 'a'-> anadirAltura(alturasAlumnos);
            case 'b'-> eliminarlista();
            case 'c'-> eliminarPosicion();
            case 'd'-> eliminarValor();
            case 'e'-> ordenarLista();
            case '0'-> System.exit(0);
        } */
    }
    /**
     * //Introducimos una altura en los Alumno
     * @param alturasAlumnos
     */
    private static void anadirAltura(ArrayList<Double> alturasAlumnos) {
        System.out.println("");
    }
    //  Funcion auxiliar para parametrizar la lectura de datos
    // @param validos cadena a comprobar con un matches
    // @param la cadena introducida

    private static double leerDato(String validos, String cadena){
        Scanner sc = new Scanner(System.in);
        boolean continuar=true;
        String opcion = "";
        while (continuar) {
            System.out.println("Introduce la opcion deseada: ");
            opcion = sc.nextLine();
            continuar=!opcion.matches("[abcde0]");
            if (continuar) {
                System.out.println("Opcion incorrecta.");
            }
        }
        return Double.parseDouble(opcion);
    }


    /* public static char menu(){
        System.out.println(
            """
            a) Añadir altura
            b) Eliminar lista actual
            c) Eliminar posicion
            d) Eliminar pore valor
            e) Ordenar lista

            0) SALIR
            """);
        String opcion=leerDato();
        return opcion.charAt(0);
    } */
}