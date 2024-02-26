package Unidad9Java.maratonEjercicios;

public class ProgramaFigura3D_v4 {
    public class Main {
        public static void main(String[] args) {
            Esfera_v4 esfera = new Esfera_v4(3.0);
            PrismaRectangular_v4 prisma = new PrismaRectangular_v4(15, 40, 3);
            Cilindro_v4 cilindro = new Cilindro_v4(10, 20);
            
            double volumenEsfera = esfera.volumen();
            double volumenPrisma = prisma.volumen();
            double volumenCilindro = cilindro.volumen();

            System.out.println("Volumen de la esfera: " + volumenEsfera);
            System.out.println("Volumen del prisma: " + volumenPrisma);
            System.out.println("Volumen del cilindro: " + volumenCilindro);
        }
    }
}
