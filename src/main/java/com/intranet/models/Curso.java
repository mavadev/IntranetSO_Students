package com.intranet.models;

public class Curso {
    private String idCursoBase;
    private String nombre;
    private String descripcion;
    private String idGrado;

    private String idCursoDictado;
    private String idDocente;
    private String idSeccion;
    private String idGradoSeccion;

    private String aula;
    private String horario;
    private String modalidad;
    private String color_hex;

    private int numGrado;
    private String letraSeccion;
    
    private String docente;
    
    // MOSTRAR CURSO - LISTA CURSO DICTADO
    public Curso(
        String idCursoDictado,
        String nombre,
        String descripcion,
        String aula, 
        String horario, 
        String modalidad
    ) {
        this.idCursoDictado = idCursoDictado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.aula = aula;
        this.horario = horario;
        this.modalidad = modalidad;
    }   
    
    // CONTENIDO DEL CURSO
    public Curso(
        String nombre,
        String descripcion,
        String horario, 
        String aula, 
        String modalidad,
        String docente,
        int numGrado,
        String letraSeccion
    ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.aula = aula;
        this.modalidad = modalidad;
        this.docente = docente;
        this.numGrado = numGrado;
        this.letraSeccion = letraSeccion;
    }   

    // Getters
    public String getIdCursoBase() {
        return idCursoBase;
    }
    public String getIdCursoDictado() {
        return idCursoDictado;
    }
    public String getIdDocente() {
        return idDocente;
    }
    public String getIdGrado() {
        return idGrado;
    }
    public String getIdSeccion() {
        return idSeccion;
    }
    public String getIdGradoSeccion() {
        return idGradoSeccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getAula() {
        return aula;
    }
    public String getHorario() {
        return horario;
    }
    public String getModalidad() {
        return modalidad;
    }
    public String getColor_hex() {
        return color_hex;
    }
    public int getNumGrado() {
        return numGrado;
    }
    public String getLetraSeccion() {
        return letraSeccion;
    }
    public String getDocente() {
        return docente;
    }
}
