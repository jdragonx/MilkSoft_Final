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
public class Inseminacion extends javax.swing.JPanel {

    /**
     * Creates new form Inseminacio
     */
    public Inseminacion() {
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();

        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 850));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1000, 750));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel29.setText("jLabel12");

        javax.swing.GroupLayout PantallaInicialLayout = new javax.swing.GroupLayout(PantallaInicial);
        PantallaInicial.setLayout(PantallaInicialLayout);
        PantallaInicialLayout.setHorizontalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PantallaInicialLayout.setVerticalGroup(
            PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(PantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PantallaInicialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel1.setText("Registro de inseminación del ganado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 40, -1, -1));

        jLabel2.setText("Arete de ganado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 87, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 84, 176, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 122, 176, 173));

        jLabel6.setText("Fecha de alimentación");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton1.setText("Registrar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, -1, -1));

        jLabel30.setText("Detalle");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 185, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 170));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Registro de inseminación", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 84, 176, -1));

        jLabel3.setText("Arete de ganado");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 87, -1, -1));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fecha 1", "Fecha 2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 122, 176, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane8.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 260, 170));

        jLabel31.setText("Detalle");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jLabel4.setText("Fechas de registro");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel8.setText("Actualización de inseminación");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Actualización de inseminación", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Consulta de inseminación");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel7.setText("Arete");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha de inseminación", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, 270));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, -1));

        jButton3.setText("Consultar");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Consulta de inseminación", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
