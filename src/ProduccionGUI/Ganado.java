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
import static Conexiones.Conexion.getConexion;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ganado extends javax.swing.JPanel {

    Conexion con = new Conexion();
    String[] itemM = new String[]{" ", "Ternero"};
    String[] itemH = new String[]{" ", "Ternera", "Vacona", "Vaca"};

    public Ganado() {
        initComponents();
        jcbParto.setEnabled(false);
        jcbMaduracion.setEnabled(false);
        jbActGanado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jcbParto = new javax.swing.JComboBox<>();
        jrbH = new javax.swing.JRadioButton();
        jrbM = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbRaza = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfArete = new javax.swing.JTextField();
        jcbSalud = new javax.swing.JComboBox<>();
        jcbProduccion = new javax.swing.JComboBox<>();
        jcbMaduracion = new javax.swing.JComboBox<>();
        jbRegGanado = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfActArete = new javax.swing.JTextField();
        jbActGanado = new javax.swing.JButton();
        jcbActParto = new javax.swing.JComboBox<>();
        jcbActProducion = new javax.swing.JComboBox<>();
        jcbMaduracion1 = new javax.swing.JComboBox<>();
        jbActBusGanado = new javax.swing.JButton();
        jcbActSalud = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jbConsultaGanado = new javax.swing.JButton();
        jtfConsultaGanado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
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

        jcbParto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0", "1", "2", "3", "4", "5" }));
        jPanel1.add(jcbParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 230, -1));

        jrbH.setText("H");
        jrbH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHActionPerformed(evt);
            }
        });
        jPanel1.add(jrbH, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jrbM.setText("M");
        jrbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMActionPerformed(evt);
            }
        });
        jPanel1.add(jrbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Ganado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel2.setText("Arete");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel3.setText("Número de partos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel4.setText("Raza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel5.setText("Estado de salud");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jcbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Jersey cattle", "Holstein Friesian cattle" }));
        jPanel1.add(jcbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 230, -1));

        jLabel6.setText("Estado de producción");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel7.setText("Género");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel8.setText("Maduración");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jtfArete.setEnabled(false);
        jPanel1.add(jtfArete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 230, -1));

        jcbSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Saludable", "Enfermedad débil", "Enfermedad Media", "Enfermedd grave", "Crítica" }));
        jPanel1.add(jcbSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 230, -1));

        jcbProduccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "En producción", "Vendida", "Seca" }));
        jPanel1.add(jcbProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, -1));

        jPanel1.add(jcbMaduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 230, -1));

        jbRegGanado.setText("Registrar");
        jbRegGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegGanadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Registro de ganado", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jPanel2.add(jtfActArete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 230, -1));

        jbActGanado.setText("Actualizar");
        jbActGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActGanadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbActGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jcbActParto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0", "1", "2", "3", "4", "5" }));
        jcbActParto.setEnabled(false);
        jPanel2.add(jcbActParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 230, -1));

        jcbActProducion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "En producción", "Vendida", "Seca" }));
        jcbActProducion.setEnabled(false);
        jPanel2.add(jcbActProducion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 230, -1));

        jcbMaduracion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Ternera", "Vacona", "Vaca" }));
        jcbMaduracion1.setEnabled(false);
        jPanel2.add(jcbMaduracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 230, -1));

        jbActBusGanado.setText("Buscar");
        jbActBusGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActBusGanadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbActBusGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jcbActSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Saludable", "Enfermedad débil", "Enfermedad Media", "Enfermedd grave", "Crítica" }));
        jcbActSalud.setEnabled(false);
        jPanel2.add(jcbActSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 230, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de ganado", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Consulta de Ganado");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel16.setText("Arete");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jbConsultaGanado.setText("Consultar");
        jbConsultaGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaGanadoActionPerformed(evt);
            }
        });
        jPanel3.add(jbConsultaGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
        jPanel3.add(jtfConsultaGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 150, -1));

        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arete", "Raza", "Numero de Partos", "Estado de Salud", "Estado de Produccion", "Genero", "Maduracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtUsers);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 830, 300));

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
        //LLENAR PARA NUEVO GANAD EL IDENTIFICADOR
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {
            PantallaInicial.setVisible(false);
        } else if (jTabbedPane1.getSelectedIndex() != 0) {
            PantallaInicial.setVisible(false);
        }
        String text = Integer.toString(Integer.parseInt(con.Consulta1Value("exec getLastArete")) + 1);
        jtfArete.setText(text);

        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jbRegGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegGanadoActionPerformed
        //Validacion de estar vacio
        //(jrbM.isSelected()==false && jrbH.isSelected()==true)||(jrbM.isSelected()==true && jrbH.isSelected()==false)
        if (jrbM.isSelected()) {
            if (jcbParto.getSelectedIndex() == 0 || jcbRaza.getSelectedIndex() == 0 || jcbSalud.getSelectedIndex() == 0
                    || jcbProduccion.getSelectedIndex() == 0 || jcbMaduracion.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Llenar atributo(s) vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (jrbM.isSelected()) {
                    con.insert("exec insGanado @parto =" + Integer.parseInt(jcbParto.getSelectedItem().toString()) + ",@raza ='"
                            + jcbRaza.getSelectedItem().toString() + "', @salud ='" + jcbSalud.getSelectedItem().toString() + "',@prod ='"
                            + jcbProduccion.getSelectedItem().toString() + "', @genero ='" + jrbM.getText() + "', @mad ='"
                            + jcbMaduracion.getSelectedItem().toString() + "'");

                    JOptionPane.showMessageDialog(null, "Registro de Ganado Exitoso", "Accion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    jcbParto.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    String text = Integer.toString(Integer.parseInt(con.Consulta1Value("exec getLastArete")) + 1);
                    jtfArete.setText(text);
                    jcbParto.setEnabled(false);
                    jcbMaduracion.setEnabled(false);
                    jcbParto.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.removeAll();
                    jrbM.setSelected(false);
                    jrbH.setSelected(false);
                } else {
                    con.insert("exec insGanado @parto =" + Integer.parseInt(jcbParto.getSelectedItem().toString()) + ",@raza ='"
                            + jcbRaza.getSelectedItem().toString() + "', @salud ='" + jcbSalud.getSelectedItem().toString() + "',@prod ='"
                            + jcbProduccion.getSelectedItem().toString() + "', @genero ='" + jrbH.getText() + "', @mad ='"
                            + jcbMaduracion.getSelectedItem().toString() + "'");

                    JOptionPane.showMessageDialog(null, "Registro de Ganado Exitoso", "Accion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    jcbParto.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    String text = Integer.toString(Integer.parseInt(con.Consulta1Value("exec getLastArete")) + 1);
                    jtfArete.setText(text);
                    jcbParto.setEnabled(false);
                    jcbMaduracion.setEnabled(false);
                    jcbParto.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.removeAll();
                    jrbM.setSelected(false);
                    jrbH.setSelected(false);

                }

            }
        } else if (jrbH.isSelected()) {
            if (jcbParto.getSelectedIndex() == 0 || jcbRaza.getSelectedIndex() == 0 || jcbSalud.getSelectedIndex() == 0
                    || jcbProduccion.getSelectedIndex() == 0 || jcbMaduracion.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Llenar atributo(s) vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (jrbM.isSelected()) {
                    con.insert("exec insGanado @parto =" + Integer.parseInt(jcbParto.getSelectedItem().toString()) + ",@raza ='"
                            + jcbRaza.getSelectedItem().toString() + "', @salud ='" + jcbSalud.getSelectedItem().toString() + "',@prod ='"
                            + jcbProduccion.getSelectedItem().toString() + "', @genero ='" + jrbM.getText() + "', @mad ='"
                            + jcbMaduracion.getSelectedItem().toString() + "'");

                    JOptionPane.showMessageDialog(null, "Registro de Ganado Exitoso", "Accion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    jcbParto.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    String text = Integer.toString(Integer.parseInt(con.Consulta1Value("exec getLastArete")) + 1);
                    jtfArete.setText(text);
                    jcbParto.setEnabled(false);
                    jcbMaduracion.setEnabled(false);
                    jcbParto.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.removeAll();
                    jrbM.setSelected(false);
                    jrbH.setSelected(false);
                } else {
                    con.insert("exec insGanado @parto =" + Integer.parseInt(jcbParto.getSelectedItem().toString()) + ",@raza ='"
                            + jcbRaza.getSelectedItem().toString() + "', @salud ='" + jcbSalud.getSelectedItem().toString() + "',@prod ='"
                            + jcbProduccion.getSelectedItem().toString() + "', @genero ='" + jrbH.getText() + "', @mad ='"
                            + jcbMaduracion.getSelectedItem().toString() + "'");

                    JOptionPane.showMessageDialog(null, "Registro de Ganado Exitoso", "Accion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    jcbParto.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    String text = Integer.toString(Integer.parseInt(con.Consulta1Value("exec getLastArete")) + 1);
                    jtfArete.setText(text);
                    jcbParto.setEnabled(false);
                    jcbMaduracion.setEnabled(false);
                    jcbParto.setSelectedIndex(0);
                    jcbMaduracion.setSelectedIndex(0);
                    jcbRaza.setSelectedIndex(0);
                    jcbSalud.setSelectedIndex(0);
                    jcbProduccion.setSelectedIndex(0);
                    jcbMaduracion.removeAll();
                    jrbM.setSelected(false);
                    jrbH.setSelected(false);

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Llenar atributo(s) vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbRegGanadoActionPerformed


    private void jbActBusGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActBusGanadoActionPerformed
        if (jtfActArete.getText().matches("")) {
            JOptionPane.showMessageDialog(null, "Identificador de arete de ganado en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (num(jtfActArete.getText())) {
                String arete = con.Consulta1Value("exec selGan @Arete='" + jtfActArete.getText() + "'");
                if (!arete.matches("")) {

                    jbActBusGanado.setEnabled(false);
                    jtfActArete.setEnabled(false);
                    jbActGanado.setEnabled(true);
                    String sexo = con.Consulta1Value("exec selSexGan @Arete=" + jtfActArete.getText());
                    if (sexo.matches("H")) {
                        jcbActProducion.setEnabled(true);
                        jcbMaduracion1.setEnabled(true);
                        jcbActParto.setEnabled(true);
                        jcbActSalud.setEnabled(true);
                    } else {
                        jcbActSalud.setEnabled(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Identificador Inexistente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de identificador de arete de ganado erróneo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //BUSQUEDA CON LA BASE DE DATOS

        }
    }//GEN-LAST:event_jbActBusGanadoActionPerformed

    private void jrbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMActionPerformed
        jrbH.setSelected(false);
        jcbMaduracion.setEnabled(false);
        jcbParto.setEnabled(false);
        jcbMaduracion.removeAll();
        jcbMaduracion.removeAllItems();
        for (int i = 0; i < itemM.length; i++) {
            jcbMaduracion.addItem(itemM[i]);
        }
        jcbMaduracion.setSelectedIndex(1);
        jcbParto.setSelectedIndex(1);

    }//GEN-LAST:event_jrbMActionPerformed

    private void jrbHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHActionPerformed
        jrbM.setSelected(false);
        jcbMaduracion.setEnabled(true);
        jcbParto.setEnabled(true);
        jcbMaduracion.removeAll();
        jcbMaduracion.removeAllItems();
        jcbParto.setSelectedIndex(0);
        for (int i = 0; i < itemH.length; i++) {
            jcbMaduracion.addItem(itemH[i]);
        }


    }//GEN-LAST:event_jrbHActionPerformed

    private void jbActGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActGanadoActionPerformed
        ///////
        if (jcbMaduracion1.getSelectedIndex() == 0
                && jcbActParto.getSelectedIndex() == 0
                && jcbActSalud.getSelectedIndex() == 0
                && jcbActProducion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Cambiar Atributo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String sexo = con.Consulta1Value("exec selSexGan @Arete=" + jtfActArete.getText());
            System.out.print("sexo value: " + sexo);
            if (sexo.matches("M")) {
                if (jcbMaduracion1.getSelectedIndex() > 0) {
                    con.insert("exec updGanSal @Salud='" + jcbActSalud.getSelectedItem().toString() + "',@Arete=" + jtfActArete.getText());
                }
            } else {
                if (jcbMaduracion1.getSelectedIndex() > 0) {
                    con.insert("exec updGanMad @Mad='" + jcbMaduracion1.getSelectedItem().toString() + "',@Arete=" + jtfActArete.getText());
                }
                if (jcbActParto.getSelectedIndex() > 0) {
                    con.insert("exec updGanPar @Parto=" + jcbActParto.getSelectedItem().toString() + ",@Arete=" + jtfActArete.getText());
                    System.out.print("\n\nexec updGanPar @Parto=" + jcbActParto.getSelectedItem().toString() + ",@Arete=" + jtfActArete.getText());
                    //exec updGanPar @Parto=1, @Arete=7
                }
                if (jcbActSalud.getSelectedIndex() > 0) {
                    con.insert("exec updGanSal @Salud='" + jcbActSalud.getSelectedItem().toString() + "',@Arete=" + jtfActArete.getText());
                }
                if (jcbActProducion.getSelectedIndex() > 0) {
                    con.insert("exec updGanPro @Prod='" + jcbActProducion.getSelectedItem().toString() + "',@Arete=" + jtfActArete.getText());
                    System.out.print("\n\nexec updGanPro @Prod='" + jcbActProducion.getSelectedItem().toString() + "',@Arete=" + jtfActArete.getText());
                }

            }
            JOptionPane.showMessageDialog(null, "Actualización Exitosa", "Error", JOptionPane.INFORMATION_MESSAGE);
            jcbParto.setSelectedIndex(0);
            jcbActParto.setEnabled(false);
            jcbActSalud.setEnabled(false);
            jcbActProducion.setEnabled(false);
            jcbMaduracion1.setEnabled(false);
            jcbActParto.setSelectedIndex(0);
            jcbActSalud.setSelectedIndex(0);
            jcbActProducion.setSelectedIndex(0);
            jcbMaduracion1.setSelectedIndex(0);
            jtfActArete.setEnabled(true);
            jbActBusGanado.setEnabled(true);
            jbActGanado.setEnabled(false);
            jtfActArete.setText("");
        }


    }//GEN-LAST:event_jbActGanadoActionPerformed

    private void jbConsultaGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaGanadoActionPerformed
        if (jtfConsultaGanado.getText().matches("")) {
            JOptionPane.showMessageDialog(null, "Identificador de arete de ganado en blanco", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (num(jtfConsultaGanado.getText())) {
                if (!jtfConsultaGanado.getText().matches("")) {

                    DefaultTableModel tmodel = (DefaultTableModel) jtUsers.getModel();
                    Connection conec = getConexion("userAc", "userAc");
                    ArrayList<ArrayList> cow = con.ConsultaMatriz(conec, "exec conGan @id=" + jtfConsultaGanado.getText());
                    tmodel.setRowCount(0);
                    cow.get(0);
                    cow.size();

                    for (int i = 0; i <= cow.size(); i++) {
                        ArrayList<ArrayList> xd = cow.get(i);
                        Object[] objArray = xd.toArray();
                        tmodel.addRow(objArray);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Identificador Inexistente", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato de identificador de arete de ganado erróneo", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbConsultaGanadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbActBusGanado;
    private javax.swing.JButton jbActGanado;
    private javax.swing.JButton jbConsultaGanado;
    private javax.swing.JButton jbRegGanado;
    private javax.swing.JComboBox<String> jcbActParto;
    private javax.swing.JComboBox<String> jcbActProducion;
    private javax.swing.JComboBox<String> jcbActSalud;
    private javax.swing.JComboBox<String> jcbMaduracion;
    private javax.swing.JComboBox<String> jcbMaduracion1;
    private javax.swing.JComboBox<String> jcbParto;
    private javax.swing.JComboBox<String> jcbProduccion;
    private javax.swing.JComboBox<String> jcbRaza;
    private javax.swing.JComboBox<String> jcbSalud;
    private javax.swing.JRadioButton jrbH;
    private javax.swing.JRadioButton jrbM;
    private javax.swing.JTable jtUsers;
    private javax.swing.JTextField jtfActArete;
    private javax.swing.JTextField jtfArete;
    private javax.swing.JTextField jtfConsultaGanado;
    // End of variables declaration//GEN-END:variables
}
