package Unidad9Java.ejercicioAjedrez.src;

public interface JuegoTablero {

    static char indiceAPosicion(int indice){
        char[] letras = {'A','B','C','D','E','F','G','H'};
        if (indice >= 0 && indice < letras.length) {
            return letras[indice];
        } else {
            System.err.println("Indice fuera del rango");
            return '?';
        }
    };
    static int indiceAPosicionN(int indice){
        if (indice >= 0 && indice <= 7) {
            return indice + 1;
        } else {
            System.err.println("Indice fuera del rango");
            return -1;
        }
    };
    static int posicionAIndice(char posicion){
        String letras = "ABCDEFGH";
        return letras.indexOf(posicion);
    };
    static int posicionAIndice(int posicion){
        if (posicion>=1 && posicion <=8) {
            return posicion--;
        }
        return -1;
    };

}