
package Interfaces;

import AdministracionUsuariosGUI.Administracion;
import Auditoria.Auditoria;
import EmpleadosGUI.Empleados;
import InventarioGUI.Productos;
import InventarioGUI.Proveedores;
import ProduccionGUI.Alimentacion;
import ProduccionGUI.Ganado;
import ProduccionGUI.Inseminacion;
import ProduccionGUI.Ordeño;
import SaludGUI.Veterinario;
import SaludGUI.CitaVeterinaria;
import SaludGUI.Enfermedades;
import VentasGUI.Clientes;
import VentasGUI.GanadoVenta;
import VentasGUI.LecheVenta;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;



public class Modulo extends javax.swing.JFrame {

    private Dimension size;


    public Modulo(String val) {
        Resolution();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
 
        if (val.matches("2")) {
            jmProduccion.setVisible(false);
            jmAdministracion.setVisible(false);
            jmSalud.setVisible(false);
            jmInventario.setVisible(false);
        }
        if (val.matches("3")) {
            jmEmpleados.setVisible(false);
            jmAdministracion.setVisible(false);
            jmVentas.setVisible(false);
            
        } 
        
    }

    private void Resolution() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

        int taskBar = screenSize.height - winSize.height;
        screenSize.height = screenSize.height - taskBar;

        if (screenSize.width > 1130) {
            screenSize.width = 1130;
        }
        if (screenSize.height > 866) {
            screenSize.height = 866;
        }
        size = screenSize;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jmProduccion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmSalud = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jmEmpleados = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MilkSoft");
        setLocationByPlatform(true);
        setMinimumSize(size);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 795));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 795));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 795));

        jPanel4.setMaximumSize(new java.awt.Dimension(1000, 795));
        jPanel4.setMinimumSize(new java.awt.Dimension(1000, 795));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/principal.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jScrollPane2.setViewportView(jPanel1);

        jmArchivo.setText("Archivo");

        jMenuItem13.setText("Cerrar sesión");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jmArchivo.add(jMenuItem13);

        jMenuBar1.add(jmArchivo);

        jmProduccion.setText("Producción");

        jMenuItem1.setText("Ganado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmProduccion.add(jMenuItem1);

        jMenuItem2.setText("Alimentación");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmProduccion.add(jMenuItem2);

        jMenuItem4.setText("Inseminación");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmProduccion.add(jMenuItem4);

        jMenuItem5.setText("Ordeño");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmProduccion.add(jMenuItem5);

        jMenuBar1.add(jmProduccion);

        jmSalud.setText("Salud");

        jMenuItem6.setText("Enfermedades");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmSalud.add(jMenuItem6);

        jMenuItem8.setText("Consulta Veterinaria");
        jmSalud.add(jMenuItem8);

        jMenuItem7.setText("Veterinarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmSalud.add(jMenuItem7);

        jMenuBar1.add(jmSalud);

        jmInventario.setText("Inventario");

        jMenuItem18.setText("Proveedores");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jmInventario.add(jMenuItem18);

        jMenuItem3.setText("Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmInventario.add(jMenuItem3);

        jMenuBar1.add(jmInventario);

        jmVentas.setText("Ventas");
        jmVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVentasActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Clientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jmVentas.add(jMenuItem10);

        jMenuItem12.setText("Venta Ganado");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jmVentas.add(jMenuItem12);

        jMenuItem11.setText("Venta Leche");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jmVentas.add(jMenuItem11);

        jMenuBar1.add(jmVentas);

        jmEmpleados.setText("Empleados");

        jMenuItem14.setText("Empleados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jmEmpleados.add(jMenuItem14);

        jMenuBar1.add(jmEmpleados);

        jmAdministracion.setText("Administración");

        jMenuItem16.setText("Administración Usuarios");
        jMenuItem16.setToolTipText("");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jmAdministracion.add(jMenuItem16);

        jMenuBar1.add(jmAdministracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVentasActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_jmVentasActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Clientes());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new GanadoVenta());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new LecheVenta());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Empleados());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Administracion());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Proveedores());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Productos());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Ganado());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Alimentacion());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Inseminacion());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Ordeño());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new Enfermedades());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(new CitaVeterinaria());
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmEmpleados;
    private javax.swing.JMenu jmInventario;
    private javax.swing.JMenu jmProduccion;
    private javax.swing.JMenu jmSalud;
    private javax.swing.JMenu jmVentas;
    // End of variables declaration//GEN-END:variables
}
