package desafio1.Vista;

import java.util.Scanner;

public class VistaCurso {
    private String mensajeConsola;
    private Scanner campo;
    private boolean ejecutando;

    //Variable para usar de opcion
    private int opcion;

    //Inputs de la clase curso
    private String nombreCursoInput;

    //Inputs de la clase estudiante
    private String nombreEstudianteInput;
    private String apellidoEstudianteInput;
    private int codigoEstudianteInput;
    private int semestreEstudianteInput;
    private int notaFinalEstudianteInput;

    public VistaCurso(){
        //input del campo
        campo = new Scanner(System.in);
        ejecutando = true;

        //inicializo variables del curso
        nombreCursoInput = "";

        //inicializo variables del estudiante
        nombreEstudianteInput = "";
        apellidoEstudianteInput = "";
        codigoEstudianteInput = 0;
        semestreEstudianteInput = 0;
        notaFinalEstudianteInput = 0;
    }

    public void mostrarVista(){
        mensajeConsola = "\n----Bienvenido----";
        System.out.println(mensajeConsola);
        System.out.println("##################");

        mensajeConsola = "\n----MENÚ----";
        System.out.println(mensajeConsola);
        mensajeConsola = " 1) Añadir estudiante";
        System.out.println(mensajeConsola);
        mensajeConsola = " 2) Buscar estudiante";
        System.out.println(mensajeConsola);
        mensajeConsola = " 3) Eliminar estudiante";
        System.out.println(mensajeConsola);
        mensajeConsola = " 4) Cargar nota";
        System.out.println(mensajeConsola);
        mensajeConsola = " 5) Promedio del curso";
        System.out.println(mensajeConsola);
        mensajeConsola = " 6) Estudiantes aprobados";
        System.out.println(mensajeConsola);

        mensajeConsola = "Elija una opción del menú:";
        System.out.println(mensajeConsola);
    }

    //Getters y setters
    public String getMensajeConsola() {
        return mensajeConsola;
    }

    public void setMensajeConsola(String mensajeConsola) {
        this.mensajeConsola = mensajeConsola;
    }

    public Scanner getScanner() {
        return campo;
    }

    public void setScanner(Scanner campo) {
        this.campo = campo;
    }

    public boolean getEjecutando() {
        return ejecutando;
    }

    public void setEjecutando(boolean ejecutando) {
        this.ejecutando = ejecutando;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getNombreCursoInput() {
        return nombreCursoInput;
    }

    public void setNombreCursoInput(String nombreCursoInput) {
        this.nombreCursoInput = nombreCursoInput;
    }

    public String getNombreEstudianteInput() {
        return nombreEstudianteInput;
    }

    public void setNombreEstudianteInput(String nombreEstudianteInput) {
        this.nombreEstudianteInput = nombreEstudianteInput;
    }

    public String getApellidoEstudianteInput() {
        return apellidoEstudianteInput;
    }

    public void setApellidoEstudianteInput(String apellidoEstudianteInput) {
        this.apellidoEstudianteInput = apellidoEstudianteInput;
    }

    public int getCodigoEstudianteInput() {
        return codigoEstudianteInput;
    }

    public void setCodigoEstudianteInput(int codigoEstudianteInput) {
        this.codigoEstudianteInput = codigoEstudianteInput;
    }

    public int getSemestreEstudianteInput() {
        return semestreEstudianteInput;
    }

    public void setSemestreEstudianteInput(int semestreEstudianteInput) {
        this.semestreEstudianteInput = semestreEstudianteInput;
    }

    public int getNotaFinalEstudianteInput() {
        return notaFinalEstudianteInput;
    }

    public void setNotaFinalEstudianteInput(int notaFinalEstudianteInput) {
        this.notaFinalEstudianteInput = notaFinalEstudianteInput;
    }
}
