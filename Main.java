/*
Ejercicio 4:
Se tiene un curso universitario el cual contiene una lista de estudiantes. Para cada
estudiante se tienen los datos: nombre y apellidos del estudiante, código, número de
semestre y nota final del estudiante. Se requiere implementar los siguientes métodos:
• Añadir un estudiante al curso: se ingresan por teclado los datos del estudiante. El
código del estudiante debe ser único, si el código ya existe se debe generar el
mensaje correspondiente.
• Buscar un estudiante de acuerdo con su código ingresado por teclado: si se
encuentra muestra los datos del estudiante. De lo contrario, debe mostrar el mensaje
correspondiente.
• Eliminar un estudiante de acuerdo con su código ingresado por teclado: si se
encuentra muestra los datos del estudiante y se solicita una confirmación de la
eliminación. Si no, debe mostrar el mensaje correspondiente.
• Cargar Notas de Estudiantes.
• Calcular promedio del curso: sumar las notas de los estudiantes y dividirlas por la
cantidad de estudiantes que tiene el curso.
• Obtener la cantidad de estudiantes que aprobó el curso: calcular el número de
estudiantes que obtuvo un promedio mayor o igual a 4.0 y mostrarlo en pantalla.
También se debe calcular el porcentaje de estudiantes que aprobó el curso.
 */

package desafio1;

import desafio1.Controlador.ControladorCurso;
import desafio1.Modelo.Curso;
import desafio1.Vista.VistaCurso;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        VistaCurso vistaCurso = new VistaCurso();

        Curso curso1 = new Curso();
        ArrayList<Curso> listaCurso = new ArrayList<>();

        ControladorCurso controlador = new ControladorCurso(vistaCurso, curso1, listaCurso);

        controlador.output();

    }
}




























