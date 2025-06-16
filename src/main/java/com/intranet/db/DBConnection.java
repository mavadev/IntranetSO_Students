package com.intranet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    
    private final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=INTRANET_SO;encrypt=false";
    private final String USER = "sa";
    private final String PASSWORD = "database";

    public DBConnection() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch(SQLException exception){
            System.out.println("Error al conectar: " + exception.getMessage());
        }
    }
    
    // Obtener instancia unica de la clase
    public static DBConnection getInstancia() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    // Obtener la conexión activa
    public Connection getConexion() {
        return connection;
    }
    
    public void cerrarConexionDB() throws SQLException{
        try {
            if (connection != null) connection.close();
        } catch (SQLException exception) {
            System.out.println("Error al cerrar la conexion: " + exception.getMessage());
        }
    }
}
