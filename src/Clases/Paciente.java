/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import sistema.odontologico.RegistrarCita;
import sistema.odontologico.RegistroPaciente;

/**
 *
 * @author riky_
 */
public class Paciente {
    private String Nombres;//25=50
    private String Apellidos;////25=50
    private String Correo;//25=50
    private String Telefono;//20
    private String FechaNacimiento;
    private String Genero;//16
    private String Cedula;//20----//206
    private String FecNac;
          

    public Paciente(){
        Nombres = "";
        Apellidos = "";
        Correo = "";
        Telefono = "";
        Genero = "";
        Cedula="";
        FecNac="";
    }
    public Paciente(String Nombre, String Apellido, String Correo_Electronico, String Celular, String Genero, String Cedula,String FecNac) {
        this.Nombres = Nombre;
        this.Apellidos = Apellido;
        this.Correo = Correo_Electronico;
        this.Telefono = Celular;
        this.Genero = Genero;
        this.Cedula=Cedula;
        this.FecNac=FecNac;
    }
    public String getFecNac() {
        return FecNac;
    }
      public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }
    
    public String getCedula(){
        return Cedula;
    }
    public int getTamanoPaciente(){
     return Nombres.length()*2+ Apellidos.length()*2+Genero.length()*2+Correo.length()*2+Telefono.length()*2+Cedula.length()*2+FecNac.length()*2;
    }
    public void GuardarPaciente(String Nombre, String Apellido, String Correo_Electronico, String Celular, String Genero, String Cedula,String FecNac){
        RegistroPaciente A = new RegistroPaciente();
        try {//
                SaveFilePaciente.crearFilePaciente(new File ("pacientes.dat"));
                SaveFilePaciente.agregarPaciente(new Paciente(Nombres, Apellidos, Correo,Telefono,Genero,Cedula,FecNac));
                SaveFilePaciente.cerrarArchivo();
                JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado los datos");
            }
            catch (IOException ex){
                JOptionPane.showMessageDialog(A,"No se pueden ingresar los datos","Error",JOptionPane.WARNING_MESSAGE);
                
            }
    }
    public boolean Validar(String busqueda){
        RegistroPaciente A = new RegistroPaciente();
        try{
            SaveFilePaciente.crearFilePaciente(new File ("pacientes.dat"));
            if (SaveFilePaciente.ValidarCita(busqueda)==false){
                return false;
            }
            else{
                return true;
            }
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(A,"No se pueden ingresar los datos","Error",JOptionPane.WARNING_MESSAGE);
        }
                catch (NullPointerException n){
            JOptionPane.showMessageDialog(A,"La cita debe contener uan fecha y hora","Error",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    public int BuscarCedula(String cedula){
        RegistrarCita A = new RegistrarCita();
        try{
            SaveFilePaciente.crearFilePaciente(new File ("pacientes.dat"));
            int i = SaveFilePaciente.buscarCedula(cedula);
            if( i==-1) {
              JOptionPane.showMessageDialog(A, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
              return -1;
            }
            else{
                return i;
            }
        }
        catch(IOException e) {
        JOptionPane.showMessageDialog(A, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex){
        JOptionPane.showMessageDialog(A, "Error no coincide codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
}
