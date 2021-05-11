
package prestamos;


import static java.lang.Thread.sleep;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libros.*;
import login_register.ConexionMySql;
import login_register.Menu_Form;




public class GestionPrestamo extends javax.swing.JFrame {

    ConexionMySql conexionBase = new ConexionMySql();
    Connection conexion = conexionBase.getConnection();
    
    PreparedStatement consultaSQL = null;
    ResultSet resultadoConsulta = null;
    
    private final int TIME = 1000; 
    
    
    
    
    public GestionPrestamo() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        listaPrestamo(0, null);
        
    }

    
        private void listaPrestamo(int opcion, String busqueda){
         
        DefaultTableModel tablaPrestamos = new DefaultTableModel();
        
        tablaPrestamos.addColumn("ID Prestamo");
        tablaPrestamos.addColumn("ID Usuario");
        tablaPrestamos.addColumn("Codigo Libro");
        tablaPrestamos.addColumn("Fecha Inicio");
        tablaPrestamos.addColumn("Fecha Devolucion");
        jTableVerPrestamos.setModel(tablaPrestamos);
        
        String consulta = "";
            
            if(opcion == 0){
                consulta = "SELECT * FROM prestamos";
            }else{
                if(opcion == 1 && busqueda != null){
                    consulta = "SELECT * FROM prestamos WHERE id_prestamo = '"+busqueda+"'";
                }else{
                    if(opcion == 2 && busqueda != null){
                        consulta = "SELECT * FROM prestamos WHERE id_usuario = '"+busqueda+"'";
                    }else{
                        if(opcion == 3 && busqueda != null){
                            consulta = "SELECT * FROM prestamos WHERE codigo_libro = '"+busqueda+"'";
                        }else{
                            if(opcion == 4 && busqueda != null){
                                consulta = "SELECT * FROM prestamos WHERE fecha_inicio_prestamo = '"+busqueda+"'";
                            }else{
                                if(opcion == 5 && busqueda != null){
                                    consulta = "SELECT * FROM prestamos WHERE fecha_devolucion = '"+busqueda+"'";
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
                tablaPrestamos.addRow(datos);
                
            }
            jTableVerPrestamos.setModel(tablaPrestamos);
            
            

            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }
        
        
    private void actualizarLibro(){
        
        int filaSeleccionada = jTableVerPrestamos.getSelectedRow();
        
        int idPrestamo = Integer.parseInt(this.jTableVerPrestamos.getValueAt(filaSeleccionada, 0).toString());
        int idUsuario = Integer.parseInt(this.jTableVerPrestamos.getValueAt(filaSeleccionada, 1).toString());
        int codigoLibro = Integer.parseInt(this.jTableVerPrestamos.getValueAt(filaSeleccionada, 2).toString());
        String fechaInicio = jTableVerPrestamos.getValueAt(filaSeleccionada, 3).toString();
        String fechaDevolucion = jTableVerPrestamos.getValueAt(filaSeleccionada, 4).toString();
        
        try {
            
            consultaSQL = conexion.prepareStatement("UPDATE prestamos SET id_usuario='"+idUsuario+"',codigo_libro='"+codigoLibro+"',fecha_inicio_prestamo='"+fechaInicio+"',fecha_devolucion='"+fechaDevolucion+"' WHERE id_prestamo = '"+idPrestamo+"'");
            consultaSQL.executeUpdate();
            listaPrestamo(0, null);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error al modificar");
        }
        
    
        
    }    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarLibro3 = new javax.swing.JButton();
        jPanelGestionLibro = new javax.swing.JPanel();
        jButtonAgregarPrestamo = new javax.swing.JButton();
        jButtonEditarPrestamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVerPrestamos = new javax.swing.JTable();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonRegresar = new javax.swing.JButton();
        PanelPrestamoTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filtroPanel = new javax.swing.JPanel();
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

        jButtonAgregarPrestamo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAgregarPrestamo.setText("Agregar ");
        jButtonAgregarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarPrestamoActionPerformed(evt);
            }
        });

        jButtonEditarPrestamo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditarPrestamo.setText("Editar ");
        jButtonEditarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarPrestamoActionPerformed(evt);
            }
        });

        jTableVerPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_Prestamo", "id_usuario", "codigo_libro", "fecha_Iniciol", "fecha_Devolucion"
            }
        ));
        jScrollPane1.setViewportView(jTableVerPrestamos);

        jComboBoxFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "ID_Prestamo", "ID_usuario", "Codigo_Libro", "Fecha_Inicio", "Fecha_Devolucion", " " }));
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

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_regresar.png"))); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        PanelPrestamoTitulo.setBackground(new java.awt.Color(0, 0, 153));
        PanelPrestamoTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" PRÉSTAMOS");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout PanelPrestamoTituloLayout = new javax.swing.GroupLayout(PanelPrestamoTitulo);
        PanelPrestamoTitulo.setLayout(PanelPrestamoTituloLayout);
        PanelPrestamoTituloLayout.setHorizontalGroup(
            PanelPrestamoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrestamoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelPrestamoTituloLayout.setVerticalGroup(
            PanelPrestamoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        filtroPanel.setBackground(new java.awt.Color(0, 0, 153));
        filtroPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Filtro:");

        javax.swing.GroupLayout filtroPanelLayout = new javax.swing.GroupLayout(filtroPanel);
        filtroPanel.setLayout(filtroPanelLayout);
        filtroPanelLayout.setHorizontalGroup(
            filtroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        filtroPanelLayout.setVerticalGroup(
            filtroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap()
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addComponent(jButtonRegresar)
                        .addGap(172, 172, 172)
                        .addComponent(PanelPrestamoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAgregarPrestamo)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonEditarPrestamo))
                            .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                                .addComponent(filtroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButtonBuscar)))))
                        .addGap(26, 26, 26))))
        );
        jPanelGestionLibroLayout.setVerticalGroup(
            jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPrestamoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxFiltro)
                            .addComponent(jTextFieldFiltro))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelGestionLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAgregarPrestamo)
                            .addComponent(jButtonEditarPrestamo))
                        .addGap(39, 39, 39))
                    .addGroup(jPanelGestionLibroLayout.createSequentialGroup()
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarPrestamoActionPerformed
       
        
        
    }//GEN-LAST:event_jButtonEditarPrestamoActionPerformed

    private void jButtonAgregarLibro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarLibro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarLibro3ActionPerformed

    private void jComboBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFiltroActionPerformed

    private void jTextFieldFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltroActionPerformed

    private void jButtonAgregarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarPrestamoActionPerformed
        //muestra un nuevo form
                RegistroPrestamo form = new RegistroPrestamo();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
    }//GEN-LAST:event_jButtonAgregarPrestamoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        //muestra un nuevo form
        Menu_Form form = new Menu_Form();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        // close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       
        int opcion = jComboBoxFiltro.getSelectedIndex();
        String busqueda = jTextFieldFiltro.getText();
        
        listaPrestamo(opcion, busqueda);
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
            java.util.logging.Logger.getLogger(GestionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrestamoTitulo;
    private javax.swing.JPanel filtroPanel;
    private javax.swing.JButton jButtonAgregarLibro3;
    private javax.swing.JButton jButtonAgregarPrestamo;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditarPrestamo;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelGestionLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVerPrestamos;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
