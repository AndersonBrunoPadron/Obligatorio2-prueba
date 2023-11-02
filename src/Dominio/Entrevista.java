
package Dominio;


public class Entrevista {
    private Evaluador evaluador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    private int numCorrelativo;

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

    public int getNumCorrelativo() {
        return numCorrelativo;
    }

    public void setNumCorrelativo(int numCorrelativo) {
        this.numCorrelativo = numCorrelativo;
    }
        
    //=================Metodos=============================================
    
    
}
