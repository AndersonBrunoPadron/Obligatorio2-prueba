
package Dominio;

import java.io.Serializable;


public class Entrevista implements Serializable{
    private Evaluador evaluador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    private int idEntrevista;

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
    //=================Metodos=============================================


    
    
}
