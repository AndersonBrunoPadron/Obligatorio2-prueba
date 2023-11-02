package Dominio;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class EjHashMap {
    private HashMap<String, Integer> temas;

    public EjHashMap() {
        temas = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getTemasPostulante() {
        return temas;
    }

    public void agregarTema(String unTema, Integer unNivel) {
        this.getTemasPostulante().put(unTema, unNivel);
    }

    public Integer darNivelDe(String unTema) {
        return this.getTemasPostulante().get(unTema);
    }

    public void eliminarTema(String unTema) {
        this.getTemasPostulante().remove(unTema);
    }

    public String[] obtenerTemas() {
        return this.getTemasPostulante().keySet().toArray(new String[this.getTemasPostulante().size()]);
    }

    public Integer[] obtenerNiveles() {
        return this.getTemasPostulante().values().toArray(new Integer[this.getTemasPostulante().size()]);
    }

    public String ubicarClave(Integer unNivel) {
        boolean encontre = false;
        String clave = "";
        Iterator<String> it = this.getTemasPostulante().keySet().iterator();
        while (it.hasNext() && !encontre) {
            String claveAux = it.next();
            if (this.darNivelDe(claveAux).equals(unNivel)) {
                encontre = true;
                clave = claveAux;
            }
        }
        return clave;
    }

    public ArrayList<String> darTemas() {
        ArrayList<String> listaAux = new ArrayList<>(this.getTemasPostulante().keySet());
        return listaAux;
    }

    public ArrayList<Integer> darNiveles() {
        ArrayList<Integer> listaAux = new ArrayList<>(this.getTemasPostulante().values());
        return listaAux;
    }
}
