/*XD*/package Interfaces;

import Auditoria.Auditoria;

import static Codes.Validacion.counter;
import static Codes.Validacion.num;
import static Codes.Validacion.unicode;
import Conexiones.Conexion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    String val = "";
    Conexion conec;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.conec = new Conexion();
        Modulo mod;
        Auditoria aud;

    }

    public void iniciar() {
        String val="";

        val = conec.ingLogin(Usuario.getText(), Pass.getText());
        System.out.print("\nVAL ES: " + val);
        if (val!= "") {
            JOptionPane.showMessageDialog(null, "Ingreso al Sistema Exitoso","Mensaje", JOptionPane.INFORMATION_MESSAGE);
            if (val.matches("4")) {
                this.setEnabled(false);
                new Auditoria().setVisible(true);
            } else {
                this.setEnabled(false);
                new Modulo(val).setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login o Contraseña Invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Usuario.setText("");
        Pass.setText("");
        val="";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jbLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MilkSoft ingreso al sistema");
        setMaximumSize(new java.awt.Dimension(465, 735));
        setMinimumSize(new java.awt.Dimension(465, 735));
        setPreferredSize(new java.awt.Dimension(465, 735));
        setSize(new java.awt.Dimension(465, 735));
        getContentPane().setLayout(null);
        getContentPane().add(Usuario);
        Usuario.setBounds(220, 350, 150, 30);
        getContentPane().add(Pass);
        Pass.setBounds(220, 410, 150, 30);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 550, 120, 30);

        jbLogin.setText("ENTRAR");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbLogin);
        jbLogin.setBounds(90, 550, 120, 30);

        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(465, 710));
        jLabel5.setMinimumSize(new java.awt.Dimension(465, 710));
        jLabel5.setPreferredSize(new java.awt.Dimension(465, 710));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 450, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        new Modulo(val).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        if(Usuario.getText().matches("") || Pass.getText().matches("")){
                     JOptionPane.showMessageDialog(null, "Llenar atributo(s) en blanco","Error", JOptionPane.ERROR_MESSAGE);  
                     Usuario.setText("");
        Pass.setText("");
        }else{
            if(counter(Usuario.getText())<=20&&counter(Pass.getText())<=128  && counter(Pass.getText())>=8 && unicode(Usuario.getText()) &&unicode(Pass.getText()) ){
               

                      iniciar();
                
            }else{
                JOptionPane.showMessageDialog(null, "Login o Contraseña Invalido","Error", JOptionPane.ERROR_MESSAGE);  
                Usuario.setText("");
        Pass.setText("");
            }
        }
        
    }//GEN-LAST:event_jbLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbLogin;
    // End of variables declaration//GEN-END:variables
}
