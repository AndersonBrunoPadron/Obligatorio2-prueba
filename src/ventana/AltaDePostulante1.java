package ventana;

import Dominio.*;
import javax.swing.JOptionPane;

public class AltaDePostulante1 extends javax.swing.JFrame {

    public AltaDePostulante1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        labelFormato = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        btnRemoto = new javax.swing.JRadioButton();
        btnPresencial = new javax.swing.JRadioButton();
        btnMixto = new javax.swing.JRadioButton();

        setTitle("Alta de postulante");
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Alta de postulante");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(150, 0, 140, 30);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 40, 130, 20);

        labelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCedula.setText("Cédula:");
        getContentPane().add(labelCedula);
        labelCedula.setBounds(20, 70, 130, 20);

        labelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDireccion.setText("Dirección:");
        getContentPane().add(labelDireccion);
        labelDireccion.setBounds(20, 100, 130, 20);

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTelefono.setText("Teléfono:");
        getContentPane().add(labelTelefono);
        labelTelefono.setBounds(20, 130, 130, 20);

        labelMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMail.setText("Mail:");
        getContentPane().add(labelMail);
        labelMail.setBounds(20, 160, 130, 20);

        labelLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLinkedin.setText("Linkedin: ");
        getContentPane().add(labelLinkedin);
        labelLinkedin.setBounds(20, 190, 130, 20);

        labelFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFormato.setText("Formato:");
        getContentPane().add(labelFormato);
        labelFormato.setBounds(20, 230, 120, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 270, 100, 20);

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente);
        btnSiguiente.setBounds(300, 270, 110, 20);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(150, 70, 260, 20);
        getContentPane().add(txtLinkedin);
        txtLinkedin.setBounds(150, 190, 260, 20);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(150, 40, 260, 20);
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(150, 100, 260, 20);
        getContentPane().add(txtTelefono);
        txtTelefono.setBounds(150, 130, 260, 20);
        getContentPane().add(txtMail);
        txtMail.setBounds(150, 160, 260, 20);

        btnGroup.add(btnRemoto);
        btnRemoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoto.setText("Remoto");
        getContentPane().add(btnRemoto);
        btnRemoto.setBounds(150, 230, 70, 21);

        btnGroup.add(btnPresencial);
        btnPresencial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPresencial.setText("Presencial");
        btnPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresencialActionPerformed(evt);
            }
        });
        getContentPane().add(btnPresencial);
        btnPresencial.setBounds(240, 230, 90, 21);

        btnGroup.add(btnMixto);
        btnMixto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMixto.setText("Mixto");
        getContentPane().add(btnMixto);
        btnMixto.setBounds(330, 230, 70, 21);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(437, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        String nombre = txtNombre.getText().trim();
        String cedulaStr = txtCedula.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String telefonoStr = txtTelefono.getText().trim();
        String correo = txtMail.getText().trim();
        String linkedin = txtLinkedin.getText().trim();
        String tipo = "";
        boolean continuar = true;

        if (nombre.isEmpty() || cedulaStr.isEmpty() || direccion.isEmpty() || telefonoStr.isEmpty() || correo.isEmpty() || linkedin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else {
            try {
                int cedula = Integer.parseInt(cedulaStr);
                int telefono = Integer.parseInt(telefonoStr);

                if (btnRemoto.isSelected()) {
                    tipo = "Remoto";
                } else if (btnPresencial.isSelected()) {
                    tipo = "Presencial";
                } else if (btnMixto.isSelected()) {
                    tipo = "Mixto";
                } else {
                    JOptionPane.showMessageDialog(this, "Debes seleccionar un formato.", "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }

                if (continuar) {
                    // Verificar si la cédula ya existe en el sistema
                    if (Sistema.getInstance().existePostulanteConCedula(cedula) || Sistema.getInstance().existeEvaluadorConCedula(cedula)) {
                        JOptionPane.showMessageDialog(this, "La cédula ya existe en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        AltaDePostulante2 siguienteVentana = new AltaDePostulante2(nombre, cedula, direccion, telefono, correo, linkedin, tipo);
                        siguienteVentana.setVisible(true);
                        this.dispose();
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cédula y el teléfono deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresencialActionPerformed


    }//GEN-LAST:event_btnPresencialActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton btnMixto;
    private javax.swing.JRadioButton btnPresencial;
    private javax.swing.JRadioButton btnRemoto;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
