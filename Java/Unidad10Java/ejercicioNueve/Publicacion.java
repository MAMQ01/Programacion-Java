package Unidad10Java.ejercicioNueve;

public abstract class Publicacion {

    private static int contadorPublicacicones = 0;
    final int idUnico;

    public Publicacion() {
        idUnico = contadorPublicacicones++;
    }

    public void mostrarEnLinea(){
        System.out.printf(  """
            | ID publicación |  %d  |
                            """,idUnico);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idUnico;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publicacion other = (Publicacion) obj;
        if (idUnico != other.idUnico)
            return false;
        return true;
    }

}