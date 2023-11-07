package ventana;

import Dominio.*;
import java.util.ArrayList;
import javax.swing.*;

public class AltaDePostulante2 extends javax.swing.JFrame {

    private Postulante postulante;
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String correo;
    private String linkedin;
    private String tipo;

    private ArrayList<ExperienciaPostulante> experiencias = new ArrayList<ExperienciaPostulante>();

    public AltaDePostulante2(String unNombre, int unaCedula, String unaDireccion, int unTelefono, String unCorreo, String unLinkedin, String unTipo) {
        //  sistema = new Sistema();
        initComponents();
        // this.postulante = postulante1;
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.direccion = unaDireccion;
        this.telefono = unTelefono;
        this.correo = unCorreo;
        this.linkedin = unLinkedin;
        this.tipo = unTipo;

        cargarTemasEnComboBox();
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
        spinnerNivel.setModel(spinnerModel);
    }

    private void cargarTemasEnComboBox() {
        comboBoxTema.removeAllItems(); // Limpia cualquier elemento existente en el combo box
        // Accede a la lista de temas en el sistema
        ArrayList<Tematica> temas = Sistema.getInstance().getListaTematicas();
        // Agrega los temas al combo box
        for (Tematica tematica : temas) {
            comboBoxTema.addItem(tematica);
        }
    }

    private void actualizarListaExperiencias() {
        listaExperiencias.setListData(experiencias.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelExperiencia = new javax.swing.JLabel();
        labelTema = new javax.swing.JLabel();
        comboBoxTema = new javax.swing.JComboBox();
        spinnerNivel = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        labelNivel = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExperiencias = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de postultante");
        getContentPane().setLayout(null);

        labelExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelExperiencia.setText("Experiencia:");
        getContentPane().add(labelExperiencia);
        labelExperiencia.setBounds(10, 130, 90, 16);

        labelTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTema.setText("Tema:");
        getContentPane().add(labelTema);
        labelTema.setBounds(10, 20, 90, 16);

        comboBoxTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTemaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTema);
        comboBoxTema.setBounds(130, 20, 240, 20);
        getContentPane().add(spinnerNivel);
        spinnerNivel.setBounds(130, 70, 80, 20);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 240, 100, 20);

        labelNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNivel.setText("Nivel:");
        getContentPane().add(labelNivel);
        labelNivel.setBounds(10, 70, 90, 16);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(230, 70, 100, 20);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(10, 170, 100, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(10, 240, 100, 20);

        listaExperiencias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaExperienciasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaExperiencias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 130, 240, 90);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 113, 360, 10);

        setSize(new java.awt.Dimension(414, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (experiencias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un tema.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener la lista de experiencias
            //postulante.agregarTemas(experiencias);
            Postulante postulante = new Postulante(nombre, cedula, direccion, telefono, correo, linkedin, tipo, experiencias);
            JOptionPane.showMessageDialog(this, "La postulante se ha guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Agrega el Postulante al Sistema
            Sistema.getInstance().agregarPostulante(postulante);
            AltaDePostulante1 siguienteVentana = new AltaDePostulante1();
            siguienteVentana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedIndex = listaExperiencias.getSelectedIndex();
        if (selectedIndex >= 0) {
            experiencias.remove(selectedIndex); // Elimina la experiencia seleccionada
            actualizarListaExperiencias();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void listaExperienciasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaExperienciasValueChanged

    }//GEN-LAST:event_listaExperienciasValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Tematica temaSeleccionado = (Tematica) comboBoxTema.getSelectedItem();
        int nivelSeleccionado = (int) spinnerNivel.getValue();

        // Comprobar si ya existe una experiencia para el tema seleccionado
        ExperienciaPostulante experienciaExistente = null;
        for (ExperienciaPostulante exp : experiencias) {
            if (experienciaExistente == null && exp.getTema().equals(temaSeleccionado)) {
                experienciaExistente = exp;
            }
        }
        // Si ya existe una experiencia para el tema, sobreescribirla
        if (experienciaExistente != null) {
            experienciaExistente.setNivel(nivelSeleccionado);
        } else {
            // Si no existe una experiencia para el tema, crear una nueva
            ExperienciaPostulante experiencia = new ExperienciaPostulante(temaSeleccionado, nivelSeleccionado);
            experiencias.add(experiencia);
        }
        // Actualizar la lista de experiencias en pantalla
        listaExperiencias.setListData(experiencias.toArray());

        // Restablecer los valores predeterminados
        comboBoxTema.setSelectedIndex(0);
        spinnerNivel.setValue(1);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboBoxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTemaActionPerformed

    }//GEN-LAST:event_comboBoxTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox comboBoxTema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelExperiencia;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelTema;
    private javax.swing.JList listaExperiencias;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
