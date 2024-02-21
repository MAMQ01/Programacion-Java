package Unidad9Java.ejercicioBanco;

abstract public class CuentaBancaria {
    protected static final double INTERESANUALBASICO = 0.1;
    private String iban;
    private double saldo;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    abstract public double consultaSaldo();
    abstract public double calcularIntereses();

    public void ingresarDinero(double cantidad){
        anadir(cantidad);
    }

    public void retirarDinero(double cantidad){
        if (getSaldo()>=cantidad) {
            anadir(-cantidad);
        } else {
            System.err.println("No se completo el retiro");
        }
    }

    private void anadir(double cantidad){
        this.saldo = saldo + cantidad;
    }

    public void tranferir(double cantidad, CuentaBancaria cuentaDestino){
        if (getSaldo()>0) {
            retirarDinero(cantidad);
            cuentaDestino.ingresarDinero(cantidad);
        } else {
            System.err.println("No se completo la transferencia");
        }
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnualBasico() {
        return INTERESANUALBASICO;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [iban=" + iban + ", saldo=" + saldo + "]";
    };

    

}
