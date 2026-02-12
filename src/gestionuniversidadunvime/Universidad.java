/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;


import java.util.ArrayList;

public class Universidad {
    
    private int id;
    private String nombre;
    private String direccion;
    private Carrera[] carreras;
    private int cantCarreras;

    public Universidad() {}
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carreras = new Carrera[100];
        this.cantCarreras = 0;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public int getId() {
        return this.id;
    }
    
    public Carrera[] getCarreras() {
        return this.carreras;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void agregarCarrera(Carrera carrera) {
        if (this.carreras == null) {
            this.carreras = new Carrera[100];
            this.carreras[0] = carrera;
            this.cantCarreras++;
        } else {
            this.carreras[this.cantCarreras] = carrera; 
        }
    }
    
    
}
