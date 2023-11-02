
package Dominio;

import java.util.ArrayList;


public class Puesto {
    private String nombre;
    private String tipo;
    private ArrayList<String> temasRequeridos;

    //=================Sets y Gets=============================================
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getTemasRequeridos() {
        return temasRequeridos;
    }

    public void setTemasRequeridos(ArrayList<String> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }
        
    //=================Metodos=============================================
    
    
}
