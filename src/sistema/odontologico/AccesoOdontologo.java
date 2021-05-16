/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.odontologico;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author riky_
 */
public class AccesoOdontologo {
        //Atributos de Acceso Aleatorio de empleado
    private static RandomAccessFile flujo; //Clase Random Access File
    private static int numeroRegistros; //Cuantos empleados hay en el archivo
    private static int tamanoRegistros = 218; //Tamano bytes por registro
    
    //Metodo crear File Empleado = crea un flujo a un archivo RandomAccessFile, con un parametro file es decir la ruta
    public static void crearFileOdontologo(File archivo) throws IOException {
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
    public static boolean setOdontologo (int i, Odontologo odon) throws IOException{
        if (i >= 0 && i <= getNumeroRegistros()){
            if (odon.getTamanoOdontologo()>tamanoRegistros){
                System.out.println("Tamano excedido de registro");
            } else {
            //Situamos el puntero sobre el tamano registro
            flujo.seek(i*tamanoRegistros);
            //Agrega el registro al archivo
            flujo.writeUTF(odon.getId());
            flujo.writeUTF(odon.getContrasena());
            flujo.writeUTF(odon.getNombre());
            flujo.writeUTF(odon.getApellido());
            flujo.writeUTF(odon.getCargo());
            flujo.writeUTF(odon.getCorreo_Electronico());
            flujo.writeInt(odon.getCelular());
            
            return true;
        }
    } else{ //Si no se puedo agregar sale la excepcion.
            System.out.println("Numero de registros fuera del limite");
        }
        return false;
    }
    //Este metodo nos permite anadir un empleado desde la clase principal, y se lo coloca al final 
    public static void agregarOdontologo (Odontologo odon) throws IOException{
        if (setOdontologo(numeroRegistros, odon)){
            numeroRegistros++;
        }
    }
    //Este metodo nos permite obtener el registro del empleado que se encuentre en ese registro medinate el putnero, devolviendo el objeto persona
    public static Odontologo getOdontologo (int i) throws IOException {
        if (i >= 0 && i <= getNumeroRegistros()){
            flujo.seek(i*tamanoRegistros);
            return new Odontologo (flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readInt());
        }else{
            System.out.println("Numero de registros fuera del limite");
            return null;
        }
    }
    //Metodo de Buscar por Id
    public static int buscarRegistro (String busqueda) throws IOException{
        String aux;
        if (busqueda == null){
            return -1;
        }
        for (int i = 0; i < getNumeroRegistros(); i++){
            flujo.seek(i*tamanoRegistros);
            aux = getOdontologo(i).getId();
            if (aux.equals(busqueda)){
                return i;
            }
        }
        return -1;
    }
    //Metodo de Buscar por contrasena
    public static int buscarRegistroC (String busqueda) throws IOException{
        String aux;
        if (busqueda == null){
            return -1;
        }
        for (int i = 0; i < getNumeroRegistros(); i++){
            flujo.seek(i*tamanoRegistros);
            aux = getOdontologo(i).getContrasena();
            if (aux.equals(busqueda)){
                return i; //retorna la posicion.
            }
        }
        return -1;
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
    
}
