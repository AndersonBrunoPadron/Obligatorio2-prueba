package Dominio;

import java.io.Serializable;

public class ExperienciaPostulante implements Serializable{

    private String tema;
    private int nivel;

    // Constructor
    public ExperienciaPostulante(String tema, int nivel) {
        this.tema = tema;
        this.nivel = nivel;
    }

    public void setTema(String nuevoTema) {
        this.tema = nuevoTema;
    }

    public String getTema() {
        return tema;
    }

    public void setNivel(int nuevoNivel) {
        this.nivel = nuevoNivel;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return getTema() + " (" + nivel + ")";
    }
}
