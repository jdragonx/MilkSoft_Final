
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduccionGUI;

import Codes.Validacion;
import Conexiones.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jonhe
 */
public class Alimentacion extends javax.swing.JPanel {

    private Connection conec = Conexiones.Conexion.getConexion("userAc", "userAc");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");

    /**
     * Creates new form Alimento
     */
    public Alimentacion() {
        initComponents();
        jTextFieldFecha.setText(java.time.LocalDateTime.now().toLocalDate().toString());
        jTextFieldHora.setText(dtf.format(java.time.LocalDateTime.now()));
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
        jTextFieldArete = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListArete = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        calendarPanelFechaActualiza = new com.github.lgooddatepicker.components.CalendarPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableActualiza = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        calendarPanelFechaConsulta = new com.github.lgooddatepicker.components.CalendarPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 850));
        setMinimumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 750));
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

        jLabel1.setText("Registro de alimentación del ganado");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 40, -1, -1));

        jLabel2.setText("Arete de ganado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 87, -1, -1));

        jTextFieldArete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreteActionPerformed(evt);
            }
        });
        jTextFieldArete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAreteKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldArete, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 84, 176, -1));

        jListArete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListAreteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListArete);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 122, 176, 173));

        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, -1, -1));
        jPanel1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 185, -1));

        jLabel6.setText("Fecha de alimentación");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 185, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, -1, -1));

        jLabel30.setText("Detalle");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 185, -1));

        jTextAreaDetalle.setColumns(20);
        jTextAreaDetalle.setRows(5);
        jScrollPane6.setViewportView(jTextAreaDetalle);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 170));

        jLabel3.setText("Hora de alimentación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Registro de alimentación", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Fecha de registro");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel10.setText("Actualización de alimentación del ganado");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 700, -1, -1));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));
        jPanel4.add(calendarPanelFechaActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jTableActualiza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Detalle", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableActualiza);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 630, 300));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de alimentación", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Consulta por intervalos de fecha de alimentación");
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel27.setText("Fecha de registro");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));
        jPanel3.add(calendarPanelFechaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 201));

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 291, -1, -1));

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Detalle", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTableConsulta);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 325, 670, 337));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Consulta por de fecha de alimentación", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean act = true;
        for (int i = 0; i < jTableActualiza.getRowCount(); i++) {
            String detalle = jTableActualiza.getValueAt(i, 2).toString();
            String cantidad = jTableActualiza.getValueAt(i, 3).toString();
            String fecha = jTableActualiza.getValueAt(i, 0).toString();
            String hora = jTableActualiza.getValueAt(i, 1).toString();
            if (detalle.equals("")) {
                JOptionPane.showMessageDialog(null, "Atributo detalle de alimento en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
                act = false;
            }

            if (!Validacion.alfesp(detalle.toString()) || Validacion.counter(jTextAreaDetalle.getText()) > 50) {
                JOptionPane.showMessageDialog(null, "Formato de detalle de alimento erróneo", "Error Message", JOptionPane.ERROR_MESSAGE);
                act = false;
            }

            if (cantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Atributo cantidad en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
                act = false;
            }

            if (!Validacion.numDec(cantidad)) {
                JOptionPane.showMessageDialog(null, "Formato de cantidad erróneo", "Error Message", JOptionPane.ERROR_MESSAGE);
                act = false;
            }

            if (act) {
                try {
                    String sql = "update ALIMENTACION set DETALLE='" + detalle + "', CANTIDAD=" + cantidad + " where FECHAHORAALIMENTACION='" + fecha + " " + hora
                            + "'";
                    conec.createStatement().executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Actualización exitosa", "Succes Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(Alimentacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 0 && jPanel1.getX() > evt.getX() && 31 > evt.getY()) {
            PantallaInicial.setVisible(false);
        } else if (jTabbedPane1.getSelectedIndex() != 0) {
            PantallaInicial.setVisible(false);
        }

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextFieldAreteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAreteKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String arete = jTextFieldArete.getText();
            String sql = "select arete from ganado where ganado.arete=" + arete;
            if (arete.isEmpty()) {
                sql = "select arete from ganado where ganado.arete=0";
            }
            ArrayList<ArrayList> query = Conexion.ConsultaMatriz(conec, sql);
            if (!Validacion.num(arete)) {
                JOptionPane.showMessageDialog(null, "Formato de arete erróneo’", "Error Message", JOptionPane.ERROR_MESSAGE);
            } else if (query.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Arete inexistente’", "Error Message", JOptionPane.ERROR_MESSAGE);
            } else if (!model.contains(jTextFieldArete.getText()) && !jTextFieldArete.getText().equals("")) {
                model.addElement(jTextFieldArete.getText());
                jListArete.setModel(model);
            }
            jTextFieldArete.setText("");
        }

    }//GEN-LAST:event_jTextFieldAreteKeyPressed

    private void jListAreteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListAreteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            model.remove(jListArete.getSelectedIndex());
        }
    }//GEN-LAST:event_jListAreteKeyPressed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldAreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAreteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean reg = true;
        String fecha = dtf1.format(java.time.LocalDate.now());
        String hora = dtf.format(java.time.LocalDateTime.now());
        String detalle = jTextAreaDetalle.getText();
        String cantidad = jTextFieldCantidad.getText();

        if (model.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista de aretes de ganado vacía", "Error Message", JOptionPane.ERROR_MESSAGE);
            reg = false;
        }
        if (detalle.equals("")) {
            JOptionPane.showMessageDialog(null, "Atributo detalle de alimento en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
            reg = false;
        }

        if (!Validacion.alfesp(detalle) || Validacion.counter(detalle) > 50) {
            JOptionPane.showMessageDialog(null, "Formato de detalle de alimento erróneo", "Error Message", JOptionPane.ERROR_MESSAGE);
            reg = false;
        }

        if (cantidad.equals("")) {
            JOptionPane.showMessageDialog(null, "Atributo cantidad en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
            reg = false;
        }

        if (!Validacion.numDec(cantidad)) {
            JOptionPane.showMessageDialog(null, "Formato de cantidad erróneo", "Error Message", JOptionPane.ERROR_MESSAGE);
            reg = false;
        }

        if (reg) {
            try {
                String sql = "insert into alimentacion values ('" + fecha + " " + hora + "','" + detalle + "','" + cantidad + "')";
                conec.createStatement().executeUpdate(sql);

                Enumeration aretes = model.elements();
                while (aretes.hasMoreElements()) {
                    sql = "insert into historialalimentacion values('" + fecha + " " + hora + "','" + aretes.nextElement() + "')";
                    conec.createStatement().executeUpdate(sql);
                }

                JOptionPane.showMessageDialog(null, "Registro exitoso", "Succes Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Alimentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel) jTableActualiza.getModel();
        tmodel.setRowCount(0);
        if (calendarPanelFechaActualiza.getSelectedDate() == null) {
            JOptionPane.showMessageDialog(null, "Fecha de alimentación en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {

            String fecha = calendarPanelFechaActualiza.getSelectedDate().format(dtf1);
            String sql = "select * from ALIMENTACION where FECHAHORAALIMENTACION between '" + fecha + "' and '" + fecha + " 23:59:59'";
            ArrayList<ArrayList> query = Conexion.ConsultaMatriz(conec, sql);
            for (int i = 0; i < query.size(); i++) {
                ArrayList<String> aux = query.get(i);
                String hora = aux.get(0).substring(11);
                ArrayList<String> aux1 = new ArrayList<String>();
                aux1.add(fecha);
                aux1.add(hora);
                aux1.add(aux.get(1));
                aux1.add(aux.get(2));
                Object[] objArray = aux1.toArray();
                tmodel.addRow(objArray);
            }
        }
        if (tmodel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha de alimentación inexistente", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel = (DefaultTableModel) jTableConsulta.getModel();
        tmodel.setRowCount(0);
        if (calendarPanelFechaConsulta.getSelectedDate() == null) {
            JOptionPane.showMessageDialog(null, "Fecha de alimentación en blanco", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            String fecha = calendarPanelFechaConsulta.getSelectedDate().format(dtf1);
            String sql = "select * from ALIMENTACION where FECHAHORAALIMENTACION between '" + fecha + "' and '" + fecha + " 23:59:59'";
            ArrayList<ArrayList> query = Conexion.ConsultaMatriz(conec, sql);
            String año = fecha.substring(0, 4);
            String mes = fecha.substring(5, 7);
            String dia = fecha.substring(8, 10);
            fecha = año + "-" + mes + "-" + dia;
            for (int i = 0; i < query.size(); i++) {
                ArrayList<String> aux = query.get(i);
                String hora = aux.get(0).toString().substring(11);
                ArrayList<String> aux1 = new ArrayList<String>();
                aux1.add(fecha);
                aux1.add(hora);
                aux1.add(aux.get(1));
                aux1.add(aux.get(2));
                Object[] objArray = aux1.toArray();
                tmodel.addRow(objArray);
            }
        }
        if (tmodel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha de alimentación inexistente", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanelFechaActualiza;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanelFechaConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListArete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableActualiza;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextArea jTextAreaDetalle;
    private javax.swing.JTextField jTextFieldArete;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}
