/*XD*/
package SaludGUI;

import Conexiones.Conexion;

public class Veterinario extends javax.swing.JPanel {

        Conexion con = new Conexion();
        
    public Veterinario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfCorreoElectronico = new javax.swing.JTextField();
        jtfFechaIns = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfConvecional = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jtbRegVet = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtbActualizar = new javax.swing.JButton();
        jtfCelular1 = new javax.swing.JTextField();
        jtfConvecional1 = new javax.swing.JTextField();
        jtfFechaIns1 = new javax.swing.JTextField();
        jtfCorreoElectronico1 = new javax.swing.JTextField();
        jtfCedula1 = new javax.swing.JTextField();
        jtfDireccion1 = new javax.swing.JTextField();
        jtfNombre1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtbBuscar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtfNombre2 = new javax.swing.JTextField();
        jtbBuscar1 = new javax.swing.JButton();
        jtfDireccion2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfCedula2 = new javax.swing.JTextField();
        jtfCorreoElectronico2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfFechaIns2 = new javax.swing.JTextField();
        jtfConvecional2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jtfCelular2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 850));
        setMinimumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel33.setText("jLabel12");

        javax.swing.GroupLayout PantallaInicialLayout = new javax.swing.GroupLayout(PantallaInicial);
        PantallaInicial.setLayout(PantallaInicialLayout);
        PantallaInicialLayout.setHorizontalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Registrar Veterinario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel3.setText("Nombre/Razon Social");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 146, -1, -1));

        jLabel4.setText("Direccion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 186, -1, -1));

        jLabel5.setText("Cedula/RUC");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 224, -1, -1));

        jLabel6.setText("Correo Electronico");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 262, -1, -1));

        jLabel7.setText("Fecha de Inscripcion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 303, -1, -1));

        jLabel8.setText("Numero de Telefono Convecional");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 341, -1, -1));

        jLabel9.setText("Numero de Telefono Celular");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 381, -1, -1));
        jPanel2.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 143, 258, -1));
        jPanel2.add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 183, 258, -1));
        jPanel2.add(jtfCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 259, 258, -1));

        jtfFechaIns.setEnabled(false);
        jPanel2.add(jtfFechaIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 300, 258, -1));
        jPanel2.add(jtfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 221, 258, -1));
        jPanel2.add(jtfConvecional, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 338, 258, -1));
        jPanel2.add(jtfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 378, 258, -1));

        jtbRegVet.setText("Registrar");
        jtbRegVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbRegVetActionPerformed(evt);
            }
        });
        jPanel2.add(jtbRegVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 455, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel34.setText("jLabel12");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Registrar Veterinario", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbActualizar.setText("Actualizar");
        jPanel3.add(jtbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 455, -1, -1));
        jPanel3.add(jtfCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 378, 258, -1));
        jPanel3.add(jtfConvecional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 338, 258, -1));

        jtfFechaIns1.setEnabled(false);
        jPanel3.add(jtfFechaIns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 300, 258, -1));
        jPanel3.add(jtfCorreoElectronico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 259, 258, -1));
        jPanel3.add(jtfCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 221, 258, -1));
        jPanel3.add(jtfDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 183, 258, -1));
        jPanel3.add(jtfNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 143, 258, -1));

        jLabel10.setText("Nombre/Razon Social");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 186, -1, -1));

        jLabel11.setText("Direccion");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 227, -1, -1));

        jLabel12.setText("Cedula/RUC");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 146, -1, -1));

        jLabel13.setText("Correo Electronico");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 262, -1, -1));

        jLabel14.setText("Fecha de Inscripcion");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 303, -1, -1));

        jLabel15.setText("Numero de Telefono Convecional");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 341, -1, -1));

        jLabel16.setText("Numero de Telefono Celular");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 381, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Actualizar Veterinario");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jtbBuscar.setText("Buscar");
        jPanel3.add(jtbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 142, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel35.setText("jLabel12");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Actualizar Veterinario", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Consultar Veterinario");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 51, -1, -1));

        jLabel19.setText("Cedula/RUC");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 123, -1, -1));
        jPanel1.add(jtfNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 120, 258, -1));

        jtbBuscar1.setText("Buscar");
        jPanel1.add(jtbBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 119, -1, -1));

        jtfDireccion2.setEnabled(false);
        jPanel1.add(jtfDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 160, 258, -1));

        jLabel20.setText("Nombre/Razon Social");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 163, -1, -1));

        jLabel21.setText("Direccion");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 204, -1, -1));

        jtfCedula2.setEnabled(false);
        jPanel1.add(jtfCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 198, 258, -1));

        jtfCorreoElectronico2.setEnabled(false);
        jPanel1.add(jtfCorreoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 236, 258, -1));

        jLabel22.setText("Correo Electronico");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 239, -1, -1));

        jLabel23.setText("Fecha de Inscripcion");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 280, -1, -1));

        jtfFechaIns2.setEnabled(false);
        jPanel1.add(jtfFechaIns2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 277, 258, -1));

        jtfConvecional2.setEnabled(false);
        jPanel1.add(jtfConvecional2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 315, 258, -1));

        jLabel24.setText("Numero de Telefono Convecional");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 318, -1, -1));

        jLabel25.setText("Numero de Telefono Celular");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 358, -1, -1));

        jtfCelular2.setEnabled(false);
        jPanel1.add(jtfCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 355, 258, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel36.setText("jLabel12");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Consultar Veterinario", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtbRegVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbRegVetActionPerformed
        String str1="";
        //con.insert(str1, "userGerente", "userGerente");
    }//GEN-LAST:event_jtbRegVetActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {
            PantallaInicial.setVisible(false);
        } else if (jTabbedPane1.getSelectedIndex() != 0){
            PantallaInicial.setVisible(false);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jtbActualizar;
    private javax.swing.JButton jtbBuscar;
    private javax.swing.JButton jtbBuscar1;
    private javax.swing.JButton jtbRegVet;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCedula1;
    private javax.swing.JTextField jtfCedula2;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfCelular1;
    private javax.swing.JTextField jtfCelular2;
    private javax.swing.JTextField jtfConvecional;
    private javax.swing.JTextField jtfConvecional1;
    private javax.swing.JTextField jtfConvecional2;
    private javax.swing.JTextField jtfCorreoElectronico;
    private javax.swing.JTextField jtfCorreoElectronico1;
    private javax.swing.JTextField jtfCorreoElectronico2;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDireccion1;
    private javax.swing.JTextField jtfDireccion2;
    private javax.swing.JTextField jtfFechaIns;
    private javax.swing.JTextField jtfFechaIns1;
    private javax.swing.JTextField jtfFechaIns2;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombre1;
    private javax.swing.JTextField jtfNombre2;
    // End of variables declaration//GEN-END:variables
}
