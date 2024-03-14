package Unidad10Java.ejercicioNueve;

public class PublicationException extends Exception{

    public PublicationException(){
        super("Excepcion en PublicationException");
    }

    public PublicationException(String mensaje){
        super(mensaje);
    }

}
