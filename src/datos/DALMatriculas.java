
package datos;

import entidades.Matricula;
import java.util.ArrayList;
import java.util.List;

public class DALMatriculas {
    private List<Matricula> matriculas;

    public DALMatriculas () {
        matriculas = new ArrayList<>();
    }

    public void agregarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

    public void eliminarMatricula(Matricula matricula) {
        matriculas.remove(matricula);
    }

    public List<Matricula> obtenerMatriculasPorEstudiante(int codigoEstudiante) {
        List<Matricula> matriculasEstudiante = new ArrayList<>();
        for (Matricula matricula : matriculas) {
            if (matricula.getEstudiante().getCodigo() == codigoEstudiante) {
                matriculasEstudiante.add(matricula);
            }
        }
        return matriculasEstudiante;
    }
    
    
}
