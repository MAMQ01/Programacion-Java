package Unidad9Java.ejercicioBanco;

public class CuentaAhorros extends CuentaBancaria{

    public CuentaAhorros(String iban, int saldo) {
        super(iban, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void consultaSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultaSaldo'");
    }

    @Override
    public void calcularIntereses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularIntereses'");
    }
    
}
