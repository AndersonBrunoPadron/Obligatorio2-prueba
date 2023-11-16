// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)

package Dominio;

import java.io.Serializable;

public class ExperienciaPostulante implements Serializable{

    private Tematica tema;
    private int nivel;

    // Constructor
    public ExperienciaPostulante(Tematica tema, int nivel) {
        this.tema = tema;
        this.nivel = nivel;
    }

    public void setTema(Tematica nuevoTema) {
        this.tema = nuevoTema;
    }

    public Tematica getTema() {
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
