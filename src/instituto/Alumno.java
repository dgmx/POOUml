package instituto;

import java.util.ArrayList;
import java.util.List;

public // Clase Alumno
class Alumno {
    private String codigoAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String emailAlumno;
    private List<Asignatura> asignaturas;

    public Alumno(String codigoAlumno, String nombreAlumno, String apellidoAlumno, String emailAlumno) {
        this.codigoAlumno = codigoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.emailAlumno = emailAlumno;
        this.asignaturas = new ArrayList<>();
    }

    // Agregar una asignatura
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Eliminar una asignatura
    public void eliminarAsignatura(String nombreAsignatura) {
        asignaturas.removeIf(asignatura -> asignatura.getNombre().equalsIgnoreCase(nombreAsignatura));
    }

    // Obtener todas las asignaturas del alumno
    public void mostrarAsignaturas() {
        System.out.println("Asignaturas de " + nombreAlumno + " " + apellidoAlumno + ":");
        for (Asignatura asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }
    }

    // Obtener el total de créditos cursados
    public int obtenerTotalCreditos() {
        int total = 0;
        for (Asignatura asignatura : asignaturas) {
            total += asignatura.getCreditos();
        }
        return total;
    }

    // Método para mostrar información del alumno
    public void mostrarInformacion() {
        System.out.println("Código: " + codigoAlumno);
        System.out.println("Nombre: " + nombreAlumno + " " + apellidoAlumno);
        System.out.println("Email: " + emailAlumno);
        System.out.println("Total Créditos: " + obtenerTotalCreditos());
        mostrarAsignaturas();
    }
}

