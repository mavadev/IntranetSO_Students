package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Curso;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoController {
    private final Connection conn;

    public CursoController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public ArrayList<Curso> obtenerCursosPorEstudianteID(String id_estudiante){
        // Consulta
        String query = "EXEC sp_ObtenerCursosEstudianteSimple @id_estudiante = ?;";
        
        // Obtenemos los cursos
        ArrayList<Curso> listaCursos = new ArrayList<Curso>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Curso curso = new Curso(
                    rs.getString("id_curso_dictado"),
                    rs.getString("nombre_curso"),
                    rs.getString("descripcion"),
                    rs.getString("aula"),
                    rs.getString("horario"),
                    rs.getString("modalidad")
                );
                
                listaCursos.add(curso);
            } 
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los cursos del estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los cursos del estudiante.");
            return null;
        }
        return listaCursos;
    }
    
    public ArrayList<Curso> obtenerCursosPorDocenteID(String id_docente){
        // Consulta
        String query = "EXEC sp_ObtenerCursosDocenteSimple @id_docente = ?;";
        
        // Obtenemos los cursos
        ArrayList<Curso> listaCursos = new ArrayList<Curso>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_docente);
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Curso curso = new Curso(
                    rs.getString("id_curso_dictado"),
                    rs.getString("nombre_curso"),
                    rs.getString("descripcion"),
                    rs.getString("aula"),
                    rs.getString("horario"),
                    rs.getString("modalidad")
                );
                
                listaCursos.add(curso);
            } 
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los cursos del profesor: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los cursos del profesor");
            return null;
        }
        return listaCursos;
    }
    
    public Curso obtenerContenidoDelCurso(String id_curso){
        // Consulta
        String query = "EXEC ObtenerDetalleCurso @id_curso_dictado = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Curso curso = new Curso(
                    rs.getString("nombre_curso"),
                    rs.getString("descripcion_curso"),
                    rs.getString("horario"),
                    rs.getString("aula"),
                    rs.getString("modalidad"),
                    rs.getString("nombres_docente") + " " + rs.getString("apellidos_docente"),
                    rs.getInt("numero_grado"),
                    rs.getString("seccion")
                );
                
                return curso;
            } 
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los cursos del profesor: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los cursos del profesor");
        }
        return null;
    }
}