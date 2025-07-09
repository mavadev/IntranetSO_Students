package com.intranet.models;
import java.time.LocalDate;

public class Estudiante extends Usuario {    
    private String idEstudiante;
    private String idUsuario;
    private String idApoderado;
    private String idGradoSeccion;

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;
    private String direccion;

    private int numeroGrado;
    private String letraSeccion;

    // MOSTRAR ESTUDIANTE COMPLETO
    public Estudiante(
        String correo,
        String idEstudiante,
        String nombres, 
        String apellidos, 
        String dni, 
        String direccion,
        int numGrado
    ) {
        super(correo, "estudiante");
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroGrado = numGrado;
    }
    
    // Getters
    public String getIdEstudiante() {
        return idEstudiante;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public String getIdApoderado() {
        return idApoderado;
    }
    public String getIdGradoSeccion() {
        return idGradoSeccion;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getNumeroGrado() {
        return numeroGrado;
    }
    public String getLetraSeccion() {
        return letraSeccion;
    }
}
