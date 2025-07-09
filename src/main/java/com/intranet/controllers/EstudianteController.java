package com.intranet.controllers;
import com.intranet.db.DBConnection;
import com.intranet.models.Estudiante;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstudianteController {
    private final Connection conn;

    public EstudianteController(DBConnection db) {
        this.conn = db.getConexion();
    }
        
    public ArrayList<Estudiante> obtenerEstudiantesPorCursoID(String id_curso){
        // Consulta
        String query = "EXEC ObtenerEstudiantesPorCursoDictado @id_curso_dictado = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            // Obtenemos los cursos
            ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
            
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getString("id_estudiante"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("dni")
                );
                
                listaEstudiantes.add(estudiante);
            } 
            
            return listaEstudiantes;
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los estudiantes del curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los estudiantes del curso.");
        }
        return null;
    }
}
