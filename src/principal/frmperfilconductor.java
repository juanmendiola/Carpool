
package principal;
import conexion.conexionmysql;
import java.sql.*;
import java.awt.Image;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static principal.frmlogin.usuariogmail;


public class frmperfilconductor extends javax.swing.JFrame {
    conexion.conexionmysql con=new conexionmysql();
    Connection cn=con.conectar();
    
    public frmperfilconductor() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmodelcarro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcolorcarro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtasientosdisponibles = new javax.swing.JTextField();
        btnregistrarcarro = new javax.swing.JButton();
        bntseleccionarfoto = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtlicencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Requisitos conductor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 17, -1, 45));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese modelo del carro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el color del carro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtmodelcarro.setBackground(new java.awt.Color(204, 204, 204));
        txtmodelcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtmodelcarro.setForeground(new java.awt.Color(0, 0, 0));
        txtmodelcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelcarroActionPerformed(evt);
            }
        });
        jPanel1.add(txtmodelcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, 165, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de asientos disponible");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 272, -1, -1));

        txtcolorcarro.setBackground(new java.awt.Color(204, 204, 204));
        txtcolorcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtcolorcarro.setForeground(new java.awt.Color(0, 0, 0));
        txtcolorcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorcarroActionPerformed(evt);
            }
        });
        jPanel1.add(txtcolorcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 165, 165, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese la placa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 204, -1, -1));

        txtplaca.setBackground(new java.awt.Color(204, 204, 204));
        txtplaca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtplaca.setForeground(new java.awt.Color(0, 0, 0));
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        jPanel1.add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 233, 165, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Foto del carro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 414, -1, -1));

        txtasientosdisponibles.setBackground(new java.awt.Color(204, 204, 204));
        txtasientosdisponibles.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtasientosdisponibles.setForeground(new java.awt.Color(0, 0, 0));
        txtasientosdisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtasientosdisponiblesActionPerformed(evt);
            }
        });
        jPanel1.add(txtasientosdisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 301, 165, -1));

        btnregistrarcarro.setBackground(new java.awt.Color(0, 153, 102));
        btnregistrarcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnregistrarcarro.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrarcarro.setText("Registrar carro");
        btnregistrarcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarcarroActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrarcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, 30));

        bntseleccionarfoto.setBackground(new java.awt.Color(204, 204, 204));
        bntseleccionarfoto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bntseleccionarfoto.setForeground(new java.awt.Color(0, 0, 0));
        bntseleccionarfoto.setText("Seleccionar foto");
        bntseleccionarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntseleccionarfotoActionPerformed(evt);
            }
        });
        jPanel1.add(bntseleccionarfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 437, -1, -1));
        jPanel1.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 467, 147, 92));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Licencia de conducción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 340, -1, -1));

        txtlicencia.setBackground(new java.awt.Color(204, 204, 204));
        txtlicencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtlicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 369, 170, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d1320ba22d23843cab56829012a0f075 (4).jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmodelcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelcarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelcarroActionPerformed

    private void txtcolorcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolorcarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolorcarroActionPerformed

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

    private void txtasientosdisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtasientosdisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtasientosdisponiblesActionPerformed

    
    private void btnregistrarcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarcarroActionPerformed

    String modelocarro=txtmodelcarro.getText();
    String colorcarro=txtcolorcarro.getText();
    String placa=txtplaca.getText();
    String asientosdisponibles=txtasientosdisponibles.getText();
    String licencia=txtlicencia.getText();
     
    
    if(modelocarro.isEmpty()||colorcarro.isEmpty()||placa.isEmpty()||asientosdisponibles.isEmpty()||licencia.isEmpty()){
        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DATOS");
    }else{
        
        try {
            String foto = null;
            
            String usuario = "SELECT id_usuario FROM usuarios WHERE correo='"+usuariogmail+"'";
            System.out.println(usuario);
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(usuario);
            rs.next();
            int id_usuario = rs.getInt("id_usuario");
           
            String consultar="INSERT INTO requisitosconductor(modelocarro,colorcarro,placa,asientosdisponibles,licencia,foto,id_usuario)VALUES('"+modelocarro+"','"+colorcarro+"','"+placa+"','"+asientosdisponibles+"','"+licencia+"','"+foto+"','"+id_usuario+"')";
            PreparedStatement ps=cn.prepareStatement(consultar);
            limpiar();
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo registrado correctamente");
            this.setVisible(false);
            frmdatosviajeconductor fr = new frmdatosviajeconductor();
            fr.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo registar el vehiculo"+e);
        }
        
    }
    }//GEN-LAST:event_btnregistrarcarroActionPerformed
    void limpiar(){
        txtmodelcarro.setText("");
        txtcolorcarro.setText("");
        txtplaca.setText("");
        txtasientosdisponibles.setText("");
        txtlicencia.setText("");;
    }
    private void bntseleccionarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntseleccionarfotoActionPerformed
    String Ruta; 
    JFileChooser jFileChooser = new JFileChooser();
    FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG","PNG","JPEG","jpg","jpeg","png" );
    jFileChooser.setFileFilter(filtrado);
    int respuesta = jFileChooser.showOpenDialog(this);
    if (respuesta == JFileChooser.APPROVE_OPTION){
        Ruta= jFileChooser.getSelectedFile().getPath();
      Image mImagen = new ImageIcon(Ruta).getImage();
      ImageIcon imageIcon = new ImageIcon(mImagen.getScaledInstance(lblimagen.getWidth(),lblimagen.getHeight(), Image.SCALE_SMOOTH));
      lblimagen.setIcon(imageIcon);
    }
    }//GEN-LAST:event_bntseleccionarfotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        frmseleccionarperfil fr = new frmseleccionarperfil();
        fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmperfilconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmperfilconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmperfilconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmperfilconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmperfilconductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntseleccionarfoto;
    private javax.swing.JButton btnregistrarcarro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTextField txtasientosdisponibles;
    private javax.swing.JTextField txtcolorcarro;
    private javax.swing.JTextField txtlicencia;
    private javax.swing.JTextField txtmodelcarro;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables

}
