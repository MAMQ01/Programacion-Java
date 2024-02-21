package Unidad9Java.ejercicioBanco;

public class CuentaAhorros extends CuentaBancaria{
    private final double SALDOMINIMO = 2000;

    public CuentaAhorros(String iban, int saldo) {
        super(iban, saldo);
    }

    @Override
    public double consultaSaldo() {
        return getSaldo();
    }

    @Override
    public double calcularIntereses() {
        if (getSaldo() >= SALDOMINIMO) {
            return getSaldo()*(getInteresAnualBasico()*2);
        } else {
            return getSaldo()*(getInteresAnualBasico()/2);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " CuentaAhorros [SALDOMINIMO=" + SALDOMINIMO + "]";
    }
    
}