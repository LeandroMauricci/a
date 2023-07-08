
package datos;

import static datos.DALEstudiantes.crearFlujo;
import java.util.*;
import entidades.*;
import java.io.*;

public final class DALAsignaturas {
    private List<Asignatura> listaAsignaturas;
    
    
    
    public DALAsignaturas(){
        escribirAsignatura("Programación", "101", 1, 4);
        escribirAsignatura("Bases de Datos", "102", 1, 4);
        escribirAsignatura("Redes de Computadoras", "103", 1, 4);
        escribirAsignatura("Sistemas Operativos", "104", 1, 4);
        escribirAsignatura("Análisis y Diseño de Sistemas", "105", 1, 4);
        escribirAsignatura("Administración de Proyectos", "106", 1, 4);

        escribirAsignatura("Anatomía", "201", 1, 4);
        escribirAsignatura("Fisiología", "202", 1, 4);
        escribirAsignatura("Farmacología", "203", 1, 4);
        escribirAsignatura("Patología", "204", 1, 4);
        escribirAsignatura("Bioquímica", "205", 1, 4);
        escribirAsignatura("Medicina Interna", "206", 1, 4);

        escribirAsignatura("Derecho Constitucional", "301", 1, 4);
        escribirAsignatura("Derecho Civil", "302", 1, 4);
        escribirAsignatura("Derecho Penal", "303", 1, 4);
        escribirAsignatura("Derecho Laboral", "304", 1, 4);
        escribirAsignatura("Derecho Mercantil", "305", 1, 4);
        escribirAsignatura("Derecho Administrativo", "306", 1, 4);

        escribirAsignatura("Psicología General", "401", 1, 4);
        escribirAsignatura("Psicología del Desarrollo", "402", 1, 4);
        escribirAsignatura("Psicopatología", "403", 1, 4);
        escribirAsignatura("Psicología Social", "404", 1, 4);
        escribirAsignatura("Psicología Cognitiva", "405", 1, 4);
        escribirAsignatura("Métodos de Investigación en Psicología", "406", 1, 4);

        escribirAsignatura("Contabilidad", "501", 1, 4);
        escribirAsignatura("Economía", "502", 1, 4);
        escribirAsignatura("Marketing", "503", 1, 4);
        escribirAsignatura("Finanzas", "504", 1, 4);
        escribirAsignatura("Gestión de Recursos Humanos", "505", 1, 4);
        escribirAsignatura("Planificación Estratégica", "506", 1, 4);

        escribirAsignatura("Diseño Arquitectónico", "601", 1, 4);
        escribirAsignatura("Historia de la Arquitectura", "602", 1, 4);
        escribirAsignatura("Construcción", "603", 1, 4);
        escribirAsignatura("Estructuras", "604", 1, 4);
        escribirAsignatura("Teoría y Crítica de la Arquitectura", "605", 1, 4);
        escribirAsignatura("Representación Gráfica", "606", 1, 4);
    }
    
    private static RandomAccessFile flujo;
    
    private static int TAMREG = 50; // Tamaño del registro
    private static int numRegistros; //Numero de Registros
    private static String nArchivo = "asignaturas.txt"; //Nombre del Archivo

    
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
        
    public String escribirAsignatura(String nombreAsignatura, String codigo, int ciclo, int numCreditos){
        String mensaje = "";
        
        try {
            crearFlujo();
            flujo.close();
            mensaje = setAsignatura(numRegistros, nombreAsignatura, codigo, ciclo, numCreditos);
            
            if(mensaje.compareTo("ok") == 0){
                numRegistros++;
            }
        } catch (IOException ex) {
            mensaje = "Excepcion: " + ex.getMessage();
        }finally{
            return mensaje;
        }
    }
    
    public String setAsignatura(int posicion, String nombreAsignatura, String codigo, int ciclo, int numCreditos){
        String mensaje = "";
        
        try{
            if(nombreAsignatura.length()+6 > TAMREG){
                mensaje = "Tamaño de registro insuficiente";
            }else{
                crearFlujo();
                flujo.seek(posicion * TAMREG);
                
                flujo.writeUTF(nombreAsignatura);
                Asignatura asignatura = new Asignatura(codigo, nombreAsignatura, ciclo, numCreditos);
                listaAsignaturas.add(asignatura);
                
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
    
    public Asignatura getAsignatura(int pos){        
        Asignatura asignatura = null;
        String nombreAsignatura;
        
        try {
            crearFlujo();
            flujo.seek(pos*TAMREG);;
            nombreAsignatura = flujo.readUTF();
            
            if(listaAsignaturas.get(pos).getNombreAsignatura().compareTo(nombreAsignatura)==0)
                asignatura = listaAsignaturas.get(pos);
                
            
        } catch (IOException ex) {
            System.out.println("Problema de E/S: " + ex.getMessage());
        }finally{
            try{
            flujo.close();
            }catch(IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return asignatura;
    }
    
    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    
}