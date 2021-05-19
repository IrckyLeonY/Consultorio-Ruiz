/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.odontologico;

/**
 *
 * @author riky_
 */
import Fuentes.fuentes;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    fuentes tipofuentes;
    public Login() {
        initComponents();
        tipofuentes = new fuentes();
        jLabel1.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 80));
        //jLabel2.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 40));
        //jLabel3.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 40));
        comboCargo.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Imagenes/diente.jpg");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        comboCargo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        combocargo = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 245, 244));
        jPanel1.setForeground(new java.awt.Color(246, 245, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setText("SmileForLife");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 200, 220));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Usuario*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cargo*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 280, 30));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 280, 30));

        comboCargo.setBackground(new java.awt.Color(204, 204, 204));
        comboCargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboCargo.setText("Ingresar");
        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });
        jPanel1.add(comboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        combocargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Odontologo", "Secretario" }));
        jPanel1.add(combocargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 280, 40));

        jMenu1.setText("Registro");

        jMenuItem1.setText("Registrar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ayuda");

        jMenuItem3.setText("Acerca de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        RegistroUsuarios A = new RegistroUsuarios(this,true);
        A.setSize(700, 530);
        A.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        // TODO add your handling code here:
        String aux = jTextField1.getText().trim();
        String aux1 = jPasswordField1.getText().trim();
        String op = combocargo.getSelectedItem().toString();
        Secretario secre = new Secretario();
        Odontologo doc = new Odontologo();
        if (op.equals("Secretario")){
            secre.ValidarLogin(aux, aux1);
            this.setVisible(false);
            PrincipalSecretaria A = new PrincipalSecretaria(this,true);
            A.setVisible(true); 
        }
        else if (op.equals("Odontologo")){
            doc.ValidarLogin(aux, aux1);
            this.setVisible(false);
            PrincipalDoctor A = new PrincipalDoctor(this,true);
            A.setVisible(true);
        }
        /*
        if (op.equals("Secretario")){
            try{
                SaveFileSecreterario.crearFileSecretario(new File("secretarios.dat"));
                if (SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistroC(aux1)).getContrasena().equals(aux1)&&
                SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistro(aux)).getId().equals(aux)){
                JOptionPane.showMessageDialog(this,"¡Éxito!\nSe han ingresado con exitos");
                this.setVisible(false);
                PrincipalSecretaria A = new PrincipalSecretaria(this,true);
                A.setVisible(true);  
            }
        }
            catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
            catch(NullPointerException ex){
                JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else if (op.equals("Odontologo")){
            try{
                SaveFileOdontologo.crearFileOdontologo(new File("odontologos.dat"));
                if (SaveFileOdontologo.getOdontologo(SaveFileOdontologo.buscarRegistro(aux)).getId().equals(aux) && 
                SaveFileOdontologo.getOdontologo(SaveFileOdontologo.buscarRegistroC(aux1)).getContrasena().equals(aux1)){
                JOptionPane.showMessageDialog(this,"¡Éxito!\nSe han ingresado con exitos");
                this.setVisible(false);
                PrincipalDoctor A = new PrincipalDoctor(this,true);
                A.setVisible(true);
            }   
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex){
                JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        */
        
       
        
        
    }//GEN-LAST:event_comboCargoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AcercaDe acercareg = new AcercaDe(this,true);
        acercareg.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comboCargo;
    private javax.swing.JComboBox<String> combocargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
