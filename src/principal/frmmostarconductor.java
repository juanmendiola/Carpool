
package principal;

import Clases.Conductor;
import Clases.Listado_conductores;
import java.sql.ResultSet;
import conexion.conexionmysql;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class frmmostarconductor extends javax.swing.JFrame {
conexion.conexionmysql con=new conexionmysql();
    Connection cn=con.conectar();
    public frmmostarconductor() {
        initComponents();
        setLocationRelativeTo(null);
        cargarCombo(combo_conductor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo_conductor = new javax.swing.JComboBox<>();
        Btinformacionconductor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Conductores disponibles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        combo_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_conductorActionPerformed(evt);
            }
        });
        jPanel2.add(combo_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        Btinformacionconductor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Btinformacionconductor.setText("Seleccionar conductor");
        Btinformacionconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtinformacionconductorActionPerformed(evt);
            }
        });
        jPanel2.add(Btinformacionconductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 204, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Si no encuentras un viaje a tu destino puedes volver luego");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Iniciar chat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        btnvolver.setBackground(new java.awt.Color(204, 204, 0));
        btnvolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(0, 0, 0));
        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d1320ba22d23843cab56829012a0f075 (5).jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -540, 390, 1050));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_conductorActionPerformed

    private void BtinformacionconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtinformacionconductorActionPerformed
     JOptionPane.showMessageDialog(null, "Conductor seleccionado correctamente");
     DesktopNotify.showDesktopMessage(
                "Conductor encontrado", "El conductor a aceptado tu viaje porfavor ingresa al chat",DesktopNotify.SUCCESS);
    }//GEN-LAST:event_BtinformacionconductorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        frmchatpasajero fr = new frmchatpasajero();
        fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
       this.setVisible(false);
        frmdatosviaje fr = new frmdatosviaje();
        fr.setVisible(true);
    }//GEN-LAST:event_btnvolverActionPerformed

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
            java.util.logging.Logger.getLogger(frmmostarconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmostarconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmostarconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmostarconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmostarconductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btinformacionconductor;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> combo_conductor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
    c.setModel(combo);
    Listado_conductores lc = new Listado_conductores();
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT trayecto, fecha, hora, barrio, municipio FROM fechayhoraconductor");
        while (rs.next()) {                
            Conductor con = new Conductor();
            con.setFecha(rs.getString(5));
            con.setHora(rs.getString(3));
            con.setTrayecto(rs.getString(2));
            con.setBarrio(rs.getString(1));
            con.setMunicipio(rs.getString(4));
            lc.AgregarConductores(con);
            String comboText = con.getTrayecto() + " - " + con.getBarrio()+ " - " + con.getMunicipio()+ " - " + con.getFecha() + " - " + con.getHora();
            combo.addElement(comboText);
            System.out.println("bien bien ");
        }           
    } catch (Exception e) {
        System.out.println("no se puede mostrar combo"+e);
    }
    }
}
