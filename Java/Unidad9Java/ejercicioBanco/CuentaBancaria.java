package Unidad9Java.ejercicioBanco;

abstract public class CuentaBancaria {
    protected final double interesAnualBasico;
    private String iban;
    private int saldo;

    public CuentaBancaria(String iban, int saldo) {
        this.interesAnualBasico = 0.1;
        this.iban = iban;
        this.saldo = saldo;
    }

    abstract public void consultaSaldo();
    abstract public void calcularIntereses();

    public void ingresarDinero(int cantidad){
        anadir(cantidad);
    }

    public void retirarDinero(int cantidad){
        if (getSaldo()>=cantidad) {
            anadir(-cantidad);
        } else {
            System.err.println("No se completo el retiro");
        }
    }

    private void anadir(int cantidad){
        this.saldo = saldo + cantidad;
    }

    public void tranferir(int cantidad, CuentaBancaria cuentaDestino){
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    };

}
