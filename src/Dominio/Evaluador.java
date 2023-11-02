
package Dominio;


public class Evaluador extends Persona {
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
}
