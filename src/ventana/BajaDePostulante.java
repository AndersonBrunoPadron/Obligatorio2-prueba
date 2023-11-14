
package ventana;

import Dominio.*;
import java.util.*;
import javax.swing.DefaultListModel;




public class BajaDePostulante extends javax.swing.JFrame implements Observer {
    
    private Postulante postulanteSeleccionado;


    public BajaDePostulante() {
        initComponents();
        
        Sistema.getInstance().addObserver(this);
        update(null, null);
    }

    private void objetoAPantalla(){
        Sistema sistema = Sistema.getInstance();
        ArrayList<Postulante> postulantes = sistema.getListaPostulantes();
        
        jListPostulantes.setListData(postulantes.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPostulantes = new javax.swing.JList();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja de postulante");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Baja de postulante");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(170, 0, 150, 30);

        jScrollPane1.setViewportView(jListPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 420, 230);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(380, 290, 90, 27);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 290, 76, 27);

        setSize(new java.awt.Dimension(500, 362));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Postulante postulante = (Postulante) jListPostulantes.getSelectedValue();
        Sistema.getInstance().eliminarPostulantePorObjeto(postulante);
        objetoAPantalla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JList jListPostulantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
               objetoAPantalla();
    }
}
