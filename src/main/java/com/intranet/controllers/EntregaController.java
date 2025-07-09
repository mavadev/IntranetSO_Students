package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Entrega;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EntregaController {
    
    private final Connection conn;

    public EntregaController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public ArrayList<Entrega> obtenerCalificacionesPorEstudianteID(String id_estudiante){
        // Consulta
        String query = "EXEC ObtenerCalificacionesEstudiante @id_estudiante = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            // Obtener las calificaciones
            ArrayList<Entrega> listaCalificaciones = new ArrayList<Entrega>();
            
            while (rs.next()) {
                Entrega entrega = new Entrega(
                    rs.getString("id_tarea_asignada"),
                    rs.getString("titulo"),
                    rs.getString("nombre_curso"),
                    rs.getTimestamp("fecha_entrega").toLocalDateTime(),
                    rs.getFloat("calificacion")
                );
                
                listaCalificaciones.add(entrega);
            } 
                
            return listaCalificaciones;
        } catch (SQLException e) {
            System.out.println("Error al obtener las entregas: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener las entregas");
        }
        return null;
    }
    
    public ArrayList<Entrega> obtenerEntregasEstudiantesPorCursoID(String id_curso){
        // Consulta
        String query = "EXEC ObtenerEntregasPorCurso @id_curso_dictado = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            // Obtener las calificaciones
            ArrayList<Entrega> listaEntregas = new ArrayList<Entrega>();
            
            while (rs.next()) {
                Entrega entrega = new Entrega(
                    rs.getString("titulo_tarea"),
                    rs.getString("estudiante"),
                    rs.getTimestamp("fecha_entrega").toLocalDateTime(),
                    rs.getString("estado_entrega") == "entregado",
                    rs.getFloat("calificacion")
                );
                
                listaEntregas.add(entrega);
            } 
                
            return listaEntregas;
        } catch (SQLException e) {
            System.out.println("Error al obtener las entregas: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener las entregas");
        }
        return null;
    }
}