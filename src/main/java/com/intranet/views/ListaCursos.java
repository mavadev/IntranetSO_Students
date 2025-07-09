package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.models.Docente;
import com.intranet.models.Estudiante;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ListaCursos extends javax.swing.JPanel {
    private JPanel contentPanel;
    DefaultTableModel modeloCursos = new DefaultTableModel();

    public ListaCursos(JPanel contentPanel) {
        initComponents();
        this.contentPanel = contentPanel;
        
        configurarTabla();
        obtenerCursos();
    }
    
    private void configurarTabla(){
        // TABLA DE CURSOS
        modeloCursos.addColumn("ID de Curso");
        modeloCursos.addColumn("Nombre del Curso");
        modeloCursos.addColumn("Descripción");
        modeloCursos.addColumn("Aula");
        modeloCursos.addColumn("Horario");
        modeloCursos.addColumn("Modalidad");

        tablaCursos.setModel(modeloCursos);
    }
    
    private void obtenerCursos(){
        // Obtener usuario actual
        Usuario usuario = AppContext.getInstance().getUsuarioActual();
        ArrayList<Curso> listaCursos = null;
        
        // Obtener cursos segun el rol
        if (usuario instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) usuario;
            listaCursos = 
                AppContext.getCursoController().obtenerCursosPorEstudianteID(estudiante.getIdEstudiante());
        } else if (usuario instanceof Docente) {
            Docente docente = (Docente) usuario;
            listaCursos = 
                AppContext.getCursoController().obtenerCursosPorDocenteID(docente.getIdDocente());
        }

        // Limpiar la tabla
        modeloCursos.setRowCount(0);

        // Insertar cada curso como fila
        for (Curso curso : listaCursos) {
            Object[] fila = {
                curso.getIdCursoDictado(),
                curso.getNombre(),
                curso.getDescripcion(),
                curso.getAula(),
                curso.getHorario(),
                curso.getModalidad()
            };
            modeloCursos.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnIrACurso = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1054, 720));

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaCursos);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Mis Cursos");

        btnIrACurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIrACurso.setText("IR A CURSO");
        btnIrACurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrACursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(699, 699, 699)
                        .addComponent(btnIrACurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnIrACurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void btnIrACursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrACursoActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaCursos.getSelectedRow();

        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_curso = tablaCursos.getValueAt(fila, 0).toString();

        // Mostrar el layout de curso pasando el curso ID
        LayoutCurso layoutCurso = new LayoutCurso(id_curso); 
        contentPanel.removeAll();
        contentPanel.add(layoutCurso);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnIrACursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrACurso;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCursos;
    // End of variables declaration//GEN-END:variables
}
