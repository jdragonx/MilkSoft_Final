/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduccionGUI;

import Codes.Validacion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonhe
 */
public class Ordeno extends javax.swing.JPanel {

    private Connection conec = Conexiones.Conexion.getConexion("userAc", "userAc");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");

    /**
     * Creates new form Ordeño
     */
    public Ordeno() {
        initComponents();
        jornada();
        jTextFieldFechaOrdeño.setText(java.time.LocalDate.now().toString());
        //jTextFieldJornada.setText(dtf.format(java.time.LocalDateTime.now()));     
    }

    public void jornada(){
                Calendar  calendario = Calendar.getInstance();
                 int hora= calendario.get(Calendar.HOUR_OF_DAY);
                  if(hora > 12  ){ 
              
              jTextFieldJornada.setText("T"); 
              
          }else {
              jTextFieldJornada.setText("M"); 
          }
        
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldArerte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListArete = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCantidaLeche = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFechaOrdeño = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldJornada = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PantallaInicial = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        calendarPanel3 = new com.github.lgooddatepicker.components.CalendarPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();

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

        jLabel1.setText("Registro de ordeño del ganado");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 97, -1, -1));

        jLabel2.setText("Arete de ganado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 144, -1, -1));

        jTextFieldArerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldArerteActionPerformed(evt);
            }
        });
        jTextFieldArerte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldArerteKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldArerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 141, 176, -1));

        jListArete.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListArete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListAreteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListArete);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 179, 176, 173));

        jLabel4.setText("Cantidad de leche");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));
        jPanel1.add(jTextFieldCantidaLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 176, -1));

        jLabel6.setText("Fecha de ordeño");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jTextFieldFechaOrdeño.setEditable(false);
        jTextFieldFechaOrdeño.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldFechaOrdeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 176, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jTextFieldJornada.setEditable(false);
        jTextFieldJornada.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextFieldJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 176, -1));

        jLabel16.setText("Jornada");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

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

        jPanel1.add(PantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 850));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel32.setText("jLabel12");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Registro de ordeño", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Arete de ganado");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jLabel9.setText("Fecha de registro");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel10.setText("Actualización de ordeño del ganado");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 176, 110));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 176, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, -1, -1));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));
        jPanel4.add(calendarPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Jornada", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 90));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel31.setText("jLabel12");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Actualización de ordeño", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Buscar");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Consulta individual de ordeño");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 67, -1, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 176, -1));

        jLabel3.setText("Arete de ganado");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha de ordeño", "Cantidad", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 160));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel30.setText("jLabel12");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Consulta individual", jPanel2);

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldArerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldArerteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldArerteActionPerformed

    private void jTextFieldArerteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldArerteKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
          
           if( !Validacion.num(jTextFieldArerte.getText() )){
               JOptionPane.showMessageDialog(null, " Fomato de arete erróneo"," Error Message",JOptionPane.ERROR_MESSAGE);
             } else if(!model.contains(jTextFieldArerte.getText())){ 
               model.addElement(jTextFieldArerte.getText());
                jListArete.setModel(model);
                 
             }
           
           jTextFieldArerte.setText("");
        }







        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldArerteKeyPressed

    private void jListAreteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListAreteKeyPressed

        if( evt.getKeyCode()== KeyEvent.VK_DELETE){
            model.remove(jListArete.getSelectedIndex());
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_jListAreteKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
     String fecha = dtf1.format(java.time.LocalDate.now());
        String  cantidadLeche = jTextFieldCantidaLeche.getText();
        String  jornada= jTextFieldJornada.getText();
        
        
        
 
        
            boolean reg= true;
           
          
            
        
          if( model.isEmpty()){
              JOptionPane.showMessageDialog(null, "Lista de aretes de ganado vacia", " Error Message", JOptionPane.ERROR_MESSAGE);
              reg = false;
          }  
          if(jTextFieldCantidaLeche.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Cantidad de leche vacia","Error Message ",JOptionPane.ERROR_MESSAGE);
              reg = false;
  
          }
          if(!Validacion.num(jTextFieldCantidaLeche.getText())){
              
              JOptionPane.showMessageDialog(null,"Formato de cantidad de erronéo"," Error Message",JOptionPane.ERROR_MESSAGE);
              reg= false;
              
          }
        
          
          if(reg){
              try{
                  
                  String sql = "insert into ORDENO values ( '"+fecha+"','"+cantidadLeche+"' , '"+jornada+"')";
                  //String sql = "insert into ORDENO values ( '"+fecha+"','"+cantidadLeche+"' , '"+jornada+"')";
                  conec.createStatement().executeUpdate(sql);
                  Enumeration aretes = model.elements();
                  while (aretes.hasMoreElements()){
                     
                      sql= "insert into HISTORIALORDENO  values ('"+aretes.nextElement()+"','"+fecha+"','"+jornada+"') ";
                      conec.createStatement().executeUpdate(sql);
                      
                  }
                      JOptionPane.showMessageDialog(null, "Registro exitoso", "Succes Message", JOptionPane.INFORMATION_MESSAGE);

                  
              } catch (SQLException ex){
                                  Logger.getLogger(Alimentacion.class.getName()).log(Level.SEVERE, null, ex);

              }
              
          }   
          
        











        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


      private javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaInicial;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jListArete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldArerte;
    private javax.swing.JTextField jTextFieldCantidaLeche;
    private javax.swing.JTextField jTextFieldFechaOrdeño;
    private javax.swing.JTextField jTextFieldJornada;
    // End of variables declaration//GEN-END:variables
}
