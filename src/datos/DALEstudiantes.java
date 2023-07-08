
package datos;

import java.io.*;
import java.util.*;

import entidades.*;

public class DALEstudiantes {

    private static RandomAccessFile flujo;
    
    private static int TAMREG = 350; // Tamaño del registro
    private static int numRegistros; //Numero de Registros
    private static String nArchivo = "estudiantes.txt"; //Nombre del Archivo

    
    //crea el archivo si no existe y si existe lo habra y escribe en el archivo
    public static String crearFlujo(){  
        try {
            flujo = new RandomAccessFile(nArchivo, "rw");
            numRegistros = (int)Math.ceil((double)flujo.length()/(double)TAMREG);
        } catch (IOException ex) {
            return "Problema al crear el flujo: " + ex.getMessage();
        }
        return null;
    }
        
    public static String escribirEstudiante(Estudiante estudiante){
        String mensaje = "";
        
        try {
            crearFlujo();
            flujo.close();
            mensaje = setEstudiante(numRegistros, estudiante);
            if(mensaje.compareTo("ok") == 0){
                numRegistros++;
            }
        } catch (IOException ex) {
            mensaje = "Excepcion: " + ex.getMessage();
        }finally{
            return mensaje;
        }
    }
    
    public static String setEstudiante(int posicion, Estudiante estudiante){
        String mensaje = "";
        
        try{
            if(estudiante.getTamaño()+6 > TAMREG){
                mensaje = "Tamaño de registro insuficiente";
            }else{
                crearFlujo();
                flujo.seek(posicion * TAMREG);
                
                flujo.writeInt(estudiante.getCodigo());
                flujo.writeUTF(estudiante.getDni());
                flujo.writeUTF(estudiante.getNombre());
                flujo.writeUTF(estudiante.getApellido());
                flujo.writeUTF(estudiante.getDireccion());
                flujo.writeUTF(estudiante.getCarrera());
                flujo.writeUTF(estudiante.getEstado());
                mensaje = "ok";
            }
        }catch(IOException ex){
            mensaje = "Excepcion: " + ex.getMessage();
        }finally{
            try{
            flujo.close();
            }catch(IOException ex){
                mensaje = "El flujo ya estaba cerrado: " + ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public static Estudiante getEstudiante(int pos){
        String dni, nombre, apellido, direccion, carrera, estado;
        int codigo;
        
        Estudiante estudiante = null;
        try {
            crearFlujo();
            flujo.seek(pos*TAMREG);
            codigo = flujo.readInt();
            dni = flujo.readUTF();
            nombre = flujo.readUTF();
            apellido = flujo.readUTF();
            direccion = flujo.readUTF();
            carrera = flujo.readUTF();
            estado = flujo.readUTF();
            
            estudiante = new Estudiante(codigo, dni, nombre, apellido, direccion, carrera, estado);
        } catch (IOException ex) {
            System.out.println("Problema de E/S: " + ex.getMessage());
        }finally{
            try{
            flujo.close();
            }catch(IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return estudiante;
    }
    
    public static List<Estudiante> getContenido(){
        List<Estudiante> lista = new ArrayList<>();
        try{
            crearFlujo();
            for(int i=0; i<numRegistros; i++)
                lista.add(getEstudiante(i));
        }finally{
            try{
            flujo.close();
            }catch(IOException ex){
                System.out.println("El flujo esta cerrado: " + ex.getMessage());
            }
        }
        return lista;
    }
    
    public static int getNumeroRegistros(){
        try {
            crearFlujo();
            flujo.close();
        } catch(IOException ex){
                System.out.println("El flujo esta cerrado: " + ex.getMessage());
            }
        return numRegistros;
    }   
    
  
}