
package logica;

import datos.*;
import entidades.*;

import java.util.List;

public class BLMatricula {
    private DALPeriodoAcademico dalPeriodoAcademico;
    private DALMatriculas dalMatriculas;

    public BLMatricula() {
        dalPeriodoAcademico = new DALPeriodoAcademico();
    }

    public void registrarMatricula(Estudiante estudiante, List<Asignatura> asignaturas, int codigoMatricula) {
        int numeroMatriculasAsignatura = contarMatriculasAsignatura(estudiante, asignaturas.get(0));
        if (numeroMatriculasAsignatura >= 4) {
            System.out.println("El estudiante ya ha alcanzado el máximo de matrículas en la asignatura " +
                    asignaturas.get(0).getNombreAsignatura());
        }

        if (numeroMatriculasAsignatura == 3 && !haAprobadoAsignatura(estudiante, asignaturas.get(0))) {
            System.out.println("El estudiante ha alcanzado el máximo de matrículas en la asignatura " +
                    asignaturas.get(0).getNombreAsignatura() + " sin haber aprobado.");
            estudiante.setEstado("Expulsado");
        }

        Matricula matricula = new Matricula(estudiante, asignaturas, codigoMatricula);
        matricula.setEstudiante(estudiante);
        matricula.setAsignaturas(asignaturas);
        dalMatriculas.agregarMatricula(matricula);
    }

    public void registrarCalificacion(Estudiante estudiante, Asignatura asignatura, int calificacion) {
        List<Matricula> matriculas = estudiante.getCodigosMatriculas();
        for (Matricula matricula : matriculas) {
            if (matricula.getAsignaturas().contains(asignatura)) {
                matricula.registrarCalificacion(asignatura, calificacion);
                break;
            }
        }
    }

    private int contarMatriculasAsignatura(Estudiante estudiante, Asignatura asignatura) {
        int contador = 0;
        List<Matricula> matriculas = estudiante.getCodigosMatriculas();
        for (Matricula matricula : matriculas) {
            if (matricula.getAsignaturas().contains(asignatura)) {
                contador++;
            }
        }
        return contador;
    }

    private boolean haAprobadoAsignatura(Estudiante estudiante, Asignatura asignatura) {
        List<Matricula> matriculas = estudiante.getCodigosMatriculas();
        for (Matricula matricula : matriculas) {
            if (matricula.getAsignaturas().contains(asignatura)) {
                int calificacion = matricula.getCalificacion(asignatura);
                if (calificacion >= 11) {
                    return true;
                }
            }
        }
        return false;
    }
}