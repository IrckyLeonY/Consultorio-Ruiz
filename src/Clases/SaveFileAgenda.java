/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;

/**
 *
 * @author riky_
 */
public class SaveFileAgenda {
    
    //Atributos de Acceso Aleatorio de Agenda
    private static RandomAccessFile flujo; //Clase Random Access File
    private static int numeroRegistros; //Cuantos empleados hay en el archivo
    private static int tamanoRegistros = 280; //Tamano bytes por registro
    
     //Metodo crear File Empleado = crea un flujo a un archivo RandomAccessFile, con un parametro file es decir la ruta
    public static void crearFileAgenda(File archivo) throws IOException {
        //Comprobar la ruta del archivo, puede que el archivo no exista o que no sea una ruta 
        if (archivo.exists() && !archivo.isFile()){
            throw new IOException(archivo.getName() + "No es un archivo");
        }
        //Crear el archivo, escritura
        flujo = new RandomAccessFile(archivo, "rw");
        //Obtenemos el numero de registros, longitud del bytes divido para el tamano de registros obtenemos el numero de registro. Se cambia a int
        //Math ceil es una aproximacion al entero superior.
        numeroRegistros = (int) Math.ceil((double)flujo.length() / (double) tamanoRegistros);
    }
    //Metodo para cerrar archivos
    public static void cerrarArchivo () throws IOException{
        flujo.close();
    }
    //Metodo boleano que  nos indica si se pudo o no agregar/guardar al empleado
    public static boolean setAgenda (int i, Agenda agenda) throws IOException{
        if (i >= 0 && i <= getNumeroRegistros()){
            if (agenda.getTamanoAgenda()>tamanoRegistros){
                System.out.println("Tamano excedido de registro");
            } else {
            //Situamos el puntero sobre el tamano registro
            flujo.seek(i*tamanoRegistros);
            //Agrega el registro al archivo
           flujo.writeInt(agenda.getCodigoCita());
           flujo.writeUTF(agenda.getFecha());
           flujo.writeBoolean(agenda.isDisponibilidad());
           flujo.writeUTF(agenda.getCedula());
            return true;
        }
    } else{ //Si no se puedo agregar sale la excepcion.
            System.out.println("Numero de registros fuera del limite");
        }
        return false;
    }
    //Este metodo nos permite anadir un empleado desde la clase principal, y se lo coloca al final 
    public static void agregarAgenda (Agenda agenda) throws IOException{
        if (setAgenda(numeroRegistros, agenda)){
            numeroRegistros++;
        }
    }
    //Este metodo nos permite obtener el registro del empleado que se encuentre en ese registro medinate el putnero, devolviendo el objeto persona
    public static Agenda getAgenda (int i) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()){
            flujo.seek(i*tamanoRegistros);
            return new Agenda (flujo.readInt(), flujo.readUTF(), flujo.readBoolean(), flujo.readUTF());
        }else{
            System.out.println("Numero de registros fuera del limite");
            return null;
        }
    }
    
    //Metodo de Buscar por Id
    public static boolean ValidarCita (String busqueda) throws IOException{
        String aux;
        
        if (busqueda == null){
            return false;
        }
        
        for (int i = 0; i < getNumeroRegistros(); i++){
            flujo.seek(i*tamanoRegistros);
            aux = getAgenda(i).getFecha();
            if (aux.equals(busqueda)){
                return false;
            }
        }
        return true;
    }
    //Metodo que devuelve el RandomAcessFile
    public static RandomAccessFile getFlujo() {
        return flujo;
    }
    //Metodo que devuelve el numero de Registros
    public static int getNumeroRegistros() {
        return numeroRegistros;
    }

    //Metodo que devuelve el tamano de registros
    public static int getTamanoRegistros() {
        return tamanoRegistros;
    }

    static void crearFileOdontologo(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
