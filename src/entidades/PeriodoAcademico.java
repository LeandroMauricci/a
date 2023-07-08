
package entidades;

import java.util.*;

public class PeriodoAcademico {
    private int año;
    private String semestre;
    
    class Fecha{
        private int dia;
        private int mes;
        private int año2;
        
        public boolean esBisiesto() {
            return ((año2 % 4 == 0) && (año2 % 100 != 0) || (año2 % 400 == 0));
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

        public Fecha (int... fecha) {
            GregorianCalendar fechaActual = new GregorianCalendar();
            int dd, mm, aa;
            dd = fechaActual.get(Calendar.DAY_OF_MONTH);
            mm = fechaActual.get(Calendar.MONTH) + 1;
            aa = fechaActual.get(Calendar.YEAR);
            dia = fecha.length > 0 ? fecha[0] : dd;
            mes = fecha.length > 1 ? fecha[1] : mm;
            año2 = fecha.length > 2 ? fecha[2] : aa;
            
            año = año2;
            
            if(mes<=2)
                semestre = "Nivelación";
            else {
                if(mes<8)
                    semestre = "1";
                else
                    semestre = "2";
            }
        }
    }
  
    public PeriodoAcademico(){
        Fecha fechaActual = new Fecha();
    }

    
  public int getAño() {
    return año;
  }

  public String getSemestre() {
    return semestre;
  }

  public void setAño(int año) {
    this.año = año;
  }

  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }

  @Override
  public String toString() {
    return "Año: " + getAño() + ", Semestre: " + getSemestre();    
  }
}

// La clase PeriodoAcadémico representa el año y el semestre (1, 2, Nivelación)