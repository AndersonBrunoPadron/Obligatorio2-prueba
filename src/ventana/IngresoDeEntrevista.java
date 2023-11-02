
package ventana;

import Dominio.*;
import java.util.ArrayList;

public class IngresoDeEntrevista extends javax.swing.JFrame {


    public IngresoDeEntrevista() {
        initComponents();
        objetoAPantalla();
    }
    
private void objetoAPantalla() {
    Sistema sistema = Sistema.getInstance(); // Obtén la instancia de Sistema
    
    // Carga la lista de nombres de postulantes en la listaDePostulantes
    ArrayList<String> nombresPostulantes = sistema.obtenerNombresPostulantes();
    
    // Convierte el ArrayList de nombres de postulantes a un arreglo de String
    String[] nombresPostulantesArray = nombresPostulantes.toArray(new String[nombresPostulantes.size()]);
    
    // Asigna el arreglo de nombres de postulantes a la listaDePostulantes
    listaDePostulantes.setListData(nombresPostulantesArray);
    
    // Carga la lista de nombres de evaluadores en la listaDeEvaluadores (si tienes un método similar en la clase Sistema)
    ArrayList<String> nombresEvaluadores = sistema.obtenerNombresEvaluadores();
    
    // Convierte el ArrayList de nombres de evaluadores a un arreglo de String
    String[] nombresEvaluadoresArray = nombresEvaluadores.toArray(new String[nombresEvaluadores.size()]);
    
    // Asigna el arreglo de nombres de evaluadores a la listaDeEvaluadores
    listaDeEvaluadores.setListData(nombresEvaluadoresArray);
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaDePostulantes = new javax.swing.JList<>();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeEvaluadores = new javax.swing.JList<>();
        labelNombre2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelNombre3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaDePostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 60, 90, 110);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Ingreso de entrevistas");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 160, 30);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Postulante:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(270, 40, 70, 20);

        labelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre1.setText("Comentario:");
        getContentPane().add(labelNombre1);
        labelNombre1.setBounds(30, 210, 70, 20);

        jScrollPane2.setViewportView(listaDeEvaluadores);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 90, 110);

        labelNombre2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre2.setText("Evaluador:");
        getContentPane().add(labelNombre2);
        labelNombre2.setBounds(30, 40, 70, 20);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 210, 240, 80);

        labelNombre3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre3.setText("Puntaje:");
        getContentPane().add(labelNombre3);
        labelNombre3.setBounds(30, 180, 70, 20);
        getContentPane().add(txtNombre1);
        txtNombre1.setBounds(120, 180, 240, 20);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(30, 300, 90, 23);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 300, 90, 23);

        setSize(new java.awt.Dimension(408, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaDeEvaluadores;
    private javax.swing.JList<String> listaDePostulantes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
