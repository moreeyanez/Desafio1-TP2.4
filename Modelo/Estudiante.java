package desafio1.Modelo;

public class Estudiante {
    //Atributos del estudiante
    private String nombre;
    private String apellido;
    private int codigo;
    private int semestre;
    private int notaFinal;

    //Constructor
    public Estudiante(String nombre, String apellido, int codigo, int semestre, int notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.semestre = semestre;
        this.notaFinal = notaFinal;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}
