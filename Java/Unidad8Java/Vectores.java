package Unidad8Java;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vectores {
    //Pide 10 numeros por teclado y los muestra
    public static double[] pideDiezNumerosDoublePorTeclado(){
        Scanner sc = new Scanner(System.in);
        double[] arrayDiezNumeros = new double[10];
        for (int i = 0; i < arrayDiezNumeros.length; i++) {
            System.out.println("Introduzca uno de los numeros a almacenar");
            arrayDiezNumeros[i] = sc.nextDouble();
        }
        return arrayDiezNumeros;
    }
    //Suma un array devuelve un double
    public static double sumaArray(double[] array){
        double suma = 0;
        for (double d : array) {
            suma +=+ d;
        }
        return suma;
    }
    //Minimo y maximo array double
    public static void minimoMaximoDeArrayDouble(){
        double[] array = pideDiezNumerosDoublePorTeclado();
        double minimo = array[0];
        double maximo = array[0];
        for (double d : array) {
            minimo = Math.min(minimo, d);
            maximo = Math.max(maximo, d);
        }
        System.out.println("El minimo es:"+minimo+" el maximo es maximo:"+maximo);
    }

    //Pide 20 numeros double por teclado
    public static double[] pideVeinteNumerosDoublePorTeclado(){
        Scanner sc = new Scanner(System.in);
        double[] arrayVeinteNumeros = new double[20];
        for (int i = 0; i < arrayVeinteNumeros.length; i++) {
            System.out.println("Introduzca uno de los numeros a almacenar");
            arrayVeinteNumeros[i] = sc.nextDouble();
        }
        return arrayVeinteNumeros;
    }

    //Pide 20 numeros enteros por teclado
    public static void pideVeinteNumerosIntPorTeclado(){
        Scanner sc = new Scanner(System.in);
        int positivos=0;
        int negativos=0;
        int[] arrayVeinteNumeros = new int[20];
        for (int i = 0; i < arrayVeinteNumeros.length; i++) {
            System.out.println("Introduzca uno de los numeros a almacenar");
            arrayVeinteNumeros[i] = sc.nextInt();
            if(arrayVeinteNumeros[i]<0){
                negativos+=arrayVeinteNumeros[i];
            } else {
                positivos+=arrayVeinteNumeros[i];
            }
        }
        System.out.println("La suma de los numeros negativos es:"+negativos);
        System.out.println("La suma de los numeros positivos es:"+positivos);
    }

    public static double mediaArray(double[] array){
        double media = sumaArray(array)/array.length;
        return media;
    }

    //Array tamaño N con M en todas sus posiciones
    public static int[] arrayNM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud el array");
        int N = sc.nextInt();
        System.out.println("Introduzca con que numero lo quiere completar");
        int M = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = M;
        }
        return array;
    }

    //Array tamaño P, dentro del array van los numeros entre P y Q
    public static void arrayPContienePHastaQ(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca P");
        int P = sc.nextInt();
        System.out.println("Introduzca Q");
        int Q = sc.nextInt();
        int[] array = new int[Math.abs(P-Q)+1];
        int direccion = (P<Q)?1:-1;
        for (int i = 0; i < array.length; i++) {
            array[i]=P;
            P+=direccion;
        }
        System.out.println(Arrays.toString(array));
    }
    // PREGUNTAR POR QUE FUNCIONA double randomInRange = a + (Math.random() * (b - a));
    //Array de 100 numeros aleatorios entre 0.0 y 1.0 y cuantos numeros son >= a R
    public static void arrayCienDoubleEntre0Y1(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // Este recibe datos con .
        // Scanner sc = new Scanner(System.in) este solo recibe datos con coma
        double array[] = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=Math.random();
        }
        System.out.println("Introduce R para ver cuantos numeros son >= a R");
        double r = sc.nextDouble();
        System.out.println(r);
        int contadorMayoresAR = 0;
        for (double elemento : array) {
            if(elemento>=r){
                contadorMayoresAR++;
            }
        }
        System.out.println(contadorMayoresAR);
        sc.close();
    }

    public static void arrayCienIntEntre1Y10(){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (1 + Math.random()*10);
        }
        System.out.println("Introduzca el numero para buscar cuantas veces está dentro del array aleatorio 1-10");
        int valorABuscar = sc.nextInt();
        //System.out.println("El array original es: "+Arrays.toString(array));
        boolean encontrado = false;
        System.out.print("El valor " + valorABuscar + " aparece en el indice: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorABuscar) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El valor " + valorABuscar + " no se encuentra en el array");
        }
    }

    public static void minimoMaximo(double[] array){
        double minimo = array[0];
        double maximo = array[0];
        for (double d : array) {
            minimo = Math.min(minimo, d);
            maximo = Math.max(maximo, d);
        }
        System.out.println("El minimo es:"+minimo+" el maximo es maximo:"+maximo);
    }

    public static void haceCalculosAlturas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos datos desea introducir");
        int cantidadDeseada = sc.nextInt();
        double[] n = new double[cantidadDeseada];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Introduzca la altura en metros");
            n[i] = sc.nextDouble();
        }
        minimoMaximo(n);
        mediaArray(n);
        mayorOMenorAMedia(n);
    } 
    //Cuantas personas estan por encima y por debajo de la media
    public static void mayorOMenorAMedia(double[] array){
        int mayoresAlaMedia = 0;
        int menoresAlaMedia = 0;
        int igualesAlaMedia = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>mediaArray(array)){
                mayoresAlaMedia+=1;
            } else if (array[i]<mediaArray(array)){
                menoresAlaMedia+=1;
            } else {
                igualesAlaMedia+=1;
            }
        }
        System.out.println("Mayores a la media: "+mayoresAlaMedia+" menor a la media: "+menoresAlaMedia+" iguales a la media: "+igualesAlaMedia);
    }

    public static void main(String[] args) {
        //VECTORES
        /* 1. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego muestre todos sus valores. */
        //System.out.println(Arrays.toString(pideDiezNumerosDoublePorTeclado()));
        
        /* 2. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego muestre la suma de todos los valores. */
        
        //System.out.println(sumaArray(pideDiezNumerosDoublePorTeclado()));
        
        /* 3. Crea un programa que pida diez números reales por teclado, los almacene en un
        array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla. */
        
        //minimoMaximoDeArrayDouble();
        
        /* 4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos. */
        
        //pideVeinteNumerosIntPorTeclado();
        
        /* 5. Crea un programa que pida veinte números reales por teclado, los almacene en un
        array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
        valores. */ 
        
        //System.out.println(mediaArray(pideDiezNumerosDoublePorTeclado()));
        
        /* 6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla. */
        
        //System.out.println(Arrays.toString(arrayNM()));
        
        /* 7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que
        contenga todos los valores desde P hasta Q, y lo muestre por pantalla. */
        
        //arrayPContienePHastaQ();
        
        /* 8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
        mostrará cuántos valores del array son igual o superiores a R. */
        
        //arrayCienDoubleEntre0Y1();
        
        /* 9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N. */
        
        //arrayCienIntEntre1Y10();
        
        /* 10. Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
        teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas
        miden por encima y por debajo de la media. */
        
        //haceCalculosAlturas();

        //--------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------
        
    }
}
