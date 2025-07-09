package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LayoutPrincipal extends javax.swing.JFrame {

    public LayoutPrincipal() {
        initComponents();
        Dashboard dashboardPanel = new Dashboard();
        ShowPanel(dashboardPanel);
    }
    
    public void ShowPanel(JPanel panel) {
        panel.setSize(1054, 720);
        panel.setLocation(0,0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnPendientes = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnCalificaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Administración");
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        sidebar.setBackground(new java.awt.Color(165, 1, 25));
        sidebar.setPreferredSize(new java.awt.Dimension(220, 720));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_logo.png"))); // NOI18N
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, -1));

        btnLogout.setBackground(new java.awt.Color(165, 1, 25));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_logout.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLogout.setIconTextGap(10);
        btnLogout.setOpaque(true);
        btnLogout.setPreferredSize(new java.awt.Dimension(220, 50));
        sidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, -1, -1));

        btnPrincipal.setBackground(new java.awt.Color(165, 1, 25));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_home.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPrincipal.setIconTextGap(10);
        btnPrincipal.setOpaque(true);
        btnPrincipal.setPreferredSize(new java.awt.Dimension(220, 50));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        sidebar.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btnCursos.setBackground(new java.awt.Color(165, 1, 25));
        btnCursos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_courses.png"))); // NOI18N
        btnCursos.setText("Cursos");
        btnCursos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCursos.setIconTextGap(10);
        btnCursos.setOpaque(true);
        btnCursos.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });
        sidebar.add(btnCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btnPendientes.setBackground(new java.awt.Color(165, 1, 25));
        btnPendientes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pending.png"))); // NOI18N
        btnPendientes.setText("Pendientes");
        btnPendientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnPendientes.setBorderPainted(false);
        btnPendientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPendientes.setIconTextGap(10);
        btnPendientes.setOpaque(true);
        btnPendientes.setPreferredSize(new java.awt.Dimension(220, 50));
        btnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendientesActionPerformed(evt);
            }
        });
        sidebar.add(btnPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        btnCuenta.setBackground(new java.awt.Color(165, 1, 25));
        btnCuenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_account.png"))); // NOI18N
        btnCuenta.setText("Mi Cuenta");
        btnCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCuenta.setIconTextGap(10);
        btnCuenta.setOpaque(true);
        btnCuenta.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        sidebar.add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        btnCalificaciones.setBackground(new java.awt.Color(165, 1, 25));
        btnCalificaciones.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCalificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_notes.png"))); // NOI18N
        btnCalificaciones.setText("Calificaciones");
        btnCalificaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(165, 1, 25)));
        btnCalificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCalificaciones.setIconTextGap(10);
        btnCalificaciones.setOpaque(true);
        btnCalificaciones.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificacionesActionPerformed(evt);
            }
        });
        sidebar.add(btnCalificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        Dashboard panelDashboard = new Dashboard();
        ShowPanel(panelDashboard);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        ListaCursos panelCursos = new ListaCursos(content);
        ShowPanel(panelCursos);
    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendientesActionPerformed
        ListaPendientes panelPendientes = new ListaPendientes(content);
        ShowPanel(panelPendientes);
    }//GEN-LAST:event_btnPendientesActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        MiCuenta panelCuenta = new MiCuenta();
        ShowPanel(panelCuenta);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificacionesActionPerformed
        ListaCalificaciones panelCalificaciones = new ListaCalificaciones(content);
        ShowPanel(panelCalificaciones);
    }//GEN-LAST:event_btnCalificacionesActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalificaciones;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPendientes;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
