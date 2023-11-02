package Dominio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Tema> listaTemas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Tematica> listaTematicas;

    public static Sistema instance ;
    
    public static Sistema getInstance(){
        if (instance == null){
            instance = new Sistema();
        }
        return instance;
    }
    
    
    public Sistema() {
        listaTematicas = new ArrayList<Tematica>(); // Inicializa el ArrayList de Tematica en el constructor.
        listaEvaluadores = new ArrayList<Evaluador>();
        listaPostulantes = new ArrayList<Postulante>();
        listaEntrevistas = new ArrayList<Entrevista>();
        listaTemas = new ArrayList<Tema>();
        listaPuestos = new ArrayList<Puesto>();
        
        
    }

    public ArrayList<Postulante> getListaPostulantes() {
        return listaPostulantes;
    }

    public void setListaPostulantes(Postulante postulantes) {
        this.listaPostulantes = listaPostulantes;
    }

    public ArrayList<Evaluador> getListaEvaluadores() {
        return listaEvaluadores;
    }

    public void setListaEvaluadores(ArrayList<Evaluador> listaEvaluadores) {
        this.listaEvaluadores = listaEvaluadores;
    }

    public ArrayList<Entrevista> getListaEntrevistas() {
        return listaEntrevistas;
    }

    public void setListaEntrevistas(ArrayList<Entrevista> listaEntrevistas) {
        this.listaEntrevistas = listaEntrevistas;
    }

    public ArrayList<Tema> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(ArrayList<Tema> listaTemas) {
        this.listaTemas = listaTemas;
    }

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puesto> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }

    public void setListaTematicas(ArrayList<Tematica> listaTematica) {
        this.listaTematicas = listaTematica;
    }

    public ArrayList<Tematica> getListaTematicas() {
        return listaTematicas;
    }


    public void agregarTematica(Tematica tematica) {
        listaTematicas.add(tematica);
    }

    public void agregarPostulante(Postulante postulante) {
        listaPostulantes.add(postulante);
    }

    public void agregarEvaluador(Evaluador evaluador) {
        listaEvaluadores.add(evaluador);
    }

    public void agregarTema(Tema tema) {
        listaTemas.add(tema);
    }

    public Postulante obtenerUltimoPostulante() {
        Postulante ultimoPostulante = null; // Inicializa como null
        if (!listaPostulantes.isEmpty()) {
            // Si la lista no está vacía, asigna el último elemento a la variable
            ultimoPostulante = listaPostulantes.get(listaPostulantes.size() - 1);
        }
        return ultimoPostulante; // Retorna la variable
    }

    public Postulante obtenerPostulantePorCedula(int cedula) {
        Postulante res = null;
        for (Postulante postulante : listaPostulantes) {
            if (postulante.getCedula() == cedula) {
                res = postulante;
            }
        }
        return res;
    }

    public boolean existePostulanteConCedula(int cedula) {
        boolean encontro = false;
        for (int i = 0; i < listaPostulantes.size() && !encontro; i++) {
            Postulante postulante = listaPostulantes.get(i);
            if (postulante.getCedula() == cedula) {
                encontro = true;
            }
        }
        return encontro;
    }


    public void sobrescribirTemasDePostulante(int posicionPostulante, ArrayList<ExperienciaPostulante> nuevosTemas) {
        if (posicionPostulante >= 0 && posicionPostulante < listaPostulantes.size()) {
            Postulante postulante = listaPostulantes.get(posicionPostulante);
            postulante.setTemas(nuevosTemas);
        }
    }

    public void imprimirTemasDePostulantes() {
        for (Postulante postulante : listaPostulantes) {
            System.out.println("Temas de " + postulante.getNombre() + ":");
            ArrayList<ExperienciaPostulante> temas = postulante.getTemas(); // Asume que el método getTemas existe en la clase Postulante
            for (ExperienciaPostulante tema : temas) {
                System.out.println(tema.getTema());
            }
        }
    }

    public ArrayList<String> obtenerNombresPostulantes() {
        ArrayList<String> nombres = new ArrayList<>();
        for (Postulante postulante : listaPostulantes) {
            nombres.add(postulante.getNombre());
        }
        return nombres;
    }
    
    public ArrayList<String> obtenerNombresEvaluadores() {
        ArrayList<String> nombres = new ArrayList<>();
        for (Evaluador evaluador : listaEvaluadores) {
            nombres.add(evaluador.getNombre());
        }
        return nombres;
    }

}
