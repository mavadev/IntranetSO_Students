package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.TareaAsignada;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.Date;
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

}