
package login_register;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class RegistroUsuario extends javax.swing.JFrame {

    
    public RegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Minimizar.setBorder(jpanel_labels_border);
        jLabel_Cerrar.setBorder(jpanel_labels_border);
        
        //crear un bottongruoup para los jRadioButton de Masculino y Femenino
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Masculino);
        bg.add(jRadioButton_Femenino);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton_Femenino = new javax.swing.JRadioButton();
        jRadioButton_Masculino = new javax.swing.JRadioButton();
        jTextField_Correo = new javax.swing.JTextField();
        jLabel_Minimizar = new javax.swing.JLabel();
        jLabel_Cerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jButton_Registrar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Registrar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jButton_Registrar.setText("Registrar");
        jButton_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Completo:");

        jTextField_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        jTextField_Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TelefonoActionPerformed(evt);
            }
        });
        jTextField_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Género:");

        jRadioButton_Femenino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton_Femenino.setText("Femenino");

        jRadioButton_Masculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton_Masculino.setSelected(true);
        jRadioButton_Masculino.setText("Masculino");
        jRadioButton_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MasculinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton_Masculino)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_Femenino))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addComponent(jTextField_Telefono)
                        .addComponent(jTextField_Correo)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Masculino)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton_Femenino))
                .addGap(75, 75, 75)
                .addComponent(jButton_Registrar)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel_Minimizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Minimizar.setText(" -");
        jLabel_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_Minimizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel_MinimizarFocusGained(evt);
            }
        });
        jLabel_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizarMouseExited(evt);
            }
        });

        jLabel_Cerrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Cerrar.setText(" X");
        jLabel_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_regresar.png"))); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Cerrar)
                        .addComponent(jLabel_Minimizar))
                    .addComponent(jButtonRegresar))
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jRadioButton_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MasculinoActionPerformed

    private void jTextField_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TelefonoActionPerformed

    private void jLabel_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizarMouseClicked

    private void jLabel_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_CerrarMouseClicked

    private void jLabel_MinimizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel_MinimizarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MinimizarFocusGained

    private void jLabel_MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizarMouseEntered
        
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_Minimizar.setBorder(jpanel_labels_border);
        jLabel_Minimizar.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_MinimizarMouseEntered

    private void jLabel_MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizarMouseExited
        
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Minimizar.setBorder(jpanel_labels_border);
        jLabel_Minimizar.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_MinimizarMouseExited

    private void jLabel_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseEntered
        
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_Cerrar.setBorder(jpanel_labels_border);
        jLabel_Cerrar.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_CerrarMouseEntered

    private void jLabel_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseExited
        
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Cerrar.setBorder(jpanel_labels_border);
        jLabel_Cerrar.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_CerrarMouseExited

    private void jTextField_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelefonoKeyTyped
        //permite ingresar solo numeros
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_TelefonoKeyTyped

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        String nombreCompleto = jTextField_Nombre.getText();
        String correo = jTextField_Correo.getText();
        String telefono = jTextField_Telefono.getText();
        
        String genero = "Masculino";
        
        if(jRadioButton_Femenino.isSelected()){
            genero = "Femenino";
        }
        
        if(verifyFields()){
            
            if(!checkUsername()){
                PreparedStatement ps;
                ResultSet rs;
                String registrarUsuarioQuery = "INSERT INTO `usuarios`(`nombre_Completo`, `telefono`, `correo`, `genero`) VALUES (?,?,?,?)";
                
                try {
                     
                     ps = ConexionMySql.getConnection().prepareStatement(registrarUsuarioQuery);
                     ps.setString(1, nombreCompleto);
                     ps.setString(2, telefono);
                     ps.setString(3, correo);
                     ps.setString(4, genero);
                     
                      if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Tu cuenta ha sido creada");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Verifica tu información");
                         }
                     
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
            }
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        //muestra un nuevo form
        Menu_Form form = new Menu_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //crear una funcion para verificar los campos vacíos
    public boolean verifyFields(){
        
        String nombreCompleto = jTextField_Nombre.getText();
        String correo = jTextField_Correo.getText();
        String telefono = jTextField_Telefono.getText();
        
        // checar campos vacíos
        
        if(nombreCompleto.trim().equals("") || correo.trim().equals("") || telefono.trim().equals("")){
        
        JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos","Campos vacíos",2);
         return false;  
        
    }
        
        //si todo está bien
        else{
            return true;
        }
        
    }
    
//crear una funcion para checar si el username inegresado ya existe en la base de datos
    
    public boolean checkUsername(){
        
        
        String nombre = jTextField_Nombre.getText();
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `usuarios` WHERE `nombre_Completo` = ?";
        try {
            st = ConexionMySql.getConnection().prepareStatement(query);
            st.setString(1, nombre);
            rs = st.executeQuery();
            
            if(rs.next()){
                
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Este username ya existe", "Error de username", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Cerrar;
    private javax.swing.JLabel jLabel_Minimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_Femenino;
    private javax.swing.JRadioButton jRadioButton_Masculino;
    private javax.swing.JTextField jTextField_Correo;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Telefono;
    // End of variables declaration//GEN-END:variables
}
