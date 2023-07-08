
package entidades;

import java.util.*;

public class Matricula {
    private final Fecha fecha;
    private PeriodoAcademico periodoAcademico;
    private Estudiante estudiante;
    private List<Asignatura> asignaturas;
    private final int codigoMatricula;

    public Matricula(Estudiante estudiante, List<Asignatura> asignaturas, int codigoMatricula) {
        this.fecha = new Fecha();
        this.periodoAcademico = new PeriodoAcademico();
        this.estudiante = estudiante;
        this.asignaturas = asignaturas;
        this.codigoMatricula = codigoMatricula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public boolean registrarCalificacion(Asignatura asignatura, int calificacion) {
        int a = 0, i = 0;
        Iterator iterador = asignaturas.iterator();
        while(iterador.hasNext()){
            if(asignaturas.get(i).getNombreAsignatura().compareToIgnoreCase(asignatura.getNombreAsignatura())==0){
                asignaturas.get(i).setCalificacion(calificacion);
                a=1;
            }
            i++;
        }
        return a == 1;
    }

    public int getCalificacion(Asignatura asignatura) {
        int i = 0, calificacion = -1; //menos 1 si no hay calfificacion
        Iterator iterador = asignaturas.iterator();
        while(iterador.hasNext()){
            if(asignaturas.get(i).getNombreAsignatura().compareToIgnoreCase(asignatura.getNombreAsignatura())==0){
                calificacion = asignaturas.get(i).getCalificacion();
            }
            i++;
        }
        return calificacion;
    }
    
    static class Fecha {
        private int dia;
        private int mes;
        private int año;
        
        public boolean esBisiesto() {
            return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
        }
        
        public boolean esValida() {
            int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            boolean añoCorrecto, mesCorrecto, diaCorrecto;
            añoCorrecto = año >= 1800;
            mesCorrecto = mes >= 1 && mes <= 12;

            if (mesCorrecto) {
                switch (mes) {
                    case 2:
                        if (esBisiesto())
                            diaCorrecto = dia >= 1 && dia <= 29;
                        else
                            diaCorrecto = dia >= 1 && dia <= diasPorMes[mes];
                    break;
                    default: diaCorrecto = dia >= 1 && dia <= diasPorMes[mes];
                }
            } else
            diaCorrecto = false;
                return diaCorrecto && mesCorrecto && añoCorrecto;
        }

        public Fecha(int... fecha) {
            GregorianCalendar fechaActual = new GregorianCalendar();
            int dd, mm, aa;
            dd = fechaActual.get(Calendar.DAY_OF_MONTH);
            mm = fechaActual.get(Calendar.MONTH) + 1;
            aa = fechaActual.get(Calendar.YEAR);
            dia = fecha.length > 0 ? fecha[0] : dd;
            mes = fecha.length > 1 ? fecha[1] : mm;
            año = fecha.length > 2 ? fecha[2] : aa;
        }

        @Override
        public String toString() {
            return dia + "/" + mes + "/" + año;
        }

    }

    public PeriodoAcademico getPeriodoAcademico() {
        return periodoAcademico;
    }

    public Estudiante getEstudiante() {
      return estudiante;
    }

    public List<Asignatura> getAsignaturas() {
      return asignaturas;
    }
    
    /*public String imprimirAsignaturas(){
        String r="";
        int i = 0;
        Iterator iterador = asignaturas.iterator();
        while(iterador.hasNext()){
            r += asignaturas.get(i).getNombreAsignatura();
            i++;
        }
        return r;
    }*/

    public void setPeriodoAcademico (PeriodoAcademico periodoAcademico){
      this.periodoAcademico = periodoAcademico;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
      return     "\nFecha: " + getFecha()
                  + "\nPeriodo Academico: " + getPeriodoAcademico()
                  + "\nEstudiante: " + getEstudiante()
                  /*+ imprimirAsignaturas()*/;
    }
    
}

//La clase Matrícula representa la matrícula registrada por un estudiante
//y define los siguientes atributos: Fecha, datos del Periodo académico,
//datos del estudiante y datos de las asignaturas en las cuales
//el estudiante se ha matriculado