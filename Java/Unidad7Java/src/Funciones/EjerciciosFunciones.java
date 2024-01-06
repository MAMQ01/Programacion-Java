package Funciones;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjerciciosFunciones {


/* 19.Escribe un programa que pida dos números reales por teclado y muestre por
pantalla el resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b)  */
// Devuelve la multiplicación de dos números

    public static double multiplica(double a, double b){
        return a*b;
    }

/* 20.Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
mayor de edad o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) */ 
// Devuelve verdadero si a>=18, falso en caso contrario

    public static boolean esMayorEdad(int a){
        if(a>=18){
            return true;
        } else {
            return false;
        }
    }

/* 21.Escribe un programa que pida dos números enteros por teclado y muestre por
pantalla cual es el mínimo. Implementa y utiliza la función:
int minimo(int a, int b) */ 
// Devuelve el menor entre a y b

    public static int minimo(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    };

/* 22.Escribe un programa que pida un número entero por teclado y muestre por
pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) */ 
// Devuelve -1 si es negativo, 1 si es positivo

    public static int dimeSigno(int a){
        if(a>0){
            return 1;
        }else if(a<0){
            return -1;
        }else{
            return 0;
        }
    }

/* 23.Escribe un programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y
utiliza la función:
double millas_a_kilometros(int millas) */ 
// Devuelve la conversión de millas a kilómetros

    public static double millas_a_kilometros(double millas){
        double kilometros;
        kilometros = millas/1.60934;
        return kilometros;
    }

/* 24.Escribe un programa que pida cinco precios y muestre por pantalla el precio de
venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función
double precioConIVA(double precio) */ 
// Devuelve el precio tras sumarle un 21% de IVA

    public static double precioConIVA(double precio){
        return precio * 1.21;
    }

/* 25.Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
pantalla su área y su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área */

    public static double perimetroRectangulo(double ancho, double alto){
        return 2*(alto+ancho);
    }

    public static double areaRectangulo(double ancho, double alto){
        return alto*ancho;
    }

/* 26.Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n */

    public static int suma1aN(int n){
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria=sumatoria+i;
        }
        return sumatoria;
    }

    public static int producto1aN(int n){
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto=producto*i;
        }
        return producto;
    }

    public static double intermedio1aN(int n){
        double media = 0;
        media = suma1aN(n)/n;
        return media;
    }

/* 27.Realiza una función llamada sumaIntervalo() que le pasan dos long y devuelve otro
long con la suma de los números comprendidos entre los números pasados (el
primero es menor que el segundo, y ambos mayores que cero, en caso contrario
devuelve -1) */

    public static long sumaIntervalo(long numUno, long numDos){
        if (numUno>numDos && (numUno>0 && numDos>0)) {
            long acumulado = 0;
            for (long i = numDos; i <= numUno; i++) {
                acumulado = numUno + i;
            }
            return acumulado;
        } else {
            return -1;
        }
    }

/* 28.Realiza una función llamada contarCeros() que se le pasa una cadena y devuelve la
cantidad de ceros que tiene. */

    public static int contarCeros(String cadena){
        int contadorCeros = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contadorCeros++;
            }
        }
        return contadorCeros;
    }

/* 29.Realiza una función llamada aleatorio() que se le pasan dos valores enteros
devuelve un entero al azar comprendido entre esos dos valores (el primero es
menor que el segundo, y ambos mayores que cero, en caso contrario devuelve -1) */

    public static int aleatorio(int minimo, int maximo){
        Random numero = new Random();
        int numAzarEntre;
        if(minimo<maximo && (minimo>0 && maximo>0)){
            numAzarEntre = numero.nextInt(((maximo-minimo)+1))+minimo;
        } else {
            return -1;
        }
        return numAzarEntre;
    }

