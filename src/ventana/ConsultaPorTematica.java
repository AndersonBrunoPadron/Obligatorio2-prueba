package ventana;

import Dominio.Sistema;
import Dominio.Tematica;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ConsultaPorTematica extends javax.swing.JFrame {

    public ConsultaPorTematica() {
        initComponents();
        objetoAPantalla();
        // Agrega un ListSelectionListener a la lista de temáticas
        listaPantallaTematica.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Se ejecutará cuando se complete la selección de un elemento
                    tematicaSeleccionadaEnPantalla();
                }
            }
        });
    }

    private void tematicaSeleccionadaEnPantalla() {
        Tematica tematicaSeleccionada = (Tematica) listaPantallaTematica.getSelectedValue();
        if (tematicaSeleccionada != null) {
            estadisticaAPantalla();
        }
    }

    private void objetoAPantalla() {
        Sistema sistema = Sistema.getInstance();
        listaPantallaTematica.setListData(sistema.getListaTematicas().toArray());
    }

    private void estadisticaAPantalla() {
        Tematica tematicaSeleccionada = (Tematica) listaPantallaTematica.getSelectedValue();
        int cantidadPostulantes = Sistema.getInstance().contarPostulantesConNivelSuperiorA5EnTematica(tematicaSeleccionada);
        int cantidadPuestos = Sistema.getInstance().cuantosPuestosTienenTematica(tematicaSeleccionada);
        actualizarEstadisticas(cantidadPuestos, cantidadPostulantes, tematicaSeleccionada);

    }

    private void actualizarEstadisticas(int cantidadPuestos, int cantidadPostulantes, Tematica tematicaSeleccionada) {
        if (cantidadPuestos == 0) {
            labelCantPuestos.setText("Aún no existen puestos que buscan conocimiento en " + tematicaSeleccionada.getNombre());
        }
        if (cantidadPuestos == 1) {
            labelCantPuestos.setText("Existe " + cantidadPuestos + " puesto que busca conocimiento en " + tematicaSeleccionada.getNombre());
        }
        if (cantidadPuestos > 1) {
            labelCantPuestos.setText("Existen " + cantidadPuestos + " puestos que buscan conocimiento en " + tematicaSeleccionada.getNombre());
        }

        if (cantidadPostulantes == 0) {
            labelCantPostulantes.setText("Aún no existen postulantes con un nivel mayor a 5 en " + tematicaSeleccionada.getNombre());
        }
        if (cantidadPostulantes == 1) {
            labelCantPostulantes.setText("Existe " + cantidadPostulantes + " postulante que tiene un nivel mayor a 5 en " + tematicaSeleccionada.getNombre());
        }
        if (cantidadPostulantes > 1) {
            labelCantPostulantes.setText("Existen " + cantidadPostulantes + " postulantes que tiene un nivel mayor a 5 en " + tematicaSeleccionada.getNombre());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelTematicas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPantallaTematica = new javax.swing.JList();
        labelTitulo1 = new javax.swing.JLabel();
        labelCantPuestos = new javax.swing.JLabel();
        labelCantPostulantes = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo.setText("Consulta por temática");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(150, 0, 150, 30);

        labelTematicas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas.setText("Temáticas:");
        getContentPane().add(labelTematicas);
        labelTematicas.setBounds(30, 40, 70, 20);

        jScrollPane2.setViewportView(listaPantallaTematica);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 390, 110);

        labelTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitulo1.setText("Estadísticas");
        getContentPane().add(labelTitulo1);
        labelTitulo1.setBounds(180, 170, 80, 30);

        labelCantPuestos.setText("                                           Selecione una temática");
        getContentPane().add(labelCantPuestos);
        labelCantPuestos.setBounds(30, 210, 420, 20);
        getContentPane().add(labelCantPostulantes);
        labelCantPostulantes.setBounds(30, 240, 420, 20);

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(30, 293, 100, 30);

        setSize(new java.awt.Dimension(473, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCantPostulantes;
    private javax.swing.JLabel labelCantPuestos;
    private javax.swing.JLabel labelTematicas;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JList listaPantallaTematica;
    // End of variables declaration//GEN-END:variables
}
