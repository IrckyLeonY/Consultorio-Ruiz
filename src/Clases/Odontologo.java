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
public class Odontologo extends Usuario{
    private String Id;//5 = 10
    private String Contrasena;//20 = 40 bytes

    public Odontologo(){
        Id = "";
        Contrasena = "";
    }
    public Odontologo(String Id, String Contrasena, String Nombre, String Apellido, String Cargo, String Correo_Electronico, int Celular) {
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
    public int getTamanoOdontologo(){
        return getTamanoUsuario()+Id.length()*2+Contrasena.length()*2;
    }
    public void RegistrarOdontologo(String Id,String Contrasena,String Nombre, String Apellido,String Cargo,String Correo,int Celular){
        RegistroUsuarios A = new RegistroUsuarios();
        try{
            SaveFileOdontologo.crearFileOdontologo(new File ("odontologos.dat"));
            SaveFileOdontologo.agregarOdontologo(new Odontologo(Id,Contrasena,Nombre,Apellido,Cargo,Correo,Celular));
            SaveFileOdontologo.cerrarArchivo();
            JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado los datos");
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(A,"No se pueden ingresar los datos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void ValidarLogin(String usuario, String contrasena){
        Login A = new Login();
        try{
                SaveFileOdontologo.crearFileOdontologo(new File("odontologos.dat"));
                if (SaveFileOdontologo.getOdontologo(SaveFileOdontologo.buscarRegistro(usuario)).getId().equals(usuario) && 
                SaveFileOdontologo.getOdontologo(SaveFileOdontologo.buscarRegistroC(contrasena)).getContrasena().equals(contrasena)){
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
