package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Postulante extends Persona implements Serializable {

    private int telefono;
    private String correo;
    private String linkedin;
    private String tipo;
    private ArrayList<ExperienciaPostulante> temas;

    @Override
    public String toString() {

        return this.getNombre()+" ("+this.getCedula()+")";
    }
    
    
public String retornaNombreYCi(){
    return this.getNombre()+" "+this.getCedula();
}
    public Postulante(String nombre, int cedula, String direccion, int telefono, String correo, String linkedin, String tipo, ArrayList<ExperienciaPostulante> temas) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.correo = correo;
        this.linkedin = linkedin;
        this.tipo = tipo;
        this.temas = temas;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<ExperienciaPostulante> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<ExperienciaPostulante> temas) {
        this.temas = temas;
    }

    public void agregarTemas(ArrayList<ExperienciaPostulante> temasNuevos) {
        temas.addAll(temasNuevos);
    }


    public int obtenerNivelTema(String temaBuscado) {
        int res = 0;
        for (ExperienciaPostulante experiencia : temas) {
            if (experiencia.getTema().equalsIgnoreCase(temaBuscado)) {
                res = experiencia.getNivel();
            }
        }
        return res; // Si no se encuentra el tema, devuelve 0.
    }

}
