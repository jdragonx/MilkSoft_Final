
package ProduccionGUI;

import static Codes.Validacion.alf;
import Conexiones.ProcedimientoGanado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static Codes.Validacion.num;
import static Codes.Validacion.counter;
import Conexiones.Conexion;

public class Ganado extends javax.swing.JPanel {
    Conexion con = new Conexion();

    public Ganado() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfRaza = new javax.swing.JTextField();
        jtfArete = new javax.swing.JTextField();
        jtfPartos = new javax.swing.JTextField();
        jcbSalud = new javax.swing.JComboBox<>();
        jcbProduccion = new javax.swing.JComboBox<>();
        jcbGenero = new javax.swing.JComboBox<>();
        jcbMaduracion = new javax.swing.JComboBox<>();
        jbRegGanado = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfActArete = new javax.swing.JTextField();
        jtfActPartos = new javax.swing.JTextField();
        jbActGanado = new javax.swing.JButton();
        jcbSalud1 = new javax.swing.JComboBox<>();
        jcbProduccion1 = new javax.swing.JComboBox<>();
        jcbMaduracion1 = new javax.swing.JComboBox<>();
        jbActBusGanado = new javax.swing.JButton();
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

        jLabel1.setText("Registro ganado");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jPanel1.add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 230, -1));
        jPanel1.add(jtfArete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 230, -1));
        jPanel1.add(jtfPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 230, -1));

        jcbSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Saludable", "Enfermedad débil", "Enfermedad Media", "Enfermedd grave", "Crítica" }));
        jPanel1.add(jcbSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 230, -1));

        jcbProduccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "En producción", "Vendida", "Seca" }));
        jPanel1.add(jcbProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, -1));

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Genero", "M", "H" }));
        jPanel1.add(jcbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 230, -1));

        jcbMaduracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ternera", "Vacona", "Vaca" }));
        jPanel1.add(jcbMaduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 230, -1));

        jbRegGanado.setText("Registrar");
        jbRegGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegGanadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel49.setText("jLabel12");

        javax.swing.GroupLayout PantallaInicialLayout = new javax.swing.GroupLayout(PantallaInicial);
        PantallaInicial.setLayout(PantallaInicialLayout);
        PantallaInicialLayout.setHorizontalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jTabbedPane1.addTab("Registro de ganado", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Actualización de ganado");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        jtfActArete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfActAreteActionPerformed(evt);
            }
        });
        jPanel2.add(jtfActArete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 230, -1));

        jtfActPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfActPartosActionPerformed(evt);
            }
        });
        jPanel2.add(jtfActPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 230, -1));

        jbActGanado.setText("Registrar");
        jPanel2.add(jbActGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jcbSalud1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Saludable", "Enfermedad débil", "Enfermedad Media", "Enfermedd grave", "Crítica" }));
        jPanel2.add(jcbSalud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 230, -1));

        jcbProduccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "En producción", "Vendida", "Seca" }));
        jPanel2.add(jcbProduccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 230, -1));

        jcbMaduracion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ternera", "Vacona", "Vaca" }));
        jPanel2.add(jcbMaduracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 230, -1));

        jbActBusGanado.setText("Buscar");
        jbActBusGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActBusGanadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbActBusGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de ganado", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Consulta de ganado");
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

    private void jtfActAreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfActAreteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfActAreteActionPerformed

    private void jtfActPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfActPartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfActPartosActionPerformed

    private void jbRegGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegGanadoActionPerformed
        //Validacion de estar vacio
        if(jtfArete.getText().matches("")||jtfPartos.getText().matches("")||jtfRaza.getText().matches("")||jcbSalud.getSelectedIndex()==0||jcbProduccion.getSelectedIndex()==0||jcbGenero.getSelectedIndex()==0||jcbMaduracion.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(null, "Llenar atributo(s) vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
             //Validacion de formato
            if(num(jtfArete.getText())==true && num(jtfPartos.getText())==true && alf(jtfRaza.getText())==true&&  counter(jtfRaza.getText())<=20 &&Integer.parseInt(jtfPartos.getText())>=0&&Integer.parseInt(jtfPartos.getText())<=5){
               
            //    con.insert("POR RELLENAR", "userEmpleado", "userEmpleado");
               JOptionPane.showMessageDialog(null, "Registro de Ganado Exitoso", "Accion Exitosa", JOptionPane.INFORMATION_MESSAGE);
               
               
           }else{
                JOptionPane.showMessageDialog(null, "Formato de Atributo(s) Invalido", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_jbRegGanadoActionPerformed

    private void jbActBusGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActBusGanadoActionPerformed
        if(jtfArete.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Atributo arete de ganado en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //BUSQUEDA CON LA BASE DE DATOS
            
        }
    }//GEN-LAST:event_jbActBusGanadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbActBusGanado;
    private javax.swing.JButton jbActGanado;
    private javax.swing.JButton jbRegGanado;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JComboBox<String> jcbMaduracion;
    private javax.swing.JComboBox<String> jcbMaduracion1;
    private javax.swing.JComboBox<String> jcbProduccion;
    private javax.swing.JComboBox<String> jcbProduccion1;
    private javax.swing.JComboBox<String> jcbSalud;
    private javax.swing.JComboBox<String> jcbSalud1;
    private javax.swing.JTextField jtfActArete;
    private javax.swing.JTextField jtfActPartos;
    private javax.swing.JTextField jtfArete;
    private javax.swing.JTextField jtfPartos;
    private javax.swing.JTextField jtfRaza;
    // End of variables declaration//GEN-END:variables
}
