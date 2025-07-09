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

public class Tarea extends javax.swing.JPanel {
    DefaultTableModel modeloCursos = new DefaultTableModel();

    public Tarea() {
        initComponents();
        obtenerDatosCurso();
    }
    
    private void obtenerDatosCurso(){
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
        jPanel3 = new javax.swing.JPanel();
        lblDescripcionTarea = new javax.swing.JLabel();
        lblTituloTarea = new javax.swing.JLabel();
        lblFechaEntrega = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNombreCurso = new javax.swing.JLabel();
        lblNombreDocente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblGradoEstudiante = new javax.swing.JLabel();
        lblNombreEstudiante = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarioEstudiante = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnEntregarTarea = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1054, 720));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TAREA DEL CURSO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcionTarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescripcionTarea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescripcionTarea.setText("Brazil is going head to head with Paraguay starting on 11 Jun 2025 at 00:45 UTC at Neo Química Arena stadium, São Paulo city, Brazil. The match is a part of the World Cup Qualification, CONMEBOL.Brazil is going head to head with Paraguay starting on 11 Jun 2025 at 00:45 UTC at Neo Química Arena stadium, São Paulo city, Brazil. The match is a part of the World Cup Qualification, CONMEBOL."); // NOI18N
        lblDescripcionTarea.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDescripcionTarea.setAutoscrolls(true);
        lblDescripcionTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDescripcionTarea.setDisplayedMnemonicIndex(3);
        lblDescripcionTarea.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblDescripcionTarea.setIconTextGap(0);
        lblDescripcionTarea.setInheritsPopupMenu(false);
        lblDescripcionTarea.setName(""); // NOI18N
        lblDescripcionTarea.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(lblDescripcionTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 120));

        lblTituloTarea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloTarea.setText("Poesia por el Dia del Padre");
        jPanel3.add(lblTituloTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 410, -1));

        lblFechaEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaEntrega.setText("24/11/2003");
        jPanel3.add(lblFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 80, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Instrucciones de la actividad");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Entrega");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 410, 20));

        lblNombreCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreCurso.setText("Comunicacion");
        jPanel3.add(lblNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 90, 20));

        lblNombreDocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreDocente.setText("Serruchin Requena");
        jPanel3.add(lblNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 140, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_default_avatar.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ENTREGA DEL CURSO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Entregable del Curso");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 410, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Mensaje de Entrega");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 410, 20));

        lblGradoEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGradoEstudiante.setText("3er Grado");
        jPanel4.add(lblGradoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 90, 20));

        lblNombreEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreEstudiante.setText("Gianmarco Chistama");
        jPanel4.add(lblNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 180, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_default_avatar.png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        txtComentarioEstudiante.setColumns(20);
        txtComentarioEstudiante.setRows(5);
        jScrollPane1.setViewportView(txtComentarioEstudiante);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 180));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("AÑADIR ARCHIVOS");
        jButton1.setEnabled(false);
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 380, 50));

        btnEntregarTarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntregarTarea.setText("ENTREGAR TAREA");
        jPanel4.add(btnEntregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 380, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntregarTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcionTarea;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblGradoEstudiante;
    private javax.swing.JLabel lblNombreCurso;
    private javax.swing.JLabel lblNombreDocente;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblTituloTarea;
    private javax.swing.JTextArea txtComentarioEstudiante;
    // End of variables declaration//GEN-END:variables
}
