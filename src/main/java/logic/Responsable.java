
package logic;

import java.util.Date;

public class Responsable extends Persona {
    private int id_responsable;
    private String tipoResponsable;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipoResponsable, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.id_responsable = id_responsable;
        this.tipoResponsable = tipoResponsable;
    }


    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipoResponsable() {
        return tipoResponsable;
    }

    public void setTipoResponsable(String tipoResponsable) {
        this.tipoResponsable = tipoResponsable;
    }
    
    
}
