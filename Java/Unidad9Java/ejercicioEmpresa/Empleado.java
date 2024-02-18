package Unidad9Java.ejercicioEmpresa;

public class Empleado {
    private final String NOMBRE;
    private final String DNI;
    private double sueldoBruto;
    private double sueldoNeto;
    private int edad;
    private int telefono;
    private String direccion;
    
    public Empleado(String nOMBRE, String dNI, double sueldoBruto, int edad, int telefono, String direccion) {
        NOMBRE = nOMBRE;
        DNI = dNI;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        calcularSueldoNeto();
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
    public String getDNI() {
        return DNI;
    }
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto*12;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado [NOMBRE=" + NOMBRE + ", DNI=" + DNI + ", sueldoBruto=" + sueldoBruto + ", sueldoNeto="
                + sueldoNeto + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }

    public void calcularSueldoNeto(){
        if (getSueldoBruto()<12000 && getSueldoBruto()>0) {
            setSueldoNeto(getSueldoBruto()/1.2);
        } else if (getSueldoBruto()<25000 && getSueldoBruto()>12000) {
            setSueldoNeto(getSueldoBruto()/1.3);
        } else if (getSueldoBruto()>25000) {
            setSueldoNeto(getSueldoBruto()/1.4);
        }
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

}
