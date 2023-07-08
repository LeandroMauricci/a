/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import entidades.*;
import java.util.ArrayList;
import datos.*;


public class NewClass {
    public static void main(String[] args) {
        String s = "Ingenieria de Computacion y sistemas";
        System.out.print(s.length());
        
        PeriodoAcademico periodoAcademico = new PeriodoAcademico();
        
        DALAsignaturas a = new DALAsignaturas();
        System.out.print(a.getListaAsignaturas()); //nulll
        Matricula matricula = new Matricula(null, a.getListaAsignaturas(), 0);
        System.out.print(matricula.toString());
        s = "Algebra lienal y geometria descriptiva";
        System.out.print(s.length());
        
    }
}
