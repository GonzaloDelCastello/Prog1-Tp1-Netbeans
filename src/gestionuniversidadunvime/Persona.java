/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;


public abstract class Persona implements MiembroDeUniversidad {
    
    protected String nombre;
    protected String apellido;
    protected int edad;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    protected String dni;

    public Persona () {};

    public Persona(String nombre, String apellido, int edad,  String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setEdad(int edad) {
        if (edad>120 || edad<16) {
            System.out.println("Edad no valida");        
        } else {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }
    

    @Override
    public String toString() {
        return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad=" + this.edad + "]";
    }
    
    @Override
    public String obtenerInformacionCompleta() {
        return toString();
    }

    @Override
    public String obtenerRol() {
        return "Persona";
    }

    public boolean equals(Persona otraPersona) {
        this.dni = otraPersona.dni;
        return true;
    }
}
