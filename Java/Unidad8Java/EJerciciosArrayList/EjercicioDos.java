package Unidad8Java.EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioDos {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        /* Ejercicio 2- Divisores
        Realizar un programa que tenga una función a la que se le pasa un entero y devuelva un
        ArrayList con todos sus divisores. */

        int numero = 0;
        do {
            System.out.println("De cuál número desea ver los posibles divisores enteros? : ");
            while (!sc.hasNextInt()) {
                System.out.println("Error! introduzca de nuevo el número");
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero<=0);
        posiblesDivisores(numero);
    }
    
    public static ArrayList<Double> posiblesDivisores(int numero){
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                arrayList.add((double)i);
            }
        }
        // ListIterator<Double> listIterator = arrayList.listIterator(numero);
        System.out.println(arrayList);
        return arrayList;
    }
}
