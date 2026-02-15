/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;

import java.util.Objects;


public class Carrera {
    private int id;
    private String nombre;
    private int duracion;
    private Materia [] materias;
    private int cantidadMaterias = 0;

    public Carrera() {}
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.materias = new Materia[100];
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getDuracion() {
        return this.duracion;
    }
    public int getId() {
        return this.id;
    }
    public Materia[] getMaterias() {
        return this.materias;
    }
    public int getCantidadMaterias() {
        return this.cantidadMaterias;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void agregarMateria(Materia materia) {
        if (this.materias == null) {
            this.materias = new Materia[100];
            this.materias[0] = materia;
            this.cantidadMaterias ++;
        } else {
            this.materias[cantidadMaterias] = materia;
            this.cantidadMaterias++;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrera other = (Carrera) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
}
