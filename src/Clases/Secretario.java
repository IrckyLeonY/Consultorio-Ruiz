/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import sistema.odontologico.Login;
import sistema.odontologico.RegistroUsuarios;

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
    public void RegistrarSecretario(String Id,String Contrasena,String Nombre,String Apellido,String Cargo,String Correo,int Celular){
        RegistroUsuarios A = new RegistroUsuarios();
        try{
            SaveFileSecreterario.crearFileSecretario(new File("secretarios.dat"));
            SaveFileSecreterario.agregarSecretario(new Secretario(Id,Contrasena,Nombre,Apellido,Cargo,Correo,Celular));
            SaveFileSecreterario.cerrarArchivo();
            JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado los datos");
        }
        catch (IOException ex){
           JOptionPane.showMessageDialog(A,"No se pueden ingresar los datos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void ValidarLogin (String usuario, String contrasena){
        Login A = new Login();
        try{
            SaveFileSecreterario.crearFileSecretario(new File("secretarios.dat"));
            if (SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistroC(contrasena)).getContrasena().equals(contrasena)&&
            SaveFileSecreterario.getSecretario(SaveFileSecreterario.buscarRegistro(usuario)).getId().equals(usuario)){
            JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado con exitos");
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
