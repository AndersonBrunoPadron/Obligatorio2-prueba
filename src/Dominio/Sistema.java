package Dominio;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sistema implements Serializable {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Tema> listaTemas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Tematica> listaTematicas;

    public static Sistema instance;

    public void serializarSistema() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("sistema.ser"); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Sistema serializado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al serializar el sistema.");
        }
    }

    public static Sistema deserializarSistema() {
        Sistema sistema = null;
        try (FileInputStream fileInputStream = new FileInputStream("sistema.ser"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            sistema = (Sistema) objectInputStream.readObject();
            System.out.println("Sistema deserializado con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error al deserializar el sistema.");
        }
        return sistema;
    }

    public static Sistema getInstance() {
        if (instance == null) {
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

    public void agregarPuesto(Puesto puesto) {
        listaPuestos.add(puesto);
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

    public ArrayList<Postulante> obtenerPostulantesConEntrevistas() {
        ArrayList<Postulante> postulantesConEntrevistas = new ArrayList<>();

        for (Entrevista entrevista : listaEntrevistas) {
            Postulante postulante = entrevista.getPostulante();
            if (postulante != null && !postulantesConEntrevistas.contains(postulante)) {
                postulantesConEntrevistas.add(postulante);
            }
        }

        return postulantesConEntrevistas;
    }

public ArrayList<Postulante> obtenerPostulantesPorTematicaNivel(ArrayList<Postulante> postulantes, ArrayList<Tematica> tematicasRequeridas, int nivelRequerido) {
    ArrayList<Postulante> postulantesCumplenConRequisitos = new ArrayList<>();

    for (Postulante postulante : postulantes) {
        boolean cumpleRequisitos = false;
        for (ExperienciaPostulante experiencia : postulante.getTemas()) {
            for (Tematica tematicaRequerida : tematicasRequeridas) {
                if (experiencia.getTema().equalsIgnoreCase(tematicaRequerida.getNombre()) && experiencia.getNivel() >= nivelRequerido) {
                    cumpleRequisitos = true;
                }
            }
        }
        if (cumpleRequisitos) {
            postulantesCumplenConRequisitos.add(postulante);
        }
    }
    return postulantesCumplenConRequisitos;
}



    
    public Tematica buscarTematicaPorNombre(String nombre) {
    for (Tematica tematica : listaTematicas) {
        if (tematica.getNombre().equalsIgnoreCase(nombre)) {
            return tematica;
        }
    }
    return null; // Devuelve null si no se encuentra la temática con el nombre especificado
}

}
