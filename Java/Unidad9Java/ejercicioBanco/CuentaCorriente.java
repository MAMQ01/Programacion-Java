package Unidad9Java.ejercicioBanco;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double consultaSaldo() {
        return getSaldo();
    }

    @Override
    public double calcularIntereses() {
        double saldo = getSaldo();
        double saldoConIntereses = saldo * getInteresAnualBasico();
        return saldoConIntereses;
    }

    @Override
    public String toString() {
        return super.toString() + " CuentaCorriente []";
    }
    
}
