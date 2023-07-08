
package entidades;

import java.util.Comparator;

public class CompararEstudiantesPorApellido implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante estudiante1, Estudiante estudiante2) {
        if (estudiante1.getApellido().compareToIgnoreCase(estudiante2.getApellido())>0) {
            return 1;
        } else if (estudiante1.getApellido().compareToIgnoreCase(estudiante2.getApellido())<0) {
            return -1;
        } else {
            return 0;
        }
    }
}