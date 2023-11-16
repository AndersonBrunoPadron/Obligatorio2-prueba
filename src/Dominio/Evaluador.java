// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)

package Dominio;

import java.io.Serializable;

public class Evaluador extends Persona implements Serializable {

    private String fechaIngreso;

    public Evaluador(String nombre, int cedula, String direccion, String fechaIngreso) {
        super(nombre, cedula, direccion);
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {

        return this.getNombre() + " (" + this.getCedula() + ")";
    }
}
