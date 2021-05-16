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
public class Usuario {
    private String Nombre; //20 = 40 bytes
    private String Apellido;// 20 = 40 bytes
    private String Cargo; // 12 = 24 bytes
    private String Correo_Electronico; //30 = 60 bytes 
    private int Celular; // 4bytes

    public Usuario(String Nombre, String Apellido, String Cargo, String Correo_Electronico, int Celular) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        this.Correo_Electronico = Correo_Electronico;
        this.Celular = Celular;
    }

    


    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public int getCelular() {
        return Celular;
    }
    public int getTamanoUsuario(){
     return Nombre.length()*2+ Apellido.length()*2+Cargo.length()*2+Correo_Electronico.length()*2+4;
    }
}
    
    


    
    
    
    

