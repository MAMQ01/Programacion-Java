package Unidad9Java.ejercicioEmpresa;

import java.util.ArrayList;

public class DatosEmpresa {
    private final String NOMBRE;
    private final int CIF;
    private int telefono;
    private String direccion;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private double totalSalarioBruto = 0;
    private double totalSalarioNeto = 0;
    
    public DatosEmpresa(String nOMBRE, int cIF, int telefono, String direccion) {
        NOMBRE = nOMBRE;
        CIF = cIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public String getNOMBRE() {
        return NOMBRE;
    }
    public int getCIF() {
        return CIF;
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
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }


    public void anadirEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public double totalSalarioBrutoEmpleados(ArrayList<Empleado> empleados){
        for (Empleado empleado : empleados) {
            totalSalarioBruto = totalSalarioBruto + empleado.getSueldoBruto();
        }
        return totalSalarioBruto;
    }

    public double totalSalarioNetoEmpleados(ArrayList<Empleado> empleados){
        for (Empleado empleado : empleados) {
            totalSalarioNeto = totalSalarioNeto + empleado.getSueldoNeto();
        }
        return totalSalarioNeto;
    }

    public static void main(String[] args) {

        DatosEmpresa empresa = new DatosEmpresa("TCC", 1234, 55555555, "Calle luna");
        //Lo cree para agregar más facil otros empleados
        ArrayList<Empleado> empleados = empresa.getEmpleados();

        Empleado empleadoUno = new Empleado("Juanito", "12345678J", 1000, 18, 123456789, "calle sol");
        empresa.anadirEmpleado(empleadoUno);
        Empleado empleadoDos = new Empleado("Jenny", "12345678A", 10000, 40, 123456789, "calle solario");

        empresa.anadirEmpleado(empleadoDos);
        empresa.totalSalarioBrutoEmpleados(empresa.empleados);
        empresa.totalSalarioNetoEmpleados(empresa.empleados);

        //System.out.println(empresa.toString());
        empresa.mostrarEmpleados();
    }

    @Override
    public String toString() {
        return "DatosEmpresa [NOMBRE=" + NOMBRE + ", CIF=" + CIF + ", telefono=" + telefono + ", direccion=" + direccion
                + ", empleados=" + empleados + ", totalSalarioBruto=" + totalSalarioBruto + ", totalSalarioNeto="
                + totalSalarioNeto + "]";
    }

    public void mostrarEmpleados(){
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
}
