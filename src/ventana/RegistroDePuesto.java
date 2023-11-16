package ventana;

import Dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class RegistroDePuesto extends javax.swing.JFrame implements Observer {

    private ArrayList<Tematica> temasRequeridos = new ArrayList<Tematica>();

    public RegistroDePuesto() {
        initComponents();

        Sistema.getInstance().addObserver(this);
        update(null, null);
    }

    private void cargarTemasEnComboBox() {
        comboBoxTema.removeAllItems(); // Limpia cualquier elemento existente en el combo box
        // Accede a la lista de temas en el sistema
        ArrayList<Tematica> temas = Sistema.getInstance().getListaTematicas();
        // Agrega los temas al combo box
        for (Tematica tematica : temas) {
            comboBoxTema.addItem(tematica.getNombre());
        }
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
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemasRequeridos = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        labelTema1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de puesto");
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Registro de puesto");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(130, 0, 160, 30);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(20, 60, 50, 16);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(120, 60, 240, 20);

        labelFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFormato.setText("Formato:");
        getContentPane().add(labelFormato);
        labelFormato.setBounds(20, 100, 100, 20);

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
        btnMixto.setBounds(300, 100, 70, 21);

        labelTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTema.setText("Tema:");
        getContentPane().add(labelTema);
        labelTema.setBounds(20, 130, 90, 16);

        comboBoxTema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTemaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxTema);
        comboBoxTema.setBounds(120, 130, 130, 20);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(20, 290, 90, 20);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 290, 90, 20);

        listaTemasRequeridos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTemasRequeridosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTemasRequeridos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 180, 240, 90);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(270, 130, 90, 20);

        labelTema1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTema1.setText("Temas requeridos:");
        getContentPane().add(labelTema1);
        labelTema1.setBounds(20, 160, 110, 20);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(20, 210, 90, 20);

        setSize(new java.awt.Dimension(414, 358));
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombrePuesto = txtNombre.getText().trim(); // Obtener el nombre del puesto y eliminar espacios en blanco

        if (nombrePuesto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del puesto no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String tipoPuesto = "";
            if (btnRemoto.isSelected()) {
                tipoPuesto = "Remoto";
            } else if (btnPresencial.isSelected()) {
                tipoPuesto = "Presencial";
            } else if (btnMixto.isSelected()) {
                tipoPuesto = "Mixto";
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de puesto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            // Validar que al menos se haya seleccionado una temática
            if (temasRequeridos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar al menos una temática requerida.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Crear una lista de temas requeridos a partir de los temas seleccionados
                ArrayList<Tematica> temasRequeridosPuesto = new ArrayList<>();
                for (Tematica tematica : temasRequeridos) {
                    temasRequeridosPuesto.add(tematica);
                }
                if (!Sistema.getInstance().existePuesto(nombrePuesto)) {
                           System.out.println("eb ventana "+Sistema.getInstance().existePuesto(nombrePuesto));
                    Puesto nuevoPuesto = new Puesto(nombrePuesto, tipoPuesto, temasRequeridosPuesto);
                    Sistema.getInstance().agregarPuesto(nuevoPuesto);

                    limpiarPantalla();

                    JOptionPane.showMessageDialog(this, "El puesto ha sido registrado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "El nombre del puesto ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void listaTemasRequeridosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTemasRequeridosValueChanged

    }//GEN-LAST:event_listaTemasRequeridosValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String temaSeleccionado = (String) comboBoxTema.getSelectedItem();
        boolean temaExistente = false;
        boolean temaEnSistema = false;

        for (Tematica tema : temasRequeridos) {
            if (tema.getNombre().equals(temaSeleccionado)) {
                temaExistente = true;
            }
        }

        if (!temaExistente) {
            for (Tematica tematica : Sistema.getInstance().getListaTematicas()) {
                if (tematica.getNombre().equals(temaSeleccionado)) {
                    temasRequeridos.add(tematica);
                    temaEnSistema = true;
                }
            }
        }
        if (temaEnSistema) {
            //actualizarListaTemasRequeridos();
            listaTemasRequeridos.setListData(temasRequeridos.toArray());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedIndex = listaTemasRequeridos.getSelectedIndex();
        if (selectedIndex >= 0) {
            temasRequeridos.remove(selectedIndex);
            // actualizarListaTemasRequeridos();
            listaTemasRequeridos.setListData(temasRequeridos.toArray());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void limpiarPantalla() {
        txtNombre.setText("");
        btnRemoto.setSelected(false);
        btnPresencial.setSelected(false);
        btnMixto.setSelected(false);
        temasRequeridos.clear(); // Elimina todos los elementos de la lista temasRequeridos
        //actualizarListaTemasRequeridos();
        listaTemasRequeridos.setListData(temasRequeridos.toArray());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JRadioButton btnMixto;
    private javax.swing.JRadioButton btnPresencial;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton btnRemoto;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> comboBoxTema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTema;
    private javax.swing.JLabel labelTema1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList listaTemasRequeridos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public void update(Observable o, Object ob) {
        cargarTemasEnComboBox();
    }
}
