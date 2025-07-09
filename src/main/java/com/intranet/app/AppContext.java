package com.intranet.app;

import com.intranet.controllers.ContenidoCursoController;
import com.intranet.controllers.CursoController;
import com.intranet.controllers.DocenteController;
import com.intranet.controllers.EntregaController;
import com.intranet.db.DBConnection;
import com.intranet.controllers.EstudianteController;
import com.intranet.controllers.TareaAsignadaController;
import com.intranet.controllers.UsuarioController;
import com.intranet.models.Usuario;

public class AppContext {
    private Usuario usuarioActual;
    private static AppContext instance;
    
    private static DBConnection dbConnection;
    
    private static UsuarioController usuarioController;
    private static EstudianteController estudianteController;
    private static CursoController cursoController;
    private static DocenteController docenteController;
    private static ContenidoCursoController contenidoCursoController;
    private static TareaAsignadaController tareaAsignadaController;
    private static EntregaController entregaController;

    public static void initialize() {
        instance = new AppContext();
        dbConnection = DBConnection.getInstancia();
        
        estudianteController = new EstudianteController(dbConnection);
    }

    public static AppContext getInstance() {
        return instance;
    }

    // Obtener / Setear usuario
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    public void setUsuarioActual(Usuario usuario) {
        this.usuarioActual = usuario;
    }
    public void limpiarContexto() {
        usuarioActual = null;
    }

    // Getters de Controladores
    public static UsuarioController getUsuarioController() {
        return usuarioController;
    }
    public static EstudianteController getEstudianteController() {
        return estudianteController;
    }
    public static CursoController getCursoController() {
        return cursoController;
    }
    public static DocenteController getDocenteController() {
        return docenteController;
    }
    public static ContenidoCursoController getContenidoCursoController() {
        return contenidoCursoController;
    }
    public static TareaAsignadaController getTareaAsignadaController() {
        return tareaAsignadaController;
    }
    public static EntregaController getEntregaController() {
        return entregaController;
    }
}