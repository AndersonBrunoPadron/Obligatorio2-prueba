package ventana;

import Dominio.Sistema;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
                System.exit(0); // Cierra la aplicación
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
        itemAltaP = new javax.swing.JMenuItem();
        itemBajaP = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemHistorialP = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemRegistroE = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemRegistroT = new javax.swing.JMenuItem();
        itemConsultaT = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemRegistroPuesto = new javax.swing.JMenuItem();
        itemConsultaPuesto = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemEntrevista = new javax.swing.JMenuItem();

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
        btnSalir.setBounds(10, 360, 76, 27);

        jMenu1.setText("Postulantes");

        itemAltaP.setText("Alta de postulante");
        itemAltaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltaPActionPerformed(evt);
            }
        });
        jMenu1.add(itemAltaP);

        itemBajaP.setText("Baja de postulante");
        itemBajaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaPActionPerformed(evt);
            }
        });
        jMenu1.add(itemBajaP);
        jMenu1.add(jSeparator1);

        itemHistorialP.setText("Historial de postulante");
        itemHistorialP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHistorialPActionPerformed(evt);
            }
        });
        jMenu1.add(itemHistorialP);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Evaluadores");

        itemRegistroE.setText("Registro de evaluador");
        itemRegistroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroEActionPerformed(evt);
            }
        });
        jMenu2.add(itemRegistroE);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tematicas");

        itemRegistroT.setText("Registro de temática");
        itemRegistroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroTActionPerformed(evt);
            }
        });
        jMenu3.add(itemRegistroT);

        itemConsultaT.setText("Consulta por temática");
        itemConsultaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaTActionPerformed(evt);
            }
        });
        jMenu3.add(itemConsultaT);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Puestos");

        itemRegistroPuesto.setText("Registro de puesto");
        itemRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroPuestoActionPerformed(evt);
            }
        });
        jMenu4.add(itemRegistroPuesto);

        itemConsultaPuesto.setText("Consulta para puesto");
        itemConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaPuestoActionPerformed(evt);
            }
        });
        jMenu4.add(itemConsultaPuesto);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Entrevista");

        itemEntrevista.setText("Ingreso de entrevista");
        itemEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEntrevistaActionPerformed(evt);
            }
        });
        jMenu5.add(itemEntrevista);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(671, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemBajaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaPActionPerformed
        new BajaDePostulante().setVisible(true);
    }//GEN-LAST:event_itemBajaPActionPerformed

    private void itemConsultaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaTActionPerformed
        new ConsultaPorTematica().setVisible(true);
    }//GEN-LAST:event_itemConsultaTActionPerformed

    private void itemAltaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAltaPActionPerformed
        if (Sistema.getInstance().getListaTematicas().size() >= 1) {
            new AltaDePostulante1().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existen temáticas cargadas en la que asignar postulantes", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_itemAltaPActionPerformed

    private void itemHistorialPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHistorialPActionPerformed
        new HistorialDePostulante().setVisible(true);
    }//GEN-LAST:event_itemHistorialPActionPerformed

    private void itemRegistroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroEActionPerformed
        new RegistroDeEvaluador().setVisible(true);
    }//GEN-LAST:event_itemRegistroEActionPerformed

    private void itemRegistroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroTActionPerformed
        new RegistroDeTematica().setVisible(true);
    }//GEN-LAST:event_itemRegistroTActionPerformed

    private void itemRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroPuestoActionPerformed

        if (Sistema.getInstance().getListaTematicas().size() >= 1) {
            new RegistroDePuesto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos una temática al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_itemRegistroPuestoActionPerformed

    private void itemConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaPuestoActionPerformed

        if (Sistema.getInstance().getListaPuestos().size() >= 1) {
            new ConsultaParaPuesto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos un puesto al sistema", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_itemConsultaPuestoActionPerformed

    private void itemEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEntrevistaActionPerformed

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
    }//GEN-LAST:event_itemEntrevistaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem itemAltaP;
    private javax.swing.JMenuItem itemBajaP;
    private javax.swing.JMenuItem itemConsultaPuesto;
    private javax.swing.JMenuItem itemConsultaT;
    private javax.swing.JMenuItem itemEntrevista;
    private javax.swing.JMenuItem itemHistorialP;
    private javax.swing.JMenuItem itemRegistroE;
    private javax.swing.JMenuItem itemRegistroPuesto;
    private javax.swing.JMenuItem itemRegistroT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
