package Unidad9Java.agenda_v2;

public class ContactoEmpresa extends Contacto {

    private String sitioWeb;
    /**
     * Crea un objeto ContactoEmpresa
     * @param nombre nombre unico de la empresa
     * @param telefono telefono de la empresa
     * @param sitioWeb sitio web unico de la empresa
     */
    public ContactoEmpresa(String nombre, int telefono, String sitioWeb) {
        super(nombre, telefono);
        this.sitioWeb = sitioWeb;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    @Override
    public String toString() {
        return super.toString() + " [sitioWeb=" + sitioWeb + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((sitioWeb == null) ? 0 : sitioWeb.hashCode());
        return result;
    }
    /**
     * Compara dos objetos, si son iguales en las condiciones del padre (solo nombre) y las de esta clase (sitioWeb).
     * @param obj El objeto a comparar vs este objeto.
     * @return true si son dos objetos iguales (mismo nombre y sitioweb).
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContactoEmpresa other = (ContactoEmpresa) obj;
        if (sitioWeb == null) {
            if (other.sitioWeb != null)
                return false;
        } else if (!sitioWeb.equals(other.sitioWeb))
            return false;
        return true;
    }
    
}
