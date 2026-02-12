/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;

public class Profesor extends Persona {
    
    private String especialidad;
    private int aniosExperiencia;
    private Materia[] materiaAsignadas;
    private int cantidadMaterias;

    public Profesor(String nombre, String apellido, int edad, String especialidad, int aniosExperiencia) {
        super.nombre = nombre;
        super.apellido = apellido;
        super.edad = edad;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.materiaAsignadas = new Materia[100];        
    }

    public String getEspecialidad() {
        return this.especialidad;
    }
    public int getAniosExperiencia() {
        return this.aniosExperiencia;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void asignarMateria(Materia materia) {
        materiaAsignadas[cantidadMaterias] = materia;
        cantidadMaterias++;
    }
    @Override
    public String toString() {
        return "Profesor [nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad=" + this.edad
                + ", especialidad=" + this.especialidad + ", aniosExperiencia=" + this.aniosExperiencia + "]";
    }
    @Override
    public String obtenerRol() {
        return "Profesor";
    }
}

