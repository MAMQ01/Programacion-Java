package Unidad6Java.src.bombillas;

public class EjercicioBombillas {
    public static void main(String[] args) {
        Bombilla bombillaUno = new Bombilla("número UNO");
        Bombilla bombillaDos = new Bombilla("número DOS");
        //Enciende el interruptor General
        Bombilla.cambiarEstadoInterruptorGeneral();
        //Enciende el interruptor propio
        bombillaUno.cambiarEstadoInterruptor();
        //Muetras si está encendida
        bombillaUno.mensajeEncendido();

        bombillaDos.cambiarEstadoInterruptor();
        bombillaDos.cambiarEstadoInterruptor();
        bombillaDos.mensajeEncendido();
    }
}
