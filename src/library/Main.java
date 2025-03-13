package library;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Crear libros
        Libro libro1 = new Libro("12345", "El Quijote", "Cervantes", 29.99);
        Libro libro2 = new Libro("67890", "1984", "George Orwell", 19.99);
        Libro libro3 = new Libro("11112", "Moby Dick", "Herman Melville", 24.99);

        // Agregar libros a la librería
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        System.out.println("\nLista de libros:");
        libreria.mostrarLibros();

        // Ordenar libros por precio
        libreria.ordenarPorPrecio();
        System.out.println("\nLibros ordenados por precio:");
        libreria.mostrarLibros();

        // Clonar un libro
        Libro libroClonado = libro1.clone();
        System.out.println("\nLibro clonado:");
        System.out.println(libroClonado);
        libreria.agregarLibro(libroClonado);
        System.out.println("\nLista de libros:");
        libreria.mostrarLibros();

        // Buscar un libro
        System.out.println("\nBuscando libro con ISBN 67890:");
        System.out.println(libreria.buscarLibro("67890"));

        // Eliminar un libro
        libreria.eliminarLibro("12345");
        System.out.println("\nLista de libros después de eliminar uno:");
        libreria.mostrarLibros();
    }
}
