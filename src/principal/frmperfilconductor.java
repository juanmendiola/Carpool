
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Requisitos conductor");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese modelo del carro");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese el color del carro");

        txtmodelcarro.setBackground(new java.awt.Color(255, 255, 255));
        txtmodelcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtmodelcarro.setForeground(new java.awt.Color(0, 0, 0));
        txtmodelcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelcarroActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero de asientos disponible");

        txtcolorcarro.setBackground(new java.awt.Color(255, 255, 255));
        txtcolorcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtcolorcarro.setForeground(new java.awt.Color(0, 0, 0));
        txtcolorcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorcarroActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese la placa");

        txtplaca.setBackground(new java.awt.Color(255, 255, 255));
        txtplaca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtplaca.setForeground(new java.awt.Color(0, 0, 0));
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Foto del carro");

        txtasientosdisponibles.setBackground(new java.awt.Color(255, 255, 255));
        txtasientosdisponibles.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtasientosdisponibles.setForeground(new java.awt.Color(0, 0, 0));
        txtasientosdisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtasientosdisponiblesActionPerformed(evt);
            }
        });

        btnregistrarcarro.setBackground(new java.awt.Color(102, 255, 102));
        btnregistrarcarro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnregistrarcarro.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrarcarro.setText("Registrar carro");
        btnregistrarcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarcarroActionPerformed(evt);
            }
        });

        bntseleccionarfoto.setBackground(new java.awt.Color(204, 204, 204));
        bntseleccionarfoto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bntseleccionarfoto.setForeground(new java.awt.Color(0, 0, 0));
        bntseleccionarfoto.setText("Seleccionar foto");
        bntseleccionarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntseleccionarfotoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Licencia de conducción");

        txtlicencia.setBackground(new java.awt.Color(255, 255, 255));
        txtlicencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnregistrarcarro))
                    .addComponent(jLabel6)
                    .addComponent(txtasientosdisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcolorcarro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtmodelcarro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(bntseleccionarfoto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtlicencia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtmodelcarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcolorcarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtasientosdisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtlicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntseleccionarfoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrarcarro))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
     
    
    if(modelocarro.isEmpty()||colorcarro.isEmpty()||placa.isEmpty()||asientosdisponibles.isEmpty()){
        JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DATOS");
    }else{
        
        try {
            String foto = null;
            
            String usuario = "SELECT id_usuario FROM usuarios WHERE gmail='"+usuariogmail+"'";
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
            frmseleccionbarrio fr = new frmseleccionbarrio();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTextField txtasientosdisponibles;
    private javax.swing.JTextField txtcolorcarro;
    private javax.swing.JTextField txtlicencia;
    private javax.swing.JTextField txtmodelcarro;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables

}
