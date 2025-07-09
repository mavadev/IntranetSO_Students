package com.intranet.models;

public class ContenidoCurso {
    private String idContenido;
    private String titulo;
    private String descripcion;
    private String semana;

    public ContenidoCurso(
        String idContenido,
        String titulo,
        String descripcion,
        String semana
    ) {
        this.idContenido = idContenido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.semana = semana;
    }

    public String getIdContenido() {
        return idContenido;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }

}
