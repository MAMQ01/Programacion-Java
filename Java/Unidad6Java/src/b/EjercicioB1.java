package Unidad6Java.src.b;

public class EjercicioB1 {
    public static void main(String[] args) {

        Punto puntoc1 = new Punto(2, 5);
        Punto puntoc2 = new Punto(3,8);
        Punto puntoc3 = new Punto(12, 7);
    
    
        System.out.println("Del punto 1, la coordenada x es: " + puntoc1.x);
        System.out.println("Del punto 1, la coordenada y es: " + puntoc1.y);
    
        puntoc1.x += puntoc1.x;
        puntoc1.y++;
        System.out.printf("Punto 1, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoc1.x, puntoc1.y);
    
        puntoc2.y += 2;
        puntoc2.x -= 8;
        System.out.printf("Punto 2, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoc2.x, puntoc2.y);
    
        puntoc3.x += puntoc1.x * 3;
        puntoc3.y *= puntoc3.y;
        System.out.printf("Punto 3, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntoc3.x, puntoc3.y);

    }
}

