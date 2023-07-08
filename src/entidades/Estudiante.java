
package entidades;

import java.util.*;

public class Estudiante implements Comparable<Estudiante>{
    private int codigo;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    
    private String carrera;
    
    private List codigosMatriculas;
    private List<Asignatura> asignaturas;
    
    private String estado; //activo, expulsado
    
    public int getCodigo() {
        return codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
    public Estudiante(int codigo, String dni, String nombre, String apellido, String direccion, String carrera, String estado){
      this.codigo = codigo;
      this.dni = dni;
      this.nombre = nombre;
      this.apellido = apellido;
      this.direccion = direccion;
      this.carrera = carrera;
      this.estado = "activo";
    }

    public int getTamaño() {
        return 4 + getDni().length()*2 + getNombre().length()*2 + getApellido().length()*2+
                getDireccion().length()*2+ getCarrera().length()*2 + getEstado().length()*2;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCódigo: " + getCodigo()
                + "\nDNI: " + getDni()
                + "\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nDireccion: " + getDireccion();
    }
    

    @Override
    public int compareTo(Estudiante estudiante) {
        if(this.codigo>estudiante.getCodigo())
            return 1;
        else{
            if(this.codigo<estudiante.getCodigo())
                return -1;
            else
                return 0;
        }
    }
    

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public List getCodigosMatriculas() {
        return codigosMatriculas;
    }

    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}