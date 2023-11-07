package Dominio;

import java.util.ArrayList;
import java.io.*;
import java.util.Observable;

public class Sistema extends Observable implements Serializable {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Tematica> listaTematicas;

    public static Sistema instance;

    public Sistema() {
        listaTematicas = new ArrayList<Tematica>(); // Inicializa el ArrayList de Tematica en el constructor.
        listaEvaluadores = new ArrayList<Evaluador>();
        listaPostulantes = new ArrayList<Postulante>();
        listaEntrevistas = new ArrayList<Entrevista>();
        listaPuestos = new ArrayList<Puesto>();

    }

    public static Sistema getInstance() {
        if (instance == null) {
            instance = new Sistema();
        }
        return instance;
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
        setChanged();
        notifyObservers();
    }

    public void agregarPostulante(Postulante postulante) {
        listaPostulantes.add(postulante);
        setChanged();
        notifyObservers();
    }

    public void agregarEvaluador(Evaluador evaluador) {
        listaEvaluadores.add(evaluador);
        setChanged();
        notifyObservers();
    }

    public void agregarPuesto(Puesto puesto) {
        listaPuestos.add(puesto);
        setChanged();
        notifyObservers();
    }

    public void serializarSistema() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("sistema.ser"); 
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); 
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Sistema serializado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al serializar el sistema.");
        }
    }

    public static Sistema deserializarSistema() {
        Sistema sistema = null;
        try (FileInputStream fileInputStream = new FileInputStream("sistema.ser"); 
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            sistema = (Sistema) objectInputStream.readObject();
            System.out.println("Sistema deserializado con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error al deserializar el sistema.");
        }
        return sistema;
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

    public boolean existeTematica(String unTema) {
        boolean encontro = false;
        for (int i = 0; i < listaTematicas.size() && !encontro; i++) {
            Tematica tematica = listaTematicas.get(i);
            if (tematica.getNombre().equals(unTema.toLowerCase())) {
                encontro = true;
            }
        }
        return encontro;
    }

    public boolean existeEvaluadorConCedula(int cedula) {
        boolean encontro = false;
        for (int i = 0; i < listaEvaluadores.size() && !encontro; i++) {
            Evaluador evaluador = listaEvaluadores.get(i);
            if (evaluador.getCedula() == cedula) {
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

    public ArrayList<Postulante> obtenerPostulantesPorTematicaNivel(ArrayList<Postulante> postulantes, ArrayList<Tematica> tematicasRequeridas, int nivelRequerido, Puesto puestoSeleccionado) {
        ArrayList<Postulante> postulantesCumplenConRequisitos = new ArrayList<>();

        for (Postulante postulante : postulantes) {
            boolean cumpleRequisitos = false;
            int cont = 0;
            for (ExperienciaPostulante experiencia : postulante.getTemas()) {

                for (Tematica tematicaRequerida : tematicasRequeridas) {
                    if (experiencia.getTema().equals(tematicaRequerida) && experiencia.getNivel() >= nivelRequerido) {
                        cont++;
                        cumpleRequisitos = true;
                    }
                }
            }
            if (cumpleRequisitos && cont == tematicasRequeridas.size() == puestoSeleccionado.getTipo().equals(postulante.getTipo())) {
                postulantesCumplenConRequisitos.add(postulante);
            }
        }
        return postulantesCumplenConRequisitos;
    }

    public Tematica buscarTematicaPorNombre(String nombre) {
        Tematica tematicaEncontrada = null;
        for (Tematica tematica : listaTematicas) {
            if (tematica.getNombre().equalsIgnoreCase(nombre)) {
                tematicaEncontrada = tematica;
            }
        }
        return tematicaEncontrada; // Devuelve null si no se encuentra la temática con el nombre especificado
    }

    public int contarPostulantesConNivelSuperiorA5EnTematica(Tematica tematica) {
        int cantidadPostulantes = 0;

        for (Postulante postulante : listaPostulantes) {
            boolean cumpleRequisitos = false;
            for (ExperienciaPostulante experiencia : postulante.getTemas()) {
                if (experiencia.getTema().equals(tematica.getNombre()) && experiencia.getNivel() > 5) {
                    cumpleRequisitos = true;
                }
            }
            if (cumpleRequisitos) {
                cantidadPostulantes++;
            }
        }
        return cantidadPostulantes;
    }

    public int cuantosPuestosTienenTematica(Tematica tematica) {
        int cantidadPuestos = 0;

        for (Puesto puesto : listaPuestos) {
            boolean cumpleRequisitos = false;
            for (Tematica tema : puesto.getTemasRequeridos()) {
                if (tema.getNombre().equalsIgnoreCase(tematica.getNombre())) {
                    cumpleRequisitos = true;
                }
            }
            if (cumpleRequisitos) {
                cantidadPuestos++;
            }
        }
        return cantidadPuestos;
    }

    public ArrayList<ExperienciaPostulante> obtenerExperienciasPorCedula(int cedula) {
        ArrayList<ExperienciaPostulante> experienciasDelPostulante = new ArrayList<>();

        for (Postulante postulante : listaPostulantes) {
            if (postulante.getCedula() == cedula) {
                experienciasDelPostulante = postulante.getTemas();
            }
        }
        return experienciasDelPostulante;
    }

    public Entrevista obtenerUltimaEntrevista(Postulante postulante) {
        Entrevista ultimaEntrevista = null;

        for (Entrevista entrevista : listaEntrevistas) {
            if (entrevista.getPostulante() == postulante) {
                ultimaEntrevista = entrevista;
            }
        }
        return ultimaEntrevista;
    }

}
