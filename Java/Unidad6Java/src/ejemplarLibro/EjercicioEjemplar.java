package Unidad6Java.src.ejemplarLibro;

public class EjercicioEjemplar {
    public static void main(String[] args) {

        EjemplarLibro libroUno = new EjemplarLibro("El agua");
        EjemplarLibro libroDos = new EjemplarLibro(libroUno);
        EjemplarLibro libroTres = new EjemplarLibro("1984");
        EjemplarLibro libroCuatro = new EjemplarLibro("Ñato");

        libroDos.prestar();
        libroDos.devolver();

        System.out.println(libroDos.toString());
        System.out.println(libroTres.toString());
        System.out.println(libroCuatro.toString());
    }
}
