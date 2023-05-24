
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

public class frmdatosviajeconductor extends javax.swing.JFrame {
conexion.conexionmysql con=new conexionmysql();
    Connection cn=con.conectar();
    public frmdatosviajeconductor() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JBtrayecto = new javax.swing.JComboBox<>();
        JBbarrio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtfechaC = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txthoraC = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBmunicipio = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        JBbarrio.setBackground(new java.awt.Color(204, 204, 204));
        JBbarrio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBbarrio.setForeground(new java.awt.Color(0, 0, 0));
        JBbarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barrios", "No Aplica", "Popular", "Manrique", "Aranjuez", "Castilla", "12 de octubre", "Robledo", "Villa Hermosa", "Buenos Aires", "La Candelaria", "Laureles", "La America", "San Javier", "El poblado", "Guayabal", "Belen" }));
        JBbarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbarrioActionPerformed(evt);
            }
        });
        jPanel2.add(JBbarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione el barrio o municipio donde vive");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtfechaC.setBackground(new java.awt.Color(204, 204, 204));
        txtfechaC.setForeground(new java.awt.Color(0, 0, 0));
        txtfechaC.setToolTipText("");
        txtfechaC.setDateFormatString("yyyy-MM-dd");
        txtfechaC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel2.add(txtfechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, -1));

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

        txthoraC.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txthoraC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txthoraC.setCaretColor(new java.awt.Color(255, 255, 255));
        txthoraC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txthoraC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txthoraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraCActionPerformed(evt);
            }
        });
        jPanel2.add(txthoraC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 70, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Publicar viaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-05-12 114853.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 240));

        JBmunicipio.setBackground(new java.awt.Color(204, 204, 204));
        JBmunicipio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JBmunicipio.setForeground(new java.awt.Color(0, 0, 0));
        JBmunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipios", "No Aplica", "Envigado", "Sabaneta", "La Estrella", "Bello", "Copacabana", " " }));
        JBmunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmunicipioActionPerformed(evt);
            }
        });
        jPanel2.add(JBmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d1320ba22d23843cab56829012a0f075 (4).jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txthoraCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraCActionPerformed

    }//GEN-LAST:event_txthoraCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String barrio = JBbarrio.getSelectedItem().toString();
        String municipio = JBmunicipio.getSelectedItem().toString();
        String trayecto = JBtrayecto.getSelectedItem().toString();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = txtfechaC.getDate();
        String fecha = formatter.format(date);
        String hora = txthoraC.getText();
            try {
        String usuario = "SELECT id_usuario FROM usuarios WHERE correo='" + usuariogmail + "'";
        System.out.println(usuario);
        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery(usuario);
        rs.next();
        int id_usuario = rs.getInt("id_usuario");
        String consultar = "INSERT INTO fechayhoraconductor (trayecto, fecha, hora, barrio, municipio, id_usuario) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = cn.prepareStatement(consultar);
        ps.setString(1, trayecto);
        ps.setString(2, fecha);
        ps.setString(3, hora);
        ps.setString(4, barrio);
        ps.setString(5, municipio);
        ps.setInt(6, id_usuario);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Informacion enviada correctamente");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Se presento un error al enviar la informacion" + e);
        
       }
    if (trayecto.equals("Seleccione el tipo de trayecto")) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una opción válida para los campos de pago o trayecto.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try {
        Date fechaSeleccionada = txtfechaC.getDate();
        System.out.println("fecha:"+fechaSeleccionada);
        // Obtener el valor ingresado por el usuario en el campo de texto
        String horaIngresada = txthoraC.getText();

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
            txthoraC.setText("");
        }
    } catch (Exception e) {
        // Ocurrió un error al tratar de obtener o procesar la hora ingresada
        JOptionPane.showMessageDialog(this, "Ocurrió un error al procesar la hora ingresada. Por favor, ingrese una hora válida.", "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error: " + e.getMessage());
    }
    this.setVisible(false);
        frmmostrarusuario fr = new frmmostrarusuario();
        fr.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmdatosviajeconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdatosviajeconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdatosviajeconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdatosviajeconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdatosviajeconductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JBbarrio;
    private javax.swing.JComboBox<String> JBmunicipio;
    public javax.swing.JComboBox<String> JBtrayecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    public com.toedter.calendar.JDateChooser txtfechaC;
    public javax.swing.JFormattedTextField txthoraC;
    // End of variables declaration//GEN-END:variables
}
