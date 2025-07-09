package com.intranet.models;

public class Usuario {
    private String idUsuario;
    private String email;
    private String password;
    private String rol;
    private String estado;

    public Usuario() {
    }

    // AÑADIR CORREO Y ROL A USUARIOS
    public Usuario(String correo, String rol) {
        this.email = correo;
        this.rol = rol;
    }
    
    // GETTERS Y SETTERS
    public String getIdUsuario() {
        return idUsuario;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getRol() {
        return rol;
    }
    public String isEstado() {
        return estado;
    }
}
