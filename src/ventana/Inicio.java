package ventana;

import Dominio.Sistema;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();

        // Agrega un WindowListener para detectar el cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Sistema sistema = Sistema.getInstance();
                sistema.serializarSistema(); 
                System.exit(0); // Cierra la aplicación
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAltaPostulante = new javax.swing.JButton();
        btnBajaPostulante = new javax.swing.JButton();
        btnRegistroTematica = new javax.swing.JButton();
        btnRegistroEvaluador = new javax.swing.JButton();
        btnRegistroPuesto = new javax.swing.JButton();
        btnIngresoDeEntrevista = new javax.swing.JButton();
        btnConsultaParaPuesto = new javax.swing.JButton();
        btnConsultaParaPuesto1 = new javax.swing.JButton();
        btnConsultaParaPuesto2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAltaPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAltaPostulante.setText("Alta de postulante");
        btnAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPostulanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltaPostulante);
        btnAltaPostulante.setBounds(50, 40, 160, 50);

        btnBajaPostulante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBajaPostulante.setText("Baja de postulante");
        btnBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaPostulanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBajaPostulante);
        btnBajaPostulante.setBounds(250, 40, 160, 50);

        btnRegistroTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistroTematica.setText("Registro de temática");
        btnRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTematicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroTematica);
        btnRegistroTematica.setBounds(450, 40, 160, 50);

        btnRegistroEvaluador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistroEvaluador.setText("Registro de evaluador");
        btnRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEvaluadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroEvaluador);
        btnRegistroEvaluador.setBounds(50, 120, 160, 50);

        btnRegistroPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistroPuesto.setText("Registro de puesto");
        btnRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPuestoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroPuesto);
        btnRegistroPuesto.setBounds(250, 120, 160, 50);

        btnIngresoDeEntrevista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresoDeEntrevista.setText("Ingreso de entrevista");
        btnIngresoDeEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoDeEntrevistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresoDeEntrevista);
        btnIngresoDeEntrevista.setBounds(450, 120, 160, 50);

        btnConsultaParaPuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaParaPuesto.setText("Consulta para puesto");
        btnConsultaParaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaParaPuestoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaParaPuesto);
        btnConsultaParaPuesto.setBounds(50, 210, 160, 50);

        btnConsultaParaPuesto1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaParaPuesto1.setText("Consulta por temática");
        btnConsultaParaPuesto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaParaPuesto1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaParaPuesto1);
        btnConsultaParaPuesto1.setBounds(250, 210, 160, 50);

        btnConsultaParaPuesto2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaParaPuesto2.setText("Historial de postulante");
        btnConsultaParaPuesto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaParaPuesto2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaParaPuesto2);
        btnConsultaParaPuesto2.setBounds(450, 210, 160, 50);

        setSize(new java.awt.Dimension(671, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaPostulanteActionPerformed
        new AltaDePostulante1().setVisible(true);
    }//GEN-LAST:event_btnAltaPostulanteActionPerformed

    private void btnBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaPostulanteActionPerformed
        new BajaDePostulante().setVisible(true);
    }//GEN-LAST:event_btnBajaPostulanteActionPerformed

    private void btnRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTematicaActionPerformed
        new RegistroDeTematica().setVisible(true);
    }//GEN-LAST:event_btnRegistroTematicaActionPerformed

    private void btnRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEvaluadorActionPerformed
        new RegistroDeEvaluador().setVisible(true);
    }//GEN-LAST:event_btnRegistroEvaluadorActionPerformed

    private void btnRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPuestoActionPerformed
        new RegistroDePuesto().setVisible(true);
    }//GEN-LAST:event_btnRegistroPuestoActionPerformed

    private void btnIngresoDeEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoDeEntrevistaActionPerformed
        new IngresoDeEntrevista().setVisible(true);
    }//GEN-LAST:event_btnIngresoDeEntrevistaActionPerformed

    private void btnConsultaParaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaParaPuestoActionPerformed
        new ConsultaParaPuesto().setVisible(true);
    }//GEN-LAST:event_btnConsultaParaPuestoActionPerformed

    private void btnConsultaParaPuesto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaParaPuesto1ActionPerformed
        new ConsultaPorTematica().setVisible(true);
    }//GEN-LAST:event_btnConsultaParaPuesto1ActionPerformed

    private void btnConsultaParaPuesto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaParaPuesto2ActionPerformed
        new HistorialDePostulante().setVisible(true);
    }//GEN-LAST:event_btnConsultaParaPuesto2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaPostulante;
    private javax.swing.JButton btnBajaPostulante;
    private javax.swing.JButton btnConsultaParaPuesto;
    private javax.swing.JButton btnConsultaParaPuesto1;
    private javax.swing.JButton btnConsultaParaPuesto2;
    private javax.swing.JButton btnIngresoDeEntrevista;
    private javax.swing.JButton btnRegistroEvaluador;
    private javax.swing.JButton btnRegistroPuesto;
    private javax.swing.JButton btnRegistroTematica;
    // End of variables declaration//GEN-END:variables
}
