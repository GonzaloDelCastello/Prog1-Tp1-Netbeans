
package gestionuniversidadunvime;

import java.time.LocalDate;

public class Personal extends Persona {
    private String puesto;
    private String departamento;
    private LocalDate fechaIngreso;

    public Personal(String nombre, String apellido, int edad, String puesto, String departamento, LocalDate fechaIngreso) {
        super.nombre = nombre;
        super.apellido = apellido;
        super.edad = edad;
        this.puesto = puesto;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public LocalDate getFechaIngreso() {
        return this.fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + "Puesto = " + this.puesto + ", Departamento = " + this.departamento + ", Fecha de Ingreso = " + this.fechaIngreso + "]";
    }
    
    @Override
    public String obtenerRol() {
        return "Personal";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString();
    }
}
