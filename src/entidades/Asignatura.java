
package entidades;

import java.util.*;

public class Asignatura {
  private String codigo;
  private String nombreAsignatura;
  private int ciclo;
  private int numCreditos;
  
  private List<Estudiante> matriculados;
  
  private int calificacion;

  public Asignatura(String codigo, String nombreAsignatura, int ciclo, int numCreditos) {
    this.codigo = codigo;
    this.nombreAsignatura = nombreAsignatura;
    this.ciclo = ciclo;
    this.numCreditos = numCreditos;
    this.calificacion = 0;
  }

    public String getCodigo() {
      return codigo;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
    
    public int getCiclo() {
    return ciclo;
    }

    public int getNumCreditos() {
      return numCreditos;
    }

    public void setCodigo(String codigo) {
      this.codigo = codigo;
    }
        
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    
    public void setCiclo(int ciclo) {
      this.ciclo = ciclo;
    }

    public void setNumeroCreditos(int numCreditos) {
      this.numCreditos = numCreditos;
    }

    @Override
    public String toString() {
      return     "\nCodigo: " + getCodigo()
                  + "\nNombre de la asignatura: " + getNombreAsignatura()
                  + "\nCiclo: " + getCiclo()
                  + "\nNúmero de créditos: " + getNumCreditos();
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public List<Estudiante> getMatriculados() {
        return matriculados;
    }
    
    public void agregarMatriculado(Estudiante estudiante) {
        matriculados.add(estudiante);
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//La clase Asignatura representa una asignatura y define los
//siguientes atributos: Código, nombre, ciclo, número de créditos