
package Dominio;

import java.io.Serializable;


public class Tema implements Serializable{
    private String nombre;
    private String descripcion;
    private int nivelRequerido;

    // Constructor
    public Tema(String nombre, String descripcion, int nivelRequerido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRequerido = nivelRequerido;
    }
    
    
    //=================Sets y Gets=============================================
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelRequerido() {
        return nivelRequerido;
    }

    public void setNivelRequerido(int nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }
        
    //=================Metodos=============================================
    
    
}
