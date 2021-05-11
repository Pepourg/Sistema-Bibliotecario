
package prestamos;

import login_register.*;
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


public class RegistroPrestamo extends javax.swing.JFrame {

    
    
    
    public RegistroPrestamo() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        Border jpanel_labels_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Minimizar.setBorder(jpanel_labels_border);
        jLabel_Cerrar.setBorder(jpanel_labels_border);
         
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_FechaInicio = new javax.swing.JTextField();
        jTextFieldCodigoLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_FechaDevolucion = new javax.swing.JTextField();
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ID Usuario:");

        jTextFieldIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Codigo del libro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Fecha de Inicio:");

        jTextField_FechaInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FechaInicioActionPerformed(evt);
            }
        });
        jTextField_FechaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FechaInicioKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Fecha de Devolución:");

        jTextField_FechaDevolucion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FechaDevolucionActionPerformed(evt);
            }
        });
        jTextField_FechaDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FechaDevolucionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jTextField_FechaInicio)
                    .addComponent(jTextFieldCodigoLibro)
                    .addComponent(jTextField_FechaDevolucion))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_FechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton_Registrar)
                .addGap(35, 35, 35))
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
        jLabel3.setText("Registro de Préstamo");

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
                .addContainerGap(141, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextFieldIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdUsuarioActionPerformed

    private void jTextField_FechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FechaInicioActionPerformed
        
    }//GEN-LAST:event_jTextField_FechaInicioActionPerformed

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

    private void jTextField_FechaInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FechaInicioKeyTyped
        //permite ingresar solo numeros
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_FechaInicioKeyTyped

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        String idUsuario = jTextFieldIdUsuario.getText();
        String codigoLibro = jTextFieldCodigoLibro.getText();
        String fechaInicio = jTextField_FechaInicio.getText();
        String fechaDevolucion = jTextField_FechaDevolucion.getText();
        
        
        
        
        if(verifyFields()){
            
            if(!checkCodigoLibroLibro() && !checkCodigoLibroPrestamo() && !checkUsername()){
                PreparedStatement ps;
                ResultSet rs;
                String registrarUsuarioQuery = "INSERT INTO `prestamos`(`id_usuario`, `codigo_libro`, `fecha_inicio_prestamo`, `fecha_devolucion`) VALUES (?,?,?,?)";
                
                try {
                     
                     ps = ConexionMySql.getConnection().prepareStatement(registrarUsuarioQuery);
                     ps.setString(1, idUsuario);
                     ps.setString(2, codigoLibro);
                     ps.setString(3, fechaInicio);
                     ps.setString(4, fechaDevolucion);
                     
                      if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Se ha creado el prestamo");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Verifica tu información");
                         }
                     
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroPrestamo.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
            }
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        //muestra un nuevo form
        GestionPrestamo form = new GestionPrestamo();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextField_FechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FechaDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FechaDevolucionActionPerformed

    private void jTextField_FechaDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FechaDevolucionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FechaDevolucionKeyTyped

    //crear una funcion para verificar los campos vacíos
    public boolean verifyFields(){
        
        String username = jTextFieldIdUsuario.getText();
        String codigoLibro = jTextFieldCodigoLibro.getText();
        String fechaInicio = jTextField_FechaInicio.getText();
        String fechaDevolucion = jTextField_FechaDevolucion.getText();
        
        // checar campos vacíos
        
        if(username.trim().equals("") || codigoLibro.trim().equals("") || fechaInicio.trim().equals("") || fechaDevolucion.trim().equals("")){
        
        JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos","Campos vacíos",2);
         return false;  
        
    }
        
        //si todo está bien
        else{
            return true;
        }
        
    }
    
//crear una funcion para checar si el username inegresado ya existe en la base de datos
    
    public boolean checkCodigoLibroPrestamo(){
        
        
        String codigoLibro = jTextFieldCodigoLibro.getText();
        PreparedStatement st;
        ResultSet rs;
        boolean codigo_libro = false;
        
        String query = "SELECT * FROM `prestamos` WHERE `codigo_libro` = ?";
        try {
            st = ConexionMySql.getConnection().prepareStatement(query);
            st.setString(1, codigoLibro);
            rs = st.executeQuery();
            
            if(rs.next()){
                
                codigo_libro = true;
                JOptionPane.showMessageDialog(null, "Este libro ya está en préstamo", "Error", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return codigo_libro;
    }
    
    
     public boolean checkCodigoLibroLibro(){
        
        
        String codigoLibro = jTextFieldCodigoLibro.getText();
        PreparedStatement st;
        ResultSet rs;
        boolean codigo_libro = false;
        
        String query = "SELECT * FROM `libros` WHERE `codigo_libro` = ?";
        try {
            st = ConexionMySql.getConnection().prepareStatement(query);
            st.setString(1, codigoLibro);
            rs = st.executeQuery();
            
            if(!rs.next()){
                
                codigo_libro = true;
                JOptionPane.showMessageDialog(null, "Este libro no existe", "Error", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return codigo_libro;
    }
     
    //crear una funcion para checar si el username inegresado ya existe en la base de datos
    
    public boolean checkUsername(){
        
        
        String idUsuario = jTextFieldIdUsuario.getText();
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `usuarios` WHERE `id` = ?";
        try {
            st = ConexionMySql.getConnection().prepareStatement(query);
            st.setString(1, idUsuario);
            rs = st.executeQuery();
            
            if(!rs.next()){
                
                username_exist = true;
                JOptionPane.showMessageDialog(null, "Este usuario no existe", "Error de usuario", 2);
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
            java.util.logging.Logger.getLogger(RegistroPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPrestamo().setVisible(true);
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
    private javax.swing.JTextField jTextFieldCodigoLibro;
    private javax.swing.JTextField jTextFieldIdUsuario;
    private javax.swing.JTextField jTextField_FechaDevolucion;
    private javax.swing.JTextField jTextField_FechaInicio;
    // End of variables declaration//GEN-END:variables
}
