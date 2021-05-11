
package login_register;

import libros.GestionLibro;
import prestamos.DevolucionLibro;
import prestamos.GestionPrestamo;


public class Menu_Form extends javax.swing.JFrame {

    
    public Menu_Form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuAdmin = new javax.swing.JPanel();
        jButtonGestionarLibro = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jButtonPrestamos = new javax.swing.JButton();
        jButtonDevoluciones = new javax.swing.JButton();
        cerrarSesionButton = new javax.swing.JButton();
        bienvenidoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenuAdmin.setBackground(new java.awt.Color(153, 153, 255));

        jButtonGestionarLibro.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGestionarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGestionarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_libro.png"))); // NOI18N
        jButtonGestionarLibro.setText("Libros");
        jButtonGestionarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarLibroActionPerformed(evt);
            }
        });

        jButtonUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_usuario2.png"))); // NOI18N
        jButtonUsuarios.setText("Nuevo Usuario");
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });

        jButtonPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPrestamos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_prestamo.png"))); // NOI18N
        jButtonPrestamos.setText("Prestamos");
        jButtonPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamosActionPerformed(evt);
            }
        });

        jButtonDevoluciones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDevoluciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_dev.png"))); // NOI18N
        jButtonDevoluciones.setText("Devoluciones");
        jButtonDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolucionesActionPerformed(evt);
            }
        });

        cerrarSesionButton.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cerrarSesionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_cerrar_sesion.png"))); // NOI18N
        cerrarSesionButton.setText("Cerrar Sesión");
        cerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionButtonActionPerformed(evt);
            }
        });

        bienvenidoPanel.setBackground(new java.awt.Color(0, 0, 153));
        bienvenidoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        javax.swing.GroupLayout bienvenidoPanelLayout = new javax.swing.GroupLayout(bienvenidoPanel);
        bienvenidoPanel.setLayout(bienvenidoPanelLayout);
        bienvenidoPanelLayout.setHorizontalGroup(
            bienvenidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienvenidoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bienvenidoPanelLayout.setVerticalGroup(
            bienvenidoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuAdminLayout = new javax.swing.GroupLayout(jPanelMenuAdmin);
        jPanelMenuAdmin.setLayout(jPanelMenuAdminLayout);
        jPanelMenuAdminLayout.setHorizontalGroup(
            jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuAdminLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGestionarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesionButton)
                .addGap(219, 219, 219))
            .addGroup(jPanelMenuAdminLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(bienvenidoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuAdminLayout.setVerticalGroup(
            jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuAdminLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bienvenidoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(cerrarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
                RegistroUsuario form = new RegistroUsuario();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamosActionPerformed
                GestionPrestamo form = new GestionPrestamo();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();       
    }//GEN-LAST:event_jButtonPrestamosActionPerformed

    private void jButtonDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolucionesActionPerformed
                DevolucionLibro form = new DevolucionLibro();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
    }//GEN-LAST:event_jButtonDevolucionesActionPerformed

    private void cerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarSesionButtonActionPerformed

    private void jButtonGestionarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarLibroActionPerformed
        //muestra un nuevo form
                GestionLibro form = new GestionLibro();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
    }//GEN-LAST:event_jButtonGestionarLibroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bienvenidoPanel;
    private javax.swing.JButton cerrarSesionButton;
    private javax.swing.JButton jButtonDevoluciones;
    private javax.swing.JButton jButtonGestionarLibro;
    private javax.swing.JButton jButtonPrestamos;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelMenuAdmin;
    // End of variables declaration//GEN-END:variables
}
