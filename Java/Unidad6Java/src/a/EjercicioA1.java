package Unidad6Java.src.a;
public class EjercicioA1 {
    public static void main(String[] args) {
        Punto puntoUno = new Punto();
        Punto puntoDos = new Punto();
        Punto puntoTres = new Punto();

        puntoUno.x = 5;
        puntoUno.y = 0;

        puntoDos.x = 10;
        puntoDos.y = 10;

        puntoTres.x = -3;
        puntoTres.y = 7;

        System.out.println("Del punto 1, la coordenada x es: " + puntoUno.x);
        System.out.println("Del punto 1, la coordenada y es: " + puntoUno.y);

        puntoUno.x += puntoUno.x;
        puntoUno.y++;
        System.out.printf("Punto 1 ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoUno.x, puntoUno.y);

        puntoDos.y += 2;
        puntoDos.x -= 8;
        System.out.printf("Punto 2 ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoDos.x, puntoDos.y);
        
        puntoTres.x += puntoUno.x * 3;
        puntoTres.y *= puntoTres.y;
        System.out.printf("Punto 3 ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoTres.x, puntoTres.y);
    }
}

class Punto {
    int x;
    int y;
}