package com.intranet.models;

import com.intranet.utils.Format;
import java.time.LocalDate;

public class Docente extends Usuario{
    private String idDocente;
    
    private String nombres;
    private String apellidos;
    private LocalDate fecha;
    private String dni;
    private String celular;
    private String direccion;
    private String especialidad;

    // MOSTRAR DOCENTE COMPLETO
    public Docente(
        String email,
        String idDocente,
        String nombre, 
        String apellido, 
        String dni, 
        String celular, 
        String direccion, 
        String especialidad
    ) {
        super(email, "docente");
        this.idDocente = idDocente;
        this.nombres = nombre;
        this.apellidos = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
    }
    
    // DOCENTE SIMPLE
    public Docente(
        String idDocente,
        String nombre, 
        String apellido, 
        String especialidad
    ) {
        this.idDocente = idDocente;
         this.nombres = nombre;
        this.apellidos = apellido;
        this.especialidad = especialidad;
    }
    

    // Getters
    public String getIdDocente() {
        return idDocente;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getDni() {
        return dni;
    }
    public String getCelular() {
        return celular;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    
    public String obtenerDatos(){
        return 
            "Datos de Docente: "
            + "\nID: " + idDocente
            + "\nNombres: " + nombres
            + "\nApellidos: " + apellidos
            + "\nDNI: " + dni
            + "\nCelular: " + celular
            + "\nDireccion: " + direccion
            + "\nEspecialidad: " + especialidad;
    }
}
