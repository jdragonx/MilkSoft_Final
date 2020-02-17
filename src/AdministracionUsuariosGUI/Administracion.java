
package AdministracionUsuariosGUI;

import Codes.Validacion;
import static Codes.Validacion.ced2Dig;
import static Codes.Validacion.cedVal;
import static Codes.Validacion.counter;
import static Codes.Validacion.num;
import static Codes.Validacion.unicode;
import Conexiones.Conexion;
import static Conexiones.Conexion.getConexion;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Administracion extends javax.swing.JPanel {
    Conexion con = new Conexion();
    Validacion val = new Validacion();
    public Administracion() {
        initComponents();
        jbEstcAct.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtfCon1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jfbRegUser = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jtfCedula = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfCon2 = new javax.swing.JTextField();
        jcbActivacion = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jcbRol = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jbUsrBus = new javax.swing.JButton();
        jbEstcAct = new javax.swing.JButton();
        jrbActivado = new javax.swing.JRadioButton();
        jrbDesactivado = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 850));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Estado");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));
        jPanel1.add(jtfCon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 340, -1));

        jLabel16.setText("Contrasena 1");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel17.setText("Nombre de Usuario");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        jPanel1.add(jtfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 340, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Actualizacion de Contraseña");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jfbRegUser.setText("Registrar");
        jfbRegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfbRegUserActionPerformed(evt);
            }
        });
        jPanel1.add(jfbRegUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        jLabel19.setText("Numero de Cedula");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));
        jPanel1.add(jtfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 340, -1));

        jLabel20.setText("Contrasena 2");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));
        jPanel1.add(jtfCon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 340, -1));

        jcbActivacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Activado", "Desactivado" }));
        jPanel1.add(jcbActivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 220, -1));

        jLabel21.setText("Rol");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jcbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Administrador", "Contador", "Empleado" }));
        jPanel1.add(jcbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 220, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel30.setText("jLabel12");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel29.setText("jLabel12");

        javax.swing.GroupLayout PantallaInicialLayout = new javax.swing.GroupLayout(PantallaInicial);
        PantallaInicial.setLayout(PantallaInicialLayout);
        PantallaInicialLayout.setHorizontalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jTabbedPane1.addTab("Registrar de Usuario", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 850));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contrasena", "Cedula", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtUsers);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 720, 300));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Consulta de Usuarios");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel31.setText("jLabel12");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Consulta de Usuarios", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel3.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 850));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Contrasena 2");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jTextField6.setEnabled(false);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 340, -1));

        jTextField7.setEnabled(false);
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 340, -1));

        jLabel10.setText("Contrasena 1");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel11.setText("Nombre de Usuario");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 340, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Actualizacion de Contraseña");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel32.setText("jLabel12");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Actualizacion de Contraseña", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Activacion/Desactivacion de Usuarios");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel13.setText("Nombre de Usuario");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 340, -1));

        jLabel14.setText("Estado");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jTextField10.setEnabled(false);
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 340, -1));

        jbUsrBus.setText("Buscar");
        jbUsrBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsrBusActionPerformed(evt);
            }
        });
        jPanel4.add(jbUsrBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jbEstcAct.setText("Actualizar");
        jbEstcAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstcActActionPerformed(evt);
            }
        });
        jPanel4.add(jbEstcAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jrbActivado.setText("Activado");
        jrbActivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivadoActionPerformed(evt);
            }
        });
        jPanel4.add(jrbActivado, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 305, -1, -1));

        jrbDesactivado.setText("Desactivado");
        jrbDesactivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDesactivadoActionPerformed(evt);
            }
        });
        jPanel4.add(jrbDesactivado, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 358, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel33.setText("jLabel12");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Activacion/Desactivacion de Usuario", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
         // CONSULTAS DE USUARIOS
         //ArrayLisT<ArrayList>=con.ConsultaMatriz(,);
            DefaultTableModel tmodel = (DefaultTableModel) jtUsers.getModel();
            
             
            Connection cone = getConexion("userAc", "userAc");
            ArrayList<ArrayList>users=con.ConsultaMatriz(cone,"exec selAllUsers");
            tmodel.setRowCount(0);
            users.get(0);
            users.size();

  
            for(int i=0;i<=users.size();i++){
                ArrayList<ArrayList> xd = users.get(i);
                Object[] objArray = xd.toArray();
                tmodel.addRow(objArray);
            }
            
  
         
         
         //FUNCIONALIDA PREVIA
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {

        } else if (jTabbedPane1.getSelectedIndex() != 0){

        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jfbRegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfbRegUserActionPerformed

    if(jtfUser.getText().matches("")||jtfCon1.getText().matches("")||jtfCon2.getText().matches("")||jtfCedula.getText().matches("")||jcbRol.getSelectedIndex()==0||jcbActivacion.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(null, "Llenar atributo(s) en blanco","Error", JOptionPane.ERROR_MESSAGE); 
    }else{

        if(cedVal(jtfCedula.getText()) && ced2Dig(jtfCedula.getText()) && counter(jtfUser.getText())<=20 && unicode(jtfUser.getText()) && counter(jtfCon1.getText())>=8 && counter(jtfCon1.getText())<=128 && counter(jtfCon2.getText())>=8 && counter(jtfCon2.getText())<=128 && counter(jtfCedula.getText())==10 && num(jtfCedula.getText())/* && jcbRol.getSelectedIndex()!=0 && jcbActivacion.getSelectedIndex()!=0*/){
            if(jtfCon1.getText().matches(jtfCon2.getText())){
                //SQL REGISTRAR USUARIO

                con.insert("exec newUser @id='"+String.valueOf(jcbRol.getSelectedIndex())+"',@login='"+jtfUser.getText()+
                        "', @pass ='"+jtfCon1.getText()+"', @ced='"+jtfCedula.getText()+"', @est='"+jcbActivacion.getSelectedItem().toString()+"'");
     

                JOptionPane.showMessageDialog(null, "Usuario Registrado","Mensaje", JOptionPane.INFORMATION_MESSAGE); 
                
                
                jtfUser.setText("");
                jtfCon1.setText("");
                jtfCon2.setText("");
                jtfCedula.setText("");
                jcbRol.setSelectedIndex(0);
                jcbActivacion.setSelectedIndex(0);
            }else{
                JOptionPane.showMessageDialog(null, "Contraseñas Diferentes","Error", JOptionPane.ERROR_MESSAGE); 
    }
            
            
        }else{
                JOptionPane.showMessageDialog(null, "Formato invalido de atributo(s)","Error", JOptionPane.ERROR_MESSAGE); 
        }
    }
    }//GEN-LAST:event_jfbRegUserActionPerformed

    private void jbUsrBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsrBusActionPerformed
        String valAct="";
        if(jTextField9.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Atributo Nombre de usuario en blanco","Error", JOptionPane.ERROR_MESSAGE); 
        }else{
            if(counter(jTextField9.getText())<=20 && unicode(jtfUser.getText())){
                //SQL DE BUSQUEDA DE USER
                ResultSet activacion = con.Consulta("exec actEstadoUser @login='"+jTextField9.getText()+"'");
                
                ///MANEJO DE LO OBTENIDO DE LA CONSULTA
                try{
                ResultSetMetaData rsmd = activacion.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                 while (activacion.next()) {
               for (int i = 1; i <= columnsNumber; i++) {
                valAct = activacion.getString(i);
                 }
                  }
                System.out.print("\nvalAct:   "+valAct);

                }catch (SQLException e) {
            System.out.print("Error 2: " + e.getMessage());
        }

                if(valAct!=""){
                    
                    jbUsrBus.setEnabled(false);
                    jTextField9.setEnabled(false);
                    jTextField10.setText(valAct);
                    
                    //VERIFICAR SI SE SELECCIONO EL NUEVO ESTADO
                    jbEstcAct.setEnabled(true);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario Inexistente","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "Formato de Nombre de Usuario Erróneo","Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_jbUsrBusActionPerformed

    private void jbEstcActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstcActActionPerformed
        if(jrbActivado.isSelected() || jrbDesactivado.isSelected()){
                        JOptionPane.showMessageDialog(null, "Actualizacion Exitosa","Mensaje", JOptionPane.INFORMATION_MESSAGE); 
                        jTextField9.setText("");
                        jTextField10.setText("");
                        jrbActivado.setSelected(false);
                        jrbDesactivado.setSelected(false);
                        jTextField9.setEnabled(true);
                        jbEstcAct.setEnabled(false);
                        jbUsrBus.setEnabled(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Atributo Estado de Activación en blanco","Error", JOptionPane.ERROR_MESSAGE); 
                        jTextField10.setText("");
                    }
    }//GEN-LAST:event_jbEstcActActionPerformed

    private void jrbActivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivadoActionPerformed
        if(jrbActivado.isSelected()){
            jrbDesactivado.setSelected(false);
        }
    }//GEN-LAST:event_jrbActivadoActionPerformed

    private void jrbDesactivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDesactivadoActionPerformed
        if(jrbDesactivado.isSelected()){
            jrbActivado.setSelected(false);
        }
    }//GEN-LAST:event_jrbDesactivadoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String valCon="";
        if(jTextField8.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Atributo Nombre de usuario en blanco","Error", JOptionPane.ERROR_MESSAGE); 
        }else{
            if(counter(jTextField8.getText())<=20 && unicode(jtfUser.getText())){
                //SQL DE BUSQUEDA DE USER
                ResultSet contrasena = con.Consulta("exec  getPassLogin @login='"+jTextField8.getText()+"'");
                
                ///MANEJO DE LO OBTENIDO DE LA CONSULTA
                try{
                ResultSetMetaData rsmd = contrasena.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                 while (contrasena.next()) {
               for (int i = 1; i <= columnsNumber; i++) {
                valCon = contrasena.getString(i);
                 }
                  }
                System.out.print("\nvalAct:   "+valCon);

                }catch (SQLException e) {
            System.out.print("Error 2: " + e.getMessage());
        }

                if(valCon!=""){
                    jTextField6.setEnabled(true);
                    jTextField7.setEnabled(true);
                    jTextField8.setEnabled(false);
                    jButton4.setEnabled(false);
                    jButton5.setEnabled(true);

                }else{
                    JOptionPane.showMessageDialog(null, "Usuario Inexistente","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "Formato de Nombre de Usuario Erróneo","Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTextField6.getText().matches("")||jTextField7.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Llenar la(s) contraseña","Error", JOptionPane.ERROR_MESSAGE); 
        }else{
            if(counter(jTextField6.getText())>=8 && counter(jTextField6.getText())<=128 && counter(jTextField7.getText())>=8 && counter(jTextField7.getText())<=128){
                   if(jTextField6.getText().matches(jTextField7.getText())){
                       con.insert("exec updPass @pass= '"+jTextField6.getText()+"' ,@login= '"+jTextField8.getText()+"'");
                       JOptionPane.showMessageDialog(null, "Actualización Exitosa","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                       
                               jTextField6.setEnabled(false);
                               jTextField7.setEnabled(false);
                               jButton5.setEnabled(false);
                               jTextField8.setEnabled(true);
                               jButton4.setEnabled(true);
                               jTextField6.setText("");
                               jTextField7.setText("");
                               jTextField8.setText("");
                   }else{
                       JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden","Error", JOptionPane.ERROR_MESSAGE);
                   }
                
            }else{
                JOptionPane.showMessageDialog(null, "Formato invalido de Contraseña(s)","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbEstcAct;
    private javax.swing.JButton jbUsrBus;
    private javax.swing.JComboBox<String> jcbActivacion;
    private javax.swing.JComboBox<String> jcbRol;
    private javax.swing.JButton jfbRegUser;
    private javax.swing.JRadioButton jrbActivado;
    private javax.swing.JRadioButton jrbDesactivado;
    private javax.swing.JTable jtUsers;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCon1;
    private javax.swing.JTextField jtfCon2;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
