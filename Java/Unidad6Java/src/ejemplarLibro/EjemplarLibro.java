package Unidad6Java.src.ejemplarLibro;

import java.time.LocalDate;

public class EjemplarLibro {
    String tituloLibro;
    LocalDate fechaAlta;
    int numeroEjemplar;
    boolean estaPrestado = false;

    public EjemplarLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
        this.fechaAlta = LocalDate.now();
        this.numeroEjemplar = 1;
        this.estaPrestado = false;
    }

    public EjemplarLibro(EjemplarLibro libro) {
        this.tituloLibro = libro.tituloLibro;
        this.fechaAlta = LocalDate.now();
        this.numeroEjemplar = libro.numeroEjemplar + 1;
        this.estaPrestado = false;
    }

    public boolean prestar(){
        if(!estaPrestado && numeroEjemplar>1){
            System.out.println("El libro fue prestado exitosamente el " + fechaAlta);
            estaPrestado = true;
            return true;
        } else {
            System.err.println("No se puede prestar esta prestado o no hay disponibles");
            return false;
        }
    }

    public boolean devolver(){
        if(estaPrestado){
            System.out.println("El libro fue devuelto exitosamente el " + LocalDate.now());
            estaPrestado = false;
            return true;
        } else {
            System.err.println("No está prestado");
            return false;
        }
    }

    public String toString() {
        return "El titulo es: " + tituloLibro + " quedan: [" +numeroEjemplar + "] ejemplares.";
    }
}
