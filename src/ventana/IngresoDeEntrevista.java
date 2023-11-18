// AUTORES: 
//ANDERSON BRUNO (314202)
//CRISTHIAN GRIBAUSKAS (309715)
package ventana;

import Dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class IngresoDeEntrevista extends javax.swing.JFrame implements Observer {

    public IngresoDeEntrevista() {
        initComponents();
        Sistema.getInstance().addObserver(this);
        update(null, null);
    }

    private void objetoAPantalla() {
        Sistema sistema = Sistema.getInstance();
        listaPantallaPostulantes.setListData(sistema.getListaPostulantes().toArray());
        listaPantallaEvaluadores.setListData(sistema.getListaEvaluadores().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaPantallaPostulantes = new javax.swing.JList();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPantallaEvaluadores = new javax.swing.JList();
        labelNombre2 = new javax.swing.JLabel();
        txtComentario = new javax.swing.JTextField();
        labelNombre3 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de entrevistas");
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(listaPantallaPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 60, 160, 110);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Ingreso de entrevistas");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(120, 0, 160, 30);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Postulante:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(240, 40, 70, 20);

        labelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre1.setText("Comentario:");
        getContentPane().add(labelNombre1);
        labelNombre1.setBounds(30, 210, 70, 20);

        jScrollPane2.setViewportView(listaPantallaEvaluadores);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 150, 110);

        labelNombre2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre2.setText("Evaluador:");
        getContentPane().add(labelNombre2);
        labelNombre2.setBounds(70, 40, 70, 20);
        getContentPane().add(txtComentario);
        txtComentario.setBounds(120, 210, 240, 80);

        labelNombre3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre3.setText("Puntaje:");
        getContentPane().add(labelNombre3);
        labelNombre3.setBounds(30, 180, 70, 20);
        getContentPane().add(txtPuntaje);
        txtPuntaje.setBounds(120, 180, 240, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(30, 300, 90, 20);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 300, 90, 20);

        setSize(new java.awt.Dimension(408, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        int selectedIndexPostulantes = listaPantallaPostulantes.getSelectedIndex();
        int selectedIndexEvaluadores = listaPantallaEvaluadores.getSelectedIndex();

        // Verifica que se haya seleccionado al menos un postulante y un evaluador
        if (selectedIndexPostulantes != -1 && selectedIndexEvaluadores != -1) {
            String comentario = txtComentario.getText().trim();
            String puntaje = txtPuntaje.getText().trim();

            if (comentario.isEmpty() || puntaje.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int puntajeValue;
                try {
                    puntajeValue = Integer.parseInt(puntaje);
                    if (puntajeValue < 1 || puntajeValue > 100) {
                        JOptionPane.showMessageDialog(this, "El puntaje debe estar en el rango de 1 a 100.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Obtiene los objetos correspondientes a los índices seleccionados
                        Postulante selectedPostulante = Sistema.getInstance().getListaPostulantes().get(selectedIndexPostulantes);
                        Evaluador selectedEvaluador = Sistema.getInstance().getListaEvaluadores().get(selectedIndexEvaluadores);
                        int idEntrevista = Sistema.getInstance().idUltimaEntrevista();
                        Entrevista entrevista = new Entrevista(selectedEvaluador, selectedPostulante, puntajeValue, comentario, idEntrevista);

                        Sistema.getInstance().getListaEntrevistas().add(entrevista);

                        String mensaje = "Entrevista registrada con éxito:\n"
                                + "Postulante: " + selectedPostulante.getNombre() + " - CI: " + selectedPostulante.getCedula() + " - Dirección: " + selectedPostulante.getDireccion() + "  - Tipo: " + selectedPostulante.getTipo() + " - Linkedin: " + selectedPostulante.getLinkedin() + "\n"
                                + "Evaluador: " + selectedEvaluador.getNombre()
                                + " - Id entrevista: " + idEntrevista;
                        JOptionPane.showMessageDialog(this, mensaje, "Entrevista Registrada", JOptionPane.INFORMATION_MESSAGE);

                        txtComentario.setText("");
                        txtPuntaje.setText("");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El puntaje debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un postulante y un evaluador.", "Error", JOptionPane.ERROR_MESSAGE);
        }

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
    private javax.swing.JList listaPantallaEvaluadores;
    private javax.swing.JList listaPantallaPostulantes;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtPuntaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        objetoAPantalla();
    }
}
