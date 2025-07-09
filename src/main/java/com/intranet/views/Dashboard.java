package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.models.Docente;
import com.intranet.models.Estudiante;
import com.intranet.models.Usuario;
import com.intranet.utils.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JPanel {
    DefaultTableModel modeloCursos = new DefaultTableModel();
    DefaultTableModel modeloDocentes = new DefaultTableModel();

    public Dashboard() {
        initComponents();
        setearDiaActual();
        configurarTablas();
        obtenerDatosEnTablas();
    }
    
    private void setearDiaActual(){
        LocalDate hoy = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM", new Locale("es", "ES"));
        String fechaFormateada = hoy.format(formatter);

        // Capitalizar la primera letra del día
        fechaFormateada = fechaFormateada.substring(0, 1).toUpperCase() + fechaFormateada.substring(1);

        lblDiaActual.setText(fechaFormateada);
    }
    
    private void configurarTablas(){
        // TABLA DE CURSOS
        modeloCursos.addColumn("ID de Curso");
        modeloCursos.addColumn("Nombre del Curso");
        modeloCursos.addColumn("Descripción");
        modeloCursos.addColumn("Aula");
        modeloCursos.addColumn("Horario");
        modeloCursos.addColumn("Modalidad");

        tablaCursos.setModel(modeloCursos);
        
        // TABLA DE PROFESORES PARA ESTUDIANTES
        modeloDocentes.addColumn("ID de Docente");
        modeloDocentes.addColumn("Nombres");
        modeloDocentes.addColumn("Apellidos");
        modeloDocentes.addColumn("Especialidad");

        tablaProfesores.setModel(modeloDocentes);
    }
    
    private void obtenerDatosEnTablas(){
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
        
        // Ocultar tabla y label si es docente
        if(usuario instanceof Docente){
            lblTablaProfesores.setVisible(false);
            tablaProfesores.setVisible(false);
            return;
        }
        
        Estudiante estudiante = (Estudiante) usuario;
        
        // Obtener profesores del estudiante
        ArrayList<Docente> listaDocentes = 
            AppContext.getDocenteController().obtenerDocentesDeEstudianteID(estudiante.getIdEstudiante());

        // Mostrar profesores en la tabla
        for (Docente docente : listaDocentes) {
            Object[] fila = {
                docente.getIdDocente(),
                docente.getNombres(),
                docente.getApellidos(),
                docente.getEspecialidad()
            };
            modeloDocentes.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblDiaActual = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblTablaProfesores = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1054, 720));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Docente");

        lblDiaActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiaActual.setText("Martes 14 de Julio");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setText("Hola, Juan Carlos");

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProfesores);

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

        lblTablaProfesores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTablaProfesores.setText("Mis Profesores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTablaProfesores))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(lblDiaActual)
                    .addContainerGap(817, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTablaProfesores)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblDiaActual)
                    .addContainerGap(697, Short.MAX_VALUE)))
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaActual;
    private javax.swing.JLabel lblTablaProfesores;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTable tablaProfesores;
    // End of variables declaration//GEN-END:variables
}
