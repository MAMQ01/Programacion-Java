package Unidad6Java.src.programaEthicalBank;

import java.util.Random;

public class CuentaBancaria {
    private final float AVISAR_HACIENDA=3000;
    private final float MAXIMO_SALDO_NEAGTIVO=-50;
    private static String datosCuenta;
    private static String IBAN;
    private String titular;
    private float saldo=0;
    private float ingreso;
    private float retirada;
    private boolean salir;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        CuentaBancaria.IBAN = generarIBAN();
    }

    private String generarIBAN() {
        StringBuilder ibanBuilder = new StringBuilder("ES"); 
        // Código del país (España en este caso)
        Random random = new Random();

        // Generar 22 dígitos aleatorios
        for (int i = 0; i < 22; i++) {
            ibanBuilder.append(random.nextInt(10));
        }

        return ibanBuilder.toString();
    }

    public String datosCuenta(){
        return "Los datos de la cuenta son: "+getIBAN()+" "+getTitular()+" "+getSaldo();
    }

    public static String getIBAN() {
        return IBAN;
    }

    public float getSaldo() {
        return saldo;
    }

    
    public void setSaldo(float saldo) {
        this.saldo=saldo;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
        if(this.saldo>0&&this.saldo>=AVISAR_HACIENDA){
        this.saldo = saldo + ingreso;
        }
        this.saldo = saldo + ingreso;
    }

    public void setRetirada(float retirada) {
        this.retirada = retirada;
        this.saldo = saldo - ingreso;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public String getTitular() {
        return titular;
    }

    

}
