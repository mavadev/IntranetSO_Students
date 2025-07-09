package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.TareaAsignada;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TareaAsignadaController {
    
     private final Connection conn;

    public TareaAsignadaController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public ArrayList<TareaAsignada> obtenerPendientesEstudiantePorID(String id_estudiante){
        // Consulta
        String query = 
            "EXEC ObtenerTareasPendientesEstudiante @id_estudiante = ?;";
        
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            ArrayList<TareaAsignada> listaPendientes = new ArrayList<TareaAsignada>();
            
            while (rs.next()) {
                TareaAsignada pendiente = new TareaAsignada(
                    rs.getString("id_tarea_asignada"),
                    rs.getString("titulo"),
                    rs.getString("nombre_curso"),
                    rs.getTimestamp("fecha_entrega").toLocalDateTime()
                );
                
                listaPendientes.add(pendiente);
            } 
                
            return listaPendientes;
        } catch (SQLException e) {
            System.out.println("Error al obtener los pendientes: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los pendientes");
        }
        return null;
    }

    public ArrayList<TareaAsignada> obtenerTareasPorEstudianteID(String id_estudiante, String id_curso){
        // Consulta
        String query = 
            "EXEC ObtenerTareasAsignadasPorEstudianteCurso "
            + "@id_estudiante = ?, "
            + "@id_curso_dictado = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_estudiante);
            sttm.setString(2, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            ArrayList<TareaAsignada> listaTareas = new ArrayList<TareaAsignada>();
            
            while (rs.next()) {
                TareaAsignada tarea = new TareaAsignada(
                    rs.getString("id_tarea"),
                    rs.getString("titulo"),
                    rs.getString("descripcion"),
                    rs.getString("estado_entrega") == "entregado",
                    rs.getTimestamp("fecha_asignacion").toLocalDateTime(),
                    rs.getFloat("calificacion")
                );
                
                listaTareas.add(tarea);
            } 
                
            return listaTareas;
        } catch (SQLException e) {
            System.out.println("Error al obtener los pendientes: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los pendientes");
        }
        return null;
    }
    
    public TareaAsignada obtenerTareaPorID(String id_tarea){
        // Consulta
        String query = "EXEC ObtenerDatosTareaPorId @id_tarea = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_tarea);
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                TareaAsignada tarea = new TareaAsignada(
                    rs.getString("titulo"),
                    rs.getString("descripcion"),
                    rs.getTimestamp("fecha_entrega").toLocalDateTime(),
                    rs.getString("nombre_curso"),
                    rs.getString("nombre_docente") + " " + rs.getString("apellido_docente")
                );
                
                return tarea;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener la tarea: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener la tarea");
        }
        return null;
    }
}