
package logica;

import datos.*;
import entidades.*;
import java.util.*;

public class BLEstudiantes{
    
  public static String escribirEstudiante(int codigo, String dni, String nombre, String apellido, String direccion, String carrera, String estado){
        String mensaje = null;
        Estudiante estudiante = null;
        if(dni.length() == 8 && nombre.length() > 1 && apellido.length() > 1 && direccion.length()>1){
            estudiante = new Estudiante(codigo, dni, nombre, apellido, direccion, carrera, estado);
            mensaje = DALEstudiantes.escribirEstudiante(estudiante);
        }
        return mensaje;
    }
    
    public static String setEstudiante(int posicion, int codigo, String dni, String nombre, String apellido, String direccion, String carrera, String estado){
        String mensaje = null;
        Estudiante estudiante = null;
        if(posicion >=0 && posicion <= DALEstudiantes.getNumeroRegistros()){
            if(dni.length() == 8 && nombre.length() > 1 && apellido.length() > 1 && direccion.length()>1){
                estudiante = new Estudiante(codigo, dni, nombre, apellido, direccion, carrera, estado);
                mensaje = DALEstudiantes.setEstudiante(posicion, estudiante);
            }else{
                mensaje = "Datos no validos";
            }
        }else{
            mensaje = "Numero de regsitro no valido";
        }
        return mensaje;
    }
    
    public static Estudiante getEstudiante(int pos){
        Estudiante estudiante = null;
        if(pos >= 0 && pos < DALEstudiantes.getNumeroRegistros()){
            estudiante = DALEstudiantes.getEstudiante(pos);
        }
        return estudiante;
    }
    
    public static List<Estudiante> getContenido(){
        if(DALEstudiantes.getNumeroRegistros() > 0)
            return DALEstudiantes.getContenido();
        return null;
    }
    
    public static int getNumRegistros(){
        return DALEstudiantes.getNumeroRegistros();
    }
    
    public static boolean verificarDNI(String dni){
        String listaDNIs[] = new String[getNumRegistros()];
        List list=getContenido();
        for(int i=0; i<getNumRegistros(); i++){
            Estudiante estudiante = (Estudiante) list.get(i);
            listaDNIs[i]= estudiante.getDni();
        }
        
        int r = 0;
        for(int i=0; i<getNumRegistros(); i++){
            if(listaDNIs[i].compareToIgnoreCase(dni)==0)
                r=1;
        }
        
        if(r==1)
            return true;
        else
            return false;
            
    }
 
  
}
