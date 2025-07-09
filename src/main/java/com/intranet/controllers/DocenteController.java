package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Docente;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DocenteController {
    
     private final Connection conn;

    public DocenteController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public ArrayList<Docente> obtenerDocentesDeEstudianteID(String id_estudiante){
        // Consulta
        String query = 
            "EXEC sp_ObtenerDocentesDeEstudiante @id_estudiante = ?;";
        
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            ArrayList<Docente> listaDocentes = new ArrayList<Docente>();
            
            while (rs.next()) {
                Docente docente = new Docente(
                    rs.getString("id_docente"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("especialidad")
                );
                
                listaDocentes.add(docente);
            } 
                
            return listaDocentes;
        } catch (SQLException e) {
            System.out.println("Error al obtener los docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los docente");
        }
        return null;
    }

}