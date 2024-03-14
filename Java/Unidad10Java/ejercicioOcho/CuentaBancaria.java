package Unidad10Java.ejercicioOcho;

import java.util.Random;

public class CuentaBancaria {

    private final String IBAN;
    private final String TITULAR;
    private double saldo;
    private double ingreso;
    private double retiro;

    public CuentaBancaria(String tITULAR) {
        IBAN = generarIBAN();
        TITULAR = tITULAR;
        this.saldo = 0.0;
    }

    protected String generarIBAN() {
        StringBuilder ibanBuilder = new StringBuilder("ES"); 
        // Código del país (España en este caso)
        Random random = new Random();

        // Generar 22 dígitos aleatorios
        for (int i = 0; i < 22; i++) {
            ibanBuilder.append(random.nextInt(10));
        }

        return ibanBuilder.toString();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        if (ingreso>0) {
            this.ingreso = ingreso;
        }
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTITULAR() {
        return TITULAR;
    }

    public String datosCuenta() {
        return "CuentaBancaria [IBAN=" + IBAN + ", TITULAR=" + TITULAR + ", saldo=" + saldo + "]";
    }


    
}
