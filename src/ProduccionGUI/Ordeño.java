/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduccionGUI;

/**
 *
 * @author jonhe
 */
public class Ordeño extends javax.swing.JPanel {

    /**
     * Creates new form Ordeño
     */
    public Ordeño() {
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel47 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        calendarPanel1 = new com.github.lgooddatepicker.components.CalendarPanel();
        calendarPanel2 = new com.github.lgooddatepicker.components.CalendarPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 850));
        setMinimumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1012, 750));
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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel1.setText("Registro de ordeño del ganado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 97, -1, -1));

        jLabel2.setText("Arete de ganado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 144, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 141, 176, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 179, 176, 173));

        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 399, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 396, 176, -1));

        jLabel6.setText("Fecha de registro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 475, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 472, 176, -1));

        jButton1.setText("Registrar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 577, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 510, 176, -1));

        jLabel16.setText("Jornada");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 513, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 880));

        jTabbedPane1.addTab("Registro de ordeño", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Arete de ganado");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 296, -1, -1));

        jLabel9.setText("Fecha de registro");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 162, -1, -1));

        jLabel10.setText("Actualización de ordeño del ganado");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 111, -1, -1));
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 550, 176, -1));

        jLabel12.setText("Cantidad");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 553, -1, -1));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 331, 176, 173));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 293, 176, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, -1, -1));

        jLabel15.setText("Jornada");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 202, -1, -1));

        jButton6.setText("Buscar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 166, -1));
        jPanel4.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de ordeño", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Jornada");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 179, -1, -1));

        jLabel18.setText("Fecha de registro");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 147, -1, -1));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 173, 166, -1));

        jButton4.setText("Buscar");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 211, -1, -1));
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 135, -1, -1));

        jLabel19.setText("Consulta individual de alimentación");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 67, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 535, 166, -1));

        jLabel22.setText("Arete de ganado");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 303, -1, -1));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList5.setEnabled(false);
        jScrollPane5.setViewportView(jList5);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 303, 166, 173));

        jLabel24.setText("Cantidad");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 538, -1, -1));

        jLabel25.setText("Empleado");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 576, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 573, 166, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 910));

        jTabbedPane1.addTab("Consulta individual", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Consulta por intervalos de fecha");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 11, -1, -1));

        jLabel27.setText("Fecha inicio");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 43, -1, -1));

        jLabel28.setText("Fecha fin");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 43, -1, -1));
        jPanel3.add(calendarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 75, -1, 201));
        jPanel3.add(calendarPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 75, -1, 201));

        jButton5.setText("Consultar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
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
                "Fecha", "Jornada", "Cantidad", "Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 325, 650, 337));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel49.setText("jLabel12");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Consulta por intervalos de fecha", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel1;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel2;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
