
package datos;

import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class DALPeriodoAcademico {
  private List<PeriodoAcademico> periodosAcademicos;

  public DALPeriodoAcademico() {
    periodosAcademicos = new ArrayList<>();
  }

  public void agregarPeriodoAcademico(PeriodoAcademico periodoAcademico) {
    periodosAcademicos.add(periodoAcademico);
  }

  public List<PeriodoAcademico> obtenerPeriodosAcademicos() {
    return periodosAcademicos;
  }

  public PeriodoAcademico buscarPorAñoYSemestre(int año, String semestre) {
    for (PeriodoAcademico periodo : periodosAcademicos) {
      if (periodo.getAño() == año && periodo.getSemestre().equals(semestre)) {
        return periodo;
      }
    }
    return null;
  }

  public void eliminarPeriodoAcademico(PeriodoAcademico periodoAcademico) {
    periodosAcademicos.remove(periodoAcademico);
  }
}
