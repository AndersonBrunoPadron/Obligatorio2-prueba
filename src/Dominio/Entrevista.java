// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)
package Dominio;

import java.io.Serializable;

public class Entrevista implements Serializable {

    private Evaluador evaluador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    private int idEntrevista;

    @Override
    public String toString() {
        return "Nombre " + postulante.toString() + " puntaje " + puntaje + " comentario " + comentarios;
    }

    //=================Sets y Gets=============================================
    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getIdEntrevista() {
        return idEntrevista;
    }

    public void setIdEntrevista(int unId) {
        this.idEntrevista = unId;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }
    //=================Metodos=============================================

}
