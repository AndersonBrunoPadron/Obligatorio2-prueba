// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)
package Interfaz;

import Dominio.Sistema;
import ventana.PreInicio;

public class Main {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PreInicio().setVisible(true);
            }
        });
    }
}
