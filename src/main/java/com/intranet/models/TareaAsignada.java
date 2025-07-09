package com.intranet.models;
import java.time.LocalDateTime;

public class TareaAsignada {
    private String idAsignacion;
    private String tituloTarea;
    private String nombreCurso;
    private String descripcion;
    private boolean entregado;
    private String docente;

    private float calificacion;
    
    private LocalDateTime fechaAsignacion;
    private LocalDateTime fechaEntrega;

    public TareaAsignada(
        String idAsignacion,
        String titulo,
        String nombreCurso,
        LocalDateTime fechaEntrega
    ) {
        this.idAsignacion = idAsignacion;
        this.tituloTarea = titulo;
        this.nombreCurso = nombreCurso;
        this.fechaEntrega = fechaEntrega;
    }

    public TareaAsignada(
        String idAsignacion,
        String titulo,
        String descripcion,
        boolean entregado,
        LocalDateTime fechaAsignacion,
        float calificacion
    ) {
        this.idAsignacion = idAsignacion;
        this.tituloTarea = titulo;
        this.descripcion = descripcion;
        this.entregado = entregado;
        this.fechaAsignacion = fechaAsignacion;
        this.calificacion = calificacion;
    }
  
    public TareaAsignada(
        String titulo,
        String descripcion,
        LocalDateTime fechaEntrega,
        String nombreCurso,
        String docente
    ) {
        this.tituloTarea = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.nombreCurso = nombreCurso;
        this.docente = docente;
    }
    
    public String getIdAsignacion() {
        return idAsignacion;
    }
    public String getTituloTarea() {
        return tituloTarea;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstadoEntregado() {
        return entregado ? "Entregado" : "Pendiente";
    }
    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public float getCalificacion(){
        return calificacion;
    }
    public String getDocente() {
        return docente;
    }
}
