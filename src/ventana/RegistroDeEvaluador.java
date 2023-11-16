// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)

package ventana;

import java.time.LocalDate;
import Dominio.*;
import java.time.Year;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroDeEvaluador extends javax.swing.JFrame {

    public RegistroDeEvaluador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelIngreso = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de evaluador");
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Registro de evaluador");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 160, 30);

        labelIngreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelIngreso.setText("Año de ingreso:");
        getContentPane().add(labelIngreso);
        labelIngreso.setBounds(20, 180, 90, 20);
        getContentPane().add(txtIngreso);
        txtIngreso.setBounds(120, 180, 240, 20);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 60, 50, 16);

        labelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCedula.setText("Cédula:");
        getContentPane().add(labelCedula);
        labelCedula.setBounds(20, 100, 50, 16);

        labelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDireccion.setText("Dirección:");
        getContentPane().add(labelDireccion);
        labelDireccion.setBounds(20, 140, 70, 20);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 60, 240, 20);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(120, 100, 240, 20);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(120, 140, 240, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 230, 90, 20);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 230, 90, 20);

        setSize(new java.awt.Dimension(412, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    String nombre = txtNombre.getText();
    String cedulaStr = txtCedula.getText();
    String ingresoAnoStr = txtIngreso.getText();
    String direccion = txtDireccion.getText();

    try {
        if (nombre.isEmpty() || cedulaStr.isEmpty() || ingresoAnoStr.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Validar que la cédula sea un número entero
            int cedula = Integer.parseInt(cedulaStr);

            // Validar que la cédula no exista en el sistema
            if (Sistema.getInstance().existePostulanteConCedula(cedula) || Sistema.getInstance().existeEvaluadorConCedula(cedula)) {
                JOptionPane.showMessageDialog(this, "La cédula ya existe en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Validar que el año de ingreso sea un número entero
                int ingresoAno = Integer.parseInt(ingresoAnoStr);
                int anoActual = Year.now().getValue();
                if (ingresoAno > anoActual) {
                    JOptionPane.showMessageDialog(this, "El año de ingreso no puede ser mayor al año actual.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    Evaluador nuevoEvaluador = new Evaluador(nombre, cedula, direccion, ingresoAnoStr);
                    Sistema.getInstance().agregarEvaluador(nuevoEvaluador);
                    JOptionPane.showMessageDialog(this, "El evaluador se ha registrado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtIngreso.setText("");
                    txtDireccion.setText("");
                }
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos para la cédula y el año de ingreso.", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
