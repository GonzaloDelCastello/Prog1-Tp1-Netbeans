/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;

public class Materia {
    
    private String nombre;
    private int codigo;
    private int creditos;
    private Carrera carrera;
    private Estudiante[] estudiantes;
    private Profesor profesor;
    
    public Materia() {}
    
    public Materia(String nombre, int codigo, int creditos, Carrera carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.carrera = carrera;
        this.estudiantes = new Estudiante[50];
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public int getCreditos() {
        return this.creditos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    // public void setCalificacion(double calificacion) {
    //     this.calificacion = calificacion;
    // }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public Carrera getCarrera() {
        return this.carrera;
    }
    public String getProfesor() {
        return this.profesor.getNombre() + " " + this.profesor.getApellido();
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < this.estudiantes.length; i++) {
            if (this.estudiantes[i] == null) {
                this.estudiantes[i] = estudiante;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Materia [nombre=" + this.nombre + ", codigo=" + this.codigo
         + ", creditos=" + this.creditos + ", calificacion=" + "]";
    }
    
}
