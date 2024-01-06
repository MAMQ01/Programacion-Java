package Unidad6Java.src.movilesPrepago;

public class ProgramaMovilPrepago {
    public static void main(String[] args) {
    MovilPrepago movilUno = new MovilPrepago((int) 1234567890123l, 0.1f, 0.25f, 0.5f, 10.0f);
    System.out.printf("El saldo antes de una llamada es: %.2f %n",movilUno.consultarSaldo());
    movilUno.efectuarLlamada(6000);
    System.out.printf("El saldo despues de una llamada es: %.2f %n",movilUno.consultarSaldo());
    movilUno.recargar(5);
    System.out.printf("El saldo despues de recargar es: %.2f %n",movilUno.consultarSaldo());
    System.out.println("...................");
    movilUno.navegar(1000);
    System.out.printf("El saldo despues de navegar es: %.2f %n",movilUno.consultarSaldo());

    
    }
}