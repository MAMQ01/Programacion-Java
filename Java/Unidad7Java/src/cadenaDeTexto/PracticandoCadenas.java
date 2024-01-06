package cadenaDeTexto;

public class PracticandoCadenas {
    public static void main(String[] args) {

        String nombre = "Lalo";

        // Probando el String.valueOf()
        String numeroPrueba = String.valueOf(110);
        System.out.println(numeroPrueba);

        // Longitud de una cadena cadena.length()

        String textoUno = " Salamanca";
        System.out.println(nombre = nombre.concat(textoUno));
        System.out.println("-----------------------------------------");

        // chaAt() Devuelve un caracter concreto de la cadena
        String mensajeCharAt = "Si pongo charAT(10), busca la posicion numero 9 que es:";
        System.out.println(nombre);
        System.out.println(mensajeCharAt + nombre.charAt(10));

        // Probabilidad substring() devuelve desde 0 hasta x-1 0 puede decidirse
        String mensajeSubstring = nombre.substring(0, 10);
        System.out.println(mensajeSubstring);
        System.out.println("-----------------------------------------");

        // indexOf() Devuelve la primera posicion en la que se encuentra el parametro
        // pasado, -1 si no lo encuentra.
        System.out.println(nombre);
        System.out.println("El indice de Lalo es: " + nombre.indexOf("niño"));

        // endsWith() Devuelve true si la cadena termina con un determinado texto
        String ultimaPalabraNombre = "Salamanca";

        if (ultimaPalabraNombre.endsWith(ultimaPalabraNombre)) {
            System.out.println("Si, se encontro su parametro al final de la cadena, el booleano es:" +  ultimaPalabraNombre.endsWith(ultimaPalabraNombre));
        } else {
            System.out.println("No, se encontro su parametro al final de la cadena, el booleano es:" +  nombre.endsWith(nombre));
        }
        System.out.println("------------------------------");

        // startsWith() Devuelve true si la cadena inicia con un determinado texto
        String primeraPalabraCadena = "Lalo";

        if (primeraPalabraCadena.startsWith(primeraPalabraCadena)) {
            System.out.println("Si, se encontro su parametro al inicio de la cadena, el booleano es:" +  nombre.startsWith(primeraPalabraCadena));
        } else {
            System.out.println("No, se encontro su parametro al inicio de la cadena, el booleano es:" +  nombre.startsWith(primeraPalabraCadena));
        }
        System.out.println("------------------------------");

        // replace("from","to") cambia una cadena a otra SIEMPRE si no de guarda el metodo sera solo temporal
        String animalElefante = "Elefante";
        System.out.println(nombre.replace(primeraPalabraCadena, animalElefante));
        System.out.println("------------------------------");

        // toUppercase() A mayusculas to toLowerCase() A minisculas
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println("------------------------------");


        // format() 

        // matches() Examina *****************************
        
        String textoNumero = String.valueOf(1);
        System.out.println(Integer.parseInt(textoNumero)*5);

        // clase Character.isLetter(ch1)
        nombre = "Lalo Salamanca";
        System.out.println();

        //Testeando el Integer y toHexString
        // int numerosss=1234;
        // String numerossString = Integer.toHexString(numerosss);
        // System.out.println("Este es el numero hexa en String: "+numerossString);
        // int numeroHexa = Integer.parseInt(numerossString, 16);
        // System.out.println("Este es el numero hexa en Int: "+numeroHexa);
        // numerosss = numeroHexa;

    }
}