/* 30.Programa que presente un menú y permita calcular repetidas veces a) el área de
círculo (necesitará el radio) , b) el área de cuadrado (ecesitará el lado) , c) el área de
triángulo (necesitará base y altura) d) Salir. Usar funciones para cada una de las 3
opciones. */

    public static double areaCirculo(double radioCirculo){
        return Math.PI*(radioCirculo*radioCirculo);
    }

    public static double areaCuadrado(double ladoCuadrado){
        double areaCuadrado = ladoCuadrado*2;
        return areaCuadrado;
    }

    public static double areaTriangulo(double baseTriangulo, double alturaTriangulo){
        return baseTriangulo*alturaTriangulo*0.5;
    }

    public static void calculaRepetidasVeces(){
        boolean continuar=true;
        while (continuar) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione la opcion que desea:");
            System.out.println("a) Calcula el area de un circulo");
            System.out.println("b) Calcula el area de un cuadrado");
            System.out.println("c) Calcula el area de un Triangulo");
            System.out.println("d) Para salir");
            System.out.println("Seleccione su opción");
            String mensaje = sc.nextLine();
            if(mensaje.length()<2 && mensaje.toLowerCase().contains("d")){
                continuar = false;
            } else if(mensaje.length()<2 && mensaje.toLowerCase().equals("c")) {
                System.out.println("Ingrese la base del triangulo para calcular su area");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo para calcular su area");
                double altura = sc.nextDouble();
                System.out.println("El area del triangulo es: "+areaTriangulo(base, altura));
            } else if(mensaje.length()<2 && mensaje.toLowerCase().equals("b")) {
                System.out.println("Ingrese el lado del cuadrado para calcular su area");
                double lado = sc.nextDouble();
                System.out.println("El area del cuadrado es: "+areaCuadrado(lado));
            } else if(mensaje.length()<2 && mensaje.toLowerCase().equals("a")) {
                System.out.println("Ingrese el radio del circulo para calcular su area");
                double radio = sc.nextDouble();
                System.out.println("El area del circulo es: "+areaCirculo(radio));
            }  
        }
        System.out.println("Finalizado! Salio del menú");
    }

/* 31.Hacer una función llamada CalcularDiasMes que se le pase como parámetro un
año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los años
bisiestos. A continuación, realizar un programa al que se le introduzca una fecha y
nos informe de los días pasados desde el 1 de enero de ese año. */

    public static int calcularDiasMes(int anyo, int mes){
        int diasMes = 0;
        boolean anyoBisiesto=false;
        if((anyo%4==0 && anyo%100!=0) || anyo%400==0){
            anyoBisiesto = true;
        }
        System.out.printf("El año %d %s %n",anyo,(anyoBisiesto? "es bisicesto":"no es bisiesto "));
        if(mes>=1 && mes<=12){
            for (int i = 1; i <= mes; i++) {
            switch (i) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes=diasMes+31;
                break;
            case 2:
                diasMes=diasMes+(anyoBisiesto? 29:28);
                break;
                }
            }
        } else {
            System.err.println("Mes desconocido");
        }
        return diasMes;
    }
    /* System.out.printf("El mes %d tiene: %d",mes, diasMes ); */

