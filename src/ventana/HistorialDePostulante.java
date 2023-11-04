
package ventana;


public class HistorialDePostulante extends javax.swing.JFrame {


    public HistorialDePostulante() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelTematicas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPantallaTematica = new javax.swing.JList<>();
        labelTematicas1 = new javax.swing.JLabel();
        labelTematicas2 = new javax.swing.JLabel();
        labelTematicas3 = new javax.swing.JLabel();
        labelTematicas4 = new javax.swing.JLabel();
        labelTematicas5 = new javax.swing.JLabel();
        labelTematicas6 = new javax.swing.JLabel();
        labelTematicas7 = new javax.swing.JLabel();
        labelTematicas8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPantallaPuestos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setMinWidth(233);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(233);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(550);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 430, 910, 240);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Historial postulante");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(370, 10, 150, 30);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 690, 120, 23);

        labelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBuscar.setText("Buscar:");
        getContentPane().add(labelBuscar);
        labelBuscar.setBounds(20, 400, 60, 20);
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(70, 400, 260, 20);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(340, 400, 90, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(440, 400, 90, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 380, 910, 10);

        labelTematicas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas.setText("Postulantes:");
        getContentPane().add(labelTematicas);
        labelTematicas.setBounds(30, 40, 80, 30);

        jScrollPane2.setViewportView(listaPantallaTematica);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 300, 240);

        labelTematicas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas1.setText("Experiencia:");
        getContentPane().add(labelTematicas1);
        labelTematicas1.setBounds(440, 260, 80, 20);

        labelTematicas2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas2.setText("Nombre:");
        getContentPane().add(labelTematicas2);
        labelTematicas2.setBounds(440, 50, 80, 20);

        labelTematicas3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas3.setText("Cédula:");
        getContentPane().add(labelTematicas3);
        labelTematicas3.setBounds(440, 80, 80, 20);

        labelTematicas4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas4.setText("Dirección:");
        getContentPane().add(labelTematicas4);
        labelTematicas4.setBounds(440, 110, 80, 20);

        labelTematicas5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas5.setText("Teléfono:");
        getContentPane().add(labelTematicas5);
        labelTematicas5.setBounds(440, 140, 80, 20);

        labelTematicas6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas6.setText("Mail:");
        getContentPane().add(labelTematicas6);
        labelTematicas6.setBounds(440, 170, 80, 20);

        labelTematicas7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas7.setText("Linkedin:");
        getContentPane().add(labelTematicas7);
        labelTematicas7.setBounds(440, 200, 80, 20);

        labelTematicas8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas8.setText("Formato:");
        getContentPane().add(labelTematicas8);
        labelTematicas8.setBounds(440, 230, 80, 20);

        jScrollPane3.setViewportView(listaPantallaPuestos);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 270, 230, 100);

        setSize(new java.awt.Dimension(970, 769));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

  

  
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

 

   
    }//GEN-LAST:event_btnCancelarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelTematicas;
    private javax.swing.JLabel labelTematicas1;
    private javax.swing.JLabel labelTematicas2;
    private javax.swing.JLabel labelTematicas3;
    private javax.swing.JLabel labelTematicas4;
    private javax.swing.JLabel labelTematicas5;
    private javax.swing.JLabel labelTematicas6;
    private javax.swing.JLabel labelTematicas7;
    private javax.swing.JLabel labelTematicas8;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaPantallaPuestos;
    private javax.swing.JList<String> listaPantallaTematica;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
