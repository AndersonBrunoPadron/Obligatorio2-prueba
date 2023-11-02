
package ventana;


public class RegistroDePuesto extends javax.swing.JFrame {


    public RegistroDePuesto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelFormato = new javax.swing.JLabel();
        btnRemoto = new javax.swing.JRadioButton();
        btnPresencial = new javax.swing.JRadioButton();
        btnMixto = new javax.swing.JRadioButton();
        labelTema = new javax.swing.JLabel();
        comboBoxTema = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Registo de puesto");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 160, 30);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 60, 50, 16);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 60, 240, 20);

        labelFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFormato.setText("Formato:");
        getContentPane().add(labelFormato);
        labelFormato.setBounds(20, 100, 120, 20);

        buttonGroup.add(btnRemoto);
        btnRemoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoto.setText("Remoto");
        btnRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoto);
        btnRemoto.setBounds(120, 100, 70, 21);

        buttonGroup.add(btnPresencial);
        btnPresencial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPresencial.setText("Presencial");
        btnPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresencialActionPerformed(evt);
            }
        });
        getContentPane().add(btnPresencial);
        btnPresencial.setBounds(210, 100, 90, 21);

        buttonGroup.add(btnMixto);
        btnMixto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMixto.setText("Mixto");
        btnMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMixtoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMixto);
        btnMixto.setBounds(310, 100, 70, 21);

        labelTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTema.setText("Tema:");
        getContentPane().add(labelTema);
        labelTema.setBounds(20, 140, 90, 16);

        comboBoxTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTemaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTema);
        comboBoxTema.setBounds(120, 140, 240, 20);

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresencialActionPerformed

    }//GEN-LAST:event_btnPresencialActionPerformed

    private void comboBoxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTemaActionPerformed

    }//GEN-LAST:event_comboBoxTemaActionPerformed

    private void btnMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMixtoActionPerformed
       
    }//GEN-LAST:event_btnMixtoActionPerformed

    private void btnRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemotoActionPerformed
        
    }//GEN-LAST:event_btnRemotoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnMixto;
    private javax.swing.JRadioButton btnPresencial;
    private javax.swing.JRadioButton btnRemoto;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> comboBoxTema;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTema;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
