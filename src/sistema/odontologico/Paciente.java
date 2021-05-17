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
public class Paciente {
    private String Nombres;//25=50
    private String Apellidos;////25=50
    private String Correo;//25=50
    private String Telefono;//20
    private String FechaNacimiento;
    private String Genero;//16
    private String Cedula;//20----//206
    private String FecNac;
          

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
}
