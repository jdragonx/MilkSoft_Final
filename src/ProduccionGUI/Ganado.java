/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduccionGUI;

import Conexiones.ProcedimientoGanado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jonhe
 */
public class Ganado extends javax.swing.JPanel {

    /**
     * Creates new form Ganado
     */
    public Ganado() {
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
        PantallaInicial = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();

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

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel29.setText("jLabel12");

        javax.swing.GroupLayout PantallaInicialLayout = new javax.swing.GroupLayout(PantallaInicial);
        PantallaInicial.setLayout(PantallaInicialLayout);
        PantallaInicialLayout.setHorizontalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1401, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel1.setText("Registro ganado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel2.setText("Arete");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel3.setText("Número de partos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel4.setText("Raza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel5.setText("Estado de salud");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel6.setText("Estado de producción");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel7.setText("Género");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel8.setText("Maduración");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 230, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 230, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 230, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saludable", "enfermedad débil", "enfermedad media", "enfermedd grave", "crítica" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 230, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "en producción", "vendida", "seca" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 230, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ternera", "vacona", "vaca" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 230, -1));

        jButton1.setText("Registrar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 880));

        jTabbedPane1.addTab("Registro de ganado", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Actualización de ganado");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel10.setText("Arete");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel11.setText("Número de partos");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel13.setText("Estado de salud");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel14.setText("Estado de producción");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel18.setText("Maduración");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 230, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 230, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saludable", "enfermedad débil", "enfermedad media", "enfermedd grave", "crítica" }));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 230, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "en producción", "vendida", "seca" }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 230, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ternera", "vacona", "vaca" }));
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 230, -1));

        jButton2.setText("Registrar");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de ganado", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Consulta de ganado");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel16.setText("Arete");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jButton4.setText("Consultar");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Arete", null},
                {"Raza", null},
                {"Número de partos", null},
                {"Estado de salud", null},
                {"Estado de producción", null},
                {"Género", null},
                {"Maduración", null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 130));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Consulta de ganado", jPanel3);

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
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {
            PantallaInicial.setVisible(false);
        } else if (jTabbedPane1.getSelectedIndex() != 0){
            PantallaInicial.setVisible(false);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
