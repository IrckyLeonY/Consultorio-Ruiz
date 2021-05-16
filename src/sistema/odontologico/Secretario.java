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
public class Secretario extends Usuario{
    //Datos miembro
    private String Id; //5 = 10
    private String Contrasena; //20 = 40 bytes

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
    


    
    
    
    
}
