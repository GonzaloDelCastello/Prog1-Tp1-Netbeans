/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;


public class Examen {
    private Materia materia;
    private Estudiante estudiante;
    private int codExamen;

    public Examen() {
    }

    public Examen(Materia materia, Estudiante estudiante, int codExamen) {
        this.materia = materia;
        this.estudiante = estudiante;
        this.codExamen = codExamen;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getCodExamen() {
        return codExamen;
    }

    public void setCodExamen(int codExamen) {
        this.codExamen = codExamen;
    }
    
    
}
