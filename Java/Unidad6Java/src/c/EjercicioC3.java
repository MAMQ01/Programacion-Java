package Unidad6Java.src.c;

public class EjercicioC3 {
    public static void main(String[] args) {
        int perimetroRectanguloUno,longitudRectanguloUno,altoRectanguloUno, areaRectanguloUno, perimetroRectanguloDos,longitudRectanguloDos, altoRectanguloDos, areaRectanguloDos;
        Rectangulo rectanguloUno = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectanguloDos = new Rectangulo(7, 9, 2, 3);

        
        if(rectanguloUno.getX2()>rectanguloUno.getX1()){
            longitudRectanguloUno = rectanguloUno.getX2()-rectanguloUno.getX1();
        }else{
            longitudRectanguloUno = rectanguloUno.getX1()-rectanguloUno.getX2();
        }

        if(rectanguloUno.getY2()>rectanguloUno.getY1()){
            altoRectanguloUno = rectanguloUno.getY2()-rectanguloUno.getY1();
        }else{
            altoRectanguloUno = rectanguloUno.getY1()-rectanguloUno.getY2();
        }

        perimetroRectanguloUno = 2*(longitudRectanguloUno+altoRectanguloUno);
        areaRectanguloUno = (longitudRectanguloUno*altoRectanguloUno);
        System.out.println("Perimetro rectangulo Uno: "+perimetroRectanguloUno+" area del rectangulo "+areaRectanguloUno);

        if(rectanguloDos.getX2()>rectanguloDos.getX1()){
            longitudRectanguloDos = rectanguloDos.getX2()-rectanguloDos.getX1();
        }else{
            longitudRectanguloDos = rectanguloDos.getX1()-rectanguloDos.getX2();
        }
        
        if(rectanguloDos.getY2()>rectanguloDos.getY1()){
            altoRectanguloDos = rectanguloDos.getY2()-rectanguloDos.getY1();
        }else{
            altoRectanguloDos = rectanguloDos.getY1()-rectanguloDos.getY2();
        }

        perimetroRectanguloDos = 2*(longitudRectanguloDos+altoRectanguloDos);
        areaRectanguloDos = (longitudRectanguloDos*altoRectanguloDos);
        System.out.println("Perimetro rectangulo Dos: "+perimetroRectanguloDos+" area del rectangulo "+areaRectanguloDos);

        System.out.println("ACTUALIZARE LAS COORDENADAS DE CADA RECTANGULO");

        rectanguloUno.setX1(1000);
        rectanguloUno.setY1(1000);
        rectanguloUno.setX2(1234);
        rectanguloUno.setY2(3333);

        if(rectanguloUno.getX2()>rectanguloUno.getX1()){
            longitudRectanguloUno = rectanguloUno.getX2()-rectanguloUno.getX1();
        }else{
            longitudRectanguloUno = rectanguloUno.getX1()-rectanguloUno.getX2();
        }

        if(rectanguloUno.getY2()>rectanguloUno.getY1()){
            altoRectanguloUno = rectanguloUno.getY2()-rectanguloUno.getY1();
        }else{
            altoRectanguloUno = rectanguloUno.getY1()-rectanguloUno.getY2();
        }

        perimetroRectanguloUno = 2*(longitudRectanguloUno+altoRectanguloUno);
        areaRectanguloUno = (longitudRectanguloUno*altoRectanguloUno);
        System.out.println("Perimetro rectangulo Uno: "+perimetroRectanguloUno+" area del rectangulo "+areaRectanguloUno);
        
    }
}
