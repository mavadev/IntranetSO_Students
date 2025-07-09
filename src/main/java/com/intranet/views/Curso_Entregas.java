package com.intranet.views;
import com.intranet.app.AppContext;
import com.intranet.models.Entrega;
import com.intranet.utils.AlertUtils;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Curso_Entregas extends javax.swing.JPanel {
    DefaultTableModel modeloEntregas = new DefaultTableModel();
    private JPanel contentPanel;
    
    public Curso_Entregas(String id_curso, JPanel contentPanel) {
        initComponents();
        configurarTabla();
        contentPanel = contentPanel;
        
        obtenerEntregas(id_curso);
    }
  
    private void configurarTabla(){
        // Tabla de Entregas
        modeloEntregas.addColumn("ID de Entrega");
        modeloEntregas.addColumn("Titulo");
        modeloEntregas.addColumn("Nombre de Curso");
        modeloEntregas.addColumn("Fecha de Entrega");
        modeloEntregas.addColumn("Calificacion");

        tablaEntregas.setModel(modeloEntregas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntregas = new javax.swing.JTable();
        btnIrAEntrega = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Entregas del Curso");

        tablaEntregas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEntregas);

        btnIrAEntrega.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIrAEntrega.setText("IR A ENTREGA");
        btnIrAEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrAEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIrAEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnIrAEntrega))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrAEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrAEntregaActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaEntregas.getSelectedRow();

        //
        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_entrega = tablaEntregas.getValueAt(fila, 0).toString();

        // Mostrar el layout de curso pasando el curso ID
        EntregaVista panelEntrega = new EntregaVista(id_entrega);
        contentPanel.removeAll();
        contentPanel.add(panelEntrega);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnIrAEntregaActionPerformed

    private void obtenerEntregas(String id_curso){
        // Obtener entregas
        ArrayList<Entrega> listaEntregas = 
            AppContext.getEntregaController().obtenerEntregasEstudiantesPorCursoID(id_curso);

        // Limpiar la tabla
        modeloEntregas.setRowCount(0);

        // Insertar cada entrega a la tabla
        for (Entrega entrega : listaEntregas) {
            Object[] fila = {
                entrega.getIdAsignacion(),
                entrega.getTituloTarea(),
                entrega.getNombreCurso(),
                entrega.getFechaEntrega(),
                entrega.getCalificacion()
            };
            modeloEntregas.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrAEntrega;
    private javax.swing.JButton btnIrAPendiente;
    private javax.swing.JButton btnIrAPendiente1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEntregas;
    // End of variables declaration//GEN-END:variables
}
