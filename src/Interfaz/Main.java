
package Interfaz;

import Dominio.Sistema;
import ventana.Inicio;

public class Main {
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                // Carga el sistema serializado al inicio del programa
                Sistema sistema = Sistema.deserializarSistema();
                if (sistema != null) {
                    Sistema.instance = sistema;
                } else {
                    Sistema.instance = new Sistema();
                }
                new Inicio().setVisible(true);
            }
        });
    }
}
