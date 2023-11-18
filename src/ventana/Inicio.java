// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)
package ventana;

import Dominio.Sistema;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();

        // Agrega un WindowListener para detectar el cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Sistema sistema = Sistema.getInstance();
                sistema.serializarSistema();
                System.exit(0);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        altaPostulante = new javax.swing.JMenuItem();
        bajaPostulante = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        historialPostulante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        registroEvaluador = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        registroTematica = new javax.swing.JMenuItem();
        consultaPorTematica = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        registroPuesto = new javax.swing.JMenuItem();
        consultaParaPuesto = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ingresoEntrevista = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jLabel1.setText("Bienvenido al sistema de gestión!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 100, 400, 60);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 360, 90, 20);

        jMenu1.setText("Postulantes");

        altaPostulante.setText("Alta de postulante");
        altaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(altaPostulante);

        bajaPostulante.setText("Baja de postulante");
        bajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(bajaPostulante);
        jMenu1.add(jSeparator1);

        historialPostulante.setText("Historial de postulante");
        historialPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(historialPostulante);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Evaluadores");

        registroEvaluador.setText("Registro de evaluador");
        registroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEvaluadorActionPerformed(evt);
            }
        });
        jMenu2.add(registroEvaluador);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tematicas");

        registroTematica.setText("Registro de temática");
        registroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroTematicaActionPerformed(evt);
            }
        });
        jMenu3.add(registroTematica);

        consultaPorTematica.setText("Consulta por temática");
        consultaPorTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPorTematicaActionPerformed(evt);
            }
        });
        jMenu3.add(consultaPorTematica);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Puestos");

        registroPuesto.setText("Registro de puesto");
        registroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroPuestoActionPerformed(evt);
            }
        });
        jMenu4.add(registroPuesto);

        consultaParaPuesto.setText("Consulta para puesto");
        consultaParaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaParaPuestoActionPerformed(evt);
            }
        });
        jMenu4.add(consultaParaPuesto);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Entrevista");

        ingresoEntrevista.setText("Ingreso de entrevista");
        ingresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoEntrevistaActionPerformed(evt);
            }
        });
        jMenu5.add(ingresoEntrevista);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(671, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaPostulanteActionPerformed
        if (Sistema.getInstance().getListaPostulantes().size() > 0) {
            new BajaDePostulante().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existen postulantes cargados al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bajaPostulanteActionPerformed

    private void consultaPorTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPorTematicaActionPerformed
        boolean sigue = true;
        if (Sistema.getInstance().getListaTematicas().size() > 0 && Sistema.getInstance().getListaPostulantes().size() > 0) {
            new ConsultaPorTematica().setVisible(true);
        } else {
            if (Sistema.getInstance().getListaTematicas().size() == 0 && Sistema.getInstance().getListaPostulantes().size() == 0) {
                JOptionPane.showMessageDialog(this, "No existen temáticas ni postulantes cargados al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                sigue = false;
            }
            if (Sistema.getInstance().getListaTematicas().size() == 0 && sigue) {
                JOptionPane.showMessageDialog(this, "No existen temáticas cargadas al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                sigue = false;
            }
            if (Sistema.getInstance().getListaPostulantes().size() == 0 && sigue) {
                JOptionPane.showMessageDialog(this, "No existen postulantes cargados al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_consultaPorTematicaActionPerformed

    private void altaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPostulanteActionPerformed
        if (Sistema.getInstance().getListaTematicas().size() > 0) {
            new AltaDePostulante1().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos una temática al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_altaPostulanteActionPerformed

    private void historialPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialPostulanteActionPerformed
        if (Sistema.getInstance().getListaPostulantes().size() > 0) {
            new HistorialDePostulante().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existen postulantes cargados al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_historialPostulanteActionPerformed

    private void registroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEvaluadorActionPerformed
        new RegistroDeEvaluador().setVisible(true);
    }//GEN-LAST:event_registroEvaluadorActionPerformed

    private void registroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroTematicaActionPerformed
        new RegistroDeTematica().setVisible(true);
    }//GEN-LAST:event_registroTematicaActionPerformed

    private void registroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroPuestoActionPerformed
        if (Sistema.getInstance().getListaTematicas().size() > 0) {
            new RegistroDePuesto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos una temática al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_registroPuestoActionPerformed

    private void consultaParaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaParaPuestoActionPerformed

        if (Sistema.getInstance().getListaPuestos().size() > 0) {
            new ConsultaParaPuesto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos un puesto al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_consultaParaPuestoActionPerformed

    private void ingresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoEntrevistaActionPerformed

        if (Sistema.getInstance().getListaEvaluadores().size() > 0 && Sistema.getInstance().getListaPostulantes().size() > 0) {
            new IngresoDeEntrevista().setVisible(true);
        } else {
            if (Sistema.getInstance().getListaEvaluadores().size() > 0 && Sistema.getInstance().getListaPostulantes().size() == 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar al menos un postulante al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }
            if (Sistema.getInstance().getListaEvaluadores().size() == 0 && Sistema.getInstance().getListaPostulantes().size() > 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar al menos un evaluadore al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }
            if (Sistema.getInstance().getListaEvaluadores().size() == 0 && Sistema.getInstance().getListaPostulantes().size() == 0) {
                JOptionPane.showMessageDialog(this, "Debe ingresar al menos un postulante y un evaluador al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ingresoEntrevistaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaPostulante;
    private javax.swing.JMenuItem bajaPostulante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem consultaParaPuesto;
    private javax.swing.JMenuItem consultaPorTematica;
    private javax.swing.JMenuItem historialPostulante;
    private javax.swing.JMenuItem ingresoEntrevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem registroEvaluador;
    private javax.swing.JMenuItem registroPuesto;
    private javax.swing.JMenuItem registroTematica;
    // End of variables declaration//GEN-END:variables
}
