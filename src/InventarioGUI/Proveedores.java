
package InventarioGUI;

public class Proveedores extends javax.swing.JPanel {


    public Proveedores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfConvecional = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jtfFechaInc = new javax.swing.JTextField();
        jtbRegistrar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jtfNombre1 = new javax.swing.JTextField();
        jtfCedula2 = new javax.swing.JTextField();
        jtfCorreo1 = new javax.swing.JTextField();
        jtfDireccion1 = new javax.swing.JTextField();
        jtfConvecional1 = new javax.swing.JTextField();
        jtfCelular1 = new javax.swing.JTextField();
        jtfFechaInc1 = new javax.swing.JTextField();
        jtbRegistrar1 = new javax.swing.JButton();
        jtbRegistrar3 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jtfNombre2 = new javax.swing.JTextField();
        jtfCedula3 = new javax.swing.JTextField();
        jtfCorreo2 = new javax.swing.JTextField();
        jtfDireccion2 = new javax.swing.JTextField();
        jtfConvecional2 = new javax.swing.JTextField();
        jtfCelular2 = new javax.swing.JTextField();
        jtfFechaInc2 = new javax.swing.JTextField();
        jbBuscarCon = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 850));
        setMinimumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PantallaInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel34.setText("jLabel12");
        PantallaInicial.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Proveedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 76, -1, -1));

        jLabel3.setText("Nombre del Proveedor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 179, -1, -1));

        jLabel4.setText("Cedula o RUC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 225, -1, -1));

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 268, -1, -1));

        jLabel6.setText("Correo Electronico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 313, -1, -1));

        jLabel7.setText("Numero de Telefono Convecional");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 358, -1, -1));

        jLabel9.setText("Numero de Telefono Celular");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 409, -1, -1));

        jLabel14.setText("Fecha de Inscripcion");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 462, -1, -1));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 176, 316, -1));
        jPanel1.add(jtfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 222, 316, -1));
        jPanel1.add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 310, 316, -1));
        jPanel1.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 265, 316, -1));
        jPanel1.add(jtfConvecional, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 355, 316, -1));
        jPanel1.add(jtfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 406, 316, -1));

        jtfFechaInc.setEnabled(false);
        jtfFechaInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaIncActionPerformed(evt);
            }
        });
        jPanel1.add(jtfFechaInc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 459, 316, -1));

        jtbRegistrar.setText("Registrar");
        jtbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jtbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 542, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel36.setText("jLabel12");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Registrar Proveedor", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Actualizar Proveedor");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 93, -1, -1));

        jLabel10.setText("Nombre del Proveedor");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 225, -1, -1));

        jLabel11.setText("Cedula o RUC");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 179, -1, -1));

        jLabel12.setText("Direccion");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 328, -1, -1));

        jLabel13.setText("Correo Electronico");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 373, -1, -1));

        jLabel16.setText("Numero de Telefono Convecional");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 418, -1, -1));

        jLabel40.setText("Numero de Telefono Celular");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 469, -1, -1));

        jLabel41.setText("Fecha de Inscripcion");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 275, -1, -1));
        jPanel4.add(jtfNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 176, 316, -1));

        jtfCedula2.setEnabled(false);
        jPanel4.add(jtfCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 222, 316, -1));
        jPanel4.add(jtfCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 370, 316, -1));
        jPanel4.add(jtfDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 325, 316, -1));
        jPanel4.add(jtfConvecional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 415, 316, -1));
        jPanel4.add(jtfCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 466, 316, -1));

        jtfFechaInc1.setEnabled(false);
        jtfFechaInc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaInc1ActionPerformed(evt);
            }
        });
        jPanel4.add(jtfFechaInc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 272, 316, -1));

        jtbRegistrar1.setText("Actualizar");
        jtbRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbRegistrar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jtbRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 542, -1, -1));

        jtbRegistrar3.setText("Buscar");
        jtbRegistrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbRegistrar3ActionPerformed(evt);
            }
        });
        jPanel4.add(jtbRegistrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 175, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel37.setText("jLabel12");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Actualizar Proveedor", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Consultar Proveedor");
        jPanel5.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 85, -1, -1));

        jLabel60.setText("Nombre del Proveedor");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 179, -1, -1));

        jLabel61.setText("Cedula o RUC");
        jPanel5.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 225, -1, -1));

        jLabel62.setText("Direccion");
        jPanel5.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 268, -1, -1));

        jLabel63.setText("Correo Electronico");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 313, -1, -1));

        jLabel64.setText("Numero de Telefono Convecional");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 358, -1, -1));

        jLabel65.setText("Numero de Telefono Celular");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 409, -1, -1));

        jLabel66.setText("Fecha de Inscripcion");
        jPanel5.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 462, -1, -1));
        jPanel5.add(jtfNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 176, 316, -1));

        jtfCedula3.setEnabled(false);
        jPanel5.add(jtfCedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 222, 316, -1));

        jtfCorreo2.setEnabled(false);
        jPanel5.add(jtfCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 310, 316, -1));

        jtfDireccion2.setEnabled(false);
        jPanel5.add(jtfDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 265, 316, -1));

        jtfConvecional2.setEnabled(false);
        jPanel5.add(jtfConvecional2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 355, 316, -1));

        jtfCelular2.setEnabled(false);
        jPanel5.add(jtfCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 406, 316, -1));

        jtfFechaInc2.setEnabled(false);
        jtfFechaInc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaInc2ActionPerformed(evt);
            }
        });
        jPanel5.add(jtfFechaInc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 459, 316, -1));

        jbBuscarCon.setText("Buscar");
        jbBuscarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarConActionPerformed(evt);
            }
        });
        jPanel5.add(jbBuscarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 175, 84, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel38.setText("jLabel12");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Consultar Proveedor", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {
            PantallaInicial.setVisible(false);
        } else if (jTabbedPane1.getSelectedIndex() != 0){
            PantallaInicial.setVisible(false);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jtfFechaIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFechaIncActionPerformed

    private void jtbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbRegistrarActionPerformed

    private void jtfFechaInc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaInc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFechaInc1ActionPerformed

    private void jtbRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbRegistrar1ActionPerformed

    private void jtfFechaInc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaInc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFechaInc2ActionPerformed

    private void jbBuscarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscarConActionPerformed

    private void jtbRegistrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbRegistrar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbRegistrar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbBuscarCon;
    private javax.swing.JButton jtbRegistrar;
    private javax.swing.JButton jtbRegistrar1;
    private javax.swing.JButton jtbRegistrar3;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCedula2;
    private javax.swing.JTextField jtfCedula3;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfCelular1;
    private javax.swing.JTextField jtfCelular2;
    private javax.swing.JTextField jtfConvecional;
    private javax.swing.JTextField jtfConvecional1;
    private javax.swing.JTextField jtfConvecional2;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfCorreo1;
    private javax.swing.JTextField jtfCorreo2;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDireccion1;
    private javax.swing.JTextField jtfDireccion2;
    private javax.swing.JTextField jtfFechaInc;
    private javax.swing.JTextField jtfFechaInc1;
    private javax.swing.JTextField jtfFechaInc2;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombre1;
    private javax.swing.JTextField jtfNombre2;
    // End of variables declaration//GEN-END:variables
}
