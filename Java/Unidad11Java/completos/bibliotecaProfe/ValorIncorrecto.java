package Unidad11Java.completos.bibliotecaProfe;

public class ValorIncorrecto extends Exception{
    private final int valor;

    public ValorIncorrecto(int valor){
        this(valor,"Excepción de Valor Incorrecto");
    }

    public ValorIncorrecto(int valor,String mensaje){
        super(mensaje);
        this.valor=valor;
    }

    @Override
    public String toString() {
        return super.toString()+" ValorIncorrecto [valor=" + valor + "]";
    }

    
}
