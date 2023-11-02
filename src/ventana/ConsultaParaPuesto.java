
package ventana;


public class ConsultaParaPuesto extends javax.swing.JFrame {

    public ConsultaParaPuesto() {
        initComponents();
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelPostulantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList<>();
        labelPuestos = new javax.swing.JLabel();
        spinnerNivel = new javax.swing.JSpinner();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPuestos = new javax.swing.JList<>();
        labelNivel = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta para puesto");
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Consulta para puesto");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 150, 30);

        labelPostulantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPostulantes.setText("Postulantes:");
        getContentPane().add(labelPostulantes);
        labelPostulantes.setBounds(30, 240, 80, 20);

        listaPostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 260, 350, 120);

        labelPuestos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPuestos.setText("Puestos:");
        getContentPane().add(labelPuestos);
        labelPuestos.setBounds(30, 40, 60, 20);
        getContentPane().add(spinnerNivel);
        spinnerNivel.setBounds(120, 180, 90, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(30, 400, 120, 23);

        listaPuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaPuestos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 350, 110);

        labelNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNivel.setText("Nivel:");
        getContentPane().add(labelNivel);
        labelNivel.setBounds(30, 180, 60, 20);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(260, 180, 120, 23);

        btnExportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar);
        btnExportar.setBounds(260, 400, 120, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 220, 350, 10);

        setSize(new java.awt.Dimension(429, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        
    }//GEN-LAST:event_btnExportarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelPostulantes;
    private javax.swing.JLabel labelPuestos;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaPostulantes;
    private javax.swing.JList<String> listaPuestos;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
