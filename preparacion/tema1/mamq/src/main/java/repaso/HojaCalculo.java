package repaso;


public class HojaCalculo {
    
    public static void main(String[] args) {
        System.out.println("Crear una hoja de calculo de 5 x 8 que incremente un saldo inicial de 120000 a 1% cada año");
        double saldo = 10000;
        double porcentaje = 0.1;
        double[][] hoja = new double[6][5];
        for (int i = 0; i < 6; i++) {
            hoja[i][0] = 10000;
            saldo = 10000;
            for (int j = 1; j < 5; j++) {
                saldo = saldo + (saldo*(porcentaje));
                hoja[i][j] = saldo;
            }
            porcentaje = porcentaje + 0.01;
        }
        for (double[] columna : hoja) {
            for (double fila : columna) {
                System.out.print((int)fila + "$ ");
            }
            System.out.println();
        }
    }
}
