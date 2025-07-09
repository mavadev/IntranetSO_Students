package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Usuario;
import com.intranet.models.Estudiante;
import com.intranet.models.Docente;

import com.intranet.utils.AlertUtils;
import com.intranet.utils.PasswordUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioController {
    private final Connection conn;

    public UsuarioController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public Usuario login(String correo, String contraseña, String rol) {
        // OBTENER USUARIO POR CORREO
        String queryUsuario = 
            "SELECT id_usuario, password FROM Usuario WHERE email = ? AND rol = ?;";
        
        // OBTENER DATOS DE DOCENTE 
        String queryDocente = 
            "SELECT id_docente, nombres, apellidos, dni, celular, direccion, especialidad "
            + "FROM Docente WHERE id_usuario = ?;";
        
        // OBTENER DATOS DE ESTUDIANTE 
        String queryEstudiante = 
            "SELECT e.id_estudiante, e.nombres, e.apellidos, e.dni, e.direccion, g.numero_grado AS num_grado "
            + "FROM Estudiante e "
            + "JOIN Grado_Seccion gs ON gs.id_grado_seccion = e.id_grado_seccion "
            + "JOIN Grado g ON g.id_grado = gs.id_grado "
            + "WHERE id_usuario = ?;";

        try (PreparedStatement sttm = conn.prepareStatement(queryUsuario)) {
            sttm.setString(1, correo);
            sttm.setString(2, rol);

            ResultSet rs = sttm.executeQuery();
            
            if (!rs.next()) {
                AlertUtils.showWarning("Correo no registrado a un usuario");
                return null;
            } 
            
            // Obtener datos de un usuario
            String hashedPasswordDB = rs.getString("password");
            String id_usuario = rs.getString("id_usuario");

            // No coincide las contraseñas
            if (!PasswordUtils.checkPassword(contraseña, hashedPasswordDB)) {
                AlertUtils.showWarning("Contraseña incorrecta");
                return null;
            }
            
            // Query para consulta
            String queryFind = rol == "docente" ? queryDocente : queryEstudiante;
            
            try (PreparedStatement sttmAdmin  = conn.prepareStatement(queryFind)) {
                sttm.setString(1, id_usuario);
                ResultSet rsAdmin = sttmAdmin.executeQuery();

                if (rsAdmin.next()) {
                    if (rol.equals("estudiante")) {
                        return new Estudiante(
                            correo,
                            rs.getString("id_estudiante"),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getString("dni"),
                            rs.getString("direccion"),
                            rs.getInt("num_grado")
                        );
                    } else if (rol.equals("docente")) {
                        return new Docente(
                            correo,
                            rs.getString("id_docente"),
                            rs.getString("nombres"),
                            rs.getString("apellidos"),
                            rs.getString("dni"),
                            rs.getString("celular"),
                            rs.getString("direccion"),
                            rs.getString("especialidad")
                        );
                    }
                } else {
                    AlertUtils.showWarning("No se encontró el usuario");
                }
            } 
                
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al iniciar sesión");
        }
        
        return null;
    }
}