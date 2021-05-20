/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

import Fuentes.fuentes;
import Clases.SaveFilePaciente;
import Clases.Paciente;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author patty
 */
public class ActualizarPaciente extends javax.swing.JDialog {

    /**
     * Creates new form ActualizarPaciente
     */
    fuentes tipofuentes;
    public ActualizarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tipofuentes = new fuentes();
        jLabel1.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel2.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel3.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel4.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel5.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel6.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel9.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel8.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 50));
        btnbuscar.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 20));
        btnguardar.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 20));
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel7, "src/Imagenes/actualizar.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfechanacimiento = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscar.setBackground(new java.awt.Color(246, 245, 244));
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 73, -1));

        jLabel1.setText("Nombres:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel3.setText("Correo- Electrónico:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setText("Teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel5.setText("Género:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel6.setText("Cédula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 50));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 160, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 210, -1));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 210, -1));

        txtgenero.setEditable(false);
        getContentPane().add(txtgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 210, -1));

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 210, -1));

        jLabel8.setText("  Actualizar Paciente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 310, 40));

        txtfechanacimiento.setEditable(false);
        getContentPane().add(txtfechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 210, -1));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 210, -1));

        jLabel9.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        btnguardar.setBackground(new java.awt.Color(246, 245, 244));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(246, 245, 244));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String aux = jTextField1.getText();
        Paciente pac = new Paciente();
        try{
            int i = pac.BuscarCedula(aux);
            txtnombre.setText(SaveFilePaciente.getPaciente(i).getNombres());
            txtapellido.setText(SaveFilePaciente.getPaciente(i).getApellidos());
            txtcorreo.setText(SaveFilePaciente.getPaciente(i).getCorreo());
            txtgenero.setText(SaveFilePaciente.getPaciente(i).getGenero());
            txtfechanacimiento.setText(SaveFilePaciente.getPaciente(i).getFecNac());
            txttelefono.setText(SaveFilePaciente.getPaciente(i).getTelefono());
        }
        catch(IOException e) {
        JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex){
        JOptionPane.showMessageDialog(this, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String Nombres = txtnombre.getText();
        String Apellidos = txtapellido.getText();
        String Correo = txtgenero.getText();
        String Telefono = txtcorreo.getText();
        String Genero = txttelefono.getText();
        String Cedula = jTextField1.getText();
        String FecNac = txtfechanacimiento.getText();
        Paciente Pac = new Paciente(Nombres, Apellidos, Correo,Telefono,Genero,Cedula,FecNac);
        Pac.GuardarPaciente(Nombres, Apellidos, Telefono, Cedula, Genero, Cedula, FecNac);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    /*public void GenerarPDF (String nombre) throws FileNotFoundException, DocumentException, IOException {
        FileOutputStream archivo = new FileOutputStream(nombre +".pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        /*
        Image logo = Image.getInstance("logo.JPG");
        PdfWriter.getInstance(documento, new FileOutputStream("logo.JPG"));
        logo.setAlignment(Element.ALIGN_CENTER);
        */
        /*documento.open();
        //documento.add(logo);
        //Local
        Paragraph parrafo1 = new Paragraph("Consultorio Estetics Dental");
        parrafo1.setAlignment(0);
        documento.add(parrafo1);
        //Titulo
        Paragraph parrafo = new Paragraph("Datos Pacientes");
        parrafo.setAlignment(1);
        documento.add(parrafo);
        //Informacion
        String aux = jTextField1.getText();
        
        try {
        // TODO add your handling code here:
        SaveFilePaciente.crearFilePaciente(new File ("pacientes.dat"));
        int i = SaveFilePaciente.buscarCedula(aux);
        if( i==-1) {
              JOptionPane.showMessageDialog(this, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
              return;
            }         
                //field1.setText(BinarioPaciente.getPaciente(i).getNombres()+BinarioPaciente.getPaciente(i).getApellidos());
                //field2.setText(BinarioPaciente.getPaciente(i).getTelefono());
                //field3.setText(BinarioPaciente.getPaciente(i).getCorreo());
                documento.add(new Paragraph("Nombre Paciente: "+SaveFilePaciente.getPaciente(i).getNombres()+" "+SaveFilePaciente.getPaciente(i).getApellidos()));
                documento.add(new Paragraph("Cedula Paciente: "+SaveFilePaciente.getPaciente(i).getCedula()));
                documento.add(new Paragraph("Fe_Na Paciente: "+SaveFilePaciente.getPaciente(i).getFecNac()));
                documento.add(new Paragraph("Genero Paciente: "+SaveFilePaciente.getPaciente(i).getGenero()));
                documento.add(new Paragraph("Telefono Paciente: "+SaveFilePaciente.getPaciente(i).getTelefono()));
                documento.add(new Paragraph("Correo Paciente: "+SaveFilePaciente.getPaciente(i).getCorreo()));
                
                SaveFilePaciente.cerrarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        Paragraph parrafo2 = new Paragraph("NOTA: SE SOLICITA VENIR 20 MINUTOS ANTES");
        parrafo1.setAlignment(0);
        documento.add(parrafo2);
        //Cierre
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo correctamente generado, por favor ir a la carpeta","Informacion",  1);
    }*/
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
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActualizarPaciente dialog = new ActualizarPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtfechanacimiento;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
