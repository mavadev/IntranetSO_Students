package com.intranet.views;

import com.intranet.utils.Format;
import com.intranet.app.AppContext;
import com.intranet.models.ContenidoCurso;
import com.intranet.models.Curso;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Curso_ContenidoCurso extends javax.swing.JPanel {
    DefaultTableModel modeloContenidos = new DefaultTableModel();
    
    public Curso_ContenidoCurso(String id_curso) {
        initComponents();
        configurarTabla();
        cargarDatosDelCurso(id_curso);
    }
    
    private void configurarTabla(){
        // Modelo de tabla para mostrar cursos
        modeloContenidos.addColumn("ID del Contenido");
        modeloContenidos.addColumn("Titulo");
        modeloContenidos.addColumn("Descripción");

        // Seteamos el modelo a la tabla:
        tablaContenidos.setModel(modeloContenidos);
    }
    
    private void cargarDatosDelCurso(String id_curso) {
        // Obtener los datos del curso
        Curso cursoContenido = AppContext.getCursoController().obtenerContenidoDelCurso(id_curso);
        
        // Asignar los datos del curso
        lblTituloCurso.setText(cursoContenido.getNombre());
        lblDescripcionCurso.setText(cursoContenido.getDescripcion());
        lblNombreProfesor.setText(cursoContenido.getDocente());
        lblGradoSeccionCurso.setText(
                Format.numGradoToStrGrado(cursoContenido.getNumGrado()) + 
                " '"+cursoContenido.getLetraSeccion()+"'");
        lblHorarioCurso.setText(cursoContenido.getHorario());
        lblAulaCurso.setText(cursoContenido.getAula());
        lblModalidadCurso.setText(cursoContenido.getModalidad());
        
        // Obtenemos los contenidos del curso
        ArrayList<ContenidoCurso> listaContenidos = 
            AppContext.getContenidoCursoController().obtenerContenidosPorCurso(id_curso);

        // Limpiar la tabla
        modeloContenidos.setRowCount(0);

        // Insertar cada curso como fila
        for (ContenidoCurso contenido : listaContenidos) {
            Object[] fila = {
                contenido.getIdContenido(),
                contenido.getTitulo(),
                contenido.getDescripcion()
            };
            modeloContenidos.addRow(fila);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescripcionCurso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGradoSeccionCurso = new javax.swing.JLabel();
        lblNombreProfesor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblHorarioCurso = new javax.swing.JLabel();
        lblAulaCurso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblModalidadCurso = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTituloCurso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcionCurso.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDescripcionCurso.setText("Introducción a los números naturales");
        add(lblDescripcionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Profesor del Curso:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        lblGradoSeccionCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGradoSeccionCurso.setText("3er Grado");
        add(lblGradoSeccionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        lblNombreProfesor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreProfesor.setText("Juan Carlos Lopez");
        add(lblNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_logo.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Horario del Curso:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        lblHorarioCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHorarioCurso.setText("Lun y Mie 8:00 - 9:30 AM");
        add(lblHorarioCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        lblAulaCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAulaCurso.setText(" Aula 3B ");
        add(lblAulaCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Aula del Curso:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Modalidad:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        lblModalidadCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModalidadCurso.setText("Presencial");
        add(lblModalidadCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Temario");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblTituloCurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTituloCurso.setText("Geografia del Peru");
        add(lblTituloCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        tablaContenidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaContenidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 630, 380));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Contenido Curso");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 31, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAulaCurso;
    private javax.swing.JLabel lblDescripcionCurso;
    private javax.swing.JLabel lblGradoSeccionCurso;
    private javax.swing.JLabel lblHorarioCurso;
    private javax.swing.JLabel lblModalidadCurso;
    private javax.swing.JLabel lblNombreProfesor;
    private javax.swing.JLabel lblTituloCurso;
    private javax.swing.JTable tablaContenidos;
    // End of variables declaration//GEN-END:variables
}
