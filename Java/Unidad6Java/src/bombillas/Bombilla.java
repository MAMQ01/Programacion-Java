package Unidad6Java.src.bombillas;

public class Bombilla {
    private boolean interruptor;
    private static boolean interruptorGeneral;
    private String nombre;

    public Bombilla(String nombre){
        this.nombre = nombre;
    }

    public boolean cambiarEstadoInterruptor() {
        return this.interruptor = !this.interruptor;
    }

    public void setInterruptor() {
        this.interruptor = !this.interruptor;
    }

    public static boolean cambiarEstadoInterruptorGeneral() {
        Bombilla.interruptorGeneral = !Bombilla.interruptorGeneral;
        return Bombilla.interruptorGeneral;
    }

    public boolean estaEncendida() {
        return this.interruptor && Bombilla.interruptorGeneral;
    }

    public void mensajeEncendido(){
        System.out.println("La bombilla "+ nombre + " está encendida? " + (estaEncendida() ? "Sí" : "No"));
    }
}
