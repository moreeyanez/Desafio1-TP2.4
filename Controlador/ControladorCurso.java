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

package desafio1.Controlador;

import com.fasterxml.jackson.core.type.TypeReference;
import desafio1.Modelo.Curso;
import desafio1.Modelo.Estudiante;
import desafio1.Vista.VistaCurso;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControladorCurso {
    VistaCurso vista;
    Curso curso1;
    ArrayList<Curso> listaCurso;

    public ControladorCurso(VistaCurso vista, Curso curso1, ArrayList<Curso> listaCurso) {
        this.vista = vista;
        this.curso1 = curso1;
        this.listaCurso = listaCurso;
    }

    public void output() {
        while (vista.getEjecutando()){
            vista.mostrarVista();
            Scanner scanner = vista.getScanner();

            try {
                int opcion = scanner.nextInt();

                if (opcion == 1){
                    añadirEstudiante();
                } else if (opcion == 2) {
                    //...
                } else if (opcion == 3) {
                    //...
                } else if (opcion == 4) {
                    //...
                } else if (opcion == 5) {
                    //...
                } else if (opcion == 6) {
                    //...
                } else if (opcion == 7) {
                    mostrarListaEstudiantes();
                } else if (opcion == 0) {
                    vista.setEjecutando(false);
                }
            } catch (InputMismatchException e) {
                vista.setMensajeConsola("\nLa opción ingresada no es válida. Por favor intenta de nuevo!");
                System.out.println(vista.getMensajeConsola());
                scanner.nextLine();
            }
        }

    }

    public void añadirEstudiante(){
        Scanner scanner = vista.getScanner();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        boolean ejecucion = true;
        while (ejecucion) {
            vista.setMensajeConsola("\n¿Desea añadir un estudiante al curso?");
            System.out.println(vista.getMensajeConsola());
            vista.setMensajeConsola(" 1) Si");
            System.out.println(vista.getMensajeConsola());
            vista.setMensajeConsola(" 2) No");
            System.out.println(vista.getMensajeConsola());
            vista.setMensajeConsola("Opción elegida: ");
            System.out.print(vista.getMensajeConsola());
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                vista.setMensajeConsola("Ingrese el nombre del estudiante: ");
                System.out.print(vista.getMensajeConsola());
                String nombreEstudiante = scanner.nextLine();

                vista.setMensajeConsola("Ingrese el apellido del estudiante: ");
                System.out.print(vista.getMensajeConsola());
                String apellidoEstudiante = scanner.nextLine();

                vista.setMensajeConsola("Ingrese el código del estudiante: ");
                System.out.print(vista.getMensajeConsola());
                int codigoEstudiante = scanner.nextInt();

                vista.setMensajeConsola("Ingrese el semestre que cursa el estudiante: ");
                System.out.print(vista.getMensajeConsola());
                int semestreEstudiante = scanner.nextInt();

                vista.setMensajeConsola("Ingrese la nota del estudiante: ");
                System.out.print(vista.getMensajeConsola());
                int notaEstudiante = scanner.nextInt();

                Estudiante estudiante = new Estudiante(nombreEstudiante, apellidoEstudiante, codigoEstudiante, semestreEstudiante, notaEstudiante);
                listaEstudiantes.add(estudiante);
            } else if (opcion == 2) {
                ejecucion = false;
            }
        }

        Curso curso1 = new Curso("Curso Universitario", listaEstudiantes);
        listaCurso.add(curso1);
        guardarInfo(listaCurso);
    }


    public void mostrarListaEstudiantes (){
        ArrayList <Curso> cursoArrayList = new ArrayList<>();

        try {
            ObjectMapper mapper = new ObjectMapper();
            cursoArrayList = mapper.readValue(new File("src/main/java/desafio1/assets/informacionGuardada.json"), new TypeReference<>(){});
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Curso curso: cursoArrayList){
            System.out.println("Los estudiantes ingresados son:");
            if (!curso.getListaEstudiantes().isEmpty()){
                for (Estudiante estudiante: curso.getListaEstudiantes()){
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Apellido: " + estudiante.getApellido());
                    System.out.println("Código: " + estudiante.getCodigo());
                    System.out.println("Semestre: " + estudiante.getSemestre());
                    System.out.println("Nota final: " + estudiante.getNotaFinal());
                }
            }
        }
    }


    public void guardarInfo(ArrayList<Curso> listaCurso){
        try{
            System.out.println("Save info");
            System.out.println(" ");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("src/main/java/desafio1/assets/informacionGuardada.json"), listaCurso);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void updateList() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            listaCurso = mapper.readValue(new File("src/main/java/desafio1/assets/informacionGuardada.json"), new TypeReference<>(){});
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
