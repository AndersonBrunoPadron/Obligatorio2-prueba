package ventana;

import Dominio.Postulante;
import Dominio.Puesto;
import Dominio.Sistema;
import Dominio.Tematica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaParaPuesto extends javax.swing.JFrame {

    public ConsultaParaPuesto() {
        initComponents();
        objetoAPantalla();
    }

    private void objetoAPantalla() {
        Sistema sistema = Sistema.getInstance(); // Obtén la instancia de Sistema
        // Obtén la lista de postulantes
        ArrayList<Puesto> puestos = sistema.getListaPuestos();
        // Crea una lista de nombres de postulantes
        ArrayList<String> nombresPuestos = new ArrayList<>();
        for (Puesto puesto : puestos) {
            nombresPuestos.add(puesto.getNombre());
        }
        // Convierte la lista de nombres de postulantes a un arreglo de String
        String[] nombresPuestosArray = nombresPuestos.toArray(new String[nombresPuestos.size()]);
        // Asigna el arreglo de nombres de postulantes a la listaDePostulantes
        listaPantallaPuestos.setListData(nombresPuestosArray);
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
        listaPantallaPuestos = new javax.swing.JList<>();
        labelNivel = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jScrollPane2.setViewportView(listaPantallaPuestos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 60, 350, 110);

        labelNivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNivel.setText("Nivel:");
        getContentPane().add(labelNivel);
        labelNivel.setBounds(30, 180, 60, 20);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
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
        jSeparator1.setBounds(30, 220, 350, 3);

        setSize(new java.awt.Dimension(429, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed


    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Obtén el valor del nivel requerido del spinner
        // Obtén el sistema
        Sistema sistema = Sistema.getInstance();
        int nivelRequerido = (int) spinnerNivel.getValue();

        // Obtiene el puesto seleccionado en la lista de puestos en pantalla
        Puesto puestoSeleccionado = obtenerPuestoSeleccionadoEnPantalla();

        if (puestoSeleccionado != null) {
            // Obtén la lista de postulantes con al menos una entrevista
            ArrayList<Postulante> postulantesConEntrevistas = sistema.obtenerPostulantesConEntrevistas();

            // Filtra los postulantes que cumplen con las condiciones
            ArrayList<Postulante> postulantesFiltrados = sistema.obtenerPostulantesPorTematicaNivel(postulantesConEntrevistas, puestoSeleccionado.getTemasRequeridos(), nivelRequerido);

            // Crea una lista de nombres de postulantes que cumplen con las condiciones
            ArrayList<String> nombresPostulantesFiltrados = new ArrayList<>();
            for (Postulante postulante : postulantesFiltrados) {
                String nombreCedula = postulante.getNombre() + " (" + postulante.getCedula() + ")";
                nombresPostulantesFiltrados.add(nombreCedula);
            }

            // Convierte la lista de nombres a un arreglo de String
            String[] nombresArray = nombresPostulantesFiltrados.toArray(new String[nombresPostulantesFiltrados.size()]);

            // Asigna el arreglo de nombres al JList listaPostulantes
            listaPostulantes.setListData(nombresArray);
        } else {
            // Si no se ha seleccionado un puesto, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Selecciona un puesto antes de consultar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private Puesto obtenerPuestoSeleccionadoEnPantalla() {
        int indicePuestoSeleccionado = listaPantallaPuestos.getSelectedIndex();
        if (indicePuestoSeleccionado >= 0) {
            Sistema sistema = Sistema.getInstance();
            ArrayList<Puesto> puestos = sistema.getListaPuestos();
            if (indicePuestoSeleccionado < puestos.size()) {
                return puestos.get(indicePuestoSeleccionado);
            }
        }
        return null;
    }

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
    private javax.swing.JList<String> listaPantallaPuestos;
    private javax.swing.JList<String> listaPostulantes;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables

}
