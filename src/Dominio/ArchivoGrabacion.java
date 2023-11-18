// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)
package Dominio;

import java.io.*;
import java.util.Formatter;

public class ArchivoGrabacion {

    private Formatter out;

    public ArchivoGrabacion(String unNombre) {
        try {
            out = new Formatter(unNombre);
        } catch (FileNotFoundException e) {
            System.out.println("Error de creacon");
            System.exit(1);
        }
    }

    public ArchivoGrabacion(String unNombre, boolean ext) {
        //ext true -> extiende
        //ext false -> sobreescribe

        try {
            out = new Formatter(unNombre);
        } catch (IOException e) {
            System.out.println("Error de creacion - extension");
            System.exit(1);
        }
    }

    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }

    public void cerrar() {
        out.close();
    }
}
