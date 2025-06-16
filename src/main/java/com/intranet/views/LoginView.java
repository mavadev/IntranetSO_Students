package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelBg = new javax.swing.JPanel();
        imgLogin = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        redirectContraseña = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        redirectRegistro = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        txtLoginPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación de Usuario");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        background.setBackground(new java.awt.Color(255, 255, 255));

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h-familia.jpg"))); // NOI18N

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("INICIAR SESIÓN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Correo electrònico");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        redirectContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redirectContraseña.setText("¿Olvidaste tu contraseña?");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("INGRESAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        redirectRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redirectRegistro.setText("Crear Cuenta");
        redirectRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirectRegistroMouseClicked(evt);
            }
        });

        jLabel.setText("No tienes una cuenta?");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(txtLoginCorreo)
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addComponent(redirectContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtLoginPassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(redirectRegistro)
                        .addGap(44, 44, 44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redirectContraseña)
                .addGap(37, 37, 37)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redirectRegistro)
                    .addComponent(jLabel))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Obtener valores de formulario
        String correo = txtLoginCorreo.getText();
        String password = new String(txtLoginPassword.getPassword());
        
       // Validacion de campos generales
        if (correo.isEmpty() || password.isEmpty()) {
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
        
        // Obtener resultado de autenticar usuario
        Usuario usuario = AppContext.getUsuarioController().login(correo, password);

        // En caso encuentre el usuario
        if(usuario != null){
            AlertUtils.showSuccess("Bienvenido "+usuario.getNombre()+"!");

            Dashboard dashboardView = new Dashboard();
            dashboardView.setUsuario(usuario.getNombre());
            
            this.setVisible(false);
            dashboardView.setVisible(true);
        }
        // Si no encuentra el usuario
        else {
            AlertUtils.showMessage("Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void redirectRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirectRegistroMouseClicked
        RegisterView registerView = new RegisterView();
        registerView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_redirectRegistroMouseClicked

    public static void main(String args[]) {        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel redirectContraseña;
    private javax.swing.JLabel redirectRegistro;
    private javax.swing.JTextField txtLoginCorreo;
    private javax.swing.JPasswordField txtLoginPassword;
    // End of variables declaration//GEN-END:variables
}
