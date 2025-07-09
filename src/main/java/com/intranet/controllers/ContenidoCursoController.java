package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.ContenidoCurso;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContenidoCursoController {
    
     private final Connection conn;

    public ContenidoCursoController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public ArrayList<ContenidoCurso> obtenerContenidosPorCurso(String id_curso){
        // Consulta
        String query = 
            "EXEC ObtenerContenidoPorCursoDictado @id_curso_dictado = ?;";
        
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            ArrayList<ContenidoCurso> listaContenidos = new ArrayList<ContenidoCurso>();
            
            while (rs.next()) {
                ContenidoCurso contenido = new ContenidoCurso(
                    rs.getString("id_contenido"),
                    rs.getString("titulo"),
                    rs.getString("descripcion"),
                    rs.getString("semana")
                );
                
                listaContenidos.add(contenido);
            } 
                
            return listaContenidos;
        } catch (SQLException e) {
            System.out.println("Error al obtener los docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los docente");
        }
        return null;
    }

}