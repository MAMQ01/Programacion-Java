package Unidad6Java.src.consumoElectrico;

public class Aparatos {
    private String nombreAparato;
    private static int consumoElectrico;
    private int potencia;
    private boolean encendido;

    public Aparatos(String nombreAparato, int potencia){
        this.nombreAparato = nombreAparato;
        this.potencia = potencia;
        this.encendido = false;
        imprimirDatos();
    }

    public void encender() {
        if (!encendido) {
            System.out.println("Encendiendo " + nombreAparato);
            consumoElectrico = consumoElectrico + potencia;
            encendido = true;
        } else {
            System.out.println(nombreAparato + " ya está encendido");
            consumoElectrico = consumoElectrico + potencia;
        }
    }

    public void apagar() {
        if (encendido) {
            System.out.println("Apagando " + nombreAparato);
            consumoElectrico = consumoElectrico - potencia;
            encendido = false;
        } else {
            System.out.println(nombreAparato + " ya está apagado");
        }
    }

    public String getNombreAparato() {
        return nombreAparato;
    }

    public static int getConsumoElectrico() {
        return consumoElectrico;
    }

    public int getPotencia() {
        return potencia;
    }

    public void imprimirDatos(){
        System.out.printf("El aparato %s tiene un consumo de %d %n",getNombreAparato(),getPotencia());
    }

}
