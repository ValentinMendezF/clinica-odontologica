
package logic;

import java.util.Date;
import javax.persistence.Entity;
@Entity
public class Responsable extends Persona {
    //private int id_responsable;
    private String tipoResponsable;

    public Responsable() {
    }

    public Responsable(String tipoResponsable, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNacimiento) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tipoResponsable = tipoResponsable;
    }

    

    /*public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }*/

    public String getTipoResponsable() {
        return tipoResponsable;
    }

    public void setTipoResponsable(String tipoResponsable) {
        this.tipoResponsable = tipoResponsable;
    }
    
    
}
