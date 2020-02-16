/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentasGUI;

/**
 *
 * @author jonhe
 */
public class Clientes extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        RazonSocial2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Identificador2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        CorreoElectronico2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        FechaDeInscripcion2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        NumeroDeTelefonoConvencional2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        NumeroDeTelefonoCelular2 = new javax.swing.JTextField();
        Registar2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        RazonSocialConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        IdentificadorConsulta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CorreoElectronicoConsulta = new javax.swing.JTextField();
        FechaDeInscripcionConsulta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NumeroDeTelefonoConvencionalConsulta = new javax.swing.JTextField();
        NumeroDeTelefonoCelularConsulta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 850));
        setMinimumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Nombre completo");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 62, -1, -1));
        jPanel1.add(RazonSocial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 212, -1));

        jLabel29.setText("Cédula/RUC");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 93, -1, -1));
        jPanel1.add(Identificador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 212, -1));

        jLabel30.setText("Correo electrónico");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 124, -1, -1));
        jPanel1.add(CorreoElectronico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 212, -1));

        jLabel31.setText("Fecha de inscripción");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 155, -1, -1));

        FechaDeInscripcion2.setEditable(false);
        FechaDeInscripcion2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(FechaDeInscripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 212, -1));

        jLabel32.setText("Número de teléfono convencional");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 186, -1, -1));
        jPanel1.add(NumeroDeTelefonoConvencional2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 212, -1));

        jLabel33.setText("Número de teléfono celular");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 217, -1, -1));
        jPanel1.add(NumeroDeTelefonoCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 212, -1));

        Registar2.setText("Registrar");
        Registar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Registar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel34.setText("Dirección");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 248, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 212, -1));

        jLabel27.setText("Registro de Cliente");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 11, -1, -1));

        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 900));

        jTabbedPane1.addTab("Registrar Cliente", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 126, -1, -1));
        jPanel2.add(RazonSocialConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 123, 212, -1));

        ListaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaClientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 161, 212, 182));

        IdentificadorConsulta.setEditable(false);
        IdentificadorConsulta.setBackground(new java.awt.Color(204, 204, 204));
        IdentificadorConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificadorConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(IdentificadorConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 361, 212, -1));

        jLabel13.setText("Cédula/RUC");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 364, -1, -1));

        jLabel12.setText("Correo electrónico");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 402, -1, -1));

        CorreoElectronicoConsulta.setEditable(false);
        CorreoElectronicoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(CorreoElectronicoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 399, 212, -1));

        FechaDeInscripcionConsulta.setEditable(false);
        FechaDeInscripcionConsulta.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(FechaDeInscripcionConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 437, 212, -1));

        jLabel11.setText("Fecha de inscripción");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jLabel10.setText("Número de teléfono convencional");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 478, -1, -1));

        NumeroDeTelefonoConvencionalConsulta.setEditable(false);
        NumeroDeTelefonoConvencionalConsulta.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(NumeroDeTelefonoConvencionalConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 475, 212, -1));

        NumeroDeTelefonoCelularConsulta.setEditable(false);
        NumeroDeTelefonoCelularConsulta.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(NumeroDeTelefonoCelularConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 513, 212, -1));

        jLabel8.setText("Número de teléfono celular");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 516, -1, -1));

        Consultar.setText("Consultar");
        jPanel2.add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 589, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 551, 212, -1));

        jLabel16.setText("Dirección");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 554, -1, -1));

        jLabel14.setText("Consulta de clientes");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 52, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 910));

        jTabbedPane1.addTab("Consultar Cliente", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 910));

        jTabbedPane1.addTab("Actualizar Cliente", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Registar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Registar2ActionPerformed

    private void IdentificadorConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificadorConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificadorConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField CorreoElectronico2;
    private javax.swing.JTextField CorreoElectronicoConsulta;
    private javax.swing.JTextField FechaDeInscripcion2;
    private javax.swing.JTextField FechaDeInscripcionConsulta;
    private javax.swing.JTextField Identificador2;
    private javax.swing.JTextField IdentificadorConsulta;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JTextField NumeroDeTelefonoCelular2;
    private javax.swing.JTextField NumeroDeTelefonoCelularConsulta;
    private javax.swing.JTextField NumeroDeTelefonoConvencional2;
    private javax.swing.JTextField NumeroDeTelefonoConvencionalConsulta;
    private javax.swing.JTextField RazonSocial2;
    private javax.swing.JTextField RazonSocialConsulta;
    private javax.swing.JButton Registar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
