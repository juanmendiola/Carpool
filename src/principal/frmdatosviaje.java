
package principal;

import conexion.conexionmysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static principal.frmlogin.usuariogmail;


public class frmdatosviaje extends javax.swing.JFrame {
conexion.conexionmysql con=new conexionmysql();
    Connection cn=con.conectar();
    public frmdatosviaje() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JBpago = new javax.swing.JComboBox<>();
        JBtrayecto = new javax.swing.JComboBox<>();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txthora = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JBbarrio = new javax.swing.JComboBox<>();
        JBmunicipio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Seleccione el barrio o municipio donde vive");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBpago.setBackground(new java.awt.Color(204, 204, 204));
        JBpago.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBpago.setForeground(new java.awt.Color(0, 0, 0));
        JBpago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forma de pago", "Efectivo", "Consignación" }));
        JBpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpagoActionPerformed(evt);
            }
        });
        jPanel2.add(JBpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));

        JBtrayecto.setBackground(new java.awt.Color(204, 204, 204));
        JBtrayecto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBtrayecto.setForeground(new java.awt.Color(0, 0, 0));
        JBtrayecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de trayecto", "Casa -> Universidad", "Universidad -> Casa" }));
        JBtrayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtrayectoActionPerformed(evt);
            }
        });
        jPanel2.add(JBtrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 210, -1));

        txtfecha.setBackground(new java.awt.Color(204, 204, 204));
        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setToolTipText("");
        txtfecha.setDateFormatString("yyyy-MM-dd");
        txtfecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel2.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese la hora");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione la fecha");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        txthora.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txthora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txthora.setCaretColor(new java.awt.Color(255, 255, 255));
        txthora.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txthora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });
        jPanel2.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione el barrio o municipio donde vive");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar viaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 150, -1));

        JBbarrio.setBackground(new java.awt.Color(204, 204, 204));
        JBbarrio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBbarrio.setForeground(new java.awt.Color(0, 0, 0));
        JBbarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barrios", "No Aplica", "Popular", "Manrique", "Aranjuez", "Castilla", "12 de octubre", "Robledo", "Villa Hermosa", "Buenos Aires", "La Candelaria", "Laureles", "La America", "San Javier", "El poblado", "Guayabal", "Belen" }));
        JBbarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbarrioActionPerformed(evt);
            }
        });
        jPanel2.add(JBbarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, -1));

        JBmunicipio.setBackground(new java.awt.Color(204, 204, 204));
        JBmunicipio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBmunicipio.setForeground(new java.awt.Color(0, 0, 0));
        JBmunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipios", "No Aplica", "Envigado", "Sabaneta", "La Estrella", "Bello", "Copacabana", " " }));
        JBmunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmunicipioActionPerformed(evt);
            }
        });
        jPanel2.add(JBmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-12 114853.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 220));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d1320ba22d23843cab56829012a0f075 (4).jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtrayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtrayectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtrayectoActionPerformed

    private void JBpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBpagoActionPerformed

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed

    }//GEN-LAST:event_txthoraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String barrio = JBbarrio.getSelectedItem().toString();
    String municipio = JBmunicipio.getSelectedItem().toString();
    String pago = JBpago.getSelectedItem().toString();
    String trayecto = JBtrayecto.getSelectedItem().toString();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = txtfecha.getDate();
        String fecha = formatter.format(date);
        String hora = txthora.getText();
    try {
        String usuario = "SELECT id_usuario FROM usuarios WHERE correo='" + usuariogmail + "'";
        System.out.println(usuario);
        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery(usuario);
        rs.next();
        int id_usuario = rs.getInt("id_usuario");

        String consultar = "INSERT INTO fechayhorapasajero (pago, trayecto, fecha, hora, barrio, municipio, id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = cn.prepareStatement(consultar);
        ps.setString(1, pago);
        ps.setString(2, trayecto);
        ps.setString(3, fecha);
        ps.setString(4, hora);
        ps.setString(5, barrio);
        ps.setString(6, municipio);
        ps.setInt(7, id_usuario);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Informacion enviada correctamente");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Se presento un error al enviar la informacion" + e);
        System.out.println("error"+e);
    }
    
    if (pago.equals("Forma de pago") || trayecto.equals("Seleccione el tipo de trayecto")) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una opción válida para los campos de pago o trayecto.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (barrio.equals("Barrios")||municipio.equals("Municipios")) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una opción válida para los campos de Barrio o Municipio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    }
     this.setVisible(false);
        frmmostarconductor fr = new frmmostarconductor();
        fr.setVisible(true);
    try {
        Date fechaSeleccionada = txtfecha.getDate();
        System.out.println("fecha:"+fechaSeleccionada);
        // Obtener el valor ingresado por el usuario en el campo de texto
        String horaIngresada = txthora.getText();

        // Dividir la hora ingresada en horas y minutos
        String[] partesHora = horaIngresada.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);

        // Verificar si la hora ingresada es válida (entre 00:00 y 23:59)
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            // La hora ingresada es válida
            System.out.println("Hora válida: " + horaIngresada);
        } else {
            // La hora ingresada es inválida
            JOptionPane.showMessageDialog(this, "El rango de hora ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            txthora.setText("");
        }
    } catch (Exception e) {
        // Ocurrió un error al tratar de obtener o procesar la hora ingresada
        JOptionPane.showMessageDialog(this, "Ocurrió un error al procesar la hora ingresada. Por favor, ingrese una hora válida.", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error: " + e.getMessage());
    }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBmunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBmunicipioActionPerformed

    private void JBbarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBbarrioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        frmseleccionarperfil fr = new frmseleccionarperfil();
        fr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmdatosviaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdatosviaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdatosviaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdatosviaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdatosviaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> JBbarrio;
    public javax.swing.JComboBox<String> JBmunicipio;
    public javax.swing.JComboBox<String> JBpago;
    public javax.swing.JComboBox<String> JBtrayecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    public com.toedter.calendar.JDateChooser txtfecha;
    public javax.swing.JFormattedTextField txthora;
    // End of variables declaration//GEN-END:variables
}
