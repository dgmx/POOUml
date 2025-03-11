package instituto;
// Clase Principal para probar
public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("A001", "Carlos", "López", "carlos.lopez@email.com");

        // Creando asignaturas
        Asignatura matematicas = new Asignatura("Matemáticas", 5);
        Asignatura programacion = new Asignatura("Programación", 6);
        Asignatura historia = new Asignatura("Historia", 4);

        // Agregando asignaturas al alumno
        alumno1.agregarAsignatura(matematicas);
        alumno1.agregarAsignatura(programacion);
        alumno1.agregarAsignatura(historia);

        // Mostrar información del alumno
        alumno1.mostrarInformacion();

        // Eliminar una asignatura
        System.out.println("\nEliminando la asignatura de Historia...");
        alumno1.eliminarAsignatura("Historia");

        // Mostrar información después de la eliminación
        alumno1.mostrarInformacion();
    }
}
