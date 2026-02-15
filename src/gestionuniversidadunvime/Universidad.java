/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidadunvime;


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
    
    public static int contarEstudiantesRecursivo(Estudiante[] estudiantes, Carrera carrera, int indice) {
        if (indice == estudiantes.length){
            return 0;
        }
        int aux = 0;
        
        if(estudiantes[indice] != null){
            if(estudiantes[indice].getCarrera().equals(carrera)){
                aux = 1;
            }
        }
        return aux + contarEstudiantesRecursivo(estudiantes, carrera, indice);
    }
    
    
    
}
