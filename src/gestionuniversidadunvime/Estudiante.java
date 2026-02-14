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

public static double calcularPromedioIterativo(Examen[] examenes) {
    double aux = 0;
    if (examenes == null || examenes.length == 0){
        return 0.0;
    }
    for (Examen examen: examenes) {//for (i=0;i<examenes.length;i++){}
        if (examen != null){
        aux = aux + examen.getNota();
        }
    }
    return aux / examenes.length;
};

public static double calcularPromedioRecursivo(Examen[] examenes, int indice) {
    
    if (examenes[indice] == null) {
        if (indice == 0) return 0.0;
        return calcularPromedioRecursivo(examenes, indice - 1);
    }
    if(indice == 0){
        return examenes[0].getNota();
    } else {
        double promedio = (examenes[indice].getNota() + (calcularPromedioRecursivo(examenes, indice-1)*(indice)))/(indice + 1);
    return promedio;        
    }
    
    }
};