package Unidad6Java.src.d;

public class Persona {
    private String DNI;
    private int edad;
    private String nombre;
    private String apellidos;
    private static final boolean MAYORIA_EDAD=false;

    public String getDni() {
        return DNI;
    }
    public void setDNI(String dNI) {
        this.DNI = dNI;
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


    public Persona(String dNI, int edad, String nombre, String apellidos) {
        this.DNI = dNI;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void imprime(){
        if(esMayorEdad()){
            System.out.printf("El DNI es: %s, el nombre tiene como nombres y apellidos %s %s, tiene %d de edad y es mayor de edad %n", getDni(), getNombre(),getApellidos(),getEdad());
        }else{
            System.out.printf("El DNI es: %s, el nombre tiene como nombres y apellidos %s %s, tiene una %d de edad %n", getDni(), getNombre(),getApellidos(),getEdad());
        }
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
        if(edad>=18){
            return !MAYORIA_EDAD;
        }else{
            return MAYORIA_EDAD;
        }
    }
}
