package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LayoutCurso extends javax.swing.JPanel {
    private String id_curso;
    
    public LayoutCurso(String id_curso) {
        initComponents();
        id_curso = id_curso;
        
        Curso_ContenidoCurso panelContenido = new Curso_ContenidoCurso(id_curso);
        ShowPanel(panelContenido);
    }
    
    public void ShowPanel(JPanel panel) {
        panel.setSize(1054, 720);
        panel.setLocation(0,0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoContenido = new javax.swing.JButton();
        btnGoEntregas = new javax.swing.JButton();
        btnGoEstudiantes = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        btnGoTareas = new javax.swing.JButton();

        btnGoContenido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoContenido.setText("Contenido");
        btnGoContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoContenidoActionPerformed(evt);
            }
        });

        btnGoEntregas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoEntregas.setText("Entregas");
        btnGoEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoEntregasActionPerformed(evt);
            }
        });

        btnGoEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoEstudiantes.setText("Estudiantes");
        btnGoEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        btnGoTareas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoTareas.setText("Tareas");
        btnGoTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGoEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoContenidoActionPerformed
        Curso_ContenidoCurso panelContenido = new Curso_ContenidoCurso(id_curso);
        ShowPanel(panelContenido);
    }//GEN-LAST:event_btnGoContenidoActionPerformed

    private void btnGoEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoEntregasActionPerformed
        Curso_Entregas panelEntregas = new Curso_Entregas(id_curso);
        ShowPanel(panelEntregas);
    }//GEN-LAST:event_btnGoEntregasActionPerformed

    private void btnGoEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoEstudiantesActionPerformed
        Curso_Estudiantes panelEstudiantes = new Curso_Estudiantes(id_curso);
        ShowPanel(panelEstudiantes);
    }//GEN-LAST:event_btnGoEstudiantesActionPerformed

    private void btnGoTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoTareasActionPerformed
        Curso_Tareas panelTareas = new Curso_Tareas(id_curso);
        ShowPanel(panelTareas);
    }//GEN-LAST:event_btnGoTareasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoContenido;
    private javax.swing.JButton btnGoEntregas;
    private javax.swing.JButton btnGoEstudiantes;
    private javax.swing.JButton btnGoTareas;
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}
