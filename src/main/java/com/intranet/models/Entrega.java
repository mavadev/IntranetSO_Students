package com.intranet.models;
import java.time.LocalDateTime;

public class Entrega {
    private String idAsignacion;
    private String tituloTarea;
    private String nombreCurso;
    private boolean entregado;
    private LocalDateTime fechaEntrega;
    private float calificacion;
    
    private String estudiante;

    public Entrega(
        String idAsignacion,
        String titulo,
        String nombreCurso,
        LocalDateTime fechaEntrega,
        float calificacion
    ) {
        this.idAsignacion = idAsignacion;
        this.tituloTarea = titulo;
        this.nombreCurso = nombreCurso;
        this.fechaEntrega = fechaEntrega;
        this.calificacion = calificacion;
    }
    
    
    public Entrega(
        String tituloTarea,
        String estudiante,
        LocalDateTime fechaEntrega,
        boolean entregado,
        float calificacion
    ) {
        this.tituloTarea = tituloTarea;
        this.estudiante = estudiante;
        this.fechaEntrega = fechaEntrega;
        this.entregado = entregado;
        this.calificacion = calificacion;
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
    public boolean isEntregado() {
        return entregado;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public float getCalificacion() {
        return calificacion;
    }
}
