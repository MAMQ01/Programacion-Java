package Unidad6Java.src.e;

public class Persona {
    private String dni;
    private int edad;
    private String nombre;
    private String apellidos;
    private static final int MAYORIA_EDAD=18;

    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public Persona(String dni, int edad, String nombre, String apellidos) {
        if(validarDNI(dni)){
            this.dni = dni;
        }else{
            System.err.println("Error guardando dni");
        }
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void imprime() {
        System.out.printf("El DNI es: %s, se llama %s %s, tiene %d de edad %s %n", getDni(), getNombre(), getApellidos(), getEdad(), (esMayorEdad() ? "es mayor de edad" : "es menor de edad"));
    }
    
    public boolean esJubilado(){
        if(edad>=65){
            return true;
        }
        return false;
    }
    
    public int diferenciaEdad(Persona p){
        return getEdad()-p.getEdad();
    }
    public boolean esMayorEdad(){
        if(edad>=MAYORIA_EDAD){
            return !true;
        }else{
            return false;
        }
    }

    public static boolean validarDNI(String dni){
        if(dni.length()==9){
            return true;
        }else{
            return false;
        }
    }
}
