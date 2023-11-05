package Interfaz;

import Dominio.Sistema;
import ventana.Inicio;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                // Preguntar al usuario si desea cargar un sistema serializado
                int option = JOptionPane.showConfirmDialog(null, "¿Desea cargar datos del sistema anterior?", "Cargar Sistema", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // Cargar el sistema serializado
                    Sistema sistema = Sistema.deserializarSistema();
                    if (sistema != null) {
                        Sistema.instance = sistema;
                    } else {
                        Sistema.instance = new Sistema();
                    }
                } else if (option == JOptionPane.NO_OPTION) {
                    // Iniciar un nuevo sistema
                    Sistema.instance = new Sistema();
                } else {
                    // Si el usuario cierra el cuadro de diálogo, sale del programa
                    System.exit(0);
                }
                new Inicio().setVisible(true);
            }
        });
    }
}
