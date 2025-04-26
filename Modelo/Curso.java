package desafio1.Modelo;

import java.util.ArrayList;

public class Curso {
    //Atributos
    private String curso1;
    private ArrayList<Estudiante> listaEstudiantes;

    //Constructor
    public Curso(String curso1, ArrayList<Estudiante> listaEstudiantes) {
        this.curso1 = curso1;
        this.listaEstudiantes = listaEstudiantes;
    }

    //Getters y setters
    public String getCurso1() {
        return curso1;
    }

    public void setCurso1(String curso) {
        this.curso1 = curso1;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
