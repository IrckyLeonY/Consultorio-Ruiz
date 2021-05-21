/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import sistema.odontologico.RegistrarCita;

/**
 *
 * @author riky_
 */
public class Agenda {
    
    private int CodigoCita; //4 bytes
    private String fecha; //24 bytes
    private boolean disponibilidad; // 1 byte
    private String cedula; //250
    
    public Agenda(){
        CodigoCita = 0;
        fecha = "";
        disponibilidad = false;
        cedula = "";
    }

    public Agenda(int CodigoCita, String fecha, boolean disponibilidad, String cedula) {
        this.CodigoCita = CodigoCita;
        this.fecha = fecha;
        this.disponibilidad = disponibilidad;
        this.cedula = cedula;
    }

    public int getCodigoCita() {
        return CodigoCita;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getCedula() {
        return cedula;
    }
    public int getTamanoAgenda(){
        return 4 + fecha.length()*2 + 1 + cedula.length()*2;
    }
    public String asignarFecha(Date fecha, String aux1){
        RegistrarCita A = new RegistrarCita();
        try{
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String aux = formato.format(fecha);
        String ft = aux.substring(11, 16);
        String fechaT = aux.replace(ft, aux1);
        return fechaT;
        }
        catch(NullPointerException ex){
        JOptionPane.showMessageDialog(A, "La cita debe contener una fecha y hora", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }
    public void registrarAgenda(int Codigo,String Fecha, boolean Validacion, String Cedula ){
        RegistrarCita A = new RegistrarCita();
        try{
            SaveFileAgenda.crearFileAgenda(new File ("agenda.dat"));
            SaveFileAgenda.agregarAgenda(new Agenda (Codigo,Fecha,Validacion,Cedula));
            SaveFileAgenda.cerrarArchivo();
            JOptionPane.showMessageDialog(A,"¡Éxito!\nSe han ingresado los datos");
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(A,"No se pueden ingresar los datos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public boolean Validar(String busqueda){
        RegistrarCita A = new RegistrarCita();
        try{
            SaveFileAgenda.crearFileAgenda(new File ("agenda.dat"));
            if (SaveFileAgenda.ValidarCita(busqueda)==false){
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

}
