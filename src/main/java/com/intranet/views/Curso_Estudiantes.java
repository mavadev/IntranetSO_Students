package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Estudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Curso_Estudiantes extends javax.swing.JPanel {
    DefaultTableModel modeloEstudiantes = new DefaultTableModel();

    public Curso_Estudiantes(String id_curso) {
        initComponents();
        configurarTabla();
        obtenerDatosEstudiantes(id_curso);
    }
    
    private void configurarTabla(){
        // Tabla de Estudiantes
        modeloEstudiantes.addColumn("ID de Estudiante");
        modeloEstudiantes.addColumn("Nombres");
        modeloEstudiantes.addColumn("Apellidos");
        modeloEstudiantes.addColumn("DNI");

        tablaEstudiantes.setModel(modeloEstudiantes);
    }
    
    private void obtenerDatosEstudiantes(String id_curso){
        // Obtener estudiantes
        ArrayList<Estudiante> listaEstudiantes = 
            AppContext.getEstudianteController().obtenerEstudiantesPorCursoID(id_curso);

        // Limpiar la tabla
        modeloEstudiantes.setRowCount(0);

        // Insertar cada estudiante a la tabla
        for (Estudiante estudiante : listaEstudiantes) {
            Object[] fila = {
                estudiante.getIdEstudiante(),
                estudiante.getNombres(),
                estudiante.getApellidos(),
                estudiante.getDni()
            };
            modeloEstudiantes.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Estudiantes del Curso");

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEstudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
