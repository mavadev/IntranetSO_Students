package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Docente;
import com.intranet.models.Estudiante;
import com.intranet.models.Entrega;

import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ListaCalificaciones extends javax.swing.JPanel {
    private JPanel contentPanel;
    DefaultTableModel modeloCalificaciones = new DefaultTableModel();

    public ListaCalificaciones(JPanel contentPanel) {
        initComponents();
        this.contentPanel = contentPanel;

        boolean esDocente = restringirDocentes();
        if(esDocente){
            AlertUtils.showWarning("Acceso solo para estudiantes.");
            Dashboard layoutDashboard = new Dashboard(); 
            contentPanel.removeAll();
            contentPanel.add(layoutDashboard);
            contentPanel.revalidate();
            contentPanel.repaint();
            return;
        }
        
        configurarTabla();
        obtenerCalifaciones();
    }
    
    private boolean restringirDocentes(){
        // Obtener usuario actual
        Usuario usuario = AppContext.getInstance().getUsuarioActual();
        return usuario instanceof Docente;
    }
    
    private void configurarTabla(){
        // Tabla de Califaciones
        modeloCalificaciones.addColumn("ID de Calificacion");
        modeloCalificaciones.addColumn("Titulo de Tarea");
        modeloCalificaciones.addColumn("Curso");
        modeloCalificaciones.addColumn("Fecha de Asignacion");
        modeloCalificaciones.addColumn("Califacion");

        tablaCalificaciones.setModel(modeloCalificaciones);
    }
    
    private void obtenerCalifaciones(){
        // Obtener usuario actual
        Estudiante estudiante = (Estudiante) AppContext.getInstance().getUsuarioActual();

        // Obtener califaciones del estudiante
        ArrayList<Entrega> listaEntregas = 
            AppContext.getEntregaController().obtenerCalificacionesPorEstudianteID(estudiante.getIdEstudiante());

        // Limpiar la tabla
        modeloCalificaciones.setRowCount(0);

        // Insertar cada califacion a la tabla
        for (Entrega entrega : listaEntregas) {
            Object[] fila = {
                entrega.getIdAsignacion(),
                entrega.getTituloTarea(),
                entrega.getNombreCurso(),
                entrega.getFechaEntrega(),
                entrega.getCalificacion()
            };
            modeloCalificaciones.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnIrAEntrega = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1054, 720));

        tablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaCalificaciones);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Mis Calificaciones");

        btnIrAEntrega.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIrAEntrega.setText("IR A ENTREGA");
        btnIrAEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIrAEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnIrAEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrAEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAEntregaActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaCalificaciones.getSelectedRow();

        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_pendiente = tablaCalificaciones.getValueAt(fila, 0).toString();

        // Mostrar el layout de curso pasando el curso ID
        EntregaVista panelEntrega = new EntregaVista(id_pendiente); 
        contentPanel.removeAll();
        contentPanel.add(panelEntrega);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnIrAEntregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrAEntrega;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCalificaciones;
    // End of variables declaration//GEN-END:variables
}
