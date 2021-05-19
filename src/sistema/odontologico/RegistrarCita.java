/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

import Fuentes.fuentes;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
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
public class RegistrarCita extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarCita
     */
    fuentes tipofuentes;
    public RegistrarCita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tipofuentes = new fuentes();
        jLabel7.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel1.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel2.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel4.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jLabel6.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 50));
        Cedula.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 30));
        jButton1.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 20));
        jButton2.setFont(tipofuentes.fuente(tipofuentes.JOA,0, 20));
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src/Imagenes/393052.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Cedula = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Telefono:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setText("Correo Electronico:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 120, -1));

        field3.setEditable(false);
        getContentPane().add(field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, -1));

        field1.setEditable(false);
        getContentPane().add(field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 230, -1));

        field2.setEditable(false);
        getContentPane().add(field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 230, -1));

        jPanel1.setBackground(new java.awt.Color(246, 245, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 100, -1));

        Cedula.setText("Cedula:");
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 80, -1));

        jCalendar1.setBackground(new java.awt.Color(246, 245, 244));
        jPanel1.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 310, 220));

        jLabel4.setText("Codigo Cita");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        jLabel7.setText("Nombre: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel6.setText("Registrar Cita");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 240, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ":00", ":15", ":30", ":45" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String aux = txtBuscar.getText();
        try {
            // TODO add your handling code here:
        BinarioPaciente.crearFilePaciente(new File ("pacientes.dat"));
        int i = BinarioPaciente.buscarCedula(aux);
        if( i==-1) {
              JOptionPane.showMessageDialog(this, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
              return;
            }
                field1.setText(BinarioPaciente.getPaciente(i).getNombres()+BinarioPaciente.getPaciente(i).getApellidos());
                field2.setText(BinarioPaciente.getPaciente(i).getTelefono());
                field3.setText(BinarioPaciente.getPaciente(i).getCorreo());
                BinarioPaciente.cerrarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            GenerarPDF(txtBuscar.getText());
        }
        catch(FileNotFoundException ex){
            
        } catch (DocumentException ex) {
            Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void GenerarPDF (String nombre) throws FileNotFoundException, DocumentException, IOException {
        FileOutputStream archivo = new FileOutputStream(nombre +".pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        /*
        Image logo = Image.getInstance("logo.JPG");
        PdfWriter.getInstance(documento, new FileOutputStream("logo.JPG"));
        logo.setAlignment(Element.ALIGN_CENTER);
        */
        documento.open();
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
        String aux = txtBuscar.getText();
        String hora = jComboBox1.getSelectedItem().toString();
        String minuto = jComboBox2.getSelectedItem().toString();
        Date Fecha = jCalendar1.getDate();
        SimpleDateFormat FechaNacimiento = new SimpleDateFormat("dd/MM/YYYY");
        String FecNac=FechaNacimiento.format(Fecha);
        try {
            // TODO add your handling code here:
        BinarioPaciente.crearFilePaciente(new File ("pacientes.dat"));
        int i = BinarioPaciente.buscarCedula(aux);
        if( i==-1) {
              JOptionPane.showMessageDialog(this, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
              return;
            }         
                //field1.setText(BinarioPaciente.getPaciente(i).getNombres()+BinarioPaciente.getPaciente(i).getApellidos());
                //field2.setText(BinarioPaciente.getPaciente(i).getTelefono());
                //field3.setText(BinarioPaciente.getPaciente(i).getCorreo());
                documento.add(new Paragraph("Nombre Paciente: "+BinarioPaciente.getPaciente(i).getNombres()+" "+BinarioPaciente.getPaciente(i).getApellidos()));
                documento.add(new Paragraph("Cedula Paciente: "+BinarioPaciente.getPaciente(i).getCedula()));
                documento.add(new Paragraph("Fe_Na Paciente: "+BinarioPaciente.getPaciente(i).getFecNac()));
                documento.add(new Paragraph("Genero Paciente: "+BinarioPaciente.getPaciente(i).getGenero()));
                documento.add(new Paragraph("Telefono Paciente: "+BinarioPaciente.getPaciente(i).getTelefono()));
                documento.add(new Paragraph("Correo Paciente: "+BinarioPaciente.getPaciente(i).getCorreo()));
                documento.add(new Paragraph("Fecha cita:"+" "+ FecNac));
                documento.add(new Paragraph("Hora cita:"+" "+ hora +" "+ minuto));
                BinarioPaciente.cerrarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(RegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        Paragraph parrafo2 = new Paragraph("NOTA: SE SOLICITA VENIR 20 MINUTOS ANTES");
        parrafo1.setAlignment(0);
        documento.add(parrafo2);
        //Cierre
        documento.close();
        JOptionPane.showMessageDialog(null, "Archivo correctamente generado, por favor ir a la carpeta","Informacion",  1);
    }
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
            java.util.logging.Logger.getLogger(RegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarCita dialog = new RegistrarCita(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Cedula;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
