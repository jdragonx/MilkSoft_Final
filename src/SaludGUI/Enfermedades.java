
package SaludGUI;

/**
 *
 * @author jonhe
 */
public class Enfermedades extends javax.swing.JPanel {

    /**
     * Creates new form Enfermedades
     */
    public Enfermedades() {
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
        jLabel1 = new javax.swing.JLabel();
        RazonSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Identificador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Registar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        RazonSocial1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RazonSocial2 = new javax.swing.JTextField();
        RazonSocial3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Identificador1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Registar1 = new javax.swing.JButton();
        Registar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        RazonSocial4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RazonSocial5 = new javax.swing.JTextField();
        Identificador2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Registar4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1100, 850));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));
        jPanel1.add(RazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 212, -1));

        jLabel2.setText("Tipo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));
        jPanel1.add(Identificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 212, -1));

        jLabel3.setText("Gravedad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        Registar.setText("Registrar");
        Registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarActionPerformed(evt);
            }
        });
        jPanel1.add(Registar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Registrar Enfermedad");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 30));

        RazonSocial1.setEnabled(false);
        jPanel1.add(RazonSocial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 212, -1));

        jLabel4.setText("Identificador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gravedad", "" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, -1));

        jTabbedPane1.addTab("Registrar Enfermedad", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Actualizar Enfermedad");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 30));

        jLabel5.setText("Identificador");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));
        jPanel5.add(RazonSocial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 212, -1));
        jPanel5.add(RazonSocial3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 212, -1));

        jLabel6.setText("Nombre");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel7.setText("Tipo");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));
        jPanel5.add(Identificador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 212, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gravedad", "" }));
        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, -1));

        jLabel8.setText("Gravedad");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        Registar1.setText("Buscar");
        Registar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registar1ActionPerformed(evt);
            }
        });
        jPanel5.add(Registar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        Registar2.setText("Actualizar");
        Registar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registar2ActionPerformed(evt);
            }
        });
        jPanel5.add(Registar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jTabbedPane1.addTab("Actualizar Enfermedad", jPanel5);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Consultar Enfermedad");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 200, 30));
        jPanel2.add(RazonSocial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 212, -1));

        jLabel9.setText("Identificador");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel10.setText("Nombre");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        RazonSocial5.setEnabled(false);
        jPanel2.add(RazonSocial5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 212, -1));

        Identificador2.setEnabled(false);
        jPanel2.add(Identificador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 212, -1));

        jLabel11.setText("Tipo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel12.setText("Gravedad");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gravedad", "" }));
        jComboBox3.setEnabled(false);
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, -1));

        Registar4.setText("Buscar");
        Registar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registar4ActionPerformed(evt);
            }
        });
        jPanel2.add(Registar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jTabbedPane1.addTab("Consultar enfermedad", jPanel2);

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

    private void RegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistarActionPerformed

    private void Registar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Registar1ActionPerformed

    private void Registar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Registar2ActionPerformed

    private void Registar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Registar4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Identificador;
    private javax.swing.JTextField Identificador1;
    private javax.swing.JTextField Identificador2;
    private javax.swing.JTextField RazonSocial;
    private javax.swing.JTextField RazonSocial1;
    private javax.swing.JTextField RazonSocial2;
    private javax.swing.JTextField RazonSocial3;
    private javax.swing.JTextField RazonSocial4;
    private javax.swing.JTextField RazonSocial5;
    private javax.swing.JButton Registar;
    private javax.swing.JButton Registar1;
    private javax.swing.JButton Registar2;
    private javax.swing.JButton Registar4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
