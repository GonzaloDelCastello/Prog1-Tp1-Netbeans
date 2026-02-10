
package gestionuniversidadunvime;


public class GestionUniversidadUnvime {


    
    public static void main(String[] args) {
    
        //Crea un estudiantes
    Estudiante estudiante1 = new Estudiante();
    estudiante1.setNombre("Juan");
    estudiante1.setApellido("Perez");
    estudiante1.setEdad(20);
    estudiante1.setPromedio(8.5);
    //Crea Profesores
    Profesor profesor1 = new Profesor("nombre profe", "apellido prof", 37, "Matemático", 10);
    Profesor profesor2 = new Profesor("Laura", "Fernandez", 40, "Programación", 15);


        //System.out.println(estudiante1.toString());
    Estudiante estudiante2 = new Estudiante("MAria","Gomez",22,"21441222");
    Estudiante estudiante3 = new Estudiante("Luis","Lopez",19,"82465464");
    Estudiante estudiante4 = new Estudiante("Ana","Martinez",21,"714546545");
        
    //Crea una universidad
    Universidad uNVIME = new Universidad("UNVIME","Av. Siempre Viva 123");
    
    //Crea una carrera
    Carrera programacion = new Carrera("Programación",3);
    Carrera ingSistemas = new Carrera("Ingenieria en Sistemas",5);
    
    //Crea materias
    Materia programacion1 = new Materia("Programacion 1",101,4,programacion);
    Materia matematica = new Materia("Matematica",102,3,programacion);
    
    //Agrega carreras a la universidad
    uNVIME.agregarCarrera(programacion);
    uNVIME.agregarCarrera(ingSistemas);

    //Agrega materias a la carrera
    programacion.agregarMateria(programacion1);
    programacion.agregarMateria(matematica);
    ingSistemas.agregarMateria(matematica);
    ingSistemas.agregarMateria(programacion1);

    //Agrega estudiantes a las materias
    programacion1.agregarEstudiante(estudiante1);
    programacion1.agregarEstudiante(estudiante2);
    matematica.agregarEstudiante(estudiante3);
    matematica.agregarEstudiante(estudiante4);
    programacion1.agregarEstudiante(estudiante3);
    matematica.agregarEstudiante(estudiante1);

    System.out.println(uNVIME.getNombre() + " tiene las siguientes carreras:");
    for (Carrera carrera : uNVIME.getCarreras()) {
        System.out.println("- " + carrera.getNombre() + " (" + carrera.getDuracion() + " años) con las siguientes materias:");
        for (Materia materia : carrera.getMaterias()) {
            System.out.println("  * " + materia.getNombre() + " (Código: " + materia.getCodigo() + ", Créditos: " + materia.getCreditos() + ") con los siguientes estudiantes:");
            for (Estudiante estudiante : materia.getEstudiantes()) {
                System.out.println("    - " + estudiante.getNombre() + " " + estudiante.getApellido() + " (Edad: " + estudiante.getEdad() + ", Promedio: " + estudiante.getPromedio() + ")");
            }
        }
    }
    Profesor profe1 = new Profesor("Carlos","Ramirez",45,"Programacion",20);
    System.out.println(profe1.getApellido());
    
    // Polimorfismo 
    Persona[] listPersonas =new Persona[6];
    listPersonas[0]=estudiante1;
    listPersonas[1]=estudiante2;
    listPersonas[2]=profesor1;
    listPersonas[3]=profesor2;
    for (int i = 0; i < listPersonas.length; i++) {
        if (listPersonas[i] != null) {
            System.out.println(listPersonas[i].toString());;
        }
    }

    MiembroDeUniversidad[] miembros = new MiembroDeUniversidad[6];
    miembros[0] = estudiante1;
    miembros[1] = estudiante2;
    miembros[2] = profesor1;
    miembros[3] = profesor2;
    for (int i = 0; i < miembros.length; i++) {
        if (miembros[i] != null) {
            System.out.println(miembros[i].obtenerInformacionCompleta());
            System.out.println("Rol: " + miembros[i].obtenerRol());
        }
    }


    }
    
}

