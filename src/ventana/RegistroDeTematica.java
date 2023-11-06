
package ventana;

import Dominio.Tematica;
import Dominio.Sistema;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;



public class RegistroDeTematica extends javax.swing.JFrame implements Observer{

private Tematica modelo;

    public RegistroDeTematica() {
        initComponents();
        Sistema.getInstance().addObserver(this);
         update(null, null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Registo de temática");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 160, 30);

        labelDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDescripcion.setText("Descripción:");
        getContentPane().add(labelDescripcion);
        labelDescripcion.setBounds(20, 100, 80, 20);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(120, 110, 240, 100);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 60, 240, 20);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 60, 50, 16);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 240, 90, 23);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 240, 90, 23);

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
// Obtener los valores de los campos de texto
    String nombre = txtNombre.getText();
    String descripcion = txtDescripcion.getText();

    if (nombre.isEmpty() || descripcion.isEmpty()) {
        // Si algún campo está vacío, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    if(!Sistema.getInstance().existeTematica(nombre)){
        Tematica nuevaTematica = new Tematica();
        nuevaTematica.setNombre(nombre);
        nuevaTematica.setDescripcion(descripcion);
        Sistema.getInstance().agregarTematica(nuevaTematica);

        JOptionPane.showMessageDialog(this, "La temática se ha guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        txtNombre.setText("");
        txtDescripcion.setText("");
        System.out.println();
    }
    else{
        JOptionPane.showMessageDialog(this, "La temática ya existe en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);

        txtNombre.setText("");
        txtDescripcion.setText("");
        System.out.println();
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables


    public void update(Observable o, Object ob) {
        
    }
}