/* 32.Programa que calcule el factorial de números menores de 20. El programa permite
al usuario meter los números que desee y finalizará cuando meta un número
menor que 1 o mayor que 20. Crea las funciones que consideres útiles y que
puedas reutilizar en otros programas. */

    public static void calcularFactorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula factorial de numeros menores de 20 y mayores de 0 ingrese el número");
        int hastaNumero = sc.nextInt();
        while (hastaNumero >= 0 && hastaNumero <= 19) {
            System.out.println("Ingresó el número: " + hastaNumero);
            System.out.println("El factorial de " + hastaNumero + " es: " + producto1aN(hastaNumero));
            System.out.println("Ingrese otro número o un valor fuera del rango para finalizar.");
            hastaNumero = sc.nextInt();
        }
        System.out.println("Finalizo el programa calcularFactorial");
    }


    /* public static String desordenar(String cadena){
        StringBuilder stringBuilder=new StringBuilder(cadena);
        stringBuilder.replace(0,ThreadLocalRandom.current().nextInt(cadena.length()),"iiiii");
        return stringBuilder.toString();
    } */

    /* 33.Realiza una función llamada cantidadDivisores al que se le pase como parámetro
    un número entero y devuelva el número de divisores o bien cero si el número negativo */

    public static int cantidadDivisores(int numeroParametro){
        if(numeroParametro>0){
            int contadorDivisores = 0;
            for (int i = 1; i <= numeroParametro; i++) {
                if(numeroParametro%i==0){
                    contadorDivisores++;
                }
            }
            return contadorDivisores;
        }else{
            return 0;
        }
    }

    /* 34.Un número primo es aquel que solo tiene como divisores el número 1 y a él
    mismo. Usando la función del programa anterior, haz un programa que muestre la
    suma de los números primos comprendidos entre 1 y 1000. */
    public static void sumaPrimosComprendidos1A1000(){
        int acumulado = 0;
        for (int i = 1; i <= 1000; i++) {
            if(cantidadDivisores(i)==2){
                acumulado+=i;
            }
        }
        System.out.println(acumulado);
    }

    
    /* 35.Crea las siguientes funciones matemáticas:
    a. masPrimo: Devuelve el siguiente menor primo que es mayor a un número que 
    se le pasa como parámetro.
    b. digitos. Devuelve el número de dígitos que tiene un número que se le pasa 
    como parámetro
    c. digitoN. Devuelve el dígito en la posición n de un número entero que se le pasa
    como parámetro. Si no lo encuentra devuelve -1.
    d. posicionDigito. Devuelve la primera posición de un dígito en un número 
    entero. Devuelve -1 si no lo encuentra. */

    public static int masPrimo(int numero) {
        while (true) {
            numero++;
            int contadorDivisores = 0;
    
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }
    
            if (contadorDivisores == 2) {
                return numero;
            }
        }
    }

    public static int digitos(int numero){
        String numeroString = Integer.toString(numero);
        return numeroString.length();
    }


    /* 36.Crea una función letraNIF a la cual se le introduce un un número de 8 cifras que
    representa un DNI y nos devolverá la letra asociada a ese DNI. Si el número
    introducido no tiene la longitud adecuada devolverá el carácter ‘-’. */

    public static char letraNIF(int dni){
        int residuoDNI = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if(digitos(dni)==8){
            residuoDNI = dni%23;
            char letra = letras.charAt(residuoDNI);
            return letra;
        }else{
            System.err.println("ERROR! DNI invalido, son 8 numeros");
            return '-';
        }
    }
    

    /* 37.Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y
    “2.Área”.
    En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el
    cálculo oportuno. Implementa las funciones:
    • int menu() // Muestra el menú y devuelve el número elegido
    • double pideRadio() // Pide que se introduzca el radio y lo devuelve
    • double circunferencia(double r) // Calcula la circunferencia y la devuelve
    • double area(double r) // Calcula el área y la devuelve
    Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el
    usuario también pueda solicitar el cálculo del volumen. Añade la función:
    • double volumen(double r) // Calcula el volumen y lo devuelve
    Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio
    una sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
    Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar
    menú -> realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada
    “Salir” que terminará el programa si es elegida.  */
    
    public static void menuCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("muestra menu circu");
        System.out.println("introduzca un radio y luego se le mostrará el cálculo oportuno");
        sc.nextDouble();
    }

    public static void menuArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("muestra menu area");
        System.out.println("introduzca un radio y luego se le mostrará el cálculo oportuno");
        sc.nextDouble();
    }

    /* 38.Generador de contraseñas seguras.
    Vamos a crear una función para generar contraseñas seguras. A la función se le pasarán
    como parámetros las opciones de generación de la contraseña y devolverá una cadena
    de caracteres con la clave generada. 
    Los parámetros de la función serán:
    • Número de caracteres a generar. 
    • Nivel de seguridad: que corresponderá a las siguientes opciones
    ◦ 1. contraseña con letras minúsculas
    ◦ 2. contraseña con letras minúsculas y mayúsculas (al menos 1 de cada)
    ◦ 3. contraseñas con mayúsculas, minúsculas y números (al menos 1 de cada)
    ◦ 4. contraseñas con mayúsculas, minúsculas, números y símbolos (al menos 1
    de cada)
    Las letras que podemos usar son:
    • Letras en mayúsculas: A a Z (abcdefghijklmnopqrtsuvwxyz)
    • Letras en minúsculas: a a z (26 caracteres)
    • Números: 0 a 9 (10 caracteres)
    • Símbolos: ! # $ % & ' ( ) * + , - . / : ; < = > ? @ [ ] ^ _` { | } ~ (32 caracteres)
    Debemos controlar que el nivel de seguridad no sea mayor que el número de caracteres
    a generar, llegado el caso se debe bajar el nivel de seguridad al número de caracteres.
    En caso de que el número de caracteres sea inadecuado, se generará una contraseña de
    8 caracteres y nivel 2.  */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.println("Ingrese los dos numeros a multiplicar uno a la vez");

        System.out.println("a * b = "+multiplica(sc.nextDouble(), sc.nextDouble())); */

        /* System.out.println("Ingrese su edad para saber si es mayor de edad");

        System.out.println((esMayorEdad(sc.nextInt()))?"Si, si mayor de edad":"No, no es mayor de edad"); */

        /* System.out.println("Ingrese dos numeros, dire cual es menor");
        System.out.println("El minimo de los dos numeros es: "+minimo(sc.nextInt(), sc.nextInt())); */

        /* System.out.println("Escribe el número");
        if(dimeSigno(sc.nextInt())==1){
            System.out.println("Es positivo");
        } else if(dimeSigno(sc.nextInt())==-1){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        } */

        /* System.out.println("Convertire de millas a km");
        System.out.println("Esas millas en km son: "+millas_a_kilometros(1)+" kilometros"); */

        /* for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el precio "+i);
            double precio=sc.nextDouble();
            System.out.println("El precio con iva es: "+precioConIVA(precio));
        } */

        /* System.out.println("Ingrese el ancho");
        double altoRectangulo = sc.nextDouble();
        System.out.println("Ingrese el alto");
        double anchoRectangulo = sc.nextDouble();
        System.out.printf("El Perimetro es: %.2f %n", perimetroRectangulo(anchoRectangulo, altoRectangulo));
        System.out.printf("El Area es: %.2f %n", areaRectangulo(anchoRectangulo, altoRectangulo)); */

        /* System.out.println("Ingrese el numero hasta donde desea ver los acumulados");
        int numeroAcumulado = sc.nextInt();
        System.out.printf("La Suma es: %d%n",suma1aN(numeroAcumulado));
        System.out.printf("El Producto es: %d%n",producto1aN(numeroAcumulado));
        System.out.printf("El Intermedio es: %.2f%n",intermedio1aN(numeroAcumulado)); */

        /* System.out.println("Ingrese el numero uno, debe ser mayor que el numero Dos");
        long numeroUno = sc.nextInt();
        System.out.println("Ingrese el numero Dos, debe ser menor que el numero Uno");
        long numeroDos = sc.nextInt();
        System.out.println("Resultado suma intervalo: "+sumaIntervalo(numeroUno, numeroDos)); */

        /* System.out.println("En la cadena hay: "+contarCeros("carlos 0000")); */
        /* System.out.println(aleatorio(1, 20)); */
        /* calculaRepetidasVeces(); */
        /* calcularDiasMes(1900, 2); */
        /* System.out.println(desordenar("HOLA juanito")); */
        /* int anyo=2000, mes=2;
        int diasTrancurridosXMes = calcularDiasMes(anyo, mes);
        System.out.printf("Han transcurrido: "+diasTrancurridosXMes); */
        /* calcularFactorial(); */
        /* System.out.println(cantidadDivisores(10)); */
        /* sumaPrimosComprendidos1A1000(); */
        /* System.out.println(masPrimo(3)); */
        letraNIF(12345678);
        sc.close();

    }

}

