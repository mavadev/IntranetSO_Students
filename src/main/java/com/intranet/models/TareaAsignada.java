package com.intranet.models;
import java.time.LocalDateTime;

public class TareaAsignada {
    private String idAsignacion;
    private String tituloTarea;
    private String nombreCurso;
    private boolean entregado;
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
}
