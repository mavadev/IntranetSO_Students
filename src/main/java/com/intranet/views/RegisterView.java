package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;

public class RegisterView extends javax.swing.JFrame {

    public RegisterView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginView1 = new com.intranet.views.LoginView();
        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegisterNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRegisterCorreo = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRegisterApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        redirectLogin = new javax.swing.JLabel();
        txtRegisterContraseña = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Correo electrónico");

        jLabel.setText("¿Ya tienes una cuenta?");

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setText("CREAR CUENTA");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos");

        redirectLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redirectLogin.setText("Iniciar Sesión");
        redirectLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirectLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(redirectLogin))
                        .addComponent(jLabel4)
                        .addComponent(txtRegisterCorreo)
                        .addComponent(jLabel3)
                        .addComponent(txtRegisterNombre)
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addComponent(txtRegisterApellido)
                        .addComponent(txtRegisterContraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisterNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisterApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisterCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisterContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(redirectLogin))
                .addGap(31, 31, 31)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h-ninas_riendo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1036, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // Obtener valores de formulario
        String nombre = txtRegisterNombre.getText();
        String apellido = txtRegisterApellido.getText();
        String correo = txtRegisterCorreo.getText();
        String password = new String(txtRegisterContraseña.getPassword());
        
        // Validacion de campos generales
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || password.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        } 
        
        // Validación de campos individuales
        String resultadoCorreo = Validador.esCorreoValido(correo);
        if (!resultadoCorreo.equals("OK")) {
            AlertUtils.showWarning(resultadoCorreo);
            return;
        } 
        String resultadoContraseña = Validador.esPasswordSegura(password);
        if (!resultadoContraseña.equals("OK")) {
            AlertUtils.showWarning(resultadoContraseña);
            return;
        } 
        
        // Crear el usuario
        Usuario nuevoUsuario = new Usuario(nombre,apellido,correo,password, "alumno");
        
        // Registramos el nuevo usuario en la base de datos
        Boolean creadoCorrectamente = AppContext.getUsuarioController().register(nuevoUsuario);

        // En caso se cree correctamente
        if(creadoCorrectamente){
            AlertUtils.showSuccess("Usuario "+nombre+" creado con éxito!");
            
            Dashboard dashboardView = new Dashboard();
            dashboardView.setUsuario(nombre);
            
            this.setVisible(false);
            dashboardView.setVisible(true);
        } 
        // Caso hubiera algún error al crear el usuario
        else {
            AlertUtils.showError("Hubo un error al crear el usuario");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void redirectLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirectLoginMouseClicked
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_redirectLoginMouseClicked

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.intranet.views.LoginView loginView1;
    private javax.swing.JLabel redirectLogin;
    private javax.swing.JTextField txtRegisterApellido;
    private javax.swing.JPasswordField txtRegisterContraseña;
    private javax.swing.JTextField txtRegisterCorreo;
    private javax.swing.JTextField txtRegisterNombre;
    // End of variables declaration//GEN-END:variables
}
