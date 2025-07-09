package com.intranet.controllers;
import com.intranet.db.DBConnection;


import java.sql.Connection;

public class EstudianteController {
    private final Connection conn;

    public EstudianteController(DBConnection db) {
        this.conn = db.getConexion();
    }
        
    
}
