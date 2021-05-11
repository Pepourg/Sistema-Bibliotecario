
package login_register;

import libros.*;
import static java.lang.Thread.sleep;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login_register.ConexionMySql;
import login_register.Menu_Form;




public class GestionUsuario extends javax.swing.JFrame {

    ConexionMySql conexionBase = new ConexionMySql();
    Connection conexion = conexionBase.getConnection();
    
    PreparedStatement consultaSQL = null;
    ResultSet resultadoConsulta = null;
    
    
    
    public GestionUsuario() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        listaUsuario(0,null);
       
    }

        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarLibro3 = new javax.swing.JButton();
        jPanelGestionLibro = new javax.swing.JPanel();
        jButtonAgregarLibro = new javax.swing.JButton();
        jButtonEditarLibro = new javax.swing.JButton();
        jButtonEliminarLibro = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVerUsuarios = new javax.swing.JTable();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();

        jButtonAgregarLibro3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregarLibro3.setText("Eliminar");
        jButtonAgregarLibro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarLibro3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelGestionLibro.setBackground(new java.awt.Color(153, 153, 255));

        jButtonAgregarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAgregarLibro.setText("Agregar ");
        jButtonAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarLibroActionPerformed(evt);
            }
        });

        jButtonEditarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditarLibro.setText("Editar ");
        jButtonEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarLibroActionPerformed(evt);
            }
        });

        jButtonEliminarLibro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEliminarLibro.setText("Eliminar");
        jButtonEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarLibroActionPerformed(evt);
            }
        });

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_regresar.png"))); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jTableVerUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "Telefono", "Correo", "Genero"
            }
        ));
        jScrollPane1.setViewportView(jTableVerUsuarios);

        jComboBoxFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "ID", "Nombre Completo", "Telefono", "Correo", "Genero" }));
        jComboBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltroActionPerformed(evt);
            }
        });

        jTextFieldFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtro:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGestionLibroLayout = new javax.swing.GroupLayout(jPanelGestionLibro);
        jPanelGestionLibro.setLayout(jPanelGestionLibroLayout);
        jPanelGestionLibroLayout.setHorizontalGroup(
            jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addComponent(jButtonAgregarLibro)
                        .addGap(76, 76, 76)
                        .addComponent(jButtonEditarLibro)
                        .addGap(81, 81, 81)
                        .addComponent(jButtonEliminarLibro))
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonBuscar)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );
        jPanelGestionLibroLayout.setVerticalGroup(
            jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegresar))
                .addGap(9, 9, 9)
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFiltro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarLibro)
                    .addComponent(jButtonEditarLibro)
                    .addComponent(jButtonEliminarLibro))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelGestionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void listaUsuario(int opcion, String busqueda){
         
        DefaultTableModel tablaUsuarios = new DefaultTableModel();
        
        tablaUsuarios.addColumn("ID Usuario");
        tablaUsuarios.addColumn("Nombre Completo");
        tablaUsuarios.addColumn("Teléfono");
        tablaUsuarios.addColumn("Correo");
        tablaUsuarios.addColumn("Género");
        
        jTableVerUsuarios.setModel(tablaUsuarios);
        
        String consulta = "";
            
            if(opcion == 0){
                consulta = "SELECT * FROM usuarios";
            }else{
                if(opcion == 1 && busqueda != null){
                    consulta = "SELECT * FROM usuarios WHERE id = '"+busqueda+"'";
                }else{
                    if(opcion == 2 && busqueda != null){
                        consulta = "SELECT * FROM usuarios WHERE nombre_completo = '"+busqueda+"'";
                    }else{
                        if(opcion == 3 && busqueda != null){
                            consulta = "SELECT * FROM usuarios WHERE telefono = '"+busqueda+"'";
                        }else{
                            if(opcion == 4 && busqueda != null){
                                consulta = "SELECT * FROM usuarios WHERE correo = '"+busqueda+"'";
                            }else{
                                if(opcion == 5 && busqueda != null){
                                    consulta = "SELECT * FROM usuarios WHERE genero = '"+busqueda+"'";
                                }
                            }
                        }
                    }
                }
            }
        
        String [] datos = new String[5];
        
        try {
            
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                tablaUsuarios.addRow(datos);
                
            }
            
            jTableVerUsuarios.setModel(tablaUsuarios);
                  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
            
        }
    }
    
    
    
    
    private void actualizarDatos(){
        
        int fila = jTableVerUsuarios.getSelectedRow();
        
        String id = jTableVerUsuarios.getValueAt(fila, 0).toString();
        String nombreCompleto = jTableVerUsuarios.getValueAt(fila, 1).toString();
        String telefono = jTableVerUsuarios.getValueAt(fila, 2).toString();
        String correo = jTableVerUsuarios.getValueAt(fila, 3).toString();
        String genero = jTableVerUsuarios.getValueAt(fila, 4).toString();
        
        try {
            
            consultaSQL = conexion.prepareStatement("UPDATE usuarios SET nombre_Completo='"+nombreCompleto+"',telefono='"+telefono+"',correo='"+correo+"',genero='"+genero+"'WHERE id = '"+id+"'");
            consultaSQL.executeUpdate(); 
            listaUsuario(0, null);
            
        } catch (SQLException e) {
            
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null, e + "Error al actualizar");
            
        }
    }
    
    
   public void eliminarUsuario(){
       
       int filaSeleccionada = jTableVerUsuarios.getSelectedRow();
       String valor = jTableVerUsuarios.getValueAt(filaSeleccionada, 0).toString();
       
       try {
           
           consultaSQL = conexion.prepareStatement("DELETE FROM usuarios WHERE id='"+valor+"'");
           consultaSQL.executeUpdate();
           listaUsuario(0,null);
           
        }catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e + "Error al eliminar");
           
       }
   }
    
    private void jButtonEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarLibroActionPerformed
        
        actualizarDatos();
        
    }//GEN-LAST:event_jButtonEditarLibroActionPerformed

    private void jButtonEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarLibroActionPerformed
       
        eliminarUsuario();
        
    }//GEN-LAST:event_jButtonEliminarLibroActionPerformed

    private void jButtonAgregarLibro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarLibro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarLibro3ActionPerformed

    private void jComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFiltroActionPerformed

    private void jTextFieldFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
     
        //muestra un nuevo form
        
        Menu_Form form = new Menu_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
                
         // close the current form(login form)
         
         this.dispose();
         
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarLibroActionPerformed
       
        //muestra un nuevo form
                
        RegistroUsuario form = new RegistroUsuario();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        
        // close the current form(login form)
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonAgregarLibroActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        int opcion = jComboBoxFiltro.getSelectedIndex();
        String busqueda = jTextFieldFiltro.getText();
        
        listaUsuario(opcion, busqueda);
        
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(GestionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarLibro;
    private javax.swing.JButton jButtonAgregarLibro3;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditarLibro;
    private javax.swing.JButton jButtonEliminarLibro;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelGestionLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVerUsuarios;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
