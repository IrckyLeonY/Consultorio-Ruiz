/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author riky_
 */
public class Secretario extends Usuario{
    //Datos miembro
    private String Id; //5 = 10
    private String Contrasena; //20 = 40 bytes

    public Secretario(){
        Id = "";
        Contrasena ="";

    }
    public Secretario(String Id, String Contrasena, String Nombre, String Apellido, String Cargo, String Correo_Electronico, int Celular) {
        super(Nombre, Apellido, Cargo, Correo_Electronico, Celular);
        this.Id = Id;
        this.Contrasena = Contrasena;
    }
    public String getId() {
        return Id;
    }
    public String getContrasena() {
        return Contrasena;
    }
    public int getTamanoSecretario(){
        return getTamanoUsuario()+Id.length()*2+Contrasena.length()*2;
    }
    public void ValidarLogin (String usuario, String contrasena){
        Login A = new Login();
        try{
            SaveFileSecreterario.crearFileSecretario(new File("secretarios.dat"));
            if (SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistroC(contrasena)).getContrasena().equals(contrasena)&&
            SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistro(usuario)).getId().equals(usuario)){
            JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado con exitos");
            //A.setVisible(false);
            
        }
    }
    catch(IOException e) {
        JOptionPane.showMessageDialog(A, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
    }
    catch(NullPointerException ex){
        JOptionPane.showMessageDialog(A, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
   }
   
}
    
}
