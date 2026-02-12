/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;


public class Estudiante extends Persona{ 

private Carrera carrera;
private double promedio;
private Materia[] materias;
private int cantidadMaterias;
private Examen[] examenes;

public Estudiante() {};

public Estudiante(String nombre, String apellido, int edad, String dni) {
    super.nombre = nombre;
    super.apellido = apellido;
    super.edad = edad;
    super.dni = dni;
    this.materias = new Materia[1000];
    this.cantidadMaterias = 0;
}


public void agregarMateria(Materia materia) {
    materias[cantidadMaterias] = materia;
    cantidadMaterias++;
}

public Materia[] getMaterias() {
    return this.materias;
}
// public double calcularPromedio() {
//     double suma = 0;
//     for (Materia materia : this.materias){
//         suma += materia.getCalificacion();
//     }
//     return suma / this.materias.size();
// }

public String getNombre() {
    return this.nombre;
}
public String getApellido() {
    return this.apellido;
}
public int getEdad() {
    return this.edad;
}
public double getPromedio() {
    return this.promedio;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}



public double setPromedio(double promedio) {
    return this.promedio = promedio;
}
@Override
public String toString() {
    return "Estudiante [nombre=" + this.nombre + ", apellido=" + this.apellido
     + ", edad=" + this.edad + ", carrera=" + this.carrera
     + ", promedio=" + this.promedio + "]";
}
@Override
public String obtenerRol() {
    return "Estudiante";
}

public static double calcularPromedioRecursivo(Materia[] materias, int indice) {
    return indice;
};
}