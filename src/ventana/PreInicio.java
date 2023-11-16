// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)

package ventana;

import Dominio.Sistema;
import javax.swing.JOptionPane;

public class PreInicio extends javax.swing.JFrame {

    public PreInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSistemaNuevo = new javax.swing.JButton();
        btnCargarDatosDelSistema = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restauración");
        getContentPane().setLayout(null);

        btnSistemaNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSistemaNuevo.setText("Iniciar un sistema nuevo");
        btnSistemaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSistemaNuevo);
        btnSistemaNuevo.setBounds(110, 170, 170, 60);

        btnCargarDatosDelSistema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCargarDatosDelSistema.setText("Cargar datos del sistema");
        btnCargarDatosDelSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCargarDatosDelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosDelSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargarDatosDelSistema);
        btnCargarDatosDelSistema.setBounds(110, 80, 170, 60);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Seleccione una opción para ingresar al sistema");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(40, 10, 330, 30);

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSistemaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaNuevoActionPerformed
        // Preguntar al usuario si desea cargar un sistema serializado
        int option = JOptionPane.showConfirmDialog(null, "¿Desea iniciar un sistema nuevo?", "Sistema nuevo", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Cargar el sistema serializado
            Sistema sistema = new Sistema();
            dispose();
            new Inicio().setVisible(true);
        }


    }//GEN-LAST:event_btnSistemaNuevoActionPerformed

    private void btnCargarDatosDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosDelSistemaActionPerformed
        // Preguntar al usuario si desea cargar un sistema serializado
        int option = JOptionPane.showConfirmDialog(null, "¿Desea cargar datos del sistema anterior?", "Cargar Sistema", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Cargar el sistema serializado
            Sistema sistema = Sistema.deserializarSistema();
            if (sistema != null) {
                Sistema.instance = sistema;
                dispose();
                new Inicio().setVisible(true);
            } else {
                Sistema.instance = new Sistema();
                dispose();
                new Inicio().setVisible(true);
            }
        }


    }//GEN-LAST:event_btnCargarDatosDelSistemaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatosDelSistema;
    private javax.swing.JButton btnSistemaNuevo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
