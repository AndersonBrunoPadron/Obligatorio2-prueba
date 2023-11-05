package ventana;

import Dominio.Entrevista;
import Dominio.Evaluador;
import Dominio.ExperienciaPostulante;
import Dominio.Postulante;
import Dominio.Sistema;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class HistorialDePostulante extends javax.swing.JFrame {

    private Postulante postulanteSeleccionado;

    public HistorialDePostulante() {
        initComponents();
        objetoAPantalla();

        listaPantallaPostulantes.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    datosAPantalla();
                }
            }
        });
    }

    private void objetoAPantalla() {
        Sistema sistema = Sistema.getInstance();
        ArrayList<Postulante> postulantes = sistema.getListaPostulantes();

        DefaultListModel<String> modelo = new DefaultListModel<>();
        listaPantallaPostulantes.setModel(modelo);

        for (Postulante postulante : postulantes) {
            modelo.addElement(postulante.getNombre() + " (" + postulante.getCedula() + ")");
        }
    }

    private void datosAPantalla() {
        postulanteSeleccionado = obtenerPostulanteSeleccionadoEnPantalla();
        if (postulanteSeleccionado != null) {
            labelTxtNombre.setText(postulanteSeleccionado.getNombre());
            labelTxtCedula.setText("" + postulanteSeleccionado.getCedula());
            labelTxtDireccion.setText(postulanteSeleccionado.getDireccion());
            labelTxtTelefono.setText("" + postulanteSeleccionado.getTelefono());
            labelTxtMail.setText(postulanteSeleccionado.getCorreo());
            labelTxtLinkedin.setText(postulanteSeleccionado.getLinkedin());
            labelTxtFormato.setText(postulanteSeleccionado.getTipo());
        }

        ArrayList<ExperienciaPostulante> experiencias = Sistema.getInstance().obtenerExperienciasPorCedula(postulanteSeleccionado.getCedula());
        DefaultListModel<String> modelo = new DefaultListModel<>();
        listaPantallaExperiencias.setModel(modelo);

        for (ExperienciaPostulante experiencia : experiencias) {
            modelo.addElement(experiencia.getTema()+" ("+experiencia.getNivel()+")");
        }

        cargarEntrevistasDelPostulante(postulanteSeleccionado);

        // Agregar el MouseListener al labelTxtLinkedin
        labelTxtLinkedin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String linkedinURL = labelTxtLinkedin.getText();

                if (isURL(linkedinURL)) {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            URI uri = new URI(linkedinURL);
                            Desktop.getDesktop().browse(uri);
                        } catch (IOException | URISyntaxException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else {
                    System.out.println("No es una URL válida: " + linkedinURL);
                }
            }
        });
    }

