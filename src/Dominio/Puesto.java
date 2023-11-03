package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Puesto implements Serializable {

    private String nombre;
    private String tipo;
    private ArrayList<Tematica> temasRequeridos;

    //=================Sets y Gets=============================================
    public Puesto(String nombre, String tipo, ArrayList<Tematica> temasRequeridos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temasRequeridos = temasRequeridos;
    }

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

    public ArrayList<Tematica> getTemasRequeridos() {
        return temasRequeridos;
    }

    public void setTemasRequeridos(ArrayList<Tematica> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }

    //=================Metodos=============================================

 
}
