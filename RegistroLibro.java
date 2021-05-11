package libros;

import login_register.ConexionMySql;
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
import login_register.ConexionMySql;
import login_register.Menu_Form;


public class RegistroLibro extends javax.swing.JFrame {

    
    public RegistroLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //crear bordes para botones de minimizar y cerrar
        
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
        jTextField_Titulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Autor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Año = new javax.swing.JTextField();
        jTextField_Editorial = new javax.swing.JTextField();
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
        jLabel4.setText("Titulo:");

        jTextField_Titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TituloActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Autor:");

        jTextField_Autor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Editorial:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Año:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Código de Libro:");

        jTextField_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_Año.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AñoActionPerformed(evt);
            }
        });
        jTextField_Año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_AñoKeyTyped(evt);
            }
        });

        jTextField_Editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                    .addComponent(jTextField_Editorial)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Año)
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Editorial)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Año, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(66, 66, 66)
                .addComponent(jButton_Registrar)
                .addGap(55, 55, 55))
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
        jLabel3.setText(" Registro de Libros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
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
                .addGap(41, 41, 41)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_Cerrar)
                                .addComponent(jLabel_Minimizar))
                            .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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

    private void jTextField_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TituloActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

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
/**/
    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        // TODO add your handling code here:
        
        String titulo = jTextField_Titulo.getText();
        String autor = jTextField_Autor.getText();
        String editorial = jTextField_Editorial.getText();
        String año = jTextField_Año.getText();
        String codigo_libro = jTextField_ID.getText();
        
        
        
        
        if(verifyFields()){
            
            if(!checarCodigoLibro()){
                PreparedStatement ps;
                ResultSet rs;
                String registrarLibroQuery = "INSERT INTO `libros`(`codigo_libro`, `titulo`, `autor`, `editorial`, `año`) VALUES (?,?,?,?,?)";
                
                try {
                     
                     ps = ConexionMySql.getConnection().prepareStatement(registrarLibroQuery);
                     ps.setString(1, codigo_libro);
                     ps.setString(2, titulo);
                     ps.setString(3, autor);
                     ps.setString(4, editorial);
                     ps.setString(5, año);
                     
                      if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Se ha registrado el libro");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Verifica la información");
                         }
                     
                } catch (SQLException ex) {
                    Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                
            }
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed

    private void jTextField_AñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AñoKeyTyped
        //permite ingresar solo numeros
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_AñoKeyTyped

    private void jTextField_AñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AñoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
       //muestra un nuevo form
                GestionLibro form = new GestionLibro();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //crear una funcion para verificar los campos vacíos
    public boolean verifyFields(){
        
        String titulo = jTextField_Titulo.getText();
        String autor = jTextField_Autor.getText();
        String editorial = jTextField_Editorial.getText();
        String año = jTextField_Año.getText();
        String codigo_libro = jTextField_ID.getText();
        
        // checar campos vacíos
        
        if(titulo.trim().equals("") || autor.trim().equals("") || editorial.trim().equals("") ||
                año.trim().equals("") || codigo_libro.trim().equals("")){
        
        JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos","Campos vacíos",2);
         return false;  
        
    }
        //checar si el año sobrepasa el limite de caracteres
        else if(año.length() > 5){
            JOptionPane.showMessageDialog(null, "El año es incorrecto","Año inválido",2);
            return false;
        }
        
        //si todo está bien
        else{
            return true;
        }
        
    }
    
//crear una funcion para checar si el username inegresado ya existe en la base de datos
    
    public boolean checarCodigoLibro(){
        
        
        String codigo_libro = jTextField_ID.getText();
        PreparedStatement st;
        ResultSet rs;
        boolean codigo_libro_exist = false;
        
        String query = "SELECT * FROM `libros` WHERE `codigo_libro` = ?";
        try {
            st = ConexionMySql.getConnection().prepareStatement(query);
            st.setString(1, codigo_libro);
            rs = st.executeQuery();
            
            if(rs.next()){
                
                codigo_libro_exist = true;
                JOptionPane.showMessageDialog(null, "Este codigo ya existe", "Error de codigo", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return codigo_libro_exist;
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
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Cerrar;
    private javax.swing.JLabel jLabel_Minimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField_Autor;
    private javax.swing.JTextField jTextField_Año;
    private javax.swing.JTextField jTextField_Editorial;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Titulo;
    // End of variables declaration//GEN-END:variables
}