// Método para verificar si una cadena es una URL válida
    private boolean isURL(String str) {
        boolean res = false;
        try {
            new URL(str).toURI();
            res = true;
        } catch (MalformedURLException | URISyntaxException e) {
            res = false;
        }
        return res;
    }

    private void cargarEntrevistasDelPostulante(Postulante postulante) {
        // Obtén el sistema
        Sistema sistema = Sistema.getInstance();

        // Obten una referencia al modelo de tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaPantalla.getModel();

        // Limpia la tabla si ya contiene datos
        modelo.setRowCount(0);

        // Obtén las entrevistas del postulante
        ArrayList<Entrevista> entrevistas = new ArrayList<>();

        for (Entrevista entrevista : sistema.getListaEntrevistas()) {
            if (entrevista.getPostulante() == postulante) {
                entrevistas.add(entrevista);
            }
        }
        // Inicializa un contador
        int contador = 1;
        // Agrega las entrevistas al modelo de la tabla
        for (Entrevista entrevista : entrevistas) {
            modelo.addRow(new Object[]{
                contador, // Utiliza el contador en lugar de la posición
                entrevista.getEvaluador().getNombre(),
                entrevista.getPuntaje(),
                entrevista.getComentarios()
            });
            // Incrementa el contador para la próxima entrevista
            contador++;
        }
        // Notifica a la tabla que los datos han cambiado
        modelo.fireTableDataChanged();
    }

    private Postulante obtenerPostulanteSeleccionadoEnPantalla() {
        String nombrePostulanteSeleccionado = listaPantallaPostulantes.getSelectedValue();
        String numerosSeleccionados = obtenerNumerosDeSeleccion(nombrePostulanteSeleccionado);
        Postulante postulanteSeleccionado = null;

        if (!numerosSeleccionados.isEmpty()) {
            // Utiliza los números obtenidos para buscar al Postulante
            int cedula = Integer.parseInt(numerosSeleccionados);
            Sistema sistema = Sistema.getInstance();
            ArrayList<Postulante> postulantes = sistema.getListaPostulantes();

            for (Postulante postulante : postulantes) {
                if (postulante.getCedula() == cedula) {
                    postulanteSeleccionado = postulante;
                }
            }
        }
        return postulanteSeleccionado;
    }

    private String obtenerNumerosDeSeleccion(String nombrePostulanteSeleccionado) {
        String numeros = "";

        if (nombrePostulanteSeleccionado != null) {
            // Utiliza una expresión regular para buscar números dentro de paréntesis
            Pattern pattern = Pattern.compile("\\((\\d+)\\)");
            Matcher matcher = pattern.matcher(nombrePostulanteSeleccionado);

            if (matcher.find()) {
                numeros = matcher.group(1); // El primer grupo capturado contiene los números
            }
        }
        return numeros;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPantalla = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelPostulantes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPantallaPostulantes = new javax.swing.JList<>();
        labelTematicas1 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTematicas3 = new javax.swing.JLabel();
        labelTematicas4 = new javax.swing.JLabel();
        labelTematicas5 = new javax.swing.JLabel();
        labelTematicas6 = new javax.swing.JLabel();
        labelTematicas7 = new javax.swing.JLabel();
        labelTematicas8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPantallaExperiencias = new javax.swing.JList<>();
        labelTxtFormato = new javax.swing.JLabel();
        labelTxtNombre = new javax.swing.JLabel();
        labelTxtCedula = new javax.swing.JLabel();
        labelTxtDireccion = new javax.swing.JLabel();
        labelTxtTelefono = new javax.swing.JLabel();
        labelTxtMail = new javax.swing.JLabel();
        labelTxtLinkedin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaPantalla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPantalla);
        if (tablaPantalla.getColumnModel().getColumnCount() > 0) {
            tablaPantalla.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaPantalla.getColumnModel().getColumn(1).setMinWidth(233);
            tablaPantalla.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaPantalla.getColumnModel().getColumn(1).setMaxWidth(233);
            tablaPantalla.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaPantalla.getColumnModel().getColumn(3).setPreferredWidth(550);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 430, 910, 240);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setText("Historial postulante");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(370, 0, 230, 30);

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

        labelPostulantes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPostulantes.setText("Postulantes:");
        getContentPane().add(labelPostulantes);
        labelPostulantes.setBounds(30, 40, 80, 30);

        jScrollPane2.setViewportView(listaPantallaPostulantes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 300, 240);

        labelTematicas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTematicas1.setText("Experiencia:");
        getContentPane().add(labelTematicas1);
        labelTematicas1.setBounds(440, 260, 80, 20);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(440, 50, 80, 20);

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

        jScrollPane3.setViewportView(listaPantallaExperiencias);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 270, 230, 100);

        labelTxtFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtFormato);
        labelTxtFormato.setBounds(540, 230, 380, 20);

        labelTxtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtNombre);
        labelTxtNombre.setBounds(540, 50, 380, 20);

        labelTxtCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtCedula);
        labelTxtCedula.setBounds(540, 80, 380, 20);

        labelTxtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtDireccion);
        labelTxtDireccion.setBounds(540, 110, 380, 20);

        labelTxtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtTelefono);
        labelTxtTelefono.setBounds(540, 140, 380, 20);

        labelTxtMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtMail);
        labelTxtMail.setBounds(540, 170, 380, 20);

        labelTxtLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(labelTxtLinkedin);
        labelTxtLinkedin.setBounds(540, 200, 380, 20);

        setSize(new java.awt.Dimension(970, 769));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed


    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    // Obtener la palabra clave de txtBuscar
    String palabraClave = txtBuscar.getText().trim();

    // Comprobar si la palabra clave está vacía
    if (!palabraClave.isEmpty()) {
        DefaultTableModel modelo = (DefaultTableModel) tablaPantalla.getModel();
        int columnComentarios = 3; // Columna de comentarios en la tabla

        // Restablecer el renderizador de la tabla para usar HTML
        tablaPantalla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == columnComentarios) {
                    String comentario = value.toString();
                    String comentarioResaltado = comentario.replaceAll(palabraClave, "<font color='red'>" + palabraClave + "</font>");
                    setText("<html>" + comentarioResaltado + "</html>");
                }
                return c;
            }
        });

        // Refrescar la tabla para aplicar el formato HTML
        tablaPantalla.repaint();
    } else {
        // Si la palabra clave está vacía, restablecer el renderizador y la tabla
        tablaPantalla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer());
        tablaPantalla.repaint();
    }

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
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPostulantes;
    private javax.swing.JLabel labelTematicas1;
    private javax.swing.JLabel labelTematicas3;
    private javax.swing.JLabel labelTematicas4;
    private javax.swing.JLabel labelTematicas5;
    private javax.swing.JLabel labelTematicas6;
    private javax.swing.JLabel labelTematicas7;
    private javax.swing.JLabel labelTematicas8;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTxtCedula;
    private javax.swing.JLabel labelTxtDireccion;
    private javax.swing.JLabel labelTxtFormato;
    private javax.swing.JLabel labelTxtLinkedin;
    private javax.swing.JLabel labelTxtMail;
    private javax.swing.JLabel labelTxtNombre;
    private javax.swing.JLabel labelTxtTelefono;
    private javax.swing.JList<String> listaPantallaExperiencias;
    private javax.swing.JList<String> listaPantallaPostulantes;
    private javax.swing.JTable tablaPantalla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
