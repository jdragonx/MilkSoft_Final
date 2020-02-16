
package AdministracionUsuariosGUI;

import Interfaces.Modulo;


public class Administracion extends javax.swing.JPanel {
    Validacion val = new Validacion();
    public Administracion() {
        initComponents();
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
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jtfCedula = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfCon2 = new javax.swing.JTextField();
        jcbActivacion = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jcbRol = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

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

        jButton8.setText("Registrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

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

        jTabbedPane1.addTab("Registrar de Usuario", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 850));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Consulta de Usuarios");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jButton3.setText("Buscar");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Contrasena", "Cedula", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 760, -1));

        jTabbedPane1.addTab("Consultar de Usuario", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel3.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 850));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Contrasena 2");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 340, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 340, -1));

        jLabel10.setText("Contrasena 1");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel11.setText("Nombre de Usuario");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 340, -1));

        jButton4.setText("Buscar");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Actualizacion de Contraseña");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jButton5.setText("Actualizar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jTabbedPane1.addTab("Actualizacion de Contraseña", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Consulta de Usuarios");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel13.setText("Nombre de Usuario");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 340, -1));

        jLabel14.setText("Estado");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jTextField10.setEnabled(false);
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 340, -1));

        jButton6.setText("Buscar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, -1));

        jButton7.setText("Actualizar");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jRadioButton1.setText("Activado");
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 305, -1, -1));

        jRadioButton2.setText("Desactivado");
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 358, -1, -1));

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
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {

        } else if (jTabbedPane1.getSelectedIndex() != 0){

        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        val.   
        System.out.print(Integer.toString(jcbRol.getItemCount())+jtfUser.getText()+"\n"+jtfCon1.getText()+"\n"+jtfCon2.getText()+"\n"+jtfCedula.getText()+"\nRo: "+
                               Integer.toString(jcbRol.getSelectedIndex()) +"\nEstado: "+Integer.toString(jcbActivacion.getSelectedIndex()) );
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> jcbActivacion;
    private javax.swing.JComboBox<String> jcbRol;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCon1;
    private javax.swing.JTextField jtfCon2;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
