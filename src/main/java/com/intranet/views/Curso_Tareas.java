package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Estudiante;
import com.intranet.models.TareaAsignada;
import com.intranet.utils.AlertUtils;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Curso_Tareas extends javax.swing.JPanel {
    private JPanel contentPanel;
    DefaultTableModel modeloTareas = new DefaultTableModel();

    public Curso_Tareas(String id_curso, JPanel contentPanel) {
        initComponents();
        configurarTabla();
        contentPanel = contentPanel;
        
        obtenerTareas(id_curso);
    }
      
    private void configurarTabla(){
        // Tabla de Entregas
        modeloTareas.addColumn("ID de Tarea");
        modeloTareas.addColumn("Titulo");
        modeloTareas.addColumn("Descripcion");
        modeloTareas.addColumn("Estado");
        modeloTareas.addColumn("Fecha de Asignacion");
        modeloTareas.addColumn("Calificacion");

        tablaTareas.setModel(modeloTareas);
    }
    
    private void obtenerTareas(String id_curso){
        // Obtener usuario actual
        Estudiante estudiante = (Estudiante) AppContext.getInstance().getUsuarioActual();

        // Obtener entregas
        ArrayList<TareaAsignada> listaTareas = 
            AppContext.getTareaAsignadaController().obtenerTareasPorEstudianteID(estudiante.getIdEstudiante(), id_curso);

        // Limpiar la tabla
        modeloTareas.setRowCount(0);

        // Insertar cada entrega a la tabla
        for (TareaAsignada tarea : listaTareas) {
            Object[] fila = {
                tarea.getIdAsignacion(),
                tarea.getTituloTarea(),
                tarea.getDescripcion(),
                tarea.getEstadoEntregado(),
                tarea.getFechaAsignacion(),
                tarea.getCalificacion()
            };
            modeloTareas.addRow(fila);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        btnIrATarea = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Tareas del Curso");

        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaTareas);

        btnIrATarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIrATarea.setText("IR A TAREA");
        btnIrATarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrATareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(559, 559, 559)
                        .addComponent(btnIrATarea, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnIrATarea))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrATareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrATareaActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaTareas.getSelectedRow();

        //
        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_tarea = tablaTareas.getValueAt(fila, 0).toString();

        // Mostrar el layout de curso pasando el curso ID
        TareaVista panelTarea = new TareaVista(id_tarea, contentPanel);
        contentPanel.removeAll();
        contentPanel.add(panelTarea);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnIrATareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrATarea;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTareas;
    // End of variables declaration//GEN-END:variables
}
