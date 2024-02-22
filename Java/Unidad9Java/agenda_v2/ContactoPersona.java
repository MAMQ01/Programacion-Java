package Unidad9Java.agenda_v2;

import java.time.LocalDate;

public class ContactoPersona extends Contacto {

    private final LocalDate CUMPLEAÑOS;
    /**
     * Crea un objeto ContactoPersona
     * @param nombre nombre unico del contacto.
     * @param telefono numero telefonico.
     * @param cUMPLEAÑOS fecha de cumpleaños.
     */
    public ContactoPersona(String nombre, int telefono, LocalDate cUMPLEAÑOS) {
        super(nombre, telefono);
        CUMPLEAÑOS = cUMPLEAÑOS;
    }

    @Override
    public String toString() {
        return super.toString() + " [CUMPLEAÑOS=" + CUMPLEAÑOS + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((CUMPLEAÑOS == null) ? 0 : CUMPLEAÑOS.hashCode());
        return result;
    }
    /**
     * Compara este objeto con otro objeto para determinar si son iguales o no.
     * Dos objetos son iguales sin tienen el mismo nombre (condicion heredad del padre) y el mismo cumpleaños.
     * @param obj El objeto a comparar con este objeto.
     * @return true si los objetos son iguales (nombre y cumpleaños).
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContactoPersona other = (ContactoPersona) obj;
        if (CUMPLEAÑOS == null) {
            if (other.CUMPLEAÑOS != null)
                return false;
        } else if (!CUMPLEAÑOS.equals(other.CUMPLEAÑOS))
            return false;
        return true;
    }

    

}
